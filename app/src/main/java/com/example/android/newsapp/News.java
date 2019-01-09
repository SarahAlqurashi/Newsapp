package com.example.android.newsapp;



public class News {
    String sectionName;
    String Title;
    String url;
    String PublicationDate;
    String author;

    public News(String sectionName, String title, String publicationDate, String url, String author) {
        this.sectionName = sectionName;
        Title = title;
        this.url = url;
        PublicationDate = publicationDate;
        this.author = author;
    }

    public News(String sectionName, String title, String publicationDate, String url) {
        this.sectionName = sectionName;
        Title = title;
        this.url = url;
        PublicationDate = publicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }


    public String getTitle() {
        return Title;
    }


    public String getUrl() {
        return url;
    }

    public String getPublicationDate() {
        return PublicationDate;
    }


    public String getAuthor() {
        return author;
    }

}