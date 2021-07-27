package com.example.lookingglass;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// media player imports
import android.widget.MediaController;
import android.widget.VideoView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.LinkedList;

// for scrolling activtity

//project member names here:
// Alexander West
// Michael Aiyedun
//Suman Poudel
//Matthew Speer

class Exhibit {
    private String name;
    private String videoPath;

    public Exhibit(String exhibitName, int videoID)
    {
        name = exhibitName;
        if (videoID == -99)
        {
            videoPath = "NULL";
        }
        else
        {
            //videoPath = "android.resource://" + getPackageName() + "/" + videoID;
        }
    }
}

public class MainActivity extends AppCompatActivity {
    LinkedList<Exhibit> database = new LinkedList<>();
    private TextView qrres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exhibitSetUp(database);

    findViewById(R.id.Histbutton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),HistorytabActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
        }
    });

        qrres = findViewById(R.id.QRRES);// qrress needs to be called later when the snan page is made
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PackageManager.PERMISSION_GRANTED);
    }

    public void exhibitSetUp(LinkedList<Exhibit> dataEntry)
    {
        dataEntry.add(new Exhibit("MonaLisa", R.raw.testvideo));
        dataEntry.add(new Exhibit("StarryNight", -99));
        dataEntry.add(new Exhibit("BirthOfVenus", -99));
        dataEntry.add(new Exhibit("Guernica", -99));
        dataEntry.add(new Exhibit("AmericanGothic", -99));
    }

    public void Scanbutton(View view){
        IntentIntegrator intentIntegrator = new IntentIntegrator(this);
        intentIntegrator.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(intentResult != null){
            if(intentResult.getContents()==null){
                qrres.setText("empty");
            }else{
                qrres.setText(intentResult.getContents());// compare database results here

            }


        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}