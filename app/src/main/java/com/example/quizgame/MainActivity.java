package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.ui_content);
        tabAdapter tAdapter = new tabAdapter(getSupportFragmentManager());
        tAdapter.addFragment(new fragment_kuis(), "Kuis");
        tAdapter.addFragment(new fragment_skor(), "Skor");
        tAdapter.addFragment(new fragment_setting(), "Setting");
        pager.setAdapter(tAdapter);
        TabLayout tab_layout = findViewById(R.id.tabs);
        tab_layout.setupWithViewPager(pager);
    }

}


