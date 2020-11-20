package com.example.bdjobprep.JobsBankQuesActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;

public class sonali_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout one,two,three,four,five,six,seven,eight,nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonali_bank_ques_activity);
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
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.one){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1qGKvgDjvAI8MfngK8qxuTZrdW19V7cHW"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1wOS0YfZVRDxgmXHxQ6VXVpZuynND7nqE"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1flAVRoisKiFAMauHA2a_dBLi0PvjSOaw"));
            startActivity(intent);
        }
        if(v.getId()==R.id.four){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Liyc7WDYx1xBFrZzfnN48epYsk0LuHAR"));
            startActivity(intent);
        }
        if(v.getId()==R.id.five){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1-agtITv_6p8zxj4-gY4kcu_kmLupWpTC"));
            startActivity(intent);
        }
        if(v.getId()==R.id.six){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1VsKjvQ2FxwYp8Aaia5Gf39dKqfFjYYu0"));
            startActivity(intent);
        }
        if(v.getId()==R.id.seven){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1kvKVUj__mMiiBtSU30aJqwCtlcO7hvl3"));
            startActivity(intent);
        }
        if(v.getId()==R.id.eight){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1eSUQTITASQfO4ApXK2PWm-3S5A06RAPg"));
            startActivity(intent);
        }
        if(v.getId()==R.id.nine){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1p6I4eqkUxtLh-XlqQSB8G93Xhhgcj2S4"));
            startActivity(intent);
        }
    }
}
