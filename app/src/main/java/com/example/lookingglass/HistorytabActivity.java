package com.example.lookingglass;


import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.lookingglass.databinding.ActivityHistorytabBinding;

public class HistorytabActivity extends AppCompatActivity {

    private ActivityHistorytabBinding binding;
    private TextView titls_1;
    private TextView Desls_1;

    private TextView titls_2;
    private TextView Desls_2;

    private TextView titls_3;
    private TextView Desls_3;

    private TextView titls_4;
    private TextView Desls_4;

    private TextView titls_5;
    private TextView Desls_5;

    private TextView titls_6;
    private TextView Desls_6;

    private TextView titls_7;
    private TextView Desls_7;

    private TextView titls_8;
    private TextView Desls_8;

    private TextView titls_9;
    private TextView Desls_9;

    private TextView titls_10;
    private TextView Desls_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Exhibitinfo Exhibitinfo = (com.example.lookingglass.Exhibitinfo) this.getApplication();
        binding = ActivityHistorytabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        titls_1=findViewById(R.id.titlels_1);
        Desls_1=findViewById(R.id.destls_1);
        VideoView vidls_1 = (VideoView) findViewById(R.id.Artistvidls_1);

        titls_2=findViewById(R.id.titlels_2);
        Desls_2=findViewById(R.id.destls_2);
        VideoView vidls_2 = (VideoView) findViewById(R.id.Artistvidls_2);

        titls_3=findViewById(R.id.titlels_3);
        Desls_3=findViewById(R.id.destls_3);
        VideoView vidls_3 = (VideoView) findViewById(R.id.Artistvidls_3);

        titls_4=findViewById(R.id.titlels_4);
        Desls_4=findViewById(R.id.destls_4);
        VideoView vidls_4 = (VideoView) findViewById(R.id.Artistvidls_4);

        titls_5=findViewById(R.id.titlels_5);
        Desls_5=findViewById(R.id.destls_5);
        VideoView vidls_5 = (VideoView) findViewById(R.id.Artistvidls_5);

        titls_6=findViewById(R.id.titlels_6);
        Desls_6=findViewById(R.id.destls_6);
        VideoView vidls_6 = (VideoView) findViewById(R.id.Artistvidls_6);

        titls_7=findViewById(R.id.titlels_7);
        Desls_7=findViewById(R.id.destls_7);
        VideoView vidls_7 = (VideoView) findViewById(R.id.Artistvidls_7);

        titls_8=findViewById(R.id.titlels_8);
        Desls_8=findViewById(R.id.destls_8);
        VideoView vidls_8 = (VideoView) findViewById(R.id.Artistvidls_8);

        titls_9=findViewById(R.id.titlels_9);
        Desls_9=findViewById(R.id.destls_9);
        VideoView vidls_9 = (VideoView) findViewById(R.id.Artistvidls_9);

        titls_10=findViewById(R.id.titlels_10);
        Desls_10=findViewById(R.id.destls_10);
        VideoView vidls_10 = (VideoView) findViewById(R.id.Artistvidls_10);

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);

