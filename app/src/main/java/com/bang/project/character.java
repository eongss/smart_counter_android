package com.bang.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class character extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView bnView;

    TextView tv_nick;
    TextView tv_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        frameLayout = findViewById(R.id.layout);
        bnView = findViewById(R.id.bnView);
        tv_nick = findViewById(R.id.tv_nick);
        tv_level = findViewById(R.id.tv_level);

        String nick = getIntent().getExtras().getString("nickname");
        tv_nick.setText(nick);



    }
}