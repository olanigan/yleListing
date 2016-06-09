package com.yle.olanigan.media.api;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yle.olanigan.media.model.Datum;
import com.yle.olanigan.media.model.Program;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

public class YleAPI {
	
	private String base_url = "https://external.api.yle.fi/v1/";
	
	public interface GetAudioAPI {
		@GET("/programs/items.json")
		Program getPrograms(@Query("app_id") String idString,
								@Query("app_key") String keyString,
								@Query("availability") String avString,
								@Query("mediaobject") String mediaString
				);
	}
	
	public List<Datum> GetPrograms(){
		
		Gson gson = new GsonBuilder().create();
		
		RestAdapter  adapter = new RestAdapter.Builder()
				.setEndpoint(base_url)
				.setConverter(new GsonConverter(gson))
				.build();
		
		GetAudioAPI service = adapter.create(GetAudioAPI.class);
		Program programList = service.getPrograms("b430a3e1",
														"7f38610e4807ccaa68e3b72bca97a0c7",
														"ondemand",
														"audio");
		Log.d("Check", programList.getApiVersion());
		return programList.getData();
	}

}
