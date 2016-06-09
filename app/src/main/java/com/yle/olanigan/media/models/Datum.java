package com.yle.olanigan.media.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Engineering on 6/9/2016.
 */
public class Datum {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private Title title;

    @SerializedName("description")
    private Description description;

    @SerializedName("availability")
    private String availability;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
