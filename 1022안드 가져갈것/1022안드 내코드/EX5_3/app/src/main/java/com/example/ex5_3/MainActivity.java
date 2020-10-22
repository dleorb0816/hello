package com.example.ex5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);//xml없이 !!!

        //1.레이아웃 만들기(Linear)
        // 1-1.레이아웃 속성객체 만들기(param 객체)
        // 1-2.레이아웃 객체에 속성객체를 사용
        //2.위젯 만들기(버튼, 텍스트뷰, 에디트 텍스트)
        //3. 위젯 이벤트 달기 (버튼,)

        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(
                                        LinearLayout.LayoutParams.MATCH_PARENT,
                                        LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baselayout = new LinearLayout(this);
        baselayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(baselayout, params);

        EditText edt1 = new EditText(this);
        Button btn1 = new Button(this);
        TextView tv1 = new TextView(this);

        edt1.setHint("값을 입력하세요!");
        baselayout.addView(edt1);

        btn1.setText("버튼입니다");
        btn1.setBackgroundColor(Color.YELLOW);
        baselayout.addView(btn1);

        tv1.setText("텍스트뷰입니다.");
        tv1.setTextSize(30);
        tv1.setTextColor(Color.MAGENTA);
        baselayout.addView(tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(edt1.getText().toString());
            }
        });
    }
}