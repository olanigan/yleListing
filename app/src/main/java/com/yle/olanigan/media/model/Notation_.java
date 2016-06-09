
package com.yle.olanigan.media.model;

import java.util.HashMap;
import java.util.Map;



public class Notation_ {

    private String value;
    private String valueType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The valueType
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * 
     * @param valueType
     *     The valueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
