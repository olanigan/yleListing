
package com.yle.olanigan.media.model;

import java.util.HashMap;
import java.util.Map;



public class Title_____ {

    private String fi;
    private String en;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The fi
     */
    public String getFi() {
        return fi;
    }

    /**
     * 
     * @param fi
     *     The fi
     */
    public void setFi(String fi) {
        this.fi = fi;
    }

    /**
     * 
     * @return
     *     The en
     */
    public String getEn() {
        return en;
    }

    /**
     * 
     * @param en
     *     The en
     */
    public void setEn(String en) {
        this.en = en;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
