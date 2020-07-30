package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class rate_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
    }
        public void rateButton(View v)
        {
            RatingBar rate =(RatingBar) findViewById(R.id.ratingBar);
            float rating = rate.getRating();
            Intent last =new Intent();
            last.setClass(this,rate2.class);
            last.putExtra("nbstars",rating);
            startActivity(last);
            finish();
        }

}