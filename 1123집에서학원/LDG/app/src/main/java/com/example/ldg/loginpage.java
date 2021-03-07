package com.example.ldg;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class loginpage extends AppCompatActivity {

    private ListView listView;
    private Custom_Adapter adapter;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        setTitle("ToDoList");

        listView = (ListView) findViewById(R.id.listView);
        adapter = new Custom_Adapter(loginpage.this, R.layout.adapter_memo, new ArrayList<MemoInfo>());
        listView.setAdapter(adapter);
    }
}
