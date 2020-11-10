package com.example.chapter11;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fourthActivity extends AppCompatActivity {
    View toastView;
    TextView toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project11_2);
        setTitle("갤러리 영화 포스터");

        Gallery gallery =(Gallery) findViewById(R.id.gallery1);
        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);
    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;

       Integer[] posterID={R.drawable.mov11, R.drawable.mov12, R.drawable.mov13,
               R.drawable.mov14, R.drawable.mov15, R.drawable.mov16,
               R.drawable.mov17, R.drawable.mov18, R.drawable.mov19,
               R.drawable.mov20};


        String[] subjectId={
                "mov11", "mov12","mov13","mov14","mov15","mov16","mov17","mov18","mov19","mov20"
        };

       public MyGalleryAdapter(Context c){
           context = c;
       }

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);

            imageView.setLayoutParams(new Gallery.LayoutParams(200,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);

            imageView.setImageResource(posterID[position]);

            final int pos = position;
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster = (ImageView) findViewById(R.id.ivPoster);
                    Toast toast = new Toast(fourthActivity.this);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);

                    toastView = (View)View.inflate(fourthActivity.this,R.layout.toast1,null);
                    toastText = (TextView) toastView.findViewById(R.id.toastText1);
                    toastText.setText(subjectId[pos]);
                    toast.setView(toastView);
                    toast.show();
                    return false;
                }
            });

           return imageView;
        }
    }
}