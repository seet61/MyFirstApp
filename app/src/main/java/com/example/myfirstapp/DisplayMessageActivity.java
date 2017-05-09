package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //получение открываюшего Intent и его переменных
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Устанавливаем полученный текст в элемент
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        //Приветствие
        String hello = getResources().getString(R.string.hello_world);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(hello);
    }
}
