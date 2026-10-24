package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.global;
import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class bookCatalogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_catalogs);

        ArrayList<global> books = (ArrayList<global>) getIntent().getSerializableExtra("books");

        ((TextView) findViewById(R.id.title)).setText(books.get(0).getTitle()); //Use this to get the value of the title in the arraylist
        ((TextView) findViewById(R.id.title1)).setText(books.get(1).getTitle());
        ((TextView) findViewById(R.id.title2)).setText(books.get(2).getTitle());
        ((TextView) findViewById(R.id.title3)).setText(books.get(3).getTitle());

        MaterialCardView btnBook = findViewById(R.id.book);

        btnBook.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(books.get(0).getTitle());
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(books.get(0).getAuthor());
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(books.get(0).getCategory());
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                Intent intent = new Intent(this, Form.class);
                startActivity(intent);
            });
        });

        MaterialCardView btnBook1 = findViewById(R.id.book1);

        btnBook1.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(books.get(1).getTitle());
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(books.get(1).getAuthor());
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(books.get(0).getCategory());
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                Intent intent = new Intent(this, Form.class);
                startActivity(intent);
            });
        });

        MaterialCardView btnBook2 = findViewById(R.id.book2);

        btnBook2.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(books.get(2).getTitle());
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(books.get(2).getAuthor());
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(books.get(0).getCategory());
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                Intent intent = new Intent(this, Form.class);
                startActivity(intent);
            });
        });

        MaterialCardView btnBook3 = findViewById(R.id.book3);

        btnBook3.setOnClickListener(v -> {
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            View popUpView =getLayoutInflater().inflate(R.layout.bookpopup, null);

            ((TextView) popUpView.findViewById(R.id.TitleSet)).setText(books.get(3).getTitle());
            ((TextView) popUpView.findViewById(R.id.AuthorSet)).setText(books.get(3).getAuthor());
            ((TextView) popUpView.findViewById(R.id.CategorySet)).setText(books.get(0).getCategory());
            builder.setView(popUpView);

            AlertDialog dialog = builder.create();
            dialog.show();

            Button butonton = popUpView.findViewById(R.id.borrowBtn);
            butonton.setOnClickListener(view -> {
                Intent intent = new Intent(this, Form.class);
                startActivity(intent);
            });
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}