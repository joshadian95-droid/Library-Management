package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category);

        bookCategory(findViewById(R.id.ctBtn), "Android Programming Basics", "Introduction to Databases", "Java Programming Fundamentals", "Web Development Essentials");
        bookCategory(findViewById(R.id.mathBtn), "College Algebra", "Discrete Mathematics", "Fundamentals of Statistics", "Introduction to Calculus");
        bookCategory(findViewById(R.id.sciBtn), "Basic Physics", "Environmental Science", "General Biology", "General Chemistry");
        bookCategory(findViewById(R.id.litBtn), "Introduction to Philippine Literature", "Philippine Short Stories", "World Literature", "Writing and Literature");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void bookCategory (Button button, String book, String book1, String book2, String book3) {
        button.setOnClickListener( v -> {
            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("book", book);
            intent.putExtra("book1", book1);
            intent.putExtra("book2", book2);
            intent.putExtra("book3", book3);
            startActivity(intent);
        });

    }
}