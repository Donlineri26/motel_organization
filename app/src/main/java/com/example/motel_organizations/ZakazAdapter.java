package com.example.motel_organizations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.List;


public class ZakazAdapter extends ArrayAdapter<Integer> {

    private LayoutInflater inflater;
    private int layout;
    private List<Integer> zakazs;

    public ZakazAdapter(Context context, int resource, List<Integer> zakazs) {
        super(context, resource, zakazs);
        this.zakazs = zakazs;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        View view=inflater.inflate(this.layout, parent, false);

        Integer zakaz = zakazs.get(position);

        return view;
    }
}
