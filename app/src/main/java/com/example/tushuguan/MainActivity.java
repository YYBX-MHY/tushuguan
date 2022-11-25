package com.example.tushuguan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*用add_book传进来的参数生成book在main*/


        /*从主页面跳转到书登记信息的页面*/
        ImageButton button_add_book = findViewById(R.id.add_book_button);
        button_add_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, add_book_Activity.class);
                startActivity(intent);
            }
        });

        /*从主页面跳转到图书信息的页面*/
        Button book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, book_show_Activity.class);
                startActivity(intent);
            }
        });
        /*书本长按事件*/
        book.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View V){

                return false;
            }
        });

    }
}