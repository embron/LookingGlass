package com.example.lookingglass;
import android.app.Application;

import java.util.LinkedList;

public class Exhibitinfo extends Application{
    public String Qrcode;
    public String history[]= new String[10];
    public int count=0;
    public LinkedList<Exhibitinfo> database = new LinkedList<>();
    private String name;
    private String videoPath;
    private String title;
    private String artist;
    private String description;

    public Exhibitinfo(String exhibitName, String videoSetPath, String fileText)
    {

        exhibitinfoSetUp(database);
        name = exhibitName;
        videoPath = videoSetPath;
        String textArray[] = fileText.split("\n");
        title = textArray[0];
        artist = textArray[1];
        description = textArray[2];
    }

    public String getName(int i)
    {
        return database.get(i).name;
    }
    public String getVideoPath(int i)
    {
        return database.get(i).videoPath;
    }
    public String getTitle(int i)
    {
        return database.get(i).title;
    }
    public String getArtist(int i)
    {
        return database.get(i).artist;
    }
    public String getDescription(int i)
    {
        return database.get(i).description;
    }


    public void exhibitinfoSetUp(LinkedList<Exhibitinfo> dataEntry)
    {
        String videoPath = "android.resource://" + getPackageName() + "/";
        dataEntry.add(new Exhibitinfo("Error", videoPath + R.raw.errorvideo, getString(R.string.error)));
        dataEntry.add(new Exhibitinfo("LunchOnTheGrass", videoPath + R.raw.lunchonthegrassvideo, getString(R.string.lunchonthegrass)));
        dataEntry.add(new Exhibitinfo("ImpressionSunrise", videoPath + R.raw.impressionsunrisevideo, getString(R.string.impressionsunrise)));
        dataEntry.add(new Exhibitinfo("TheDanceClass", videoPath + R.raw.thedanceclassvideo, getString(R.string.thedanceclass)));
        dataEntry.add(new Exhibitinfo("LuncheonAtTheBoatingParty", videoPath + R.raw.luncheonattheboatingpartyvideo, getString(R.string.luncheonattheboatingparty)));
        dataEntry.add(new Exhibitinfo("TheCardPlayers", videoPath + R.raw.thecardplayersvideo, getString(R.string.thecardplayers)));


    }

}
