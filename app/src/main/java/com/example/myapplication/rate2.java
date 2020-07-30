package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class rate2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate2);
        Intent caller =getIntent();
        float rating = caller.getFloatExtra("nbstars",0);
        TextView textView = (TextView) findViewById(R.id.textView_Last);
        textView.setText("Thank you for rating us"+rating);

    }
}