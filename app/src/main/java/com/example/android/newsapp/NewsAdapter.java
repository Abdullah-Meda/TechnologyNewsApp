package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getTitle();
        titleTextView.setText(title);

        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getAuthor();
        authorTextView.setText(author);

        TextView dateTextView = listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getPublicationDate();
        dateTextView.setText(date);

        TextView sectionNameTextView = listItemView.findViewById(R.id.section_name_text_view);
        String sectionName = currentNews.getSectionName();
        sectionNameTextView.setText(sectionName);

        ImageView thumbnailImageView = listItemView.findViewById(R.id.thumbnail_image_view);
        String imageUrl = currentNews.getThumbnail();
        Picasso.get().load(imageUrl).into(thumbnailImageView);

        return listItemView;
    }
}
