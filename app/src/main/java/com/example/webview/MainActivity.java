package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w=findViewById(R.id.webview);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.cmrit.ac.in");

        WebSettings webSettings;
        webSettings = w.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (w.canGoBack()) {
            w.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
