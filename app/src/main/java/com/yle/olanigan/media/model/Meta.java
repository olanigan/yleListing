
package com.yle.olanigan.media.model;

import java.util.HashMap;
import java.util.Map;



public class Meta {

    private String offset;
    private String limit;
    private String mediaobject;
    private String availability;
    private int count;
    private int program;
    private int clip;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The limit
     */
    public String getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The mediaobject
     */
    public String getMediaobject() {
        return mediaobject;
    }

    /**
     * 
     * @param mediaobject
     *     The mediaobject
     */
    public void setMediaobject(String mediaobject) {
        this.mediaobject = mediaobject;
    }

    /**
     * 
     * @return
     *     The availability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * 
     * @param availability
     *     The availability
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The program
     */
    public int getProgram() {
        return program;
    }

    /**
     * 
     * @param program
     *     The program
     */
    public void setProgram(int program) {
        this.program = program;
    }

    /**
     * 
     * @return
     *     The clip
     */
    public int getClip() {
        return clip;
    }

    /**
     * 
     * @param clip
     *     The clip
     */
    public void setClip(int clip) {
        this.clip = clip;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
