package com.example.bdjobprep.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bdjobprep.R;
import com.example.bdjobprep.pdf_resourse_activities.bangla_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.bangladesh_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.boro_book_pdf_Activity;
import com.example.bdjobprep.pdf_resourse_activities.all_board_book_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.computer_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.eng_literature_pdf_Activity;
import com.example.bdjobprep.pdf_resourse_activities.english_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.gk_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.int_affairs_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.math_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.mixed_book_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.metal_ability_pdf_Activity;
import com.example.bdjobprep.pdf_resourse_activities.noitikota_pdf_activity;
import com.example.bdjobprep.pdf_resourse_activities.vugol_pdf_activity;


public class pdf_Somvar_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout bangla,english,math,bangladesh,engLiterature,intAffairs,
    gk,vugol,noitikota,mentalAbility,computer,allBoard,boroBoi,mixedBoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf__somvar_activity);
        init();
    }

    private void init() {

        bangla = findViewById(R.id.bangla_pdf_resource);
        english = findViewById(R.id.english_pdf_resource);
        math = findViewById(R.id.math_pdf_resource);
        bangladesh = findViewById(R.id.bangladesh_pdf_resource);
        engLiterature = findViewById(R.id.engLiterature_pdf_resource);
        intAffairs = findViewById(R.id.intAffairs_pdf_resource);
        gk = findViewById(R.id.gk_pdf_resource);
        vugol = findViewById(R.id.vugol_pdf_resource);
        noitikota = findViewById(R.id.noitikota_pdf_resource);
        mentalAbility = findViewById(R.id.mentalAbility_pdf_resource);
        computer=findViewById(R.id.computer_pdf_resource);
        allBoard = findViewById(R.id.all_boardBook_pdf_resource);
        boroBoi = findViewById(R.id.bigBook_pdf_resource);
        mixedBoi = findViewById(R.id.mixedCollec_pdf_resource);

        bangla.setOnClickListener(this);
        english.setOnClickListener(this);
        math.setOnClickListener(this);
        bangladesh.setOnClickListener(this);
        engLiterature.setOnClickListener(this);
        intAffairs.setOnClickListener(this);
        gk.setOnClickListener(this);
        vugol.setOnClickListener(this);
        noitikota.setOnClickListener(this);
        mentalAbility.setOnClickListener(this);
        computer.setOnClickListener(this);
        allBoard.setOnClickListener(this);
        boroBoi.setOnClickListener(this);
        mixedBoi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bangla_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,bangla_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.english_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,english_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.math_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,math_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.bangladesh_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,bangladesh_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.engLiterature_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,eng_literature_pdf_Activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.intAffairs_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,int_affairs_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.gk_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,gk_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.vugol_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,vugol_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.noitikota_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,noitikota_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.mentalAbility_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,metal_ability_pdf_Activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.computer_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,computer_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.all_boardBook_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,all_board_book_pdf_activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.bigBook_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,boro_book_pdf_Activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.mixedCollec_pdf_resource){
            Intent intent = new Intent(pdf_Somvar_activity.this,mixed_book_pdf_activity.class);
            startActivity(intent);
        }
    }
}
