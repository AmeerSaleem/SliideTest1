
package com.example.sliidetest1.ModelClasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("mainImage")
    @Expose
    private MainImage mainImage;
    @SerializedName("mainImageThumbnail")
    @Expose
    private MainImageThumbnail mainImageThumbnail;
    @SerializedName("additionalImages")
    @Expose
    private List<Object> additionalImages = null;

    public MainImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    public MainImageThumbnail getMainImageThumbnail() {
        return mainImageThumbnail;
    }

    public void setMainImageThumbnail(MainImageThumbnail mainImageThumbnail) {
        this.mainImageThumbnail = mainImageThumbnail;
    }

    public List<Object> getAdditionalImages() {
        return additionalImages;
    }

    public void setAdditionalImages(List<Object> additionalImages) {
        this.additionalImages = additionalImages;
    }

}
