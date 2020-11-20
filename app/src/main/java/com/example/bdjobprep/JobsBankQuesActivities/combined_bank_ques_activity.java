package com.example.bdjobprep.JobsBankQuesActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;

public class combined_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout one,two,three,four,five,six,seven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined_bank_ques_activity);
        init();
    }

    private void init() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.one){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_TR4BdsV3rTAO9xHqHbWlPopX01WM3Xu/view?usp=sharing"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1eGtts3SdAEstGW5qSY0E9RkTXIstftDr"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Y6dN1aH_kLl5j6r9gygriVewtgCjSW-v"));
            startActivity(intent);
        }
        if(v.getId()==R.id.four){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1vNvs_gfufG0gOXsvSsIOkW-MHWYpeWOT"));
            startActivity(intent);
        }
        if(v.getId()==R.id.five){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1EIDyM9A1PWnNThay0I_qd50iXsobBtPS"));
            startActivity(intent);
        }
        if(v.getId()==R.id.six){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1nmmvuHw2_8t3M5-sMfX3cawDZ0M88dw8"));
            startActivity(intent);
        }
        if(v.getId()==R.id.seven){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1qwCN7A4a2g-FbJzg4NEKGcgWq97nUBw2"));
            startActivity(intent);
        }
    }
}
