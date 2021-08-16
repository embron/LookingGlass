package com.example.lookingglass;

import android.app.Application;

import java.util.Arrays;

public class Exhibitinfo extends Application{
    public String Qrcode = "error";
    public String[] history= new String[10];
    public int count = 0;

    public String getQrcode(){
        return Qrcode;
    }
    public void setQrcode(String qr){
        Qrcode=qr;
    }

    public String getHistory(int a){
        return history[a];
    }

    public void setHistory(int a,String qr){
        history[a]=qr;
    }

    public void inccount(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
