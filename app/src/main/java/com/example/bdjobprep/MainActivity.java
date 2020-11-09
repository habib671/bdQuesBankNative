package com.example.bdjobprep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bdjobprep.xml.all_govtQues_activity;
import com.example.bdjobprep.xml.bank_prevQues_activity;
import com.example.bdjobprep.xml.cse_it_prevQues_activity;
import com.example.bdjobprep.xml.eee_prevQues_activity;
import com.example.bdjobprep.xml.pdf_Somvar_activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout pdf,bank,cse,eee,allGovt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        pdf = findViewById(R.id.pdf_resource);
        bank = findViewById(R.id.bank_prev_ques_ID);
        cse = findViewById(R.id.cse_prev_ques_ID);
        eee = findViewById(R.id.eee_prev_ques_ID);
        allGovt = findViewById(R.id.all_govt_prev_ques_ID);

        pdf.setOnClickListener(this);
        bank.setOnClickListener(this);
        cse.setOnClickListener(this);
        eee.setOnClickListener(this);
        allGovt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.pdf_resource){
            Intent intent = new Intent(MainActivity.this,pdf_Somvar_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.bank_prev_ques_ID){
            Intent intent = new Intent(MainActivity.this, bank_prevQues_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.cse_prev_ques_ID){
            Intent intent = new Intent(MainActivity.this, cse_it_prevQues_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.eee_prev_ques_ID){
            Intent intent = new Intent(MainActivity.this, eee_prevQues_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.all_govt_prev_ques_ID){
            Intent intent = new Intent(MainActivity.this, all_govtQues_activity.class);
            startActivity(intent);
        }
    }
}
