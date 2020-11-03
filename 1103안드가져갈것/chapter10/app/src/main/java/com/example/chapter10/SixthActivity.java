package com.example.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SixthActivity extends Activity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex16);

        Button btnnewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnnewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
                EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);
                RadioButton addRdt = (RadioButton) findViewById(R.id.addRdt);
                RadioButton subRdt = (RadioButton) findViewById(R.id.subRdt);
                RadioButton mulRdt = (RadioButton) findViewById(R.id.mulRdt);
                RadioButton divRdt = (RadioButton) findViewById(R.id.divRdt);

                if(addRdt.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), SeventhActivity.class);
                    intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));
                    intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));
                    intent.putExtra("Num3",addRdt.getText().toString());
                    startActivityForResult(intent,0);
                }
                else if(subRdt.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), SeventhActivity.class);
                    intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));
                    intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));
                    intent.putExtra("Num3",subRdt.getText().toString());
                    startActivityForResult(intent,0);
                }
                else if(mulRdt.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), SeventhActivity.class);
                    intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));
                    intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));
                    intent.putExtra("Num3",mulRdt.getText().toString());
                    startActivityForResult(intent,0);
                }
                else if(divRdt.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), SeventhActivity.class);
                    intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));
                    intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));
                    intent.putExtra("Num3",divRdt.getText().toString());
                    startActivityForResult(intent,0);
                }

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            int hap = data.getIntExtra("Hap",0);
            Toast.makeText(getApplicationContext(),"결과 :" + hap, Toast.LENGTH_SHORT).show();
        }
    }
}