package com.example.resepsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.resepsederhana.R.layout.activity_main;
import static com.example.resepsederhana.R.layout.resep1;
import static com.example.resepsederhana.R.layout.resep2;
import static com.example.resepsederhana.R.layout.resep3;
import static com.example.resepsederhana.R.layout.resep4;
import static com.example.resepsederhana.R.layout.resep5;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    public void onBackPressed() {
        if (backPressedTime+2000>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            setContentView(activity_main);
        }
        backPressedTime=System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resep1(View view) {
        setContentView(resep1);
    }

    public void resep2(View view) {
        setContentView(resep2);
    }

    public void resep3(View view) {
        setContentView(resep3);
    }

    public void resep4(View view) {
        setContentView(resep4);
    }

    public void resep5(View view) {
        setContentView(resep5);
    }
}
