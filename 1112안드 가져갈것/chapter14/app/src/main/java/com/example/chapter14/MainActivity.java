package com.example.chapter14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstbtn,secondBtn,thirdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstbtn=(Button) findViewById(R.id.firstBtn);
        firstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_intent = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(first_intent);
            }
        });

        secondBtn=(Button) findViewById(R.id.secondBtn);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second_intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second_intent);
            }
        });

        thirdBtn=(Button) findViewById(R.id.thirdBtn);
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third_intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(third_intent);
            }
        });
    }
}