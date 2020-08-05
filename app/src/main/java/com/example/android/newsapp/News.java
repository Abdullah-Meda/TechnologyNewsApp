package com.example.android.newsapp;

import android.graphics.drawable.Drawable;

public class News {

    private String mSectionName;
    private String mPublicationDate;
    private String mTitle;
    private String mWebUrl;
    private Drawable mThumbnail;
    private String mAuthor;

    public News (String sectionName, String publicationDate, String title, String webUrl, Drawable thumbnail, String author) {
        mSectionName = sectionName;
        mPublicationDate = publicationDate;
        mTitle = title;
        mWebUrl = webUrl;
        mThumbnail = thumbnail;
        mAuthor = author;
    }

    public String getSectionName() { return mSectionName; }
    public String getPublicationDate() { return mPublicationDate; }
    public String getTitle() { return mTitle; }
    public String getWebUrl() { return mWebUrl; }
    public Drawable getThumbnail() { return mThumbnail; }
    public String getAuthor() { return mAuthor; }
}
