package com.example.layoutapp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView desertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_course);
        desertsCard = findViewById(R.id.card_view_deserts);


        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCourseActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCourseActivityIntent);
            }
        });

        desertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desertsActivityIntent = new Intent(MainActivity.this,DesertsActivity.class);
                startActivity(desertsActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_id);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydevelopers@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}