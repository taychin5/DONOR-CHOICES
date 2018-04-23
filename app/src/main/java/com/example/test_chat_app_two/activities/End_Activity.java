package com.example.test_chat_app_two.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;
import com.example.test_chat_app_two.activities.homePage.Home_activity;

public class End_Activity extends AppCompatActivity {
    private int path;
    private  int hit;

    private Toolbar toolbar;
    private TextView pathStory;
    private TextView des;
    private ImageView mainImg ;
    private Button gobtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        loadSendValue();

        initToolbar();
        initButton();
        setTextAndImage();

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

    private void setTextAndImage(){
        pathStory = findViewById(R.id.path);
        des = findViewById(R.id.des);
        mainImg = findViewById(R.id.main_img);

        switch(path){
            case 9:
                pathStory.setText("testComplete");
                des.setText("testcomplete2");

                mainImg.setImageResource(R.drawable.a1);
                break;
            case 13:
                pathStory.setText("testComplete");
                des.setText("testcomplete2");

                mainImg.setImageResource(R.drawable.a1);
                break;
            case 17:
                pathStory.setText("testComplete");
                des.setText("testcomplete2");

                mainImg.setImageResource(R.drawable.a1);
                break;
            case 18:
                pathStory.setText("testComplete");
                des.setText("testcomplete2");

                mainImg.setImageResource(R.drawable.a1);
                break;
            case 19:
                pathStory.setText("testComplete");
                des.setText("testcomplete2");

                mainImg.setImageResource(R.drawable.a1);
                break;
            default:
                pathStory.setText("testFail");
                des.setText("testFail");

        }
    }
    private void initToolbar(){
        toolbar = (Toolbar)findViewById(R.id.choose_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_chevron_left_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("คุณทำได้ดีมากในทางที่คุณเลือก");

    }
    private void initButton(){
        gobtn = findViewById(R.id.buttongo);
        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainChatActivity.class);
                startActivity(intent);
                finish();
                            }
        });
    }
    private void loadSendValue() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            path = extras.getInt("path");
            hit = extras.getInt("hit");
            //The key argument here must match that used in the other activity
        }
    }
}
