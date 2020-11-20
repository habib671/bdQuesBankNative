package com.example.bdjobprep.CategoryActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;
import com.example.bdjobprep.SSCQuesActivities.SSCAccountingActivity;
import com.example.bdjobprep.SSCQuesActivities.SSCAgricultureActivity;
import com.example.bdjobprep.SSCQuesActivities.SSCBengali1Activity;

public class SchoolsSSCQuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_s_c_all_ques);
    }

    public void openSSCAccounting(View view) {
        Intent intent = new Intent(SchoolsSSCQuesActivity.this, SSCAccountingActivity.class);
        startActivity(intent);
    }

    public void openSSCAgriculture(View view) {
        Intent intent = new Intent(SchoolsSSCQuesActivity.this, SSCAgricultureActivity.class);
        startActivity(intent);
    }

    public void openSSCBengali1(View view) {
        Intent intent = new Intent(SchoolsSSCQuesActivity.this, SSCBengali1Activity.class);
        startActivity(intent);
    }

    public void openSSCBengali2(View view) {
    }

    public void openSSCBangladeshWorldView(View view) {
    }

    public void openSSCBiology(View view) {
    }

    public void openSSCBusinessInitiative(View view) {
    }

    public void openSSCChemistry(View view) {
    }

    public void openSSCCivics(View view) {
    }

    public void openSSCEconomics(View view) {
    }

    public void openSSCEnglish1(View view) {
    }

    public void openSSCEnglish2(View view) {
    }

    public void openSSCFinance(View view) {
    }

    public void openSSCGeography(View view) {
    }

    public void openSSCHigherMath(View view) {
    }

    public void openSSCMath(View view) {
    }

    public void openSSCPhysics(View view) {
    }

    public void openSSCHomeScience(View view) {
    }

    public void openSSCIslam(View view) {
    }

    public void openSSCScience(View view) {
    }

    public void openSSCICT(View view) {
    }

    public void openSSCHindu(View view) {
    }
}