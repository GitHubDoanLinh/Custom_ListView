package com.example.custom_listview;

import java.lang.reflect.Constructor;

public class Country {
    public void setTenQuocGia(String tenQuocGia) {
        TenQuocGia = tenQuocGia;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    private String TenQuocGia;
    private  String MoTa;
    private  int Hinh;

    public Country(String tenQuocGia, String moTa, int hinh) {
        TenQuocGia = tenQuocGia;
        MoTa = moTa;
        Hinh = hinh;
    }
    public  String getTen(){
        return  TenQuocGia;
    }
    public  String getMota(){
        return  MoTa;
    }
    public  int getHinh(){
        return  Hinh;
    }
}
