package com.example.ldg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom_Adapter extends BaseAdapter {

    private Activity mAct;
    LayoutInflater mInflater;
    ArrayList<MemoInfo> mMemoInfoObjArr;
    int mListLayout;


    public Custom_Adapter(Activity a, int listLayout, ArrayList<MemoInfo> memoInfoArrayList) {
        mAct = a;
        mListLayout = listLayout;
        mMemoInfoObjArr = memoInfoArrayList;
        mInflater = (LayoutInflater) a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setDatas(ArrayList<MemoInfo> arrayList) {
        mMemoInfoObjArr = arrayList;
    }

    @Override
    public int getCount() {
        return mMemoInfoObjArr.size();
    }

    @Override
    public Object getItem(int i) {
        return mMemoInfoObjArr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
            view = mInflater.inflate(mListLayout,viewGroup,false);

        final TextView tvNum = (TextView) view.findViewById(R.id.tv_num);
        tvNum.setText(mMemoInfoObjArr.get(i).num);

        final TextView tvContent = (TextView) view.findViewById(R.id.tv_content);
        tvContent.setText(mMemoInfoObjArr.get(i).content);

        Button updateButton = (Button) view.findViewById(R.id.btnUpdate);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View v = mAct.getLayoutInflater().inflate(R.layout.dialog_memo,null);
                EditText edtContent = (EditText)v.findViewById(R.id.edtcontent);
                edtContent.setText(tvContent.getText());

                new AlertDialog.Builder(mAct)
                        .setTitle("수정하기")
                        .setView(v)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }).setCancelable(false).show();

            }
        });



        return view;
    }
}
