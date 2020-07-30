package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MusicList extends AppCompatActivity {
    int l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        //list display
        ListView ListViewMusic =(ListView) findViewById(R.id.listView);
        final ArrayAdapter<CharSequence>adapterMusic=ArrayAdapter.createFromResource(this,R.array.Music_List,android.R.layout.simple_list_item_1);
        ListViewMusic.setAdapter(adapterMusic);
        ListViewMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String mess=getString(R.string.message)+adapterMusic.getItem(position);
                l=position;
                Toast.makeText(getApplicationContext(),mess,Toast.LENGTH_LONG).show();
            }
        });
        Intent music =new Intent();
        music.setClass(this,Music1.class);
        music.putExtra("position",l);
        startActivity(music);

    }

}