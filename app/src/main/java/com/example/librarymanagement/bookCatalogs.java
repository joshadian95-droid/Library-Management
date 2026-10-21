package com.example.librarymanagement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class bookCatalogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_catalogs);

        String book = getIntent().getStringExtra("book");
        String book1 = getIntent().getStringExtra("book1");
        String book2 = getIntent().getStringExtra("book2");
        String book3 = getIntent().getStringExtra("book3");

        TextView text = findViewById(R.id.title);
        text.setText(book);
        MaterialCardView btnBook = findViewById(R.id.book);

        TextView text1 = findViewById(R.id.title1);
        text1.setText(book1);
        MaterialCardView btnBook1 = findViewById(R.id.book1);

        TextView text2 = findViewById(R.id.title2);
        text2.setText(book2);
        MaterialCardView btnBook2 = findViewById(R.id.book2);

        TextView text3 = findViewById(R.id.title3);
        text3.setText(book3);
        MaterialCardView btnBook3 = findViewById(R.id.book3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}