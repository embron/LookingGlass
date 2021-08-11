package com.example.lookingglass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class Exhibittab extends AppCompatActivity {
    private TextView artname;
    private TextView artdesc;
    private TextView artsum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibittab);
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
            artname.setText(Exhibitinfo.getTitle(1));
            artdesc.setText(Exhibitinfo.getArtist(1));
            artsum.setText(Exhibitinfo.getDescription(1));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(1));

            break;
        case"ImpressionSunrise":
            artname.setText(Exhibitinfo.getTitle(2));
            artdesc.setText(Exhibitinfo.getArtist(2));
            artsum.setText(Exhibitinfo.getDescription(2));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(2));

            break;
        case"TheDanceClass":
            artname.setText(Exhibitinfo.getTitle(3));
            artdesc.setText(Exhibitinfo.getArtist(3));
            artsum.setText(Exhibitinfo.getDescription(3));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(3));

            break;
        case"LuncheonAtTheBoatingParty":
            artname.setText(Exhibitinfo.getTitle(4));
            artdesc.setText(Exhibitinfo.getArtist(4));
            artsum.setText(Exhibitinfo.getDescription(4));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(4));

            break;
        case"TheCardPlayers":
            artname.setText(Exhibitinfo.getTitle(5));
            artdesc.setText(Exhibitinfo.getArtist(5));
            artsum.setText(Exhibitinfo.getDescription(5));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(5));

            break;
        default:
            artname.setText(Exhibitinfo.getTitle(0));
            artdesc.setText(Exhibitinfo.getArtist(0));
            artsum.setText(Exhibitinfo.getDescription(0));
            artvid.setVideoPath(Exhibitinfo.getVideoPath(0));

            break;
    }

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }


}

