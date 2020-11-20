package com.example.bdjobprep;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.bdjobprep.BooksActivities.BanglaBooksActivity;
import com.example.bdjobprep.BooksActivities.BangladeshBooksActivity;
import com.example.bdjobprep.BooksActivities.BoardBooksctivity;
import com.example.bdjobprep.BooksActivities.ComputerITBooksctivity;
import com.example.bdjobprep.BooksActivities.EngLiteratureBooksActivity;
import com.example.bdjobprep.BooksActivities.EnglishBooksActivity;
import com.example.bdjobprep.BooksActivities.GKBooksActivity;
import com.example.bdjobprep.BooksActivities.GeoBooksActivity;
import com.example.bdjobprep.BooksActivities.IntAffairsBooksActivity;
import com.example.bdjobprep.BooksActivities.LargeBooksActivity;
import com.example.bdjobprep.BooksActivities.MathBooksActivity;
import com.example.bdjobprep.BooksActivities.MetalAbilityBooksActivity;
import com.example.bdjobprep.BooksActivities.MixedBooksctivity;
import com.example.bdjobprep.BooksActivities.NoitikotaBooksActivity;
import com.example.bdjobprep.CategoryActivities.JobsBankQuesActivity;
import com.example.bdjobprep.CategoryActivities.JobsCSEQuesActivity;
import com.example.bdjobprep.CategoryActivities.JobsEEEQuesActivity;
import com.example.bdjobprep.CategoryActivities.JobsGovtQuesActivity;
import com.example.bdjobprep.CategoryActivities.SchoolsSSCQuesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting custom Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar_main_activity);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
    }

    //Setting menu for Actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            openSearch();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    //Launching other activities
    private void openSearch() {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void openQuiz(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void openUserSetting(View view) {
        Intent intent = new Intent(MainActivity.this, UserProfileActivity.class);
        startActivity(intent);
    }

    public void openSSCQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, SchoolsSSCQuesActivity.class);
        startActivity(intent);
    }

    public void openHSCQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void openAdmissionQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }


    public void openBCSQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void openBanksQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, JobsBankQuesActivity.class);
        startActivity(intent);
    }

    public void openGovtJobsQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, JobsGovtQuesActivity.class);
        startActivity(intent);
    }

    public void openCSEJobsQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, JobsCSEQuesActivity.class);
        startActivity(intent);
    }

    public void openEEEJobsQuestions(View view) {
        Intent intent = new Intent(MainActivity.this, JobsEEEQuesActivity.class);
        startActivity(intent);
    }

    public void openBengaliBooks(View view) {
        Intent intent = new Intent(MainActivity.this, BanglaBooksActivity.class);
        startActivity(intent);
    }

    public void openEnglishBooks(View view) {
        Intent intent = new Intent(MainActivity.this, EnglishBooksActivity.class);
        startActivity(intent);
    }

    public void openMathBooks(View view) {
        Intent intent = new Intent(MainActivity.this, MathBooksActivity.class);
        startActivity(intent);
    }

    public void openBDBooks(View view) {
        Intent intent = new Intent(MainActivity.this, BangladeshBooksActivity.class);
        startActivity(intent);
    }

    public void openEngLiteratureBooks(View view) {
        Intent intent = new Intent(MainActivity.this, EngLiteratureBooksActivity.class);
        startActivity(intent);
    }

    public void openIntAffairsBooks(View view) {
        Intent intent = new Intent(MainActivity.this, IntAffairsBooksActivity.class);
        startActivity(intent);
    }

    public void openGenKnwBooks(View view) {
        Intent intent = new Intent(MainActivity.this, GKBooksActivity.class);
        startActivity(intent);
    }

    public void openGeographyBooks(View view) {
        Intent intent = new Intent(MainActivity.this, GeoBooksActivity.class);
        startActivity(intent);
    }

    public void openNoitikotaBooks(View view) {
        Intent intent = new Intent(MainActivity.this, NoitikotaBooksActivity.class);
        startActivity(intent);
    }

    public void openMentalAbilityBooks(View view) {
        Intent intent = new Intent(MainActivity.this, MetalAbilityBooksActivity.class);
        startActivity(intent);
    }

    public void openComputerITBooks(View view) {
        Intent intent = new Intent(MainActivity.this, ComputerITBooksctivity.class);
        startActivity(intent);
    }

    public void openBoardBooks(View view) {
        Intent intent = new Intent(MainActivity.this, BoardBooksctivity.class);
        startActivity(intent);
    }

    public void openLargeBooks(View view) {
        Intent intent = new Intent(MainActivity.this, LargeBooksActivity.class);
        startActivity(intent);
    }

    public void openMixedBooks(View view) {
        Intent intent = new Intent(MainActivity.this, MixedBooksctivity.class);
        startActivity(intent);
    }
    //Launching other activities
}
