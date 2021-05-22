package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCountry;
    ArrayList<Country> countryArr =new ArrayList<>();
    CountryAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reference();
        countryAdapter=new CountryAdapter(this, R.layout.row_of_country,countryArr);
        lvCountry.setAdapter(countryAdapter);
    }
    private void Reference(){
        lvCountry = (ListView)findViewById(R.id.listView);
//        countryArr=new ArrayList<>();
        countryArr.add(new Country("Vietnam",  "93.7M", R.drawable.vn)); //tham so R.drawable.vn là đường dẫn tới hình ảnh. vn là tên hình ảnh, lưu trong mục res/drawable
        countryArr.add(new Country("thailand",  "63.7M",R.drawable.thailand));
        countryArr.add(new Country("China",  "1400M", R.drawable.china2));
        countryArr.add(new Country("India",  "1300M", R.drawable.india));
        countryArr.add(new Country("lao",  "7M", R.drawable.lao));
        countryArr.add(new Country("Cambodia",  "12M", R.drawable.cambodia));
    }

}