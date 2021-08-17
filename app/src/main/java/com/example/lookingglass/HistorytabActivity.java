package com.example.lookingglass;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lookingglass.databinding.ActivityHistorytabBinding;

import java.util.LinkedList;


public class HistorytabActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Exhibitinfo Exhibitinfo = (com.example.lookingglass.Exhibitinfo) this.getApplication();
        com.example.lookingglass.databinding.ActivityHistorytabBinding binding = ActivityHistorytabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        database = new LinkedList<>();
        exhibitSetUp(database);

        MediaController mediaController = new MediaController(this);
        Uri uri = Uri.parse(getVideoPath(0));

        TextView titls_1 = findViewById(R.id.titlels_1);
        TextView desls_1 = findViewById(R.id.destls_1);
        VideoView vidls_1 =findViewById(R.id.Artistvidls_1);
        View ls1 = findViewById(R.id.lastscan_1);
        View ls2 = findViewById(R.id.lastscan_2);
        View ls3 = findViewById(R.id.lastscan_3);
        View ls4 = findViewById(R.id.lastscan_4);
        View ls5 = findViewById(R.id.lastscan_5);
        View ls6 = findViewById(R.id.lastscan_6);
        View ls7 = findViewById(R.id.lastscan_7);
        View ls8 = findViewById(R.id.lastscan_8);
        View ls9 = findViewById(R.id.lastscan_9);
        View ls10 = findViewById(R.id.lastscan_10);



        TextView titls_2 = findViewById(R.id.titlels_2);
        TextView desls_2 = findViewById(R.id.destls_2);
        VideoView vidls_2 =findViewById(R.id.Artistvidls_2);

        TextView titls_3 = findViewById(R.id.titlels_3);
        TextView desls_3 = findViewById(R.id.destls_3);
        VideoView vidls_3 =findViewById(R.id.Artistvidls_3);

        TextView titls_4 = findViewById(R.id.titlels_4);
        TextView desls_4 = findViewById(R.id.destls_4);
        VideoView vidls_4 =findViewById(R.id.Artistvidls_4);

        TextView titls_5 = findViewById(R.id.titlels_5);
        TextView desls_5 = findViewById(R.id.destls_5);
        VideoView vidls_5 =findViewById(R.id.Artistvidls_5);

        TextView titls_6 = findViewById(R.id.titlels_6);
        TextView desls_6 = findViewById(R.id.destls_6);
        VideoView vidls_6 =findViewById(R.id.Artistvidls_6);

        TextView titls_7 = findViewById(R.id.titlels_7);
        TextView desls_7 = findViewById(R.id.destls_7);
        VideoView vidls_7 =findViewById(R.id.Artistvidls_7);

        TextView titls_8 = findViewById(R.id.titlels_8);
        TextView desls_8 = findViewById(R.id.destls_8);
        VideoView vidls_8 =findViewById(R.id.Artistvidls_8);

        TextView titls_9 = findViewById(R.id.titlels_9);
        TextView desls_9 = findViewById(R.id.destls_9);
        VideoView vidls_9 =findViewById(R.id.Artistvidls_9);

        TextView titls_10 = findViewById(R.id.titlels_10);
        TextView desls_10 = findViewById(R.id.destls_10);
        VideoView vidls_10 =findViewById(R.id.Artistvidls_10);

        //Toolbar toolbar = binding.toolbar;
        //setSupportActionBar(toolbar);

