package com.example.brom.activitiesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Aboutpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpage);

        TextView aboutTexten = (TextView)findViewById(R.id.textView_about);

        aboutTexten.setText("Glasslistan skapades för att lista dom bästa glassarna som säljs i paket från Sveriges olika matvarubutiker! Trycker man på en produkt i listan så får man mer intressant information om produkten. Den tänkta målgruppen för sidan är ungdomar och vuxna som ofta handlar i matbutiker och gärna äter glass. Här kan de finna nya intressanta produkter som de sedan kan köpa i en butik där de bor.");
    }
}
