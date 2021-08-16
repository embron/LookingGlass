package com.example.lookingglass;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;

public class Exhibittab extends AppCompatActivity {


    public LinkedList<Exhibit> database = new LinkedList<>();
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
        setContentView(R.layout.activity_exhibittab);
        exhibitSetUp(database);

        Exhibitinfo Exhibitinfo = (com.example.lookingglass.Exhibitinfo) getApplicationContext();
        MainActivity MainActivity= (MainActivity)getApplicationContext();
        VideoView artvid = findViewById(R.id.Artistvid);

        MediaController mediaController = new MediaController(this);
        Uri uri =Uri.parse(getVideoPath(0));

        TextView artname = findViewById(R.id.Artistname);
        TextView artdesc = findViewById(R.id.artistdesc);
        TextView artsum = findViewById(R.id.Artistsumm);

        findViewById(R.id.returning).setOnClickListener(v -> onBackPressed());


    switch (com.example.lookingglass.MainActivity.getQrcode()){
        case"LunchOnTheGrass":
            artname.setText(getTitle(1));
            artdesc.setText(getArtist(1));
            artsum.setText(getDescription(1));
            artvid.setVideoPath(getVideoPath(1));
            uri =Uri.parse(getVideoPath(1));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
        case"ImpressionSunrise":
            artname.setText(getTitle(2));
            artdesc.setText(getArtist(2));
            artsum.setText(getDescription(2));
            artvid.setVideoPath(getVideoPath(2));
            uri =Uri.parse(getVideoPath(2));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
        case"TheDanceClass":
            artname.setText(getTitle(3));
            artdesc.setText(getArtist(3));
            artsum.setText(getDescription(3));
            artvid.setVideoPath(getVideoPath(3));
            uri =Uri.parse(getVideoPath(3));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
        case"LuncheonAtTheBoatingParty":
            artname.setText(getTitle(4));
            artdesc.setText(getArtist(4));
            artsum.setText(getDescription(4));
            artvid.setVideoPath(getVideoPath(4));
            uri =Uri.parse(getVideoPath(4));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
        case"TheCardPlayers":
            artname.setText(getTitle(5));
            artdesc.setText(getArtist(5));
            artsum.setText(getDescription(5));
            artvid.setVideoPath(getVideoPath(5));
            uri =Uri.parse(getVideoPath(5));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
        default:
            artname.setText(getTitle(0));
            artdesc.setText(getArtist(0));
            artsum.setText(getDescription(0));
            artvid.setVideoPath(getVideoPath(0));
            artvid.setVideoURI(uri);
            artvid.setMediaController(mediaController);
            mediaController.setAnchorView(artvid);

            break;
    }

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
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

