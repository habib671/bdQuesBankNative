package com.example.bdjobprep;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        //Setting custom Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar_user_profile_activity);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.user_preferences);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void pickUserAvatar(View view) {
        Toast.makeText(UserProfileActivity.this, R.string.new_pic_selected, Toast.LENGTH_SHORT).show();
    }

    public void saveChanges(View view) {
        Toast.makeText(UserProfileActivity.this, R.string.saved_changes, Toast.LENGTH_SHORT).show();
    }
}