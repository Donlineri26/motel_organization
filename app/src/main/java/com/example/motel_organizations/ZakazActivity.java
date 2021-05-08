package com.example.motel_organizations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ZakazActivity extends AppCompatActivity {

    ArrayList<Integer> zakazs = new ArrayList();
    ListView zakazList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakaz);
        TextView title = (TextView) findViewById(R.id.title_header);
        title.setText("ЗАКАЗЫ");

        setInitialData();

        zakazList = (ListView) findViewById(R.id.zakazList);

        ZakazAdapter adapter = new ZakazAdapter(this, R.layout.record, zakazs);

        zakazList.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LinearLayout zakaz_body = (LinearLayout) view.findViewById(R.id.zakaz_body);
                if (zakaz_body.getVisibility() == View.VISIBLE)
                    zakaz_body.setVisibility(View.GONE);
                else
                    zakaz_body.setVisibility(View.VISIBLE);
            }
        };
        zakazList.setOnItemClickListener(itemClickListener);
    }

    private void setInitialData() {
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
        zakazs.add(0);
    }
}