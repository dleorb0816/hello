package com.example.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SeventhActivity extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex17);
        setTitle("Second 액티비티");


        Intent inIntent= getIntent();

        final int hapValue = inIntent.getIntExtra("Num1",0) + inIntent.getIntExtra("Num2",0);
        final int hapValue1 = inIntent.getIntExtra("Num1",0) - inIntent.getIntExtra("Num2",0);
        final int hapValue2 = inIntent.getIntExtra("Num1",0) * inIntent.getIntExtra("Num2",0);
        final int hapValue3 = inIntent.getIntExtra("Num1",0) / inIntent.getIntExtra("Num2",0);


        final String str1 = inIntent.getStringExtra("Num3");//라디오 체크값 가져오기


        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(str1.equals("더하기")){
                        Intent outIntent = new Intent(getApplicationContext(),SixthActivity.class);
                        outIntent.putExtra("Hap",hapValue);
                        setResult(RESULT_OK,outIntent);
                        finish();
                    }
                    else if(str1.equals("빼기")){
                        Intent outIntent = new Intent(getApplicationContext(),SixthActivity.class);
                        outIntent.putExtra("Hap",hapValue1);
                        setResult(RESULT_OK,outIntent);
                        finish();
                    }
                    else if(str1.equals("곱하기")){
                        Intent outIntent = new Intent(getApplicationContext(),SixthActivity.class);
                        outIntent.putExtra("Hap",hapValue2);
                        setResult(RESULT_OK,outIntent);
                        finish();
                    }
                    else if(str1.equals("나누기")){
                        Intent outIntent = new Intent(getApplicationContext(),SixthActivity.class);
                        outIntent.putExtra("Hap",hapValue3);
                        setResult(RESULT_OK,outIntent);
                        finish();
                    }




            }
        });


    }
}
