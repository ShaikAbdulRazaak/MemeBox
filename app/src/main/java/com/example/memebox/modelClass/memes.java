package com.example.memebox.modelClass;

import com.google.gson.annotations.SerializedName;

public class memes {
    @SerializedName("url")
    private
    String url;
    @SerializedName("title")
    private
    String title;

    public memes( String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
