package com.example.lookingglass;

import android.app.Application;

import java.util.Arrays;

public class Exhibitinfo extends Application{
    public String Qrcode;
    public String[] history;
    public int count;

    public Exhibitinfo()
    {
        Qrcode = "error";
        history = new String[10];
        Arrays.fill(history, "Error");
        count = 0;
    }

}