/////////////////1
        switch ( Exhibitinfo.history[0]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_1.setText(Exhibitinfo.getTitle(1));
                Desls_1.setText(Exhibitinfo.getArtist(1));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(1));
                   findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                        @Override
                       public void onClick(View v) {
                               startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                       }
                  });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_1.setText(Exhibitinfo.getTitle(2));
                Desls_1.setText(Exhibitinfo.getArtist(2));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_1.setText(Exhibitinfo.getTitle(3));
                Desls_1.setText(Exhibitinfo.getArtist(3));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_1.setText(Exhibitinfo.getTitle(4));
                Desls_1.setText(Exhibitinfo.getArtist(4));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_1.setText(Exhibitinfo.getTitle(5));
                Desls_1.setText(Exhibitinfo.getArtist(5));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_1.setText(Exhibitinfo.getTitle(0));
                Desls_1.setText(Exhibitinfo.getArtist(0));
                vidls_1.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////2
        switch ( Exhibitinfo.history[1]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_2.setText(Exhibitinfo.getTitle(1));
                Desls_2.setText(Exhibitinfo.getArtist(1));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_2.setText(Exhibitinfo.getTitle(2));
                Desls_2.setText(Exhibitinfo.getArtist(2));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_2.setText(Exhibitinfo.getTitle(3));
                Desls_2.setText(Exhibitinfo.getArtist(3));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_2.setText(Exhibitinfo.getTitle(4));
                Desls_2.setText(Exhibitinfo.getArtist(4));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_2.setText(Exhibitinfo.getTitle(5));
                Desls_2.setText(Exhibitinfo.getArtist(5));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_2.setText(Exhibitinfo.getTitle(0));
                Desls_2.setText(Exhibitinfo.getArtist(0));
                vidls_2.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////3
        switch ( Exhibitinfo.history[2]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_3.setText(Exhibitinfo.getTitle(1));
                Desls_3.setText(Exhibitinfo.getArtist(1));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_3.setText(Exhibitinfo.getTitle(2));
                Desls_3.setText(Exhibitinfo.getArtist(2));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_3.setText(Exhibitinfo.getTitle(3));
                Desls_3.setText(Exhibitinfo.getArtist(3));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_3.setText(Exhibitinfo.getTitle(4));
                Desls_3.setText(Exhibitinfo.getArtist(4));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_3.setText(Exhibitinfo.getTitle(5));
                Desls_3.setText(Exhibitinfo.getArtist(5));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_3.setText(Exhibitinfo.getTitle(0));
                Desls_3.setText(Exhibitinfo.getArtist(0));
                vidls_3.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////4
        switch ( Exhibitinfo.history[3]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_4.setText(Exhibitinfo.getTitle(1));
                Desls_4.setText(Exhibitinfo.getArtist(1));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_4.setText(Exhibitinfo.getTitle(2));
                Desls_4.setText(Exhibitinfo.getArtist(2));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_4.setText(Exhibitinfo.getTitle(3));
                Desls_4.setText(Exhibitinfo.getArtist(3));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_4.setText(Exhibitinfo.getTitle(4));
                Desls_4.setText(Exhibitinfo.getArtist(4));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_4.setText(Exhibitinfo.getTitle(5));
                Desls_4.setText(Exhibitinfo.getArtist(5));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_4.setText(Exhibitinfo.getTitle(0));
                Desls_4.setText(Exhibitinfo.getArtist(0));
                vidls_4.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_4).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////5
        switch ( Exhibitinfo.history[4]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_5.setText(Exhibitinfo.getTitle(1));
                Desls_5.setText(Exhibitinfo.getArtist(1));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_5.setText(Exhibitinfo.getTitle(2));
                Desls_5.setText(Exhibitinfo.getArtist(2));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_5.setText(Exhibitinfo.getTitle(3));
                Desls_5.setText(Exhibitinfo.getArtist(3));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_5.setText(Exhibitinfo.getTitle(4));
                Desls_5.setText(Exhibitinfo.getArtist(4));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_5.setText(Exhibitinfo.getTitle(5));
                Desls_5.setText(Exhibitinfo.getArtist(5));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_5.setText(Exhibitinfo.getTitle(0));
                Desls_5.setText(Exhibitinfo.getArtist(0));
                vidls_5.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_5).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////6
        switch ( Exhibitinfo.history[5]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_6.setText(Exhibitinfo.getTitle(1));
                Desls_6.setText(Exhibitinfo.getArtist(1));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_6.setText(Exhibitinfo.getTitle(2));
                Desls_6.setText(Exhibitinfo.getArtist(2));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_6.setText(Exhibitinfo.getTitle(3));
                Desls_6.setText(Exhibitinfo.getArtist(3));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_6.setText(Exhibitinfo.getTitle(4));
                Desls_6.setText(Exhibitinfo.getArtist(4));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_6.setText(Exhibitinfo.getTitle(5));
                Desls_6.setText(Exhibitinfo.getArtist(5));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_6.setText(Exhibitinfo.getTitle(0));
                Desls_6.setText(Exhibitinfo.getArtist(0));
                vidls_6.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_6).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////7
        switch ( Exhibitinfo.history[6]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_7.setText(Exhibitinfo.getTitle(1));
                Desls_7.setText(Exhibitinfo.getArtist(1));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_7.setText(Exhibitinfo.getTitle(2));
                Desls_7.setText(Exhibitinfo.getArtist(2));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_7.setText(Exhibitinfo.getTitle(3));
                Desls_7.setText(Exhibitinfo.getArtist(3));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_7.setText(Exhibitinfo.getTitle(4));
                Desls_7.setText(Exhibitinfo.getArtist(4));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_7.setText(Exhibitinfo.getTitle(5));
                Desls_7.setText(Exhibitinfo.getArtist(5));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_7.setText(Exhibitinfo.getTitle(0));
                Desls_7.setText(Exhibitinfo.getArtist(0));
                vidls_7.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_7).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////8
        switch ( Exhibitinfo.history[7]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_8.setText(Exhibitinfo.getTitle(1));
                Desls_8.setText(Exhibitinfo.getArtist(1));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_8.setText(Exhibitinfo.getTitle(2));
                Desls_8.setText(Exhibitinfo.getArtist(2));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_8.setText(Exhibitinfo.getTitle(3));
                Desls_8.setText(Exhibitinfo.getArtist(3));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_8.setText(Exhibitinfo.getTitle(4));
                Desls_8.setText(Exhibitinfo.getArtist(4));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_8.setText(Exhibitinfo.getTitle(5));
                Desls_8.setText(Exhibitinfo.getArtist(5));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_8.setText(Exhibitinfo.getTitle(0));
                Desls_8.setText(Exhibitinfo.getArtist(0));
                vidls_8.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_8).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////9
        switch ( Exhibitinfo.history[8]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_9.setText(Exhibitinfo.getTitle(1));
                Desls_9.setText(Exhibitinfo.getArtist(1));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_9.setText(Exhibitinfo.getTitle(2));
                Desls_9.setText(Exhibitinfo.getArtist(2));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_9.setText(Exhibitinfo.getTitle(3));
                Desls_9.setText(Exhibitinfo.getArtist(3));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_9.setText(Exhibitinfo.getTitle(4));
                Desls_9.setText(Exhibitinfo.getArtist(4));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_9.setText(Exhibitinfo.getTitle(5));
                Desls_9.setText(Exhibitinfo.getArtist(5));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_9.setText(Exhibitinfo.getTitle(0));
                Desls_9.setText(Exhibitinfo.getArtist(0));
                vidls_9.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_9).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }
/////////////////10
        switch ( Exhibitinfo.history[9]){
            case"LunchOnTheGrass":
                Exhibitinfo.Qrcode ="LunchOnTheGrass";
                titls_10.setText(Exhibitinfo.getTitle(1));
                Desls_10.setText(Exhibitinfo.getArtist(1));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(1));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"ImpressionSunrise":
                Exhibitinfo.Qrcode ="ImpressionSunrise";
                titls_10.setText(Exhibitinfo.getTitle(2));
                Desls_10.setText(Exhibitinfo.getArtist(2));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(2));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheDanceClass":
                Exhibitinfo.Qrcode ="TheDanceClass";
                titls_10.setText(Exhibitinfo.getTitle(3));
                Desls_10.setText(Exhibitinfo.getArtist(3));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(3));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"LuncheonAtTheBoatingParty":
                Exhibitinfo.Qrcode ="LuncheonAtTheBoatingParty";
                titls_10.setText(Exhibitinfo.getTitle(4));
                Desls_10.setText(Exhibitinfo.getArtist(4));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(4));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            case"TheCardPlayers":
                Exhibitinfo.Qrcode ="TheCardPlayers";
                titls_10.setText(Exhibitinfo.getTitle(5));
                Desls_10.setText(Exhibitinfo.getArtist(5));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(5));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
            default:
                Exhibitinfo.Qrcode ="Error";
                titls_10.setText(Exhibitinfo.getTitle(0));
                Desls_10.setText(Exhibitinfo.getArtist(0));
                vidls_10.setVideoPath(Exhibitinfo.getVideoPath(0));
                findViewById(R.id.lastscan_10).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                    }
                });

                break;
        }

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();


            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}