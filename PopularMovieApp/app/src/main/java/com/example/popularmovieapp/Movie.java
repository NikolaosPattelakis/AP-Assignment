package com.example.popularmovieapp;

public class Movie {

    private String mImageUrl;
    private String mTitle;
    private int mPopularity;
    private String mDescription;


    public Movie(String imageUrl, String title, int popularity){
        this.mImageUrl =imageUrl;
        this.mTitle = title;
        this.mPopularity = popularity;
    }

    public Movie(String imageUrl, String title, int popularity, String description){
        this.mImageUrl =imageUrl;
        this.mTitle = title;
        this.mPopularity = popularity;
        this.mDescription = description;
    }

    public String getImageUrl(){
        return mImageUrl;
    }

    public String getTitle(){
        return mTitle;
    }

    public int getPopularity(){
        return mPopularity;
    }

    public String getDescription(){
        return mDescription;
    }
}
