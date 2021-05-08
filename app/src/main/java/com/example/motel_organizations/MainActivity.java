package com.example.motel_organizations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout list = (LinearLayout) findViewById(R.id.list_items);
        LinearLayout password = (LinearLayout) findViewById(R.id.password);
        TextView selectedItem = (TextView) findViewById(R.id.selectedItem);

        findViewById(R.id.button_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (list.getVisibility()) {
                    case View.GONE:
                        list.setVisibility(View.VISIBLE);
                        password.setVisibility(View.GONE);
                        break;
                    case View.VISIBLE:
                        list.setVisibility(View.GONE);
                        password.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }
            }
        });
        TextView item1 = (TextView) findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueItem = item1.getText().toString();
                String valueSelectedItem = selectedItem.getText().toString();
                if (valueItem.equals("Администраторр")) {
                    selectedItem.setTextSize(20);
                } else {
                    selectedItem.setTextSize(30);
                }
                selectedItem.setText(valueItem);
                item1.setText(valueSelectedItem);
                list.setVisibility(View.GONE);
                password.setVisibility(View.VISIBLE);
            }
        });
        TextView item2 = (TextView) findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueItem = item2.getText().toString();
                String valueSelectedItem = selectedItem.getText().toString();
                if (valueItem.equals("Администраторр")) {
                    selectedItem.setTextSize(20);
                } else {
                    selectedItem.setTextSize(30);
                }
                selectedItem.setText(valueItem);
                item2.setText(valueSelectedItem);
                list.setVisibility(View.GONE);
                password.setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.buttonMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueSelectedItem = selectedItem.getText().toString();
                Intent intent;
                if ("Менеджер".equals(valueSelectedItem)) {
                    intent = new Intent(MainActivity.this, EditActivity.class);
                } else {
                    intent = new Intent(MainActivity.this, ZakazActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}