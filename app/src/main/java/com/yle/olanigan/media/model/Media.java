
package com.yle.olanigan.media.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Media {

    private String id;
    private String duration;
    private List<ContentProtection> contentProtection = new ArrayList<ContentProtection>();
    private boolean available;
    private String type;
    private boolean downloadable;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The contentProtection
     */
    public List<ContentProtection> getContentProtection() {
        return contentProtection;
    }

    /**
     * 
     * @param contentProtection
     *     The contentProtection
     */
    public void setContentProtection(List<ContentProtection> contentProtection) {
        this.contentProtection = contentProtection;
    }

    /**
     * 
     * @return
     *     The available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(boolean available) {
        this.available = available;
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
     *     The downloadable
     */
    public boolean isDownloadable() {
        return downloadable;
    }

    /**
     * 
     * @param downloadable
     *     The downloadable
     */
    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
