
package com.yle.olanigan.media.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PartOfSeries {

    private Description_ description;
    private List<Object> creator = new ArrayList<Object>();
    private String type;
    private Title title;
    private CoverImage coverImage;
    private List<Object> countryOfOrigin = new ArrayList<Object>();
    private List<Interaction> interactions = new ArrayList<Interaction>();
    private String id;
    private Image image;
    private List<Subject> subject = new ArrayList<Subject>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The description
     */
    public Description_ getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description_ description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The creator
     */
    public List<Object> getCreator() {
        return creator;
    }

    /**
     * 
     * @param creator
     *     The creator
     */
    public void setCreator(List<Object> creator) {
        this.creator = creator;
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
     *     The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The coverImage
     */
    public CoverImage getCoverImage() {
        return coverImage;
    }

    /**
     * 
     * @param coverImage
     *     The coverImage
     */
    public void setCoverImage(CoverImage coverImage) {
        this.coverImage = coverImage;
    }

    /**
     * 
     * @return
     *     The countryOfOrigin
     */
    public List<Object> getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * 
     * @param countryOfOrigin
     *     The countryOfOrigin
     */
    public void setCountryOfOrigin(List<Object> countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * 
     * @return
     *     The interactions
     */
    public List<Interaction> getInteractions() {
        return interactions;
    }

    /**
     * 
     * @param interactions
     *     The interactions
     */
    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

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
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public List<Subject> getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