/////////////////1
        switch ( com.example.lookingglass.MainActivity.getHistory(0)){
            case"LunchOnTheGrass":

                titls_1.setText(getTitle(1));
                desls_1.setText(getArtist(1));
                vidls_1.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_1.setText(getTitle(2));
                desls_1.setText(getArtist(2));
                vidls_1.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_1.setText(getTitle(3));
                desls_1.setText(getArtist(3));
                vidls_1.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_1.setText(getTitle(4));
                desls_1.setText(getArtist(4));
                vidls_1.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_1.setText(getTitle(5));
                desls_1.setText(getArtist(5));
                vidls_1.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
               // Exhibitinfo.Qrcode ="Error";
                titls_1.setText(getTitle(0));
                desls_1.setText(getArtist(0));
                vidls_1.setVideoPath(getVideoPath(0));
                vidls_1.setVideoURI(uri);
                vidls_1.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_1);
                titls_1.setVisibility(View.GONE);
                desls_1.setVisibility(View.GONE);
                vidls_1.setVisibility(View.GONE);
                ls1.setVisibility(View.GONE);
                findViewById(R.id.lastscan_1).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////2
        switch ( com.example.lookingglass.MainActivity.getHistory(1)){
            case"LunchOnTheGrass":

                titls_2.setText(getTitle(1));
                desls_2.setText(getArtist(1));
                vidls_2.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_2.setText(getTitle(2));
                desls_2.setText(getArtist(2));
                vidls_2.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_2.setText(getTitle(3));
                desls_2.setText(getArtist(3));
                vidls_2.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_2.setText(getTitle(4));
                desls_2.setText(getArtist(4));
                vidls_2.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_2.setText(getTitle(5));
                desls_2.setText(getArtist(5));
                vidls_2.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_2.setText(getTitle(0));
                desls_2.setText(getArtist(0));
                vidls_2.setVideoPath(getVideoPath(0));
                vidls_2.setVideoURI(uri);
                vidls_2.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_2);
                titls_2.setVisibility(View.GONE);
                desls_2.setVisibility(View.GONE);
                vidls_2.setVisibility(View.GONE);
                ls2.setVisibility(View.GONE);
                findViewById(R.id.lastscan_2).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////3
        switch ( com.example.lookingglass.MainActivity.getHistory(2)){
            case"LunchOnTheGrass":

                titls_3.setText(getTitle(1));
                desls_3.setText(getArtist(1));
                vidls_3.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_3.setText(getTitle(2));
                desls_3.setText(getArtist(2));
                vidls_3.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_3.setText(getTitle(3));
                desls_3.setText(getArtist(3));
                vidls_3.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_3.setText(getTitle(4));
                desls_3.setText(getArtist(4));
                vidls_3.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_3.setText(getTitle(5));
                desls_3.setText(getArtist(5));
                vidls_3.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_3.setText(getTitle(0));
                desls_3.setText(getArtist(0));
                vidls_3.setVideoPath(getVideoPath(0));
                vidls_3.setVideoURI(uri);
                vidls_3.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_3);
                titls_3.setVisibility(View.GONE);
                desls_3.setVisibility(View.GONE);
                vidls_3.setVisibility(View.GONE);
                ls3.setVisibility(View.GONE);
                findViewById(R.id.lastscan_3).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////4
        switch ( com.example.lookingglass.MainActivity.getHistory(3)){
            case"LunchOnTheGrass":

                titls_4.setText(getTitle(1));
                desls_4.setText(getArtist(1));
                vidls_4.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_4.setText(getTitle(2));
                desls_4.setText(getArtist(2));
                vidls_4.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_4.setText(getTitle(3));
                desls_4.setText(getArtist(3));
                vidls_4.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_4.setText(getTitle(4));
                desls_4.setText(getArtist(4));
                vidls_4.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_4.setText(getTitle(5));
                desls_4.setText(getArtist(5));
                vidls_4.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
            //    Exhibitinfo.Qrcode ="Error";
                titls_4.setText(getTitle(0));
                desls_4.setText(getArtist(0));
                vidls_4.setVideoPath(getVideoPath(0));
                vidls_4.setVideoURI(uri);
                vidls_4.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_4);
                titls_4.setVisibility(View.GONE);
                desls_4.setVisibility(View.GONE);
                vidls_4.setVisibility(View.GONE);
                ls4.setVisibility(View.GONE);
                findViewById(R.id.lastscan_4).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////5
        switch ( com.example.lookingglass.MainActivity.getHistory(4)){
            case"LunchOnTheGrass":

                titls_5.setText(getTitle(1));
                desls_5.setText(getArtist(1));
                vidls_5.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_5.setText(getTitle(2));
                desls_5.setText(getArtist(2));
                vidls_5.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_5.setText(getTitle(3));
                desls_5.setText(getArtist(3));
                vidls_5.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_5.setText(getTitle(4));
                desls_5.setText(getArtist(4));
                vidls_5.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_5.setText(getTitle(5));
                desls_5.setText(getArtist(5));
                vidls_5.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
              //  Exhibitinfo.Qrcode ="Error";
                titls_5.setText(getTitle(0));
                desls_5.setText(getArtist(0));
                vidls_5.setVideoPath(getVideoPath(0));
                vidls_5.setVideoURI(uri);
                vidls_5.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_5);
                titls_5.setVisibility(View.GONE);
                desls_5.setVisibility(View.GONE);
                vidls_5.setVisibility(View.GONE);
                ls5.setVisibility(View.GONE);
                findViewById(R.id.lastscan_5).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////6
        switch ( com.example.lookingglass.MainActivity.getHistory(5)){
            case"LunchOnTheGrass":

                titls_6.setText(getTitle(1));
                desls_6.setText(getArtist(1));
                vidls_6.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_6.setText(getTitle(2));
                desls_6.setText(getArtist(2));
                vidls_6.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_6.setText(getTitle(3));
                desls_6.setText(getArtist(3));
                vidls_6.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_6.setText(getTitle(4));
                desls_6.setText(getArtist(4));
                vidls_6.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_6.setText(getTitle(5));
                desls_6.setText(getArtist(5));
                vidls_6.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
           //     Exhibitinfo.Qrcode ="Error";
                titls_6.setText(getTitle(0));
                desls_6.setText(getArtist(0));
                vidls_6.setVideoPath(getVideoPath(0));
                vidls_6.setVideoURI(uri);
                vidls_6.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_6);
                titls_6.setVisibility(View.GONE);
                desls_6.setVisibility(View.GONE);
                vidls_6.setVisibility(View.GONE);
                ls6.setVisibility(View.GONE);
                findViewById(R.id.lastscan_6).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////7
        switch ( com.example.lookingglass.MainActivity.getHistory(6)){
            case"LunchOnTheGrass":

                titls_7.setText(getTitle(1));
                desls_7.setText(getArtist(1));
                vidls_7.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_7.setText(getTitle(2));
                desls_7.setText(getArtist(2));
                vidls_7.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_7.setText(getTitle(3));
                desls_7.setText(getArtist(3));
                vidls_7.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_7.setText(getTitle(4));
                desls_7.setText(getArtist(4));
                vidls_7.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_7.setText(getTitle(5));
                desls_7.setText(getArtist(5));
                vidls_7.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_7.setText(getTitle(0));
                desls_7.setText(getArtist(0));
                vidls_7.setVideoPath(getVideoPath(0));
                vidls_7.setVideoURI(uri);
                vidls_7.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_7);
                titls_7.setVisibility(View.GONE);
                desls_7.setVisibility(View.GONE);
                vidls_7.setVisibility(View.GONE);
                ls7.setVisibility(View.GONE);
                findViewById(R.id.lastscan_7).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////8
        switch ( com.example.lookingglass.MainActivity.getHistory(7)){
            case"LunchOnTheGrass":

                titls_8.setText(getTitle(1));
                desls_8.setText(getArtist(1));
                vidls_8.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_8.setText(getTitle(2));
                desls_8.setText(getArtist(2));
                vidls_8.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_8.setText(getTitle(3));
                desls_8.setText(getArtist(3));
                vidls_8.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_8.setText(getTitle(4));
                desls_8.setText(getArtist(4));
                vidls_8.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_8.setText(getTitle(5));
                desls_8.setText(getArtist(5));
                vidls_8.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_8.setText(getTitle(0));
                desls_8.setText(getArtist(0));
                vidls_8.setVideoPath(getVideoPath(0));
                vidls_8.setVideoURI(uri);
                vidls_8.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_8);
                titls_8.setVisibility(View.GONE);
                desls_8.setVisibility(View.GONE);
                vidls_8.setVisibility(View.GONE);
                ls8.setVisibility(View.GONE);
                findViewById(R.id.lastscan_8).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////9
        switch ( com.example.lookingglass.MainActivity.getHistory(8)){
            case"LunchOnTheGrass":

                titls_9.setText(getTitle(1));
                desls_9.setText(getArtist(1));
                vidls_9.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_9.setText(getTitle(2));
                desls_9.setText(getArtist(2));
                vidls_9.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_9.setText(getTitle(3));
                desls_9.setText(getArtist(3));
                vidls_9.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_9.setText(getTitle(4));
                desls_9.setText(getArtist(4));
                vidls_9.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_9.setText(getTitle(5));
                desls_9.setText(getArtist(5));
                vidls_9.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_9.setText(getTitle(0));
                desls_9.setText(getArtist(0));
                vidls_9.setVideoPath(getVideoPath(0));
                vidls_9.setVideoURI(uri);
                vidls_9.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_9);
                titls_9.setVisibility(View.GONE);
                desls_9.setVisibility(View.GONE);
                vidls_9.setVisibility(View.GONE);
                ls9.setVisibility(View.GONE);
                findViewById(R.id.lastscan_9).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }
