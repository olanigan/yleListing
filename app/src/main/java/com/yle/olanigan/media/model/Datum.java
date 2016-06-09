
package com.yle.olanigan.media.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Datum {

    private Description description;
    private Video video;
    private String typeMedia;
    private List<Object> creator = new ArrayList<Object>();
    private PartOfSeries partOfSeries;
    private String indexDataModified;
    private List<String> alternativeId = new ArrayList<String>();
    private String type;
    private String duration;
    private String productionId;
    private ContentRating contentRating;
    private Title____ title;
    private ItemTitle itemTitle;
    private List<Object> countryOfOrigin = new ArrayList<Object>();
    private String id;
    private String typeCreative;
    private Image_ image;
    private List<Audio> audio = new ArrayList<Audio>();
    private OriginalTitle originalTitle;
    private List<PublicationEvent> publicationEvent = new ArrayList<PublicationEvent>();
    private String collection;
    private List<Subject_> subject = new ArrayList<Subject_>();
    private List<Object> subtitling = new ArrayList<Object>();
    private List<Interaction_> interactions = new ArrayList<Interaction_>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * 
     * @param video
     *     The video
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * 
     * @return
     *     The typeMedia
     */
    public String getTypeMedia() {
        return typeMedia;
    }

    /**
     * 
     * @param typeMedia
     *     The typeMedia
     */
    public void setTypeMedia(String typeMedia) {
        this.typeMedia = typeMedia;
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
     *     The partOfSeries
     */
    public PartOfSeries getPartOfSeries() {
        return partOfSeries;
    }

    /**
     * 
     * @param partOfSeries
     *     The partOfSeries
     */
    public void setPartOfSeries(PartOfSeries partOfSeries) {
        this.partOfSeries = partOfSeries;
    }

    /**
     * 
     * @return
     *     The indexDataModified
     */
    public String getIndexDataModified() {
        return indexDataModified;
    }

    /**
     * 
     * @param indexDataModified
     *     The indexDataModified
     */
    public void setIndexDataModified(String indexDataModified) {
        this.indexDataModified = indexDataModified;
    }

    /**
     * 
     * @return
     *     The alternativeId
     */
    public List<String> getAlternativeId() {
        return alternativeId;
    }

    /**
     * 
     * @param alternativeId
     *     The alternativeId
     */
    public void setAlternativeId(List<String> alternativeId) {
        this.alternativeId = alternativeId;
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
     *     The productionId
     */
    public String getProductionId() {
        return productionId;
    }

    /**
     * 
     * @param productionId
     *     The productionId
     */
    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    /**
     * 
     * @return
     *     The contentRating
     */
    public ContentRating getContentRating() {
        return contentRating;
    }

    /**
     * 
     * @param contentRating
     *     The contentRating
     */
    public void setContentRating(ContentRating contentRating) {
        this.contentRating = contentRating;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title____ getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title____ title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The itemTitle
     */
    public ItemTitle getItemTitle() {
        return itemTitle;
    }

    /**
     * 
     * @param itemTitle
     *     The itemTitle
     */
    public void setItemTitle(ItemTitle itemTitle) {
        this.itemTitle = itemTitle;
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
     *     The typeCreative
     */
    public String getTypeCreative() {
        return typeCreative;
    }

    /**
     * 
     * @param typeCreative
     *     The typeCreative
     */
    public void setTypeCreative(String typeCreative) {
        this.typeCreative = typeCreative;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image_ getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image_ image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The audio
     */
    public List<Audio> getAudio() {
        return audio;
    }

    /**
     * 
     * @param audio
     *     The audio
     */
    public void setAudio(List<Audio> audio) {
        this.audio = audio;
    }

    /**
     * 
     * @return
     *     The originalTitle
     */
    public OriginalTitle getOriginalTitle() {
        return originalTitle;
    }

    /**
     * 
     * @param originalTitle
     *     The originalTitle
     */
    public void setOriginalTitle(OriginalTitle originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     * 
     * @return
     *     The publicationEvent
     */
    public List<PublicationEvent> getPublicationEvent() {
        return publicationEvent;
    }

    /**
     * 
     * @param publicationEvent
     *     The publicationEvent
     */
    public void setPublicationEvent(List<PublicationEvent> publicationEvent) {
        this.publicationEvent = publicationEvent;
    }

    /**
     * 
     * @return
     *     The collection
     */
    public String getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(String collection) {
        this.collection = collection;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public List<Subject_> getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(List<Subject_> subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The subtitling
     */
    public List<Object> getSubtitling() {
        return subtitling;
    }

    /**
     * 
     * @param subtitling
     *     The subtitling
     */
    public void setSubtitling(List<Object> subtitling) {
        this.subtitling = subtitling;
    }

    /**
     * 
     * @return
     *     The interactions
     */
    public List<Interaction_> getInteractions() {
        return interactions;
    }

    /**
     * 
     * @param interactions
     *     The interactions
     */
    public void setInteractions(List<Interaction_> interactions) {
        this.interactions = interactions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
