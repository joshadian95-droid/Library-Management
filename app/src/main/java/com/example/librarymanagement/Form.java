package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.librarymanagement.model.BookInfo;
import com.example.librarymanagement.model.LibraryModel;

import java.util.List;

public class Form extends AppCompatActivity {

    private BorrowInfoRepository borrowInfoRepository;
    TextView selectedItemTextView;
    EditText nameEditText, studentNum, contactNum, selectedBooks, borrowingDate, returnDate;
    private Button confirmBtn;
    BookInfo bookInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameEditText = findViewById(R.id.inputName);
        studentNum = findViewById(R.id.inputStudentNo);
        contactNum = findViewById(R.id.inputContactNo);
        borrowingDate = findViewById(R.id.inputborrowDate);
        returnDate = findViewById(R.id.inputReturnDate);
        selectedItemTextView = findViewById(R.id.selectedBook);
<<<<<<< HEAD
//        selectedItemTextView.setText(bookInfo.getTitle());

        String title = getIntent().getStringExtra("title");

//        if (android.os.Build.VERSION.SDK_INT >= 33) {
//            bookInfo = getIntent().getSerializableExtra(
//                    "BOOK_INFO", BookInfo.class);
//        } else {
//            bookInfo = (BookInfo) getIntent()
//                    .getSerializableExtra("BOOK_INFO");
//        }
//
//        if (bookInfo != null){
//            selectedItemTextView.setText(bookInfo.getTitle());
//        }
//
//        else {
//            selectedItemTextView.setText(title);
//        }

        if (android.os.Build.VERSION.SDK_INT >= 33) {
            bookInfo = getIntent().getSerializableExtra("BOOK_INFO", BookInfo.class);
        } else {
            bookInfo = (BookInfo) getIntent().getSerializableExtra("BOOK_INFO");
        }

        if (bookInfo != null) {
            selectedItemTextView.setText(bookInfo.getTitle());
        } else if (title != null) {
            selectedItemTextView.setText(title);
        }

=======
        selectedItemTextView.setText(bookInfo.getTitle());
        confirmBtn = findViewById(R.id.confirmBtn);
        borrowInfoRepository = new BorrowInfoRepository(this);

        confirmBtn.setOnClickListener(v -> {

            String name = nameEditText.getText().toString().trim();
            String studentNo = studentNum.getText().toString().trim();
            String contactNo = contactNum.getText().toString().trim();
            String selectedBook = selectedBooks.getText().toString().trim();
            String borrowDate = borrowingDate.getText().toString().trim();
            String returnD8 = returnDate.getText().toString().trim();

            if (name.isEmpty()){
                Toast.makeText(this, "Please Enter your Name!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (studentNo.isEmpty()){
                Toast.makeText(this, "Please Enter your Student Number!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (contactNo.isEmpty()){
                Toast.makeText(this, "Please Enter your Contact Number!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (borrowDate.isEmpty()){
                Toast.makeText(this, "Please Input Date!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (returnD8.isEmpty()){
                Toast.makeText(this, "Please Input Return Date!", Toast.LENGTH_SHORT).show();
                return;
            }

            LibraryModel library = new LibraryModel(
                    name,
                    Integer.parseInt(studentNo),
                    Integer.parseInt(contactNo),
                    selectedBook,
                    borrowDate,
                    returnD8
            );

            if(borrowInfoRepository.insertLibrary(library)){
                Toast.makeText(this,"saved successfully!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });
    }

<<<<<<< HEAD
=======
        List<LibraryModel> library = borrowInfoRepository.getLibraryModel();

        StringBuilder result = new StringBuilder();

        for (LibraryModel library : library) {

            result.append("Name: ")
                    .append(library.getName())
                    .append("\n");

            result.append("Student Number: ")
                    .append(library.getStudentNum())
                    .append("\n");

            result.append("Contact Number: ")
                    .append(library.getContactNum())
                    .append("\n");


            result.append("Borrow Date: ")
                    .append(library.getBorrowingDate())
                    .append("\n");

            result.append("Return Date: ")
                    .append(library.getReturnDate())
                    .append("\n");
        }
>>>>>>> 1e05f9d066d661713210bbfd4c27a615d88d12fc
    }
>>>>>>> aec2ab72009fdb231d2e59d12eddf33970bd4066
}