package com.example.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseAdapter {


    private Context context;
    private int layout;
    private List<Country> listCountry;

    public CountryAdapter(Context context, int layout, List<Country> listCountry) {
        this.context = context;
        this.layout = layout;
        this.listCountry = listCountry;
    }

    @Override
    public int getCount() {

        return listCountry.size();
    }

    @Override
    public Object getItem(int position) { return null;}

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =inflater.inflate(layout, null);
        // anh xa view
        TextView txtName =(TextView) convertView.findViewById(R.id.txtTen);
        TextView txtPop =(TextView) convertView.findViewById(R.id.txtMota);
        ImageView imgCountry=(ImageView) convertView.findViewById(R.id.imgQuocgia);
        // gan gia tri
        Country country =listCountry.get(position);
        txtName.setText(country.getTen());
        txtPop.setText(country.getMota());
        imgCountry.setImageResource(country.getHinh());

        return convertView;
    }
}
