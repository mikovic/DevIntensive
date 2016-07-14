package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.softdesign.devintensive.R;

import utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static   final String TAG= ConstantManager.PREFIX_TEXT+"MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        if(savedInstanceState==null){

        }else {

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 11:
            break;
        }

    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }
}
