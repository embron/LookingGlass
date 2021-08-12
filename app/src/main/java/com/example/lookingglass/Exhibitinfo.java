package com.example.lookingglass;

import android.app.Application;

public class Exhibitinfo extends Application{
    public String Qrcode;
    public String[] history;
    public int count=0;

    public Exhibitinfo()
    {
        Qrcode = "error";
        history = new String[10];
        count = 0;
    }

}
