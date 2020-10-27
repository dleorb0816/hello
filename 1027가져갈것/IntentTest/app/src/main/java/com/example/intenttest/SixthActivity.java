package com.example.intenttest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

@SuppressWarnings("deprecation")
public class SixthActivity extends AppCompatActivity implements ActionBar.TabListener {
    ActionBar.Tab tabSong, tabArtist, tabAlbum;

    MyTabFragment myFrags[] = new MyTabFragment[3];//멤버변수생성

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //액션바 만들기
        ActionBar bar = getSupportActionBar();//보완된 ActionBar getSupportActionBar
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        //1-1. 탭 만들어서 액션마에 꽂기
        tabSong = bar.newTab();//탭만들고
        tabSong.setText("음악별");//이름 설정
        tabSong.setTabListener(this);//이벤트처리등록
        bar.addTab(tabSong);//액션바에 탭달아주기

        //1-1. 탭 만들어서 액션마에 꽂기
        tabArtist = bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        //1-1. 탭 만들어서 액션마에 꽂기
        tabAlbum = bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;//myTabFrag객체 생성

        if(myFrags[tab.getPosition()] == null){//탭에서 누른위치가 없으면(처음이면)
            myTabFrag = new MyTabFragment();//프래그먼트 하나 만들어서
            Bundle data = new Bundle();//번들 데이터를 만들어서
            data.putString("tabName", tab.getText().toString());//데이터에 보낸다,키값 tabName 현제 눌러진탭에서 글자를 가져오는걸 키값에 담는거?
            myTabFrag.setArguments(data);//데이터 세팅?
            myFrags[tab.getPosition()] = myTabFrag;//myFrags배열에다가 현재선택된 위치에 만든걸 집어넣음
        }
        else    //처음이 아니면
            myTabFrag = myFrags[tab.getPosition()];

        ft.replace(android.R.id.content, myTabFrag);//FragmentTransaction사용해서 myTabFrag로 화면 갱신
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }


    //2.프래그먼트 만들기 ->내부(이너)크래스로 만든다, 외부에 만들어도 된다. 시스템적으로 연결해서 써야되서 static으로 써야됨
    public static class MyTabFragment extends Fragment {
        String tabName;

        //프래그먼트가 만들어 질때, 액티비티(os)와 통신이 필요할시 설정값 세팅
        //통신해야 되는 이유 탭 만들려고
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle data = getArguments();//통신하기 위한 통로 만들어줌,등록된걸 가져온다(탭에 등록된걸 가져오나?)
            tabName = data.getString("tabName");//tabName으로 값을 가져옴, 값이 달라도 태그라서 오류는 안남
        }
        //프레그먼트가 만들어지고 나서, 뷰를 생성할때,
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout baseLayout = new LinearLayout(super.getActivity());
            baseLayout.setOrientation(LinearLayout.VERTICAL);
            baseLayout.setLayoutParams(params);

            if (tabName == "음악별") baseLayout.setBackgroundColor(Color.RED);
            if (tabName == "가수별") baseLayout.setBackgroundColor(Color.GREEN);
            if (tabName == "앨범별") baseLayout.setBackgroundColor(Color.BLUE);

            return baseLayout;
        }
    }


    /*public void onTabSelected(TabLayout.Tab tab, FragmentTransaction ft) {

    }*/

}
