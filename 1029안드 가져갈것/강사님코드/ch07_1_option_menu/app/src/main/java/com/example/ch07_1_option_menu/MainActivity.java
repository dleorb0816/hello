package com.example.ch07_1_option_menu;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //LinearLayout baseLayout;
    //Button button1;

    EditText edt1;
    ImageView iv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");

//        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
//        button1 = (Button) findViewById(R.id.button1);

        edt1 = (EditText) findViewById(R.id.edt1);
        iv1 = (ImageView) findViewById(R.id.iv1);
    }

    //xml이 아니라 자바로 만든 메뉴
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        //방법1 - xml로 inflate
        MenuInflater mIn = getMenuInflater();
        mIn.inflate(R.menu.menu1, menu);

        //방법2 - Java 코드로//
//        menu.add(0, 1, 0, "배경색 (빨강)");
//        menu.add(0, 2, 0, "배경색 (초록)");
//        menu.add(0, 3, 0, "배경색 (파랑)");
//
//        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
//        sMenu.add(0, 4, 0, "버튼 45도 회전");
//        sMenu.add(0, 5, 0, "버튼 2배 확대");

        return true;
    }


    float sumAngle=0;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item0:

                String strAngle = edt1.getText().toString();
                if(strAngle.equals(""))
                {

                }
                else
                {
                    float fAngle = Float.parseFloat(strAngle);
                    sumAngle += fAngle;
                    iv1.setRotation(sumAngle);
                }

//                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.item1:
//                baseLayout.setBackgroundColor(Color.GREEN);
                iv1.setImageResource(R.drawable.jeju1);
                return true;
            case R.id.item2:
//                baseLayout.setBackgroundColor(Color.GREEN);
                iv1.setImageResource(R.drawable.jeju4);
                return true;
            case R.id.item3:
//                baseLayout.setBackgroundColor(Color.BLUE);
                iv1.setImageResource(R.drawable.jeju12);
                return true;
//            case R.id.subRotate:
////                button1.setRotation(45);
//                return true;
//            case R.id.subSize:
////                button1.setScaleX(2);
//                return true;
        }
        return false;
    }

}
