package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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

        bookCategory(findViewById(R.id.ctBtn), R.drawable.android_programming_basics,"Android Programming Basics", "Michael Torres", R.drawable.introduction_to_databases, "Introduction to Databases", "Robert Santos", R.drawable.java_programming_fundamentals,"Java Programming Fundamentals", "Daniel Cruz", R.drawable.web_development_essentials,"Web Development Essentials", "Kevin Reyes", "Computer & Technology");
        bookCategory(findViewById(R.id.mathBtn), R.drawable.college_algebra, "College Algebra", "Marica Garcia", R.drawable.discrete_mathematics,"Discrete Mathematics", "Anthony Kim", R.drawable.fundamentals_of_statistics,"Fundamentals of Statistics", "Patricia Lopez", R.drawable.introduction_to_calculus,"Introduction to Calculus", "John Mendoza","Mathematics");
        bookCategory(findViewById(R.id.sciBtn), R.drawable.basic_of_physics,"Basic Physics", "Richard Flores", R.drawable.environmental_science,"Environmental Science", "Angela Ramos", R.drawable.general_biology,"General Biology", "Michelle Tan", R.drawable.general_chemistry,"General Chemistry", "Christopher Lee", "Science");
        bookCategory(findViewById(R.id.litBtn), R.drawable.introduction_to_philippine_literature,"Introduction to Philippine Literature", "Elena Castillo", R.drawable.philippine_short_stories,"Philippine Short Stories", "Ramon Villanueva", R.drawable.world_literature,"World Literature", "Sophia Hernandez", R.drawable.writing_and_literature,"Writing and Literature", "Mark Gonzales","Literature");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void bookCategory (View button, int bookCover, String book, String Author, int bookCover1, String book1, String Author1, int bookCover2, String book2, String Author2, int bookCover3, String book3, String Author3, String category) { //View Button fixed the of Button button in xml and the keep crashing shit. Using View instead of MaterialViewCard is much better.
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
            global.bookCover = bookCover;
            global.bookCover1 = bookCover1;
            global.bookCover2= bookCover2;
            global.bookCover3 = bookCover3;
            startActivity(intent);
        });
    }
}