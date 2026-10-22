package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.BookInfo;

public class Form extends AppCompatActivity {

    TextView selectedItemTextView;
    EditText nameEditText, studentNum, contactNum, borrowingDate;
    BookInfo bookInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        if (android.os.Build.VERSION.SDK_INT >= 33) {
            bookInfo = getIntent().getSerializableExtra(
                    "BOOK_INFO", BookInfo.class);
        } else {
            bookInfo = (BookInfo) getIntent()
                    .getSerializableExtra("BOOK_INFO");
        }
        nameEditText = findViewById(R.id.inputName);
        studentNum = findViewById(R.id.inputStudentNo);
        contactNum = findViewById(R.id.inputContactNo);
        borrowingDate = findViewById(R.id.inputborrowDate);
        selectedItemTextView = findViewById(R.id.selectedBook);
        selectedItemTextView.setText(bookInfo.getTitle());
    }
}