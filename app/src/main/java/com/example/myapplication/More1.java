package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class More1 extends AppCompatActivity {
    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more1);
        webView = (WebView) findViewById(R.id.webView);
    }

        public void navigator (View v)
        {
            webView.loadUrl("http://www.google.com");
        }
}