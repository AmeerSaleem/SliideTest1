
package com.example.sliidetest1.ModelClasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("contentId")
    @Expose
    private String contentId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("contentSource")
    @Expose
    private String contentSource;
    @SerializedName("contentSourceDisplay")
    @Expose
    private String contentSourceDisplay;
    @SerializedName("contentSourceLogo")
    @Expose
    private String contentSourceLogo;
    @SerializedName("categories")
    @Expose
    private List<String> categories = null;
    @SerializedName("categoriesEnglish")
    @Expose
    private List<String> categoriesEnglish = null;
    @SerializedName("verticals")
    @Expose
    private List<String> verticals = null;
    @SerializedName("verticalsEnglish")
    @Expose
    private List<String> verticalsEnglish = null;
    @SerializedName("iabCategories")
    @Expose
    private List<Integer> iabCategories = null;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("countries")
    @Expose
    private List<String> countries = null;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("publishedAt")
    @Expose
    private Integer publishedAt;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("persons")
    @Expose
    private List<Person> persons = null;
    @SerializedName("topics")
    @Expose
    private List<Topic> topics = null;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("isPreview")
    @Expose
    private Boolean isPreview;
    @SerializedName("gaId")
    @Expose
    private String gaId;
    @SerializedName("contentURL")
    @Expose
    private String contentURL;
    @SerializedName("recommendationId")
    @Expose
    private String recommendationId;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContentSource() {
        return contentSource;
    }

    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    public String getContentSourceDisplay() {
        return contentSourceDisplay;
    }

    public void setContentSourceDisplay(String contentSourceDisplay) {
        this.contentSourceDisplay = contentSourceDisplay;
    }

    public String getContentSourceLogo() {
        return contentSourceLogo;
    }

    public void setContentSourceLogo(String contentSourceLogo) {
        this.contentSourceLogo = contentSourceLogo;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getCategoriesEnglish() {
        return categoriesEnglish;
    }

    public void setCategoriesEnglish(List<String> categoriesEnglish) {
        this.categoriesEnglish = categoriesEnglish;
    }

    public List<String> getVerticals() {
        return verticals;
    }

    public void setVerticals(List<String> verticals) {
        this.verticals = verticals;
    }

    public List<String> getVerticalsEnglish() {
        return verticalsEnglish;
    }

    public void setVerticalsEnglish(List<String> verticalsEnglish) {
        this.verticalsEnglish = verticalsEnglish;
    }

    public List<Integer> getIabCategories() {
        return iabCategories;
    }

    public void setIabCategories(List<Integer> iabCategories) {
        this.iabCategories = iabCategories;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Integer publishedAt) {
        this.publishedAt = publishedAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Boolean getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
    }

    public String getGaId() {
        return gaId;
    }

    public void setGaId(String gaId) {
        this.gaId = gaId;
    }

    public String getContentURL() {
        return contentURL;
    }

    public void setContentURL(String contentURL) {
        this.contentURL = contentURL;
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

}
