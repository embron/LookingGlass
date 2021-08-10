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
                artname.setText("LunchOnTheGrass");
                artdesc.setText("");
                artsum.setText("");
                artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
        case"ImpressionSunrise":
            artname.setText("ImpressionSunrise");
            artdesc.setText("");
            artsum.setText("");
            artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
        case"TheDanceClass":
            artname.setText("TheDanceClass");
            artdesc.setText("");
            artsum.setText("");
            artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
        case"LuncheonAtTheBoatingParty":
            artname.setText("LuncheonAtTheBoatingParty");
            artdesc.setText("");
            artsum.setText("");
            artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
        case"TheCardPlayers":
            artname.setText("TheCardPlayers");
            artdesc.setText("");
            artsum.setText("");
            artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
        default:
            artname.setText("Error");
            artdesc.setText("");
            artsum.setText("");
            artvid.setVideoPath(Exhibitinfo.getVideoPath());

            break;
    }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}