package com.example.chapter14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    Intent intent;
    Button btnStart, btnStop;
    Toast toast1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex14_1);
        setTitle("서비스 테스트 에제");

        intent = new Intent(this,MusicService.class);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
                android.util.Log.i("서비스 테스트", "startService");

                Toast toast1 = Toast.makeText(FirstActivity.this, "startService", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
                android.util.Log.i("서비스 테스트", "stopService");
                Toast toast2 = Toast.makeText(FirstActivity.this, "stopService", Toast.LENGTH_SHORT);
                toast2.show();
            }
        });
    }
}