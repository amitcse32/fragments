package com.cssoft.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class HomeFragment extends Fragment {


    String title;
    @SuppressLint("ValidFragment")
    public HomeFragment(String value) {
        title=value;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.home,null);

        TextView textView=view.findViewById(R.id.textView);
        textView.setText(title);

        return view;
    }





}
