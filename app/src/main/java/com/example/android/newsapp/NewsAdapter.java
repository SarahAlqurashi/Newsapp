package com.example.android.newsapp;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        // Find the TextView with view ID section_name
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionView.setText(currentNews.getSectionName());

        //change  the  background color based on the current news secation
        GradientDrawable SectionCircle = (GradientDrawable) sectionView.getBackground();
        int SectionColor = getSectionColor(currentNews.getSectionName());
        SectionCircle.setColor(SectionColor);


        // Find the TextView with view ID title
        TextView TitleView = (TextView) listItemView.findViewById(R.id.title);
        TitleView.setText(currentNews.getTitle());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.PublicationDate);
        dateView.setText(currentNews.getPublicationDate());

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    private int getSectionColor(String Section) {
        int SectionColorResourceId;
        switch (Section.toLowerCase()) {
            case "science":
                SectionColorResourceId = R.color.science_section;
                break;
            case "technology":
                SectionColorResourceId = R.color.technologyـsection;
                break;
            default:
                SectionColorResourceId = R.color.science_section;
                break;
        }

        return ContextCompat.getColor(getContext(), SectionColorResourceId);
    }

}
