package com.yle.olanigan.media.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Engineering on 6/9/2016.
 */
public class Meta {

    @SerializedName("offset")
    private String offset;

    @SerializedName("limit")
    private String limit;

    @SerializedName("mediaobject")
    private String mediaobject;

    @SerializedName("availability")
    private String availability;

    @SerializedName("count")
    private int count;

    @SerializedName("program")
    private int program;

    @SerializedName("clip")
    private int clip;


    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getMediaobject() {
        return mediaobject;
    }

    public void setMediaobject(String mediaobject) {
        this.mediaobject = mediaobject;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getProgram() {
        return program;
    }

    public void setProgram(int program) {
        this.program = program;
    }

    public int getClip() {
        return clip;
    }

    public void setClip(int clip) {
        this.clip = clip;
    }


}
