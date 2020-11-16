package com.cookandroid.network;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class UserInfo extends AppCompatActivity {
    String id,name,phone,grade,writeTime;
    public UserInfo(String id, String name, String phone, String grade, String writeTime){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.grade = grade;
        this.writeTime = writeTime;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}