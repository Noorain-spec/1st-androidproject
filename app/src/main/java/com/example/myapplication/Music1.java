package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Music1 extends AppCompatActivity {
    MediaPlayer pianoMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music1);
        Intent caller1 =new Intent();
        int position =caller1.getIntExtra("position",0);
            switch (position) {
                case 0:
                pianoMusic = MediaPlayer.create(this, R.raw.main_dhoondne_ko_zamaane_mein);
                case 1:
                    pianoMusic = MediaPlayer.create(this, R.raw.tu_jo_mila);
                case 2:
                    pianoMusic = MediaPlayer.create(this, R.raw.ek_galti);
                            }
            Switch switch_looping=(Switch) findViewById(R.id.switch_loop);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                pianoMusic.setLooping(isChecked);
            }
        });
    }
    public void playMusic(View v)
    {
        pianoMusic.start();
    }
    public void pauseMusic(View v)
    {
        if(pianoMusic.isPlaying())
            pianoMusic.pause();
    }

}