package com.example.bdjobprep.JobsBankQuesActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;

public class bd_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout one,two,three,four,five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_bank_ques_activity);
        init();
    }

    private void init() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.one){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eRWOWLyNNaeZiVZMq9FeUWQ6MNI9GWx5/view?usp=sharing"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iEu8ZzH5kj45VoF84S6HC2QBNgxpsDKG/view?usp=sharing"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lOPyI16ZV5u5AqIBbbwo94d_pi9sW6mo/view?usp=sharing"));
            startActivity(intent);
        }
        if(v.getId()==R.id.four){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1CQZSlWfhhPslI3PlfwVZU2HyAC_g29G7/view?usp=sharing"));
            startActivity(intent);
        }
        if(v.getId()==R.id.five){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ZSO3HDcbQ4JV71URvWOohZPo1UIMrQt3/view?usp=sharing"));
            startActivity(intent);
        }
    }
}
