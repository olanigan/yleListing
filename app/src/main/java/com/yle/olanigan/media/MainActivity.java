package com.yle.olanigan.media;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.yle.olanigan.media.api.RESTClient;
import com.yle.olanigan.media.api.YleAPI;
import com.yle.olanigan.media.models.Datum;
import com.yle.olanigan.media.models.Program;
import com.yle.olanigan.media.models.ProgramItem;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
   // private AdapterViewCompat.OnItemClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                new APICallTask().execute("");
            }
        });

        listView = (ListView) findViewById(R.id.ListView1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String title = ((TextView) view.findViewById(android.R.id.text1)).getText().toString();
                    ProgramItem item = Program.getByTitle(title);

                Intent detailIntent = new Intent(MainActivity.this,ItemActivity.class);
                detailIntent.putExtra("title", item.getTitle());
                detailIntent.putExtra("description", item.getDescription());
                startActivity(detailIntent);

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
           Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);

        }
        else if(id == R.id.load){
            new APICallTask().execute("");

        }

        return super.onOptionsItemSelected(item); /**/

    }

    private class APICallTask extends AsyncTask<String,Integer,List<Datum>>{

        @Override
        protected List<Datum> doInBackground(String... params) {
            // TODO Auto-generated method stub
           // YleAPI api = new YleAPI();
            RESTClient api = new RESTClient();
            return api.GetPrograms(MainActivity.this);

        }

        protected void onProgressUpdate(Integer... progress){

        }

        protected void onPostExecute(List<Datum> results){
            StringBuilder sb = new StringBuilder();
           ArrayList<String> sList = new ArrayList<String>();
            // String[] sList;
            //List<Datum> response = results.;
            for(Datum datum: results){
                Log.d("Task Output", datum.getId() + " - " + datum.getTitle().getFi());
               // sb.append(datum.getId() + "\n");

                String id = datum.getId();
                String title = datum.getTitle().getFi() != null ? datum.getTitle().getFi() : datum.getTitle().getSv();
                String description = datum.getDescription().getFi() != null ? datum.getDescription().getFi() : datum.getDescription().getSv();

                if(title != null)
                    sList.add(title);

                ProgramItem item = new ProgramItem(id,title,description);
                Program.addProgram(item);
            }
            /*runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    listView = (ListView) findViewById(R.id.ListView1);
                }
            });*/
            //((TextView) findViewById(R.id.textView1)).setText(sb.toString());
            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,sList  );
            listView.setAdapter(adapter);
        }



    }

    public void fetchProgram(View v){
        new APICallTask().execute("");
    }

}