/////////////////10
        switch ( com.example.lookingglass.MainActivity.getHistory(9)){
            case"LunchOnTheGrass":

                titls_10.setText(getTitle(1));
                desls_10.setText(getArtist(1));
                vidls_10.setVideoPath(getVideoPath(1));
                uri =Uri.parse(getVideoPath(1));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LunchOnTheGrass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"ImpressionSunrise":

                titls_10.setText(getTitle(2));
                desls_10.setText(getArtist(2));
                vidls_10.setVideoPath(getVideoPath(2));
                uri =Uri.parse(getVideoPath(2));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("ImpressionSunrise");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheDanceClass":

                titls_10.setText(getTitle(3));
                desls_10.setText(getArtist(3));
                vidls_10.setVideoPath(getVideoPath(3));
                uri =Uri.parse(getVideoPath(3));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheDanceClass");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"LuncheonAtTheBoatingParty":

                titls_10.setText(getTitle(4));
                desls_10.setText(getArtist(4));
                vidls_10.setVideoPath(getVideoPath(4));
                uri =Uri.parse(getVideoPath(4));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("LuncheonAtTheBoatingParty");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            case"TheCardPlayers":

                titls_10.setText(getTitle(5));
                desls_10.setText(getArtist(5));
                vidls_10.setVideoPath(getVideoPath(5));
                uri =Uri.parse(getVideoPath(5));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("TheCardPlayers");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
            default:
             //   Exhibitinfo.Qrcode ="Error";
                titls_10.setText(getTitle(0));
                desls_10.setText(getArtist(0));
                vidls_10.setVideoPath(getVideoPath(0));
                vidls_10.setVideoURI(uri);
                vidls_10.setMediaController(mediaController);
                mediaController.setAnchorView(vidls_10);
                titls_10.setVisibility(View.GONE);
                desls_10.setVisibility(View.GONE);
                vidls_10.setVisibility(View.GONE);
                ls10.setVisibility(View.GONE);
                findViewById(R.id.lastscan_10).setOnClickListener(v -> {
                    com.example.lookingglass.MainActivity.setQrcode("Error");
                    startActivity(new Intent(getApplicationContext(),Exhibittab.class));
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                });

                break;
        }

        findViewById(R.id.fab).setOnClickListener(view -> onBackPressed());


    }

    public LinkedList<Exhibit> database;
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
        String videoPath = "android.resource://" + getPackageName() + '/';
        dataEntry.add(new Exhibit("Error", videoPath + R.raw.errorvideo, getString(R.string.error)));
        dataEntry.add(new Exhibit("LunchOnTheGrass", videoPath + R.raw.lunchonthegrassvideo, getString(R.string.lunchonthegrass)));
        dataEntry.add(new Exhibit("ImpressionSunrise", videoPath + R.raw.impressionsunrisevideo, getString(R.string.impressionsunrise)));
        dataEntry.add(new Exhibit("TheDanceClass", videoPath + R.raw.thedanceclassvideo, getString(R.string.thedanceclass)));
        dataEntry.add(new Exhibit("LuncheonAtTheBoatingParty", videoPath + R.raw.luncheonattheboatingpartyvideo, getString(R.string.luncheonattheboatingparty)));
        dataEntry.add(new Exhibit("TheCardPlayers", videoPath + R.raw.thecardplayersvideo, getString(R.string.thecardplayers)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}