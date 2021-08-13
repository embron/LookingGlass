package com.example.lookingglass;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.LinkedList;

// media player imports

// for scrolling activtity

//project member names here:
// Alexander West
// Michael Aiyedun
//Suman Poudel
//Matthew Speer

class Exhibit {
    private final String name;
    private final String videoPath;
    private final String title;
    private final String artist;
    private final String description;

    public Exhibit()
    {
        name = "error";
        videoPath = "error";
        title = "error";
        artist = "error";
        description = "error";
    }
    public Exhibit(String exhibitName, String videoSetPath, String fileText)
    {
        name = exhibitName;
        videoPath = videoSetPath;
        String[] textArray = fileText.split("\n");
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

public class MainActivity extends AppCompatActivity {
    Exhibitinfo Exhibitinfo = (com.example.lookingglass.Exhibitinfo) this.getApplication();
    LinkedList<Exhibit> database = new LinkedList<>();
    private TextView qrres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exhibitSetUp(database);
//history button
    findViewById(R.id.Histbutton).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),HistorytabActivity.class));
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    });

//Exhibit button
    findViewById(R.id.Exhibbutton).setOnClickListener(v -> {
        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    });
        qrres = findViewById(R.id.QRRES);// qrress needs to be called later when the snan page is made
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PackageManager.PERMISSION_GRANTED);
    }

    public void exhibitSetUp(LinkedList<Exhibit> dataEntry)
    {
        String videoPath = "android.resource://" + getPackageName() + "/";
        dataEntry.add(new Exhibit("Error", videoPath + R.raw.errorvideo, getString(R.string.error)));
        dataEntry.add(new Exhibit("LunchOnTheGrass", videoPath + R.raw.lunchonthegrassvideo, getString(R.string.lunchonthegrass)));
        dataEntry.add(new Exhibit("ImpressionSunrise", videoPath + R.raw.impressionsunrisevideo, getString(R.string.impressionsunrise)));
        dataEntry.add(new Exhibit("TheDanceClass", videoPath + R.raw.thedanceclassvideo, getString(R.string.thedanceclass)));
        dataEntry.add(new Exhibit("LuncheonAtTheBoatingParty", videoPath + R.raw.luncheonattheboatingpartyvideo, getString(R.string.luncheonattheboatingparty)));
        dataEntry.add(new Exhibit("TheCardPlayers", videoPath + R.raw.thecardplayersvideo, getString(R.string.thecardplayers)));


    }


    public void Scanbutton(View view){
        IntentIntegrator intentIntegrator = new IntentIntegrator(this);
        intentIntegrator.initiateScan();

    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(intentResult != null){
            if(intentResult.getContents()==null){
                qrres.setText("empty");
            }else{
                Exhibitinfo.Qrcode =intentResult.getContents();

                if(Exhibitinfo.count<10){
                Exhibitinfo.history[Exhibitinfo.count]=Exhibitinfo.Qrcode;
                Exhibitinfo.count++;
                }else{
                    for (int a=0;a<9;a++){
                        Exhibitinfo.history[9-a]=Exhibitinfo.history[9-a-1];
                    }
                    Exhibitinfo.history[0]=Exhibitinfo.Qrcode;
                }

                qrres.setText(intentResult.getContents());// compare database results here

            }


        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}