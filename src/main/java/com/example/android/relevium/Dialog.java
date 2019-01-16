package com.example.android.relevium;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Dialog extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        WebView dialog = (WebView) findViewById(R.id.DialogFlow);
        dialog.loadUrl("file:///android_asset/QnA.html");

        WebSettings webSettings = dialog.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

}
