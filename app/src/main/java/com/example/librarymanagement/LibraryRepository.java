package com.example.librarymanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

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

    public boolean insertLibrary(LibraryModel library) {

               ContentValues values = new ContentValues();
               values.put(LibraryTable.COLUMN_NAME, library.getName());
               values.put(LibraryTable.COLUMN_STUDENT_NUMBER, library.getStudentNum());
               values.put(LibraryTable.COLUMN_CONTACT_NUMBER, library.getContactNum());
               values.put(LibraryTable.COLUMN_SELECTED_BOOKS, library.getSelectedBooks());
               values.put(LibraryTable.COLUMN_BORROWING_DATE, library.getBorrowingDate());
               values.put(LibraryTable.COLUMN_RETURN_DATE, library.getReturnDate());

               long newRowId = db.insert(LibraryTable.TABLE_NAME, null, values);
               return newRowId != -1;
    }

}
