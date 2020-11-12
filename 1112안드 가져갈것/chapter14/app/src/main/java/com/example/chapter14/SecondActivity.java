package com.example.chapter14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.Image;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView ivBattery;
    EditText edtBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex14_2);
        setTitle("배터리 상태 체크");

        ivBattery = (ImageView) findViewById(R.id.ivBattery);
        edtBattery = (EditText) findViewById(R.id.edtBattery);



    }
    BroadcastReceiver br = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            if (action.equals(Intent.ACTION_BATTERY_CHANGED)){
                int remain = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
                edtBattery.setText("현재 충전량 : " + remain + "%\n");

                if(remain >= 90) ivBattery.setImageResource(R.drawable.battery_100);
                else if(remain >= 70) ivBattery.setImageResource(R.drawable.battery_80);
                else if(remain >= 50) ivBattery.setImageResource(R.drawable.battery_60);
                else if(remain >= 10) ivBattery.setImageResource(R.drawable.battery_20);
                else                    ivBattery.setImageResource(R.drawable.battery_0);

                int plug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED,0);
                Toast toast1;
                switch (plug){
                    case 0:
                        edtBattery.append("전원 연결 : 안됨");
                        toast1 = Toast.makeText(getApplicationContext(),"배터리 상태 : 충전중이 아님",Toast.LENGTH_SHORT);
                        toast1.show();
                        break;
                    case BatteryManager.BATTERY_PLUGGED_AC:
                        edtBattery.append("전원 연결 : 어댑터 연걸됨");
                        toast1 = Toast.makeText(getApplicationContext(),"배터리 상태 : 현재 충전중임",Toast.LENGTH_SHORT);
                        toast1.show();
                        break;
                    case BatteryManager.BATTERY_PLUGGED_USB:
                        edtBattery.append("전원 연결 : USB 연결됨");
                        toast1 = Toast.makeText(getApplicationContext(),"배터리 상태 : 현재 충전중임",Toast.LENGTH_SHORT);
                        toast1.show();
                        break;
                }
            }
        }
    };
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(br);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter iFilter = new IntentFilter();
        iFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(br,iFilter);
    }
}