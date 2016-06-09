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
import com.yle.olanigan.media.utils.DefaultValues;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Engineering on 6/9/2016.
 */
public class RESTClient {
    private String base_url = "https://external.api.yle.fi/v1/";

    public interface GetAudioAPI {
        @GET("/programs/items.json")
        ProgramInfo getPrograms(@Query("app_id") String idString,
                            @Query("app_key") String keyString,
                            @Query("availability") String avString,
                            @Query("mediaobject") String mediaString,
                            @Query("offset") int offset
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
        String app_id = context.getResources().getString(R.string.pref_app_id);
        String app_key = context.getResources().getString(R.string.pref_app_key);

        String settings_id = sharedPreferences.getString(app_id, DefaultValues.getApp_Id());
        String settings_key = sharedPreferences.getString(app_key, DefaultValues.getApp_Key());
        ProgramInfo programList = service.getPrograms( settings_id,
                                                       settings_key ,
                                                "ondemand",
                                                "audio", 25);

        return programList.getData();
    }

}
