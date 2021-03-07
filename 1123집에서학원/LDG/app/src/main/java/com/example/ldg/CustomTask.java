package com.example.ldg;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CustomTask extends AsyncTask<String, Void, String> {
    String sendMsg, receiveMsg;

    @Override
    protected String doInBackground(String... strings) {
        try{
            String str;
            URL url = new URL("http://192.168.219.100/nettest/data.jsp");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            conn.setRequestMethod("POST");//데이터를 post방식으로 전송한다
            OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
            sendMsg = "id="   + strings[0] + "&pwd="+strings[1];//보낼정보
            osw.write(sendMsg);
            osw.flush();

            if(conn.getResponseCode() == conn.HTTP_OK){
                InputStreamReader tmp = new InputStreamReader(conn.getInputStream(),"UTF-8");//읽어오고
                BufferedReader reader = new BufferedReader(tmp);//읽어온걸 reader에 저장하고
                StringBuffer buffer = new StringBuffer();//reader에 저장된걸 buffer에 담아준다

                while ((str = reader.readLine())!=null){//str에저장된걸 한줄씩 읽어서
                    buffer.append(str);//읽은걸 버퍼에 저장
                }
                receiveMsg=buffer.toString();//receiveMst에 buffer에 내용을 string형식으로 저장함
            }else {
                Log.i("통신결과", conn.getResponseCode()+"에러");
                //통신이 실패했을때 실패한 이유를 알기위해 로그릴 찍습니다.
            }

       }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return receiveMsg;
    }
}
