package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Fragment2 fragment1;
    ViewerFragment fragment2;

    FragmentManager manager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp=findViewById(R.id.viewpager);
        VPAdapter adapter=new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        // 연동
        TabLayout tab=findViewById(R.id.tab);
        tab.setupWithViewPager(vp);

        manager = getSupportFragmentManager();

        fragment1 = (Fragment2) manager.findFragmentById(R.id.Fragment2);
        fragment2 = (ViewerFragment) manager.findFragmentById(R.id.ViewerFragment);

        Log.v(TAG, "Log.v 출력 " + TAG);

    }
    public void onImageChange(int index) {
        fragment2.setImage(index);
    }



}