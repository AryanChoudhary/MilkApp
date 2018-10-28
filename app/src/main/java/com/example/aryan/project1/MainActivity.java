package com.example.aryan.project1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        ImageView backgroundImg = (ImageView) findViewById(R.id.image);
        backgroundImg.setBackgroundColor(Color.rgb(0, 0, 0));
    }
}
