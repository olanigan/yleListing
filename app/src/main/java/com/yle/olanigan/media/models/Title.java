package com.yle.olanigan.media.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Engineering on 6/9/2016.
 */
public class Title {

    @SerializedName("fi")
    private String fi;

    @SerializedName("sv")
    private String sv;

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }


}
