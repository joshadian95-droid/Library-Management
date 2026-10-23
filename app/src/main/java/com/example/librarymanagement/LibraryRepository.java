package com.example.librarymanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.librarymanagement.model.BookInfo;
import com.example.librarymanagement.model.LibraryModel;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private DatabaseHelper dbHelper;
    private SQLiteDatabase db;
           public LibraryRepository(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }


    public List<BookInfo> getBookInfo() {

        List<BookInfo> BookInfoList = new ArrayList<>();


        Cursor cursor = db.rawQuery(
                "SELECT * FROM " + BooksTable.TABLE_NAME,
                null
        );

        while (cursor.moveToNext()) {

            String title = cursor.getString(
                    cursor.getColumnIndexOrThrow(BooksTable.COLUMN_TITLE)
            );

            String author = cursor.getString(
                    cursor.getColumnIndexOrThrow(BooksTable.COLUMN_AUTHOR)
            );

            String category = cursor.getString(
                    cursor.getColumnIndexOrThrow(BooksTable.COLUMN_CATEGORY)
            );

            int availability = cursor.getInt(
                    cursor.getColumnIndexOrThrow(BooksTable.COLUMN_AVAILABILITY)
            );

            String shortDescription = cursor.getString(
                    cursor.getColumnIndexOrThrow(BooksTable.COLUMN_SHORT_DESCRIPTION)
            );
            BookInfoList.add(new BookInfo(title,  author, category, availability, shortDescription));
        }
        cursor.close();

        return BookInfoList;
    }
}
