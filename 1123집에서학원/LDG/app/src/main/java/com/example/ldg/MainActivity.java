package com.example.ldg;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Custom_Adapter adapter;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);
        adapter = new Custom_Adapter(MainActivity.this, R.layout.adapter_memo, new ArrayList<MemoInfo>());

        //execute의 매개값은
        //sendMsg = "id="+strings[0]+"&pwd="+strings[1];
        //doInBackround에서 사용된 문자열 배열에 필요한 값을 넣습니다.

        // 그리고 jsp로 부터 리턴값을 받아야할 때는
        //String returns = task.execute("rain483","1234").get();
        //처럼 사용하시면 되는데요. get()에서 에러가 발생할 수 있어서 try catch문으로
        //감싸야에러가 나지 않습니다.

        ImageView imageView = (ImageView) findViewById(R.id.iv);
        imageView.setBackground(new ShapeDrawable(new OvalShape()));
        imageView.setClipToOutline(true);


        Button btnLogin = (Button) findViewById(R.id.btnlogin);
        EditText editId = (EditText) findViewById(R.id.edtid);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, loginpage.class);
                String id = editId.getText().toString();
                if (id.equals("aa")) {
                    startActivity(in);
                }


            }
        });


        Button btnreg = (Button) findViewById(R.id.btnreg);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final View v = getLayoutInflater().inflate(R.layout.dialog_add, null);
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("회원가입")
                        .setView(v)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String id = ((EditText)v.findViewById(R.id.edtID)).getText().toString();
                                String pwd = ((EditText)v.findViewById(R.id.edtPwd)).getText().toString();
                                String name = ((EditText)v.findViewById(R.id.edtName)).getText().toString();
                                String phone = ((EditText)v.findViewById(R.id.edtPhone)).getText().toString();

                                new NetworkInsert(adapter).execute(id,pwd,name,phone);

                                dialogInterface.cancel();
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .setCancelable(false)
                        .show();
            }
        });
    }
}