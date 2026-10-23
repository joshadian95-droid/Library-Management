package com.example.librarymanagement;

public class BooksTable {
    public static final String TABLE_NAME = "books";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_IMAGE_NAME = "imageName";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_AUTHOR = "author";
    public static final String COLUMN_CATEGORY = "category";
    public static final String COLUMN_AVAILABILITY = "availability";
    public static final String COLUMN_SHORT_DESCRIPTION = "shortDescription";


    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_TITLE + " TEXT,"
                    + COLUMN_IMAGE_NAME + " TEXT,"
                    + COLUMN_AUTHOR + " TEXT,"
                    + COLUMN_CATEGORY + " TEXT,"
                    + COLUMN_AVAILABILITY + " INTEGER,"
                    + COLUMN_SHORT_DESCRIPTION + " TEXT"
                    + ") ";
}
