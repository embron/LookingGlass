package com.example.lookingglass;
import android.app.Application;

public class Exhibitinfo extends Application{


    private String name;
    private String videoPath;
    private String title;
    private String artist;
    private String description;

    public Exhibitinfo(String exhibitName, String videoSetPath, String fileText)
    {
        name = exhibitName;
        videoPath = videoSetPath;
        String textArray[] = fileText.split("\n");
        title = textArray[0];
        artist = textArray[1];
        description = textArray[2];
    }

    public String getName()
    {
        return name;
    }
    public String getVideoPath()
    {
        return videoPath;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getDescription()
    {
        return description;
    }

}
