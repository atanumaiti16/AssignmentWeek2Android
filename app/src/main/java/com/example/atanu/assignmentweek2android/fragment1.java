package com.example.atanu.assignmentweek2android;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment {

    Button  Topnews, InternationNews, localNews, sportsNews;
    myIntrerface I;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
       I = (myIntrerface) getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container,false);

        Topnews = view.findViewById(R.id.btn_topnews);
        InternationNews = view.findViewById(R.id.btn_international);
        localNews = view.findViewById(R.id.btn_local_news);
        sportsNews = view.findViewById(R.id.btn_sports);

        Topnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.myMethod("Todays top news are........");
            }
        });

        InternationNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.myMethod("Todays top International news are........");

            }
        });

        localNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.myMethod("An Earthquake of 6.2 magnitidue occured in chicago");
            }
        });

        sportsNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I.myMethod("Rafael Nadal and Roger Federar lost to each other");
            }
        });
        return view;
    }
}
