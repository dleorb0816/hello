package com.example.ex5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText brand_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       brand_phone =(EditText) findViewById(R.id.edit1);

        brand_phone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }
}