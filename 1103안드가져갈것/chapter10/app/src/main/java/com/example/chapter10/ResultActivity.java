package com.example.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");


        TextView tv[] = new TextView[imageName.length];
        RatingBar rbar[] = new RatingBar[imageName.length];

        Integer tvID[] = {R.id.tv1, R.id.tv2, R.id.tv3,
                R.id.tv4, R.id.tv5, R.id.tv6,
                R.id.tv7, R.id.tv8, R.id.tv9};

        Integer rbarId[] = {R.id.rbar1, R.id.rbar2,R.id.rbar3,
                R.id.rbar4, R.id.rbar5,R.id.rbar6,
                R.id.rbar7, R.id.rbar8,R.id.rbar9};
//--------------------------------------------------직접풀어보기 10-2
        Integer ImageField[] = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,
                                R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,
                                R.drawable.pic7,R.drawable.pic8,R.drawable.pic9};

        TextView tvTop = (TextView) findViewById(R.id.tvTop);
        ImageView ivTop = (ImageView) findViewById(R.id.ivTop);

        int max_index =0;
        for (int i=0; i<voteResult.length;i++){
            if(voteResult[max_index] < voteResult[i])
                max_index = i;
        }
        tvTop.setText(imageName[max_index]);
        ivTop.setImageResource(ImageField[max_index]);


        for (int i = 0;i<voteResult.length;i++){
            tv[i] = (TextView) findViewById(tvID[i]);
            rbar[i] = (RatingBar) findViewById(rbarId[i]);
        }

        for(int i =0; i<voteResult.length;i++){
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
