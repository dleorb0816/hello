package com.example.ldg;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class UserInfo extends AppCompatActivity {
    String id,name,phone,regTime;
    public UserInfo(String id, String name, String phone, String regTime){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.regTime = regTime;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}