package com.example.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.RadialGradient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switch1;
    RadioGroup rGroup1;
    RadioButton rdoOreo,rdoPie,rdoQ;
    ImageView ImgAnd;
    Button btnEnd,btnRe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        switch1 = (Switch) findViewById(R.id.switch1);
        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        rdoOreo = (RadioButton) findViewById(R.id.RdoOreo);
        rdoPie = (RadioButton) findViewById(R.id.RdoPie);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        ImgAnd = (ImageView) findViewById(R.id.ImgAnd);
        btnEnd = (Button) findViewById(R.id.btnEnd);
        btnRe = (Button) findViewById(R.id.btnRe);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    //ImgAnd.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnRe.setVisibility(View.VISIBLE);
                }else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    ImgAnd.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnRe.setVisibility(View.INVISIBLE);
                }
            }
        });

        /*rdoOreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImgAnd.setImageResource(R.drawable.oreo);
            }
        });

        rdoPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImgAnd.setImageResource(R.drawable.pie);
            }
        });

        rdoQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImgAnd.setImageResource(R.drawable.nougat);
            }
        }); 라디오 버튼 하나하나 이벤트 다주기*/

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String result;
                if(checkedId == R.id.RdoOreo){
                    ImgAnd.setVisibility(View.VISIBLE);
                    ImgAnd.setImageResource(R.drawable.oreo);
                }else if(checkedId == R.id.RdoPie){
                    ImgAnd.setVisibility(View.VISIBLE);
                    ImgAnd.setImageResource(R.drawable.pie);
                }else if(checkedId == R.id.RdoQ){
                    ImgAnd.setVisibility(View.VISIBLE);
                    ImgAnd.setImageResource(R.drawable.nougat);
                }
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent restartIntent = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restartIntent);*/
               switch1.setChecked(false);
               rGroup1.clearCheck();
               ImgAnd.setImageResource(0);



            }
        });
    }
}