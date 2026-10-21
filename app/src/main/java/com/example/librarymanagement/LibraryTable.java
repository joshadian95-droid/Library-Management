package com.example.librarymanagement;

public class LibraryTable {
    public static final String TABLE_NAME = "library";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_STUDENT_NUMBER = "studentNum";
    public static final String COLUMN_CONTACT_NUMBER = "contactNum";
    public static final String COLUMN_SELECTED_BOOKS = "selectedBooks";
    public static final String COLUMN_BORROWING_DATE = "borrowingDate";
    public static final String COLUMN_RETURN_DATE = "returnDate";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_STUDENT_NUMBER + " INTEGER,"
                    + COLUMN_CONTACT_NUMBER + " INTEGER,"
                    + COLUMN_SELECTED_BOOKS + " TEXT,"
                    + COLUMN_BORROWING_DATE + " INTEGER,"
                    + COLUMN_RETURN_DATE + " INTEGER"
                    + ") ";

}
