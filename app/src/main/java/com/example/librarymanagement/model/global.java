package com.example.librarymanagement.model;

import java.io.Serializable;
import java.util.ArrayList;

public class global implements Serializable {

    private String title;
    private String author;
    private String description;
    private String category;

    public global(String title, String author, String description, String category) {

        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

}
