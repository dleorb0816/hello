package com.example.chapter11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button firstBtn,secondBtn,thirdBtn,fourthBtn,fifthBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = (Button) findViewById(R.id.firstBtn);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_intent = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(first_intent);
            }
        });

        secondBtn = (Button)findViewById(R.id.secondBtn);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second_intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second_intent);
            }
        });

        thirdBtn = (Button)findViewById(R.id.thirdBtn);
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third_intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(third_intent);
            }
        });

        fourthBtn = (Button)findViewById(R.id.fourthBtn);
        fourthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourth_intent = new Intent(getApplicationContext(),fourthActivity.class);
                startActivity(fourth_intent);
            }
        });

        fifthBtn = (Button)findViewById(R.id.fifthBtn);
        fifthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifth_intent = new Intent(getApplicationContext(),fifthActivity.class);
                startActivity(fifth_intent);
            }
        });
    }
}