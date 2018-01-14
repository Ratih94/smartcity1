package com.example.jhon.smartcity1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by jhon on 18/12/2017.
 */
public class RsAdvent extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advent);

        int advent;
        WebView browser = (WebView) findViewById(advent);
        browser.getSettings().setJavaScriptEnabled(true);

        browser.loadUrl("www.google.com");
    }
}