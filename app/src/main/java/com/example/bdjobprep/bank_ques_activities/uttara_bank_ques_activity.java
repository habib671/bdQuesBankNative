package com.example.bdjobprep.bank_ques_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bdjobprep.R;

public class uttara_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttara_bank_ques_activity);
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
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1mBcv8ecYgvW241X3ghGbsJGWtZdc-Rju"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1sNI_xLRgBKtTAeyxBti4rU-V7xDoX5hM"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1CtbYYQqu-fTZHEmKXcHqwMlajiexLyyg"));
            startActivity(intent);
        }

    }
}
