package com.example.librarymanagement.model;

import java.io.Serializable;

public class BookInfo implements Serializable {
    private String title;
    private String author;
    private String category;
    private int availability;
    private String description;

    public BookInfo(String title, String author, String category, int availability, String description) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.availability = availability;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getAvailability() {
        return availability;
    }

    public String getDescription() {
        return description;
    }
}
