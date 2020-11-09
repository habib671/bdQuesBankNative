package com.example.bdjobprep.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bdjobprep.R;
import com.example.bdjobprep.bank_ques_activities.bd_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.combined_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.sonali_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.rupali_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.janata_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.agrani_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.uttara_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.pkb_bank_ques_activity;
import com.example.bdjobprep.bank_ques_activities.mixed_bank_ques_activity;

public class bank_prevQues_activity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout bb,cm,sonali,rupali,janata,agrani,
    uttara,pkb,mixed;
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
            Intent intent = new Intent(bank_prevQues_activity.this,bd_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.combinedBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,combined_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.sonaliBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,sonali_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.rupaliBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,rupali_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.agraniBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,agrani_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.janataBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,janata_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.uttaraBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,uttara_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.pkb_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,pkb_bank_ques_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.mixedBank_ques_ID){
            Intent intent = new Intent(bank_prevQues_activity.this,mixed_bank_ques_activity.class);
            startActivity(intent);
        }
    }
}
