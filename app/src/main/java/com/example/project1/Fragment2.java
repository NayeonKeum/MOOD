package com.example.project1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;

public class Fragment2 extends Fragment {

    MainActivity activity;

    // 프래그먼트가 액티비티로 올라오는 그 순간 -> onAttach 메소드
    // the moment that fragment comes up to Activity -> onAttach method
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (MainActivity) getActivity();
    }

    // 인플레이션은 OnCreateView에서 한다.
    // inflation is at OnCreateView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_2, container,false);

        Button button1 = (Button) rootView.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onImageChange(0);
            }
        });


        Button button2 = (Button) rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onImageChange(1);
            }
        });


        Button button3 = (Button) rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onImageChange(2);
            }
        });

        // 프레그먼트에서 다른 뷰어 프레그먼트에 직접 접근은 못한다.
        // 엑티비티쪽으로 요청 해야 한다.
        // you do not have direct access to other viewer segments in the pree
        // you have to request it to the Activity

        return rootView;
    }


}