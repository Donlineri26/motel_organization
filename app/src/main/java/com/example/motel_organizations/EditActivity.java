package com.example.motel_organizations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        TextView title = (TextView) findViewById(R.id.title_header);
        title.setText("EDIT");
    }

    public void setStatusNomer(View view){
        if (view.getBackground().getConstantState()
                .equals(getResources().getDrawable(R.drawable.poly_nomera).getConstantState())) {
            view.setBackground(getResources().getDrawable(R.drawable.poly_active_nomera));
        } else {
            view.setBackground(getResources().getDrawable(R.drawable.poly_nomera));
        }
    }
}