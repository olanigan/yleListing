package com.yle.olanigan.media;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemActivity extends AppCompatActivity {

    private static String TAG_TITLE = "title";
    private static String TAG_DESC = "description";
    private static String TAG_MOD = "modified";

    private TextView titleView;
    private TextView descView;
    private TextView lastModifiedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ItemActivity.this, MainActivity.class));

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        titleView = (TextView) findViewById(R.id.titleView);
        descView = (TextView) findViewById(R.id.descView);
        lastModifiedView = (TextView) findViewById(R.id.lastModifiedView);
        //handle intent from MainActivity
        handleIntent();
    }

    private void handleIntent(){

        Intent intent = getIntent();
        String title = intent.hasExtra(TAG_TITLE) ? intent.getStringExtra(TAG_TITLE)  : "Not defined";
        String desc =  intent.hasExtra(TAG_DESC) ? intent.getStringExtra(TAG_DESC)  : "Not defined";
        String lastModified = intent.hasExtra(TAG_MOD) ? intent.getStringExtra(TAG_MOD)  : "Not defined";

        titleView.setText(title);
        descView.setText(desc);
        lastModifiedView.setText(lastModified);
    }

}
