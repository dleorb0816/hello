package com.example.chapter7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    RelativeLayout baseLayout;

    ImageView imgView;
    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2);
        setTitle("제주도풍경");
        baseLayout = (RelativeLayout) findViewById(R.id.baseLayout1);
        imgView = (ImageView) findViewById(R.id.img);
        editText = (EditText) findViewById(R.id.edit1);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.hanra:
                imgView.setImageResource(R.drawable.cat);
                return true;
            case R.id.chuja:
                imgView.setImageResource(R.drawable.dog);
                return true;
            case R.id.bum:
                imgView.setImageResource(R.drawable.horse);
                return true;

            case R.id.subRotate:

                String getEdit = editText.getText().toString();
                if(getEdit.replace(" ","").equals("")){//editText가 공란인지 아닌지 확인하는 방법
                    imgView.setRotation(0);
                }else{
                imgView.setRotation(Float.parseFloat(getEdit));
                }
                return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu2,menu);
        return true;
    }
}