
package com.yle.olanigan.media.model;

import java.util.HashMap;
import java.util.Map;



public class Format {

    private String inScheme;
    private String type;
    private String key;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The inScheme
     */
    public String getInScheme() {
        return inScheme;
    }

    /**
     * 
     * @param inScheme
     *     The inScheme
     */
    public void setInScheme(String inScheme) {
        this.inScheme = inScheme;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
