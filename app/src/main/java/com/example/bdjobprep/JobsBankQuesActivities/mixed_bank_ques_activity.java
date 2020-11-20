package com.example.bdjobprep.JobsBankQuesActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bdjobprep.R;

public class mixed_bank_ques_activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout one,two,three,four,five,six,seven,eight,nine,ten,
    eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_bank_ques_activity);
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
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        eleven.setOnClickListener(this);
        twelve.setOnClickListener(this);
        thirteen.setOnClickListener(this);
        fourteen.setOnClickListener(this);
        fifteen.setOnClickListener(this);
        sixteen.setOnClickListener(this);
        seventeen.setOnClickListener(this);
        eighteen.setOnClickListener(this);
        nineteen.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.one){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1aIuRMGhTy2xcPcsZlVWqKYlFDUVQsr1l"));
            startActivity(intent);
        }
        if(v.getId()==R.id.two){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1n1bzvOnJwBr-EzuVMLhNTi2fOcSXwv-i"));
            startActivity(intent);
        }
        if(v.getId()==R.id.three){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dvtY9_kkYAfKNu53eSII2yKCSJmiEp3N"));
            startActivity(intent);
        }
        if(v.getId()==R.id.four){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12RIYj4epxtH4Vg_p5xGEE2E-p9W6XPu0"));
            startActivity(intent);
        }
        if(v.getId()==R.id.five){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=16XV1cRzjYYZsY50bRVUJn66khPQFnljK"));
            startActivity(intent);
        }
        if(v.getId()==R.id.six){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ivx-2wLVH_PjCT_fDHDZLTZB35WnRqja"));
            startActivity(intent);
        }
        if(v.getId()==R.id.seven){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ocs_zk3xr2yuRcH6HGx-4pRg_bjidMcd"));
            startActivity(intent);
        }
        if(v.getId()==R.id.eight){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12DOOvVKoGpqsfdMpBpL-A5aUOWHUpTs-"));
            startActivity(intent);
        }
        if(v.getId()==R.id.nine){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=196SmznAoBx30KOw9cZws90dCs6y3UiZF"));
            startActivity(intent);
        }
        if(v.getId()==R.id.ten){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1x2EHXcrILAg0POael7ZbPLTBjz2xnNlA"));
            startActivity(intent);
        }

        if(v.getId()==R.id.eleven){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1mYutj5PG_sCX4Wr0xkXbSaQ0vKsREX7P"));
            startActivity(intent);
        }
        if(v.getId()==R.id.twelve){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12zVb9ydMFid7pKI2_vjC4ojGgvo0twy8"));
            startActivity(intent);
        }
        if(v.getId()==R.id.thirteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Gm4n43T5VccpOhaejq34TsUkrmYV84JB"));
            startActivity(intent);
        }
        if(v.getId()==R.id.fourteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1jJnIntpIjQ4OJop_h2fTix2trPuahLDd"));
            startActivity(intent);
        }
        if(v.getId()==R.id.fifteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1e35u2f8nbBEltAaote2Drk7kFD9nVGJw"));
            startActivity(intent);
        }
        if(v.getId()==R.id.sixteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1NPu-L_r00ZySYLzFeOIL9kD9l6nkdRHG"));
            startActivity(intent);
        }
        if(v.getId()==R.id.seventeen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1rFO4t4w-jWE-32zI4OeHDqIjJ_zNch_5"));
            startActivity(intent);
        }
        if(v.getId()==R.id.eighteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1enW7t9_aLaLfChvdzNQkYNZ7CHD0PJOE"));
            startActivity(intent);
        }
        if(v.getId()==R.id.nineteen){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BIlkpszaHTryQc2v__W61aSij1hlscPO"));
            startActivity(intent);
        }

    }
}
