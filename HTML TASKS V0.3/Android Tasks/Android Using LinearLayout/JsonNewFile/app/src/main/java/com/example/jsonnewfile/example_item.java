package com.example.jsonnewfile;

public class example_item {

    private String mImageUrl;
    private String mcreator;
    private int mLikes;

    public example_item(String imageUrl, String creator, int likes) {
        mImageUrl = imageUrl;
        mcreator = creator;
        mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mcreator;
    }

    public int getLikeCount() {
        return mLikes;
    }


}