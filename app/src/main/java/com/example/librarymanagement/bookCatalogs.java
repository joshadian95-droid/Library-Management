package com.example.librarymanagement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.global;
import com.google.android.material.card.MaterialCardView;

public class bookCatalogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_catalogs);

          String category = global.category;
          String title = global.book;
          String title1 = global.book1;
          String title2 = global.book2;
          String title3 = global.book3;
          String author = global.author;
          String author1 = global.author1;
          String author2 = global.author2;
          String author3 = global.author3;

//        String book = getIntent().getStringExtra("book");
//        String book1 = getIntent().getStringExtra("book1");
//        String book2 = getIntent().getStringExtra("book2");
//        String book3 = getIntent().getStringExtra("book3");

        TextView text = findViewById(R.id.title);
        text.setText(global.book);
        MaterialCardView btnBook = findViewById(R.id.book);

        TextView text1 = findViewById(R.id.title1);
        text1.setText(global.book1);
        MaterialCardView btnBook1 = findViewById(R.id.book1);

        TextView text2 = findViewById(R.id.title2);
        text2.setText(global.book2);
        MaterialCardView btnBook2 = findViewById(R.id.book2);

        TextView text3 = findViewById(R.id.title3);
        text3.setText(global.book3);
        MaterialCardView btnBook3 = findViewById(R.id.book3);

        bookCred(btnBook, author, title, "", category);
        bookCred(btnBook1, author1, title1, "", category);
        bookCred(btnBook2, author2, title2, "", category);
        bookCred(btnBook3, author3, title3, "", category);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void bookCred (View cardView, String Author, String title, String description, String category){
        global.book = title;
        global.book1 = title;
        global.book2 = title;
        global.book3 = title;
        global.author = Author;
        global.description = description;
        global.category = category;
    }
}