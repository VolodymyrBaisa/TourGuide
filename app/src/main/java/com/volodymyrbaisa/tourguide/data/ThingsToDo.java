package com.volodymyrbaisa.tourguide.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bios on 2/20/2018.
 */

public class ThingsToDo implements Item {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("image")
    private String[] mImage;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("price")
    private String mPrice;
    @SerializedName("time")
    private String mTime;
    @SerializedName("website")
    private String mWebsite;

    public ThingsToDo(String title, String[] image, String location, String price, String time, String website) {
        this.mTitle = title;
        this.mImage = image;
        this.mLocation = location;
        this.mPrice = price;
        this.mTime = time;
        this.mWebsite = website;
    }

    public String getTitle() {
        return mTitle;
    }

    public String[] getImage() {
        return mImage;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getPrice() {
        return mPrice;
    }

    public String getTime() {
        return mTime;
    }

    public String getWebsite() {
        return mWebsite;
    }
}
