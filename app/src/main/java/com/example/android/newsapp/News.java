package com.example.android.newsapp;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class News {

    private String mSectionName;
    private String mPublicationDate;
    private String mTitle;
    private String mWebUrl;
    private String mThumbnail;
    private String mAuthor;

    public News (String sectionName, String publicationDate, String title, String webUrl, String thumbnail, String author) {
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
    public String getThumbnail() { return mThumbnail; }
    public String getAuthor() { return mAuthor; }
}
