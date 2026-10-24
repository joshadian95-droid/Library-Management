package com.example.librarymanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.librarymanagement.model.BookInfo;
import com.example.librarymanagement.model.LibraryModel;

import java.util.ArrayList;
import java.util.List;

public class BorrowInfoRepository {
    private DatabaseHelper dbHelper;
    private SQLiteDatabase db;
    public BorrowInfoRepository(Context context) {
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

        long result = db.insert(LibraryTable.TABLE_NAME, null, values);
        return result != -1;
    }

    public List<LibraryModel> getLibrary() {

        List<LibraryModel> libraryInfo = new ArrayList<>();


        Cursor cursor = db.rawQuery(
                "SELECT * FROM " + LibraryTable.TABLE_NAME,
                null
        );

        while (cursor.moveToNext()) {

            String name = cursor.getString(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_NAME)
            );

            int studentNum = cursor.getInt(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_STUDENT_NUMBER)
            );

            int contactNum = cursor.getInt(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_CONTACT_NUMBER)
            );

            String selectedBook = cursor.getString(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_SELECTED_BOOKS)
            );

            String borrowingDate = cursor.getString(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_BORROWING_DATE)
            );

            String returnDate = cursor.getString(
                    cursor.getColumnIndexOrThrow(LibraryTable.COLUMN_RETURN_DATE)
            );
            libraryInfo.add(new LibraryModel(name,  studentNum, contactNum, selectedBook, borrowingDate, returnDate));
        }
        cursor.close();

        return libraryInfo;
    }
}
