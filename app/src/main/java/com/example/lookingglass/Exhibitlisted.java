package com.example.lookingglass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.LinkedList;

public class Exhibitlisted extends AppCompatActivity {
    public LinkedList<Exhibitlisted.Exhibit> database = new LinkedList<>();
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibitlisted);
        exhibitSetUp(database);
        MediaController mediaController = new MediaController(this);
        Uri uri1 = Uri.parse(getVideoPath(1));
        Uri uri2 = Uri.parse(getVideoPath(2));
        Uri uri3 = Uri.parse(getVideoPath(3));
        Uri uri4 = Uri.parse(getVideoPath(4));
        Uri uri5 = Uri.parse(getVideoPath(5));


        TextView Exhhititle_1=findViewById(R.id.Exhhititle_1);
        TextView Exhidest_1=findViewById(R.id.Exhidest_1);
        VideoView exhiVid_1=findViewById(R.id.exhiVid_1);

        Exhhititle_1.setText(getTitle(1));
        Exhidest_1.setText(getArtist(1));
        exhiVid_1.setVideoPath(getVideoPath(1));

        exhiVid_1.setVideoURI(uri1);
        exhiVid_1.setMediaController(mediaController);
        mediaController.setAnchorView(exhiVid_1);
        findViewById(R.id.Exhibutt_1).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Exhibittab.class));
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation);
        });


        TextView Exhhititle_2=findViewById(R.id.Exhhititle_2);
        TextView Exhidest_2=findViewById(R.id.Exhidest_2);
        VideoView exhiVid_2=findViewById(R.id.exhiVid_2);

        Exhhititle_2.setText(getTitle(2));
        Exhidest_2.setText(getArtist(2));
        exhiVid_2.setVideoPath(getVideoPath(2));
        exhiVid_2.setVideoURI(uri2);
        exhiVid_2.setMediaController(mediaController);
        mediaController.setAnchorView(exhiVid_2);
        findViewById(R.id.Exhibutt_2).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Exhibittab.class));
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation);
        });


        TextView Exhhititle_3=findViewById(R.id.Exhhititle_3);
        TextView Exhidest_3=findViewById(R.id.Exhidest_3);
        VideoView exhiVid_3=findViewById(R.id.exhiVid_3);

        Exhhititle_3.setText(getTitle(3));
        Exhidest_3.setText(getArtist(3));
        exhiVid_3.setVideoPath(getVideoPath(3));
        exhiVid_3.setVideoURI(uri3);
        exhiVid_3.setMediaController(mediaController);
        mediaController.setAnchorView(exhiVid_3);
        findViewById(R.id.Exhibutt_3).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Exhibittab.class));
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation);
        });

        TextView Exhhititle_4=findViewById(R.id.Exhhititle_4);
        TextView Exhidest_4=findViewById(R.id.Exhidest_4);
        VideoView exhiVid_4=findViewById(R.id.exhiVid_4);

        Exhhititle_4.setText(getTitle(4));
        Exhidest_4.setText(getArtist(4));
        exhiVid_4.setVideoPath(getVideoPath(4));
        exhiVid_4.setVideoURI(uri4);
        exhiVid_4.setMediaController(mediaController);
        mediaController.setAnchorView(exhiVid_4);
        findViewById(R.id.Exhibutt_4).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Exhibittab.class));
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation);
        });

        TextView Exhhititle_5=findViewById(R.id.Exhhititle_5);
        TextView Exhidest_5=findViewById(R.id.Exhidest_5);
        VideoView exhiVid_5=findViewById(R.id.exhiVid_5);
        Exhhititle_5.setText(getTitle(5));
        Exhidest_5.setText(getArtist(5));
        exhiVid_5.setVideoPath(getVideoPath(5));
        exhiVid_5.setVideoURI(uri5);
        exhiVid_5.setMediaController(mediaController);
        mediaController.setAnchorView(exhiVid_5);
        findViewById(R.id.Exhibutt_5).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Exhibittab.class));
            overridePendingTransition(R.anim.zoom_in,R.anim.static_animation);
        });
    }

    static class Exhibit {
        private final String name;
        private final String videoPath;
        private final String title;
        private final String artist;
        private final String description;

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
    public void exhibitSetUp(LinkedList<Exhibitlisted.Exhibit> dataEntry){
        String videoPath = "android.resource://" + getPackageName() + "/";
        dataEntry.add(new Exhibitlisted.Exhibit("Error", videoPath + R.raw.errorvideo, getString(R.string.error)));
        dataEntry.add(new Exhibitlisted.Exhibit("LunchOnTheGrass", videoPath + R.raw.lunchonthegrassvideo, getString(R.string.lunchonthegrass)));
        dataEntry.add(new Exhibitlisted.Exhibit("ImpressionSunrise", videoPath + R.raw.impressionsunrisevideo, getString(R.string.impressionsunrise)));
        dataEntry.add(new Exhibitlisted.Exhibit("TheDanceClass", videoPath + R.raw.thedanceclassvideo, getString(R.string.thedanceclass)));
        dataEntry.add(new Exhibitlisted.Exhibit("LuncheonAtTheBoatingParty", videoPath + R.raw.luncheonattheboatingpartyvideo, getString(R.string.luncheonattheboatingparty)));
        dataEntry.add(new Exhibitlisted.Exhibit("TheCardPlayers", videoPath + R.raw.thecardplayersvideo, getString(R.string.thecardplayers)));
    }
}