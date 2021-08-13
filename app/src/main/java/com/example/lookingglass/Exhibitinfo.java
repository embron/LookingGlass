package com.example.lookingglass;

import android.app.Application;

public class Exhibitinfo extends Application{
    public String Qrcode;
    public String[] history;
    public int count;

    public Exhibitinfo()
    {
        Qrcode = "error";
        history = new String[10];
        history = null;
        count = 0;
    }

}
