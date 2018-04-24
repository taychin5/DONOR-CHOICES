package com.example.test_chat_app_two.activities;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;
import com.example.test_chat_app_two.activities.homePage.Home_activity;
import com.example.test_chat_app_two.value_class.CharityInfo;

import pl.droidsonroids.gif.GifImageView;

public class ChoosenActivity extends AppCompatActivity {

    private int choosePosition;
    private String chooseTitle;
    private String charityName;

    private CharityInfo charityInfo;

    private Toolbar toolbar;
    private Button goBtn;
    private TextView header;
    private TextView charityNameTxt;
    private TextView headerMain;
    private TextView desTxt;
    private GifImageView mainImg;
    private GifImageView charImg;

    private ShareActionProvider mShareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosen);



        loadSendValue();
        initControl();
        setNewCharityinfo();

        toolbar = (Toolbar)findViewById(R.id.choose_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_chevron_left_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        //getdata

        //header.setText(Home_activity.mainStoryList.get(choosePosition).getStoryTitle());
        //mainImg.setImageResource(Home_activity.mainStoryList.get(choosePosition).getMainImage());
        //headerMain.setText(Home_activity.mainStoryList.get(choosePosition).getStoryTitle());
        //charityNameTxt.setText(charityName);
        //desTxt.setText(Home_activity.mainStoryList.get(choosePosition).getDes());


        header.setText("ป่าตะวันตก ในคืนนั้น");

        mainImg.setImageResource(R.drawable.sence_mountain);
        int displayWidth = getWindowManager().getDefaultDisplay().getHeight();
        mainImg.getLayoutParams().height = displayWidth/4;

        headerMain.setText("ป่าตะวันตก ในคืนนั้น");

        charityNameTxt.setText("มูลนิธิสืบนาคะเสถียร");

        desTxt.setText("การเดินทางออกลาดตระเวนของผู้พิทักษ์ป่าไทยที่กิดขึ้นเป็นประจำ แต่ครั้งนี้เราและเพื่อนแยกกลุ่มกันจนเหลือกันอยู่สองคน ในคืนนี้นเเสียงปืนที่ดังขึ้น การบุกรุกป่าเข้ามาอีกครั้ง ทุกการตัดสินใจมีผลต่อความเป็นและความตายของพวกเราทั้งสิ้น");

        charImg.setImageResource(R.drawable.panic_a);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }

        if(item.getItemId()== R.id.mShare){
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT,"my new app");
            startActivity(Intent.createChooser(i,"Share Via"));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    void initControl() {
        goBtn = (Button) findViewById(R.id.goBtn);
        header = (TextView) findViewById(R.id.header);
        headerMain = findViewById(R.id.headerMain);
        mainImg =  findViewById(R.id.mainImage);
        charityNameTxt = (TextView) findViewById(R.id.charity_name);
        desTxt = findViewById(R.id.desTxt);
        charImg = findViewById(R.id.jobpic);


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
                if(first_activity.firstTime==true) {
                    Intent intent = new Intent(ChoosenActivity.this, OnBoardingActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(ChoosenActivity.this, MainChatActivity.class);
                    startActivity(intent);
                }
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
