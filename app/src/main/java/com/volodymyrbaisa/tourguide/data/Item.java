package com.volodymyrbaisa.tourguide.data;

/**
 * Created by Bios on 2/18/2018.
 */

public class Item {
    private int mId;
    private String mTitle;
    private String[] mImage;
    private String mLocation;
    private String mPrice;
    private String mTime;
    private String mWebsite;

    public Item(int id, String title, String[] image, String location, String price, String time, String website) {
        mId = id;
        mTitle = title;
        mImage = image;
        mLocation = location;
        mPrice = price;
        mTime = time;
        mWebsite = website;
    }

    public int getId() {
        return mId;
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
