package com.example.chapter7;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class EighthActivity extends AppCompatActivity {
//예제 7-14~17까지 한방에 다한거
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex6);
        setTitle("대화상자");

        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String[] versionArray = new String[] {"오레오","파이","큐(10)"};
                final boolean[] checkArray = new boolean[] {true,false,false};//예제 7-19
                AlertDialog.Builder dlg = new AlertDialog.Builder(EighthActivity.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);
                //dlg.setItems(versionArray, new DialogInterface.OnClickListener() {예제 7-18
               /* dlg.setSingleChoiceItems(versionArray,0, new DialogInterface.OnClickListener() {//예제 7-19
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        button1.setText(versionArray[which]);
                    }
                });*/
                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {//예제7-20
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        button1.setText(versionArray[which]);
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}