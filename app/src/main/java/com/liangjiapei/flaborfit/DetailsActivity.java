package com.liangjiapei.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitleTextView = (TextView) findViewById(R.id.exerciseTitleTextView);
        ImageView exerciseImageView = (ImageView) findViewById(R.id.exerciseImageView);
        LinearLayout mainBG = (LinearLayout) findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        exerciseTitleTextView.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {

            exerciseImageView.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));

            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {

            exerciseImageView.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));

            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)) {

            exerciseImageView.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));

            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));

        }

    }
}
