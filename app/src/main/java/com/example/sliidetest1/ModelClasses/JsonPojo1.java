
package com.example.sliidetest1.ModelClasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonPojo1 {

    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
