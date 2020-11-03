package com.example.chapter10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_intent = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(first_intent);
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second_intent = new Intent(getApplicationContext(),FourthActivity.class);
                startActivity(second_intent);
            }
        });

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third_intent = new Intent(getApplicationContext(),FifthActivity.class);
                startActivity(third_intent);
            }
        });

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourth_intent = new Intent(getApplicationContext(),SixthActivity.class);
                startActivity(fourth_intent);
            }
        });

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifth_intent = new Intent(getApplicationContext(),EightActivity.class);
                startActivity(fifth_intent);
            }
        });
    }
}