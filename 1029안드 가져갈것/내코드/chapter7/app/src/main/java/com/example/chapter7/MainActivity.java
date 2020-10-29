package com.example.chapter7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button first,second,third,fourth,fifth,sixth,seventh,eighth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (Button) findViewById(R.id.firstBtn);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_intent = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(first_intent);
            }
        });

        second = (Button) findViewById(R.id.secondBtn);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second_intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(second_intent);
            }
        });

        third = (Button) findViewById(R.id.thirdBtn);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third_intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(third_intent);
            }
        });

        fourth = (Button) findViewById(R.id.fourthBtn);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourth_intent = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(fourth_intent);
            }
        });

        fifth = (Button) findViewById(R.id.fifthBtn);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifth_intent = new Intent(MainActivity.this,FifthActivity.class);
                startActivity(fifth_intent);
            }
        });

        sixth = (Button) findViewById(R.id.sixthBtn);
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixth_intent = new Intent(MainActivity.this,SixthActivity.class);
                startActivity(sixth_intent);
            }
        });

        seventh = (Button) findViewById(R.id.seventhBtn);
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seventh_intent = new Intent(MainActivity.this,SeventhActivity.class);
                startActivity(seventh_intent);
            }
        });

        eighth = (Button) findViewById(R.id.eighthBtn);
        eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eighth_intent = new Intent(MainActivity.this,EighthActivity.class);
                startActivity(eighth_intent);
            }
        });
    }
}