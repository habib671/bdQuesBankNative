package com.example.bdjobprep.CategoryActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.JobsBankQuesActivities.agrani_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.bd_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.combined_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.janata_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.mixed_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.pkb_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.rupali_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.sonali_bank_ques_activity;
import com.example.bdjobprep.JobsBankQuesActivities.uttara_bank_ques_activity;
import com.example.bdjobprep.R;

public class JobsBankQuesActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout bb, cm, sonali, rupali, janata, agrani,
            uttara, pkb, mixed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_prev_ques_activity);
        init();
    }

    private void init() {
        bb = findViewById(R.id.bangladeshBank_ques_ID);
        cm = findViewById(R.id.combinedBank_ques_ID);
        sonali = findViewById(R.id.sonaliBank_ques_ID);
        rupali = findViewById(R.id.rupaliBank_ques_ID);
        janata= findViewById(R.id.janataBank_ques_ID);
        agrani = findViewById(R.id.agraniBank_ques_ID);
        uttara = findViewById(R.id.uttaraBank_ques_ID);
        pkb = findViewById(R.id.pkb_ques_ID);
        mixed = findViewById(R.id.mixedBank_ques_ID);

        bb.setOnClickListener(this);
        cm.setOnClickListener(this);
        sonali.setOnClickListener(this);
        rupali.setOnClickListener(this);
        janata.setOnClickListener(this);
        agrani.setOnClickListener(this);
        uttara.setOnClickListener(this);
        pkb.setOnClickListener(this);
        mixed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bangladeshBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, bd_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.combinedBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, combined_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.sonaliBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, sonali_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.rupaliBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, rupali_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.agraniBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, agrani_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.janataBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, janata_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.uttaraBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, uttara_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.pkb_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, pkb_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.mixedBank_ques_ID){
            Intent intent = new Intent(JobsBankQuesActivity.this, mixed_bank_ques_activity.class);
            startActivity(intent);
        }
    }
}
