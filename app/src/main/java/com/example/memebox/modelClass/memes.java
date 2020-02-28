package com.example.memebox.modelClass;

import com.google.gson.annotations.SerializedName;

public class memes {
    @SerializedName("sno")
    private int sno;
    @SerializedName("category")
    private String category;
    @SerializedName("location")
    private String location;
    @SerializedName("name")
    private String name;

    public memes(int sno, String category, String location, String name) {
        this.sno = sno;
        this.category = category;
        this.location = location;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
