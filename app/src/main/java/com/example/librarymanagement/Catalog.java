package com.example.librarymanagement;

import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Catalog extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_catalog);

        //SearchView and ListView Methods.
        searchView = findViewById(R.id.categorySearch);
        listView = findViewById(R.id.list_item);

        list = new ArrayList();
        list.add("Android Programming Basics");
        list.add("Introduction to Databases");
        list.add("Java Programming Fundamentals");
        list.add("Web Development Essentials");
        list.add("College Algebra");
        list.add("Discrete Mathematics");
        list.add("Fundamentals of Statistics");
        list.add("Introduction to Calculus");
        list.add("Basic Physics");
        list.add("Environmental Science");
        list.add("General Biology");
        list.add("General Chemistry");
        list.add("Introduction to Philippine Literature");
        list.add("Philippine Short Stories");
        list.add("World Literature");
        list.add("Writing and Literature");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnSearchClickListener(v -> { //changing the visibility of ListView into Visible
            listView.setVisibility(View.VISIBLE);
        });

        searchView.setOnCloseListener(() -> { //changing the visibility of ListView into gone when user click the x button
            listView.setVisibility(View.GONE);
            return false;
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void bookCat(Button butonton, String author, String title, String category){
        butonton.setOnClickListener(v -> {

        });
    }
}