package com.example.bdjobprep.xml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bdjobprep.R;
import com.example.bdjobprep.adapterClass.eeeAdapterClass;

public class eee_prevQues_activity extends AppCompatActivity {
    RecyclerView recyclerView;
    private String[] eeeQues;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_prev_ques_activity);
        recyclerView=findViewById(R.id.recyclerviewID);

        eeeQues = getResources().getStringArray(R.array.eee_ques_list);
         eeeAdapterClass eeeAdapterClass = new eeeAdapterClass(this,eeeQues);
        recyclerView.setAdapter(eeeAdapterClass);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
