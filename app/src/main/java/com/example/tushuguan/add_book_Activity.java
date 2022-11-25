package com.example.tushuguan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class add_book_Activity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_book);
        findViewById(R.id.finish).setOnClickListener(this);
        findViewById(R.id.tu_pian).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.finish) {
            // 结束图书录入
            Intent intent = new Intent();
            Bundle tushu = new Bundle();
            TextView book_title = findViewById(R.id.book_title);
            tushu.putString("title",book_title.getText().toString());
            TextView book_authon = findViewById(R.id.book_authon);
            tushu.putString("title",book_authon.getText().toString());
            TextView book_Publisher = findViewById(R.id.book_Publisher);
            tushu.putString("title",book_Publisher.getText().toString());
            TextView book_introduction = findViewById(R.id.book_introduction);
            tushu.putString("title",book_introduction.getText().toString());
            intent.putExtras(tushu);
            intent.setClass(add_book_Activity.this, MainActivity.class);
            startActivity(intent);

        }
    }
}
