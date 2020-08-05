package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        News currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getTitle();
        titleTextView.setText(title);

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getAuthor();
        authorTextView.setText(author);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getPublicationDate();
        dateTextView.setText(date);

        TextView sectionNameTextView = (TextView) listItemView.findViewById(R.id.section_name_text_view);
        String sectionName = currentNews.getSectionName();
        sectionNameTextView.setText(sectionName);

        ImageView thumbnailImageView = (ImageView) listItemView.findViewById(R.id.thumbnail_image_view);
        Drawable thumbnail = QueryUtils.LoadImageFromWebOperations(currentNews.getWebUrl());
        thumbnailImageView.setImageDrawable(thumbnail);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
