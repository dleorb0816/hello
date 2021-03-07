package com.example.ldg;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MemoInfo extends AppCompatActivity {
    String num,content;
    public MemoInfo(String num, String content ){
        this.num = num;
        this.content = content;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}