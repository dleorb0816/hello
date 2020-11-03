package com.example.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class FirstActivity extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);


        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            final RadioButton secondRdt = (RadioButton)findViewById(R.id.secondRdt);
           final RadioButton thirdRdt = (RadioButton) findViewById(R.id.thirdRdt);
            @Override
            public void onClick(View v) {

                if(secondRdt.isChecked() ){
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }
                else if(thirdRdt.isChecked() ){
                    Intent intent1= new Intent(getApplicationContext(),ThirdActivity.class);
                    startActivity(intent1);
                }


            }
        });

    }
}
