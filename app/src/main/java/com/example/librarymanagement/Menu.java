package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        Button catalogBtn = findViewById(R.id.catalogBtn);
        Button cateBtn = findViewById(R.id.categoryBtn);
        Button backBtn = findViewById(R.id.backBtn);

        catalogBtn.setOnClickListener( v -> {
            Intent intent = new Intent(Menu.this, Catalog.class);
            startActivity(intent);
        });

        backBtn.setOnClickListener( v -> {
            Intent intent = new Intent(Menu.this, MainActivity.class);
            startActivity(intent);
        });

        cateBtn.setOnClickListener( v -> {
            Intent intent = new Intent(this, Category.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}