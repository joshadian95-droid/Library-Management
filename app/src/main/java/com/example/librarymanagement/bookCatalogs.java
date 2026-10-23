package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.BookInfo;
import com.example.librarymanagement.model.global;
import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

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
          int bookCover = global.bookCover;
          int bookCover1 = global.bookCover1;
          int bookCover2 = global.bookCover2;
          int bookCover3 = global.bookCover3;

//        String book = getIntent().getStringExtra("book");
//        String book1 = getIntent().getStringExtra("book1");
//        String book2 = getIntent().getStringExtra("book2");
//        String book3 = getIntent().getStringExtra("book3");

        TextView text = findViewById(R.id.title);
        text.setText(global.book);
        MaterialCardView btnBook = findViewById(R.id.book);

        btnBook.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(title);
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(author);
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(category);
            ((ImageView) popUpView.findViewById(R.id.cover)).setImageResource(bookCover);
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            bookCred(btnBook, bookCover, author, title, "", category);
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                BookInfo bookInfo = new BookInfo(title, author, category, 1, "");
                Intent intent = new Intent(this, Form.class);
                intent.putExtra("BOOK_INFO", bookInfo);
                intent.putExtra("title", title);
                startActivity(intent);
            });
        });

        TextView text1 = findViewById(R.id.title1);
        text1.setText(global.book1);
        MaterialCardView btnBook1 = findViewById(R.id.book1);

        btnBook1.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(title1);
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(author1);
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(category);
            ((ImageView) popUpView.findViewById(R.id.cover)).setImageResource(bookCover1);
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            bookCred(btnBook1, bookCover1,author1, title1, "", category);
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                BookInfo bookInfo = new BookInfo(title1, author1, category, 1, "");
                Intent intent = new Intent(this, Form.class);
                intent.putExtra("BOOK_INFO", bookInfo);
                intent.putExtra("title", title1);
                startActivity(intent);
            });
        });

        TextView text2 = findViewById(R.id.title2);
        text2.setText(global.book2);
        MaterialCardView btnBook2 = findViewById(R.id.book2);

        btnBook2.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(title2);
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(author2);
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(category);
            ((ImageView) popUpView.findViewById(R.id.cover)).setImageResource(bookCover2);
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            bookCred(btnBook2, bookCover2,author2, title2, "", category);
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                BookInfo bookInfo = new BookInfo(title2, author2, category, 1, "");
                Intent intent = new Intent(this, Form.class);
                intent.putExtra("BOOK_INFO", bookInfo);
                intent.putExtra("title", title2);
                startActivity(intent);
            });
        });

        TextView text3 = findViewById(R.id.title3);
        text3.setText(global.book3);
        MaterialCardView btnBook3 = findViewById(R.id.book3);

        btnBook3.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(title3);
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(author3);
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(category);
            ((ImageView) popUpView.findViewById(R.id.cover)).setImageResource(bookCover3);
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            bookCred(btnBook3, bookCover3,author3, title3, "", category);
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                BookInfo bookInfo = new BookInfo(title3, author3, category, 1, "");
                Intent intent = new Intent(this, Form.class);
                intent.putExtra("BOOK_INFO", bookInfo);
                intent.putExtra("title", title3);
                startActivity(intent);
            });
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void bookCred (View cardView, int bookCover, String Author, String title, String description, String category){
        global.book = title;
        global.author = Author;
        global.description = description;
        global.category = category;
        global.bookCover = bookCover;
    }
}