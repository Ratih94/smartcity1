package com.example.jhon.smartcity1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.activity_list_item);
    }

    public void onrsClick(View theButton) {
        Intent rs = new Intent(this, RsJava.class);
        startActivity(rs);
    }
}
