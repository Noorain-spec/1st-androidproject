package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Mugoto(View v)
        {
        Intent song=new Intent();
        song.setClass(this,MusicList.class);
        startActivity(song);
        }
        public void MSgoto(View v)
        {
        Intent more= new Intent();
        more.setClass(this,More1.class);
        startActivity(more);
        }
        public void enter (View v){
            Intent rate = new Intent();
            rate.setClass(this, rate_us.class);
            startActivity(rate);
        }
}