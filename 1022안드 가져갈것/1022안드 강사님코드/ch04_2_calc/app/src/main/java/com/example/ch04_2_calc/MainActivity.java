package com.example.ch04_2_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    //1번-멤버 변수
    EditText edt1, edt2;
    TextView tv1;

//    Button btn00, btn01, btn02, btn03, btn04;
//    Button btn05, btn06, btn07, btn08, btn09;

    Button []btnArr = new Button[10];

    //4번-이너 클래스(내부 클래스)
//    class MyOnTouchListener implements View.OnTouchListener {
//
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//            int result;
//            String str1, str2;
//            int n1, n2;
//            str1 = edt1.getText().toString();
//            str2 = edt2.getText().toString();
//            n1 = Integer.parseInt(str1);
//            n2 = Integer.parseInt(str2);//문자를 -> 숫자로
//
//            result = n1 - n2;
//
//            tv1.setText("계산 결과: " + result);
//            tv1.setTextSize(20);
//            return false;
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int []btnID ={R.id.btn00, R.id.btn01, R.id.btn02, R.id.btn03, R.id.btn04,
                      R.id.btn05, R.id.btn06, R.id.btn07, R.id.btn08, R.id.btn09};

        for(int i=0; i< btnID.length; ++i)
            btnArr[i]= (Button) findViewById(btnID[i]);

//        btnArr[0]= (Button) findViewById(R.id.btn00);
//        btnArr[1]= (Button) findViewById(R.id.btn01);
//        btnArr[2]= (Button) findViewById(R.id.btn02);
//        btnArr[3]= (Button) findViewById(R.id.btn03);
//        btnArr[4]= (Button) findViewById(R.id.btn04);
//        btnArr[5]= (Button) findViewById(R.id.btn05);
//        btnArr[6]= (Button) findViewById(R.id.btn06);
//        btnArr[7]= (Button) findViewById(R.id.btn07);
//        btnArr[8]= (Button) findViewById(R.id.btn08);
//        btnArr[9]= (Button) findViewById(R.id.btn09);

        for(int i=0; i<btnArr.length;++i)
        {
            final int index = i;
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //포커스가 어디에 있는지 확인
                    if (edt1.isFocused()) {
                        edt1.setText(edt1.getText().toString() + index);
                    } else if (edt2.isFocused()) {
                        edt2.setText(edt2.getText().toString() + index);
                    } else
                        Toast.makeText(getApplicationContext(), "에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            });
        }

//        btn01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                //포커스가 어디에 있는지 확인
//                if(edt1.isFocused())
//                {
//                    edt1.setText(edt1.getText().toString() +"1");
//                }
//                else if(edt2.isFocused())
//                {
//                    edt2.setText(edt2.getText().toString() +"1");
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
//            }
//        });

//        btn02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                //포커스가 어디에 있는지 확인
//                if(edt1.isFocused())
//                {
//                    edt1.setText(edt1.getText().toString() +"2");
//                }
//                else if(edt2.isFocused())
//                {
//                    edt2.setText(edt2.getText().toString() +"2");
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn03.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                //포커스가 어디에 있는지 확인
//                if(edt1.isFocused())
//                {
//                    edt1.setText(edt1.getText().toString() +"3");
//                }
//                else if(edt2.isFocused())
//                {
//                    edt2.setText(edt2.getText().toString() +"3");
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn04.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                //포커스가 어디에 있는지 확인
//                if(edt1.isFocused())
//                {
//                    edt1.setText(edt1.getText().toString() +"4");
//                }
//                else if(edt2.isFocused())
//                {
//                    edt2.setText(edt2.getText().toString() +"4");
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn05.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                //포커스가 어디에 있는지 확인
//                if(edt1.isFocused())
//                {
//                    edt1.setText(edt1.getText().toString() +"5");
//                }
//                else if(edt2.isFocused())
//                {
//                    edt2.setText(edt2.getText().toString() +"5");
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"에디터를 선택해주세요", Toast.LENGTH_SHORT).show();
//            }
//        });



//        EditText edt1, edt2;
        Button btn1, btn2, btn3, btn4;
        Button btn5;
//        TextView tv1;

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn5 = (Button) findViewById(R.id.btn5);

        tv1 = (TextView) findViewById(R.id.tv1);


        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,
                            "값을 입력하세요!",
                            Toast.LENGTH_SHORT).show();
                }//그렇지 않으면, 정상
                else
                {
                    double n1 = Double.parseDouble(str1);
                    double n2 = Double.parseDouble(str2);//문자를 -> 숫자로

                    double result = n1 + n2;

                    tv1.setText("계산 결과: " + result);
                    tv1.setTextSize(20);
                }
                return false;
            }
        });
//        btn1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event)
//            {
////                int result;
////                String str1, str2;
////                int n1, n2;
////                str1 = edt1.getText().toString();
////                str2 = edt2.getText().toString();
////                n1 = Integer.parseInt(str1);
////                n2 = Integer.parseInt(str2);//문자를 -> 숫자로
////
////                result = n1 + n2;
////
////                tv1.setText("계산 결과: " + result);
////                tv1.setTextSize(20);
//
//                return false;
//            }
//        });


        //View.OnTouchListener lis1 = new View.OnTouchListener() ;


        View.OnTouchListener listener2 = new View.OnTouchListener (){

            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,
                            "값을 입력하세요!",
                            Toast.LENGTH_SHORT).show();
                }//그렇지 않으면, 정상
                else
                {
                    double n1 = Double.parseDouble(str1);
                    double n2 = Double.parseDouble(str2);//문자를 -> 숫자로

                    double result = n1 - n2;

                    tv1.setText("계산 결과: " + result);
                    tv1.setTextSize(20);
                }
                return false;
            }
        };



        btn2.setOnTouchListener(listener2);

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,
                            "값을 입력하세요!",
                            Toast.LENGTH_SHORT).show();
                }//그렇지 않으면, 정상
                else
                {
                    double n1 = Double.parseDouble(str1);
                    double n2 = Double.parseDouble(str2);//문자를 -> 숫자로

                    double result = n1 * n2;

                    tv1.setText("계산 결과: " + result);
                    tv1.setTextSize(20);
                }
                return false;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,
                                    "값을 입력하세요!",
                            Toast.LENGTH_SHORT).show();
                }
                else//그렇지 않으면, 정상
                {
                    if(str2.equals("0"))
                    {
                        Toast.makeText(MainActivity.this,
                                        "0으로 나눌 수 없습니다!",
                                        Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        double n1 = Double.parseDouble(str1);
                        double n2 = Double.parseDouble(str2);//문자를 -> 숫자로

                        double result = n1 / n2;

                        //1234.56788 -> 123456.56788 - > 123456 - > 1234.56
                        result = (int)(result * 1000) / 1000.0;

                        tv1.setText("계산 결과: " + result);
                        tv1.setTextSize(20);
                    }
                }



                return false;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))
                {
                    Toast.makeText(MainActivity.this,
                            "값을 입력하세요!",
                            Toast.LENGTH_SHORT).show();
                }//그렇지 않으면, 정상
                else
                {
                    double n1 = Double.parseDouble(str1);
                    double n2 = Double.parseDouble(str2);//문자를 -> 숫자로

                    double result = n1 % n2;

                    tv1.setText("계산 결과: " + result);
                    tv1.setTextSize(20);
                }
                return false;
            }
        });

    }
}