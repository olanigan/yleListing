
package com.yle.olanigan.media.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Subject {

    private String id;
    private Title__ title;
    private Broader broader;
    private String inScheme;
    private String type;
    private String key;
    private List<Notation> notation = new ArrayList<Notation>();
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
     *     The title
     */
    public Title__ getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title__ title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The broader
     */
    public Broader getBroader() {
        return broader;
    }

    /**
     * 
     * @param broader
     *     The broader
     */
    public void setBroader(Broader broader) {
        this.broader = broader;
    }

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

    /**
     * 
     * @return
     *     The notation
     */
    public List<Notation> getNotation() {
        return notation;
    }

    /**
     * 
     * @param notation
     *     The notation
     */
    public void setNotation(List<Notation> notation) {
        this.notation = notation;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
