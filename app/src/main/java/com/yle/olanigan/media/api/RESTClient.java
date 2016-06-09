package com.yle.olanigan.media.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yle.olanigan.media.R;
import com.yle.olanigan.media.models.Datum;
import com.yle.olanigan.media.models.ProgramInfo;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Engineering on 6/9/2016.
 */
public class RESTClient {
    private String base_url = "https://external.api.yle.fi/v1";

    public interface GetAudioAPI {
        @GET("/programs/items.json")
        ProgramInfo getPrograms(@Query("app_id") String idString,
                            @Query("app_key") String keyString,
                            @Query("availability") String avString,
                            @Query("mediaobject") String mediaString,
                            @Query("offset") int offset,
                            @Query("limit") String limit
        );
    }

    public List<Datum> GetPrograms(Context context){

        Gson gson = new GsonBuilder().create();

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(base_url)
                .setConverter(new GsonConverter(gson))
                .build();

        GetAudioAPI service = adapter.create(GetAudioAPI.class);

        //Get Settings values
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String app_id = context.getString(R.string.default_id);
        String app_key = context.getString(R.string.default_key);
        String limit = context.getString(R.string.default_limit);
        int offset = Integer.parseInt(context.getString(R.string.default_offset));


        String settings_id = sharedPreferences.getString(context.getString(R.string.pref_app_id),app_id);
        String settings_key = sharedPreferences.getString(context.getString(R.string.pref_app_key), app_key);
        String settings_limit = sharedPreferences.getString(context.getString(R.string.pref_limit), limit);
        int settings_offset = sharedPreferences.getInt(context.getString(R.string.meta_offset), offset);

        ProgramInfo programList = service.getPrograms( settings_id,
                                                       settings_key ,
                                                        "ondemand",
                                                        "audio",
                                                        settings_offset,
                                                        settings_limit  );

        //Store Next Offset to Preferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int meta_offset = programList.getMeta().getOffset();
        int new_offset = meta_offset + Integer.parseInt(settings_limit);
        editor.putInt(context.getString(R.string.meta_offset), new_offset);
        editor.commit();

        return programList.getData();
    }

}
