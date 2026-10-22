package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.librarymanagement.model.global;
import com.google.android.material.card.MaterialCardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category);

        bookCategory(findViewById(R.id.ctBtn), "Android Programming Basics", "Michael Torres", "Introduction to Databases", "Robert Santos", "Java Programming Fundamentals", "Daniel Cruz", "Web Development Essentials", "Kevin Reyes", "Computer & Technology");
        bookCategory(findViewById(R.id.mathBtn), "College Algebra", "Marica Garcia", "Discrete Mathematics", "Anthony Kim", "Fundamentals of Statistics", "Patricia Lopez", "Introduction to Calculus", "John Mendoza","Mathematics");
        bookCategory(findViewById(R.id.sciBtn), "Basic Physics", "Richard Flores", "Environmental Science", "Angela Ramos", "General Biology", "Michelle Tan", "General Chemistry", "Christopher Lee", "Science");
        bookCategory(findViewById(R.id.litBtn), "Introduction to Philippine Literature", "Elena Castillo", "Philippine Short Stories", "Ramon Villanueva", "World Literature", "Sophia Hernandez", "Writing and Literature", "Mark Gonzales","Literature");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void bookCategory (View button, String book, String Author,String book1, String Author1, String book2, String Author2, String book3, String Author3, String category) { //View Button fixed the of Button button in xml and the keep crashing shit. Using View instead of MaterialViewCard is much better.
        button.setOnClickListener( v -> {
            Intent intent = new Intent(Category.this, bookCatalogs.class);
            global.book = book;
            global.book1 = book1;
            global.book2 = book2;
            global.book3 = book3;
            global.author = Author;
            global.author1 = Author1;
            global.author2 = Author2;
            global.author3 = Author3;
            global.category = category;
            startActivity(intent);
        });
    }
}