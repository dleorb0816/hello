package com.example.chapter11;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex11_1);
        setTitle("리스트뷰 테스트");

        final  String[] mid = {"히어로즈","24시", "로스트","로스트룸","스몰빌","탐정몽크",
        "빅뱅이론", "프렌즈", "덱스터","글리","가쉽걸","테이큰","슈퍼내추럴","브이"};

        ListView list = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,mid);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                Toast.makeText(getApplicationContext(), mid[arg2],Toast.LENGTH_SHORT).show();
            }
        });
    }
}