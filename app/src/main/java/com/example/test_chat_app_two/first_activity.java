package com.example.test_chat_app_two;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.test_chat_app_two.homePage.Home_activity;
import com.example.test_chat_app_two.homePage.ListViewChoseActivity;


public class first_activity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);


        constraintLayout = (ConstraintLayout) findViewById(R.id.layout_main);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home_activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
