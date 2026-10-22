package com.example.librarymanagement;

import static com.example.librarymanagement.model.global.author;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.librarymanagement.model.BookInfo;

public class BorrowDialog extends Dialog {

    public interface OnBorrowClickListener {
        void onBorrow(BookInfo bookInfo);
    }

    public BorrowDialog(
            Context context,
            BookInfo bookInfo,
            OnBorrowClickListener listener) {

        super(context);

        setContentView(R.layout.bookpopup);

        // Set book details
        ((TextView) findViewById(R.id.TitleSet)).setText(bookInfo.getTitle());
        ((TextView) findViewById(R.id.AuthorSet)).setText(bookInfo.getAuthor());
        ((TextView) findViewById(R.id.CategorySet)).setText(bookInfo.getCategory());
        ((TextView) findViewById(R.id.AvailabilitySet)).setText(bookInfo.getAvailability() + "");
        ((TextView) findViewById(R.id.DescriptionSet)).setText(bookInfo.getDescription());

        // Dialog appearance
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(
                    new ColorDrawable(Color.TRANSPARENT));

            getWindow().setLayout(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        }

        // Borrow button
        Button borrowBtn = findViewById(R.id.borrowBtn);

        borrowBtn.setOnClickListener(v -> {
            if (listener != null) {
                listener.onBorrow(bookInfo);
            }
            dismiss();
        });
    }
}
