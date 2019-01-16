package com.example.android.relevium;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Maps extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        WebView map = (WebView) findViewById(R.id.Maps);
        map.loadUrl("file:///android_asset/Maps.html");

        WebSettings webSettings = map.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


}
