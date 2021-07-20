package com.example.lookingglass;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.LinkedList;

//project member names here:
// Alexander West
// Michael Aiyedun
//Suman Poudel
//Matthew Speer

class Exhibit {
    private String name;
}

public class MainActivity extends AppCompatActivity {
    LinkedList<Exhibit> database = new LinkedList<>();
    private TextView qrres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrres = findViewById(R.id.QRRES);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PackageManager.PERMISSION_GRANTED);
    }


    public void Scanbuttion(View view){
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
                qrres.setText(intentResult.getContents());
            }


        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}