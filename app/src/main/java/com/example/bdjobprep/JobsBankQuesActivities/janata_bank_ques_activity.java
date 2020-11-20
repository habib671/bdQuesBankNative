package com.example.bdjobprep.JobsBankQuesActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;

public class janata_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janata_bank_ques_activity);
        init();
    }
    private void init() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.one){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1sAouKzdVp4EDgDEKdwGTI_V4GE2EcFV4"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1JuDS-CqCW8L-hCX7_HmX2NVFwEb_v0kH"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=19WIF3OY5EZjt5aWeUpepvH4ejZu3B4oy"));
            startActivity(intent);
        }

    }
}
