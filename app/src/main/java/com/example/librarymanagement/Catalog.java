package com.example.librarymanagement;

import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.BookInfo;

import java.util.ArrayList;
import java.util.List;

public class Catalog extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    List<BookInfo> bookInfoList = new ArrayList<>();
    LibraryRepository libraryRepository;
    //ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_catalog);

        libraryRepository = new LibraryRepository(this);
        bookInfoList = libraryRepository.getBookInfo();


        //SearchView and ListView Methods.
        searchView = findViewById(R.id.categorySearch);
        listView = findViewById(R.id.list_item);

        initListView();

        searchView.setOnSearchClickListener(v -> { //changing the visibility of ListView into Visible
            listView.setVisibility(View.VISIBLE);
        });

        searchView.setOnCloseListener(() -> { //changing the visibility of ListView into gone when user click the x button
            //listView.setVisibility(View.GONE);
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

 //   private void bookCat(Button butonton, String author, String title, String category){
   //     butonton.setOnClickListener(v -> {
//});
    private void initListView(){
        List<String> list = new ArrayList<>();
        for (BookInfo bookInfo : bookInfoList) {
            list.add(bookInfo.getTitle());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                list
        );

        listView.setAdapter(adapter);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            // Get the selected title
            String selectedItem = list.get(position);

            // Get the original BookInfo object using the position
            BookInfo selectedBook = bookInfoList.get(position);

            // Pass the selected BookInfo to BorrowDialog
            BorrowDialog dialog = new BorrowDialog(
                    Catalog.this,
                    selectedBook,
                    book -> {
                        Intent intent = new Intent(Catalog.this, Form.class);
                        intent.putExtra("BOOK_INFO", book);
                        startActivity(intent);
                    }
            );

            dialog.show();
        });
    }
}