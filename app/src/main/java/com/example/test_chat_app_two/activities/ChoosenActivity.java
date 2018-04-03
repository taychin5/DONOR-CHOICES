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
import com.example.test_chat_app_two.value_class.CharityInfo;

public class ChoosenActivity extends AppCompatActivity {

    private int choosePosition;
    private String chooseTitle;
    private String charityName;

    private CharityInfo charityInfo;

    private Button goBtn;
    private TextView header;
    private TextView charityNameTxt;
    private ImageView mainImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosen);


        loadSendValue();
        initControl();
        setNewCharityinfo();

        header.setText(Home_activity.mainStoryList.get(choosePosition).getStoryTitle());
        mainImg.setImageResource(Home_activity.mainStoryList.get(choosePosition).getMainImage());


    }

    void initControl() {
        goBtn = (Button) findViewById(R.id.goBtn);
        header = (TextView) findViewById(R.id.header);
        mainImg = (ImageView) findViewById(R.id.mainImage);
        charityNameTxt = (TextView) findViewById(R.id.charity_name);


        charityNameTxt.setText(charityName);
        charityNameTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosenActivity.this,CharityActivity.class);
                intent.putExtra("charityName",charityName);
                startActivity(intent);
            }
        });

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosenActivity.this, MainChatActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadSendValue() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            chooseTitle = extras.getString("chooseTitle");
            choosePosition = extras.getInt("choosePosition");
            charityName = extras.getString("charityName");
            //The key argument here must match that used in the other activity
        }
    }

    void setNewCharityinfo() {
        charityInfo = new CharityInfo(charityName);

    }
}
