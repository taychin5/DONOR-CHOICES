package com.example.test_chat_app_two.activities;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;
import com.example.test_chat_app_two.activities.homePage.Home_activity;

public class ChoosenActivity extends AppCompatActivity {

    private int choosePosition;
    private String chooseTitle;

    private Button goBtn;
    private TextView header;
    private ImageView mainImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosen);


        loadSendValue();
        initControl();

        header.setText(Home_activity.mainStoryList.get(choosePosition).getStoryTitle());
        mainImg.setImageResource(Home_activity.mainStoryList.get(choosePosition).getMainImage());


    }

    void initControl() {
        goBtn = (Button) findViewById(R.id.goBtn);
        header = (TextView) findViewById(R.id.header);
        mainImg = (ImageView) findViewById(R.id.mainImage);

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosenActivity.this, MainChatActivity.class);
                startActivity(intent);
            }
        });
    }

    void loadSendValue() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            chooseTitle = extras.getString("chooseTitle");
            choosePosition = extras.getInt("choosePosition");
            //The key argument here must match that used in the other activity
        }
    }
}
