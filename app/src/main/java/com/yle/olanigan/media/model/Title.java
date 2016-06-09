
package com.yle.olanigan.media.model;

import java.util.HashMap;
import java.util.Map;



public class Title {

    private String sv;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sv
     */
    public String getSv() {
        return sv;
    }

    /**
     * 
     * @param sv
     *     The sv
     */
    public void setSv(String sv) {
        this.sv = sv;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
