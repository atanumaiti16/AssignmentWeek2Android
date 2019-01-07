package com.example.atanu.assignmentweek2android;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity implements  myIntrerface {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fragment1 f1 = new fragment1();
        //getFragmentManager().beginTransaction().replace(R.id.LeftFragment1,f1,"Hi").commit();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.LeftFragment1,f1);
        ft.commit();
    }




    @Override
    public void myMethod(String Data) {
        Bundle bundle = new Bundle();

        bundle.putString("key",Data);

        fragment2 f2 = new fragment2();
        f2.setArguments(bundle);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.RigthFragment2,f2);
        ft.commit();
    }
}
