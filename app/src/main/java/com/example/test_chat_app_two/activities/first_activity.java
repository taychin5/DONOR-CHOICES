package com.example.test_chat_app_two.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.homePage.Home_activity;


public class first_activity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Home_activity.class);
                startActivity(intent);
                finish();
            }
        },4000);


        constraintLayout = (ConstraintLayout) findViewById(R.id.layout_main);

//        constraintLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Home_activity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

    }
}
