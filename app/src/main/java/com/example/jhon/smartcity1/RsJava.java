package com.example.jhon.smartcity1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by jhon on 18/12/2017.
 */
public class RsJava extends ListActivity{


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] menulokasi = new String[]{"RS Urip Sumoharjo", "RS Advent"};

        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menulokasi));
    }

    protected void onListItemClick(ListView satu, View v, int position, long id)
    {
        super.onListItemClick(satu, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        //TODO Auto=generated method stub
        try
        {
            Intent i = null;
            if (pilihan.equals("RS Urip Sumoharjo")) {
                i = new Intent(this, RsUripSumoharjo.class);
            }
            if (pilihan.equals("RS Advent")) {
                i = new Intent(this, RsAdvent.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
