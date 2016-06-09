package com.yle.olanigan.media.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Engineering on 6/9/2016.
 */
public class ProgramInfo {

    private String apiVersion;
    private Meta meta;
    private List<Datum> data = new ArrayList<Datum>();

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
}
