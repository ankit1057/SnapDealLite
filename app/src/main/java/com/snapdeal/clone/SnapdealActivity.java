package com.snapdeal.clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SnapdealActivity extends AppCompatActivity {
    private WebView webViewMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapdeal);

        webViewMain=findViewById(R.id.webViewMain);
        webViewMain.getSettings().setJavaScriptEnabled(true);
        webViewMain.setWebViewClient(new WebViewClient());
        webViewMain.loadUrl("https://snapdeal.com/");
    }
}
