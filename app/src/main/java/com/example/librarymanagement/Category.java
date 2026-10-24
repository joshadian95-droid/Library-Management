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
            books.add(new global("Android Programming Basics", "Michael Torres", "", "Computer & Technology", R.drawable.android_programming_basics));
            books.add(new global("Introduction to Databases", "Robert Santos", "", "Computer & Technology", R.drawable.introduction_to_databases));
            books.add(new global("Java Programming Fundamentals", "Daniel Cruz", "", "Computer & Technology", R.drawable.java_programming_fundamentals));
            books.add(new global("Web Development Essentials", "Kevin Reyes", "", "Computer & Technology", R.drawable.web_development_essentials));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });

        mathCat = findViewById(R.id.mathBtn);
        mathCat.setOnClickListener(v -> {
            ArrayList<global> books =new ArrayList<>();
            books.add(new global("College Algebra", "Maria Garcia", "", "Mathematics", R.drawable.college_algebra));
            books.add(new global("Discrete Mathematics", "Anthony Lim", "", "Mathematics", R.drawable.discrete_mathematics));
            books.add(new global("Fundamentals of Statistics", "Patricia Lopez", "", "Mathematics", R.drawable.fundamentals_of_statistics));
            books.add(new global("Introduction of Calculus", "John Mendoza", "", "Mathematics", R.drawable.introduction_to_calculus));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });
        sciCat = findViewById(R.id.sciBtn);
        sciCat.setOnClickListener(v -> {
            ArrayList<global> books =new ArrayList<>();
            books.add(new global("Basic Physics", "Richard Flores", "", "Science", R.drawable.basic_of_physics));
            books.add(new global("Environmental Science", "Angela Ramos", "", "Science", R.drawable.environmental_science));
            books.add(new global("General Biology", "Michelle Tan", "", "Science", R.drawable.general_biology));
            books.add(new global("General Chemistry", "Christopher Lee", "", "Science", R.drawable.general_chemistry));

            Intent intent = new Intent(Category.this, bookCatalogs.class);
            intent.putExtra("books", books);
            startActivity(intent);
        });
        litCat = findViewById(R.id.litBtn);

        litCat.setOnClickListener(v -> {
            ArrayList<global> books = new ArrayList<>();
            books.add(new global("Introduction to Philippine Literature", "Elena Castillo", "", "Literature", R.drawable.introduction_to_philippine_literature));
            books.add(new global("Philippine Short Stories", "Ramos Villanueva","","Literature", R.drawable.philippine_short_stories));
            books.add(new global("World Literature", "Sophia Hernandez","","Literature", R.drawable.world_literature));
            books.add(new global("Writing and Literature", "Mark Gonzales","","Literature", R.drawable.writing_and_literature));
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}