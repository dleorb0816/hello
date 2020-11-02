package com.example.chapter7;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class NinethActivity extends AppCompatActivity {
    TextView tvName, tvEmail;
    Button button1;
    
    //팝업쪽에 있는 애들
    EditText dlgEdtName, dlgEdtEmail;
    TextView toastText;
    View dialogView, toastView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex7);
        setTitle("사용자 정보 입력");

        tvName = (TextView) findViewById(R.id.tvName);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView = (View) View.inflate(NinethActivity.this,R.layout.dialog1,null);//다이얼로그뷰 객체 만들기
                


                AlertDialog.Builder dlg = new AlertDialog.Builder(NinethActivity.this);
                dlgEdtName.setText(tvName.getText().toString());
                dlgEdtEmail.setText(tvEmail.getText().toString());
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(dialogView);//뷰를 꽂는다

                dlgEdtName = (EditText) dialogView.findViewById(R.id.dlgEdt1);//dlgEdt가 dialogView객체에 있기 때문에 findviewById 앞에 객체이름.을 붙여준다
                dlgEdtEmail = (EditText) dialogView.findViewById(R.id.dlgEdt2);

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvName.setText(dlgEdtName.getText().toString());
                        tvEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });

                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = new Toast(NinethActivity.this);
                        toastView = (View) View.inflate(NinethActivity.this, R.layout.toast1, null);
                        toastText = (TextView) toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다");
                        toast.setView(toastView);//토스트에 뷰로 꽂아주겠다
                        toast.show();
                    }
                });
                dlg.show();

            }
        });
    }
}