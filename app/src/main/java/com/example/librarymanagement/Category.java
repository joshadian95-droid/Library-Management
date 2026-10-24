package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.librarymanagement.model.global;
import com.google.android.material.card.MaterialCardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Category extends AppCompatActivity {

    MaterialCardView techCat, mathCat, sciCat, litCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category);
        techCat = findViewById(R.id.ctBtn);
        techCat.setOnClickListener(v -> {

            ArrayList<global> books =new ArrayList<>();
            books.add(new global("Android Programming Basics", "Michael Torres", "", "Computer & Technology"));
            books.add(new global("Introduction to Databases", "Robert Santos", "", "Computer & Technology"));
            books.add(new global("Java Programming Fundamentals", "Daniel Cruz", "", "Computer & Technology"));
            books.add(new global("Web Development Essentials", "Kevin Reyes", "", "Computer & Technology"));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });

        mathCat = findViewById(R.id.mathBtn);
        mathCat.setOnClickListener(v -> {
            ArrayList<global> books =new ArrayList<>();
            books.add(new global("College Algebra", "Maria Garcia", "", "Mathematics"));
            books.add(new global("Discrete Mathematics", "Anthony Lim", "", "Mathematics"));
            books.add(new global("Fundamentals of Statistics", "Patricia Lopez", "", "Mathematics"));
            books.add(new global("Introduction of Calculus", "John Mendoza", "", "Mathematics"));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });
        sciCat = findViewById(R.id.sciBtn);
        sciCat.setOnClickListener(v -> {
            ArrayList<global> books =new ArrayList<>();
            books.add(new global("Basic Physics", "Richard Flores", "", "Science"));
            books.add(new global("Environmental Science", "Angela Ramos", "", "Science"));
            books.add(new global("General Biology", "Michelle Tan", "", "Science"));
            books.add(new global("General Chemistry", "Christopher Lee", "", "Science"));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });
        litCat = findViewById(R.id.litBtn);

        litCat.setOnClickListener(v -> {
            ArrayList<global> books = new ArrayList<>();
            books.add(new global("Introduction to Philippine Literature", "Elena Castillo", "", "Literature"));
            books.add(new global("Philippine Short Stories", "Ramos Villanueva","",""));
            books.add(new global("World Literature", "Sophia Hernandez","",""));
            books.add(new global("Writing and Literature", "Mark Gonzales","",""));
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}