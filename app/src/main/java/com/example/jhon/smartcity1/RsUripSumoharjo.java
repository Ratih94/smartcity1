package com.example.jhon.smartcity1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by jhon on 18/12/2017.
 */
public class RsUripSumoharjo extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urip);

        int urip;
        WebView browser = (WebView) findViewById(urip);
        browser.getSettings().setJavaScriptEnabled(true);

        browser.loadUrl("www.google.com");
    }
}