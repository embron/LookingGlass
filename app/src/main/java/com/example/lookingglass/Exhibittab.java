package com.example.lookingglass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.LinkedList;

public class Exhibittab extends AppCompatActivity {
    private TextView artname;
    private TextView artdesc;
    private TextView artsum;


    public LinkedList<Exhibit> database = new LinkedList<>();
    String videoPath = "android.resource://" + getPackageName() + "/";
    public String getName(int i)
    {
        return database.get(i).name;
    }
    public String getVideoPath(int i)
    {
        return database.get(i).videoPath;
    }
    public  String getTitle(int i)
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //String a = null,b=null,c=null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibittab);
        // Exhibit Exhibit = new Exhibit(a,b,c);
        exhibitSetUp(database);

        Exhibitinfo Exhibitinfo = (com.example.lookingglass.Exhibitinfo) this.getApplication();
        VideoView artvid = (VideoView) findViewById(R.id.Artistvid);


        artname=findViewById(R.id.Artistname);
        artdesc=findViewById(R.id.artistdesc);
        artsum=findViewById(R.id.Artistsumm);

        findViewById(R.id.returning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    switch (Exhibitinfo.Qrcode){
        case"LunchOnTheGrass":
            artname.setText(getTitle(1));
            artdesc.setText(getArtist(1));
            artsum.setText(getDescription(1));
            artvid.setVideoPath(getVideoPath(1));

            break;
        case"ImpressionSunrise":
            artname.setText(getTitle(2));
            artdesc.setText(getArtist(2));
            artsum.setText(getDescription(2));
            artvid.setVideoPath(getVideoPath(2));

            break;
        case"TheDanceClass":
            artname.setText(getTitle(3));
            artdesc.setText(getArtist(3));
            artsum.setText(getDescription(3));
            artvid.setVideoPath(getVideoPath(3));

            break;
        case"LuncheonAtTheBoatingParty":
            artname.setText(getTitle(4));
            artdesc.setText(getArtist(4));
            artsum.setText(getDescription(4));
            artvid.setVideoPath(getVideoPath(4));

            break;
        case"TheCardPlayers":
            artname.setText(getTitle(5));
            artdesc.setText(getArtist(5));
            artsum.setText(getDescription(5));
            artvid.setVideoPath(getVideoPath(5));

            break;
        default:
            artname.setText(getTitle(0));
            artdesc.setText(getArtist(0));
            artsum.setText(getDescription(0));
            artvid.setVideoPath(getVideoPath(0));

            break;
    }

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }

    static class Exhibit {
        private String name;
        private String videoPath;
        private String title;
        private String artist;
        private String description;

        public Exhibit(String exhibitName, String videoSetPath, String fileText)
        {


            name = exhibitName;
            videoPath = videoSetPath;
            String[] textArray = fileText.split("\n");
            title = textArray[0];
            artist = textArray[1];
            description = textArray[2];
        }


    }

    public void exhibitSetUp(LinkedList<Exhibit> dataEntry){
        String videoPath = "android.resource://" + getPackageName() + "/";
        dataEntry.add(new Exhibit("Error", videoPath + R.raw.errorvideo, getString(R.string.error)));
        dataEntry.add(new Exhibit("LunchOnTheGrass", videoPath + R.raw.lunchonthegrassvideo, getString(R.string.lunchonthegrass)));
        dataEntry.add(new Exhibit("ImpressionSunrise", videoPath + R.raw.impressionsunrisevideo, getString(R.string.impressionsunrise)));
        dataEntry.add(new Exhibit("TheDanceClass", videoPath + R.raw.thedanceclassvideo, getString(R.string.thedanceclass)));
        dataEntry.add(new Exhibit("LuncheonAtTheBoatingParty", videoPath + R.raw.luncheonattheboatingpartyvideo, getString(R.string.luncheonattheboatingparty)));
        dataEntry.add(new Exhibit("TheCardPlayers", videoPath + R.raw.thecardplayersvideo, getString(R.string.thecardplayers)));
    }




}

