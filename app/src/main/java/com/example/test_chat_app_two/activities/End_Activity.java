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
    private int donate;

    private Toolbar toolbar;
    private TextView pathStory;
    private TextView des;
    private TextView donateTxt;
    private ImageView mainImg ;
    private Button gobtn;
    private TextView charity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        loadSendValue();

        initToolbar();
        initButton();
        setTextAndImage();

        charity = findViewById(R.id.name_char);
        charity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(End_Activity.this,CharityActivity.class);
                intent.putExtra("charityName","serb");
                startActivity(intent);
            }
        });

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
        donateTxt =findViewById(R.id.donate_num);

        donateTxt.setText(donate+"  บาท");
            switch(path){
            case 9:
                pathStory.setText("พวกโจรหนีไปได้");
                des.setText("ช้าไปการตัดสินใจครั้งนี้ ไม่เฉียบขาดพอที่จะทำให้จับพวกนายพรานได้");

                mainImg.setImageResource(R.drawable.sence_forest_night);
                break;
            case 13:
                pathStory.setText("คุณพาเพื่อนหนีออกมาสำเร็จ");
                des.setText("แดงบาดเจ็บ แต่โชคดีที่ไม่ได้เป็นอะไรมาก การตัดสินใจครั้งนี้ทำให้พวกเราปลอดภัยก็จริง แต่เราจับพวกนายพรานไม่ได้");

                mainImg.setImageResource(R.drawable.sence_helicopter);
                break;
            case 17:
                pathStory.setText("คุณโดนยิง เสียชีวิต");
                des.setText("การกระทำครั้งนี้อาจจะรีบร้อนไป ทำให้คุณเสียชีวิตได้");

                mainImg.setImageResource(R.drawable.sence_die);
                break;
            case 18:
                pathStory.setText("ยินดีด้วยคุณสามารถจับคนร้ายได้");
                des.setText("ถึงเพื่อนเราจะได้รับบาดเจ็บ แต่เราสามารถจับนายพรานและสามารถรอดชีวิตมาได้ คุณตัดสินใจได้ดีมาก");

                mainImg.setImageResource(R.drawable.sence_helicopter);
                break;
            case 19:
                pathStory.setText("คุณถูกยิงตาย");
                des.setText("ด้วยความคิดที่จะทำดีต่อพวกนายพรานมันไม่มีผลใดๆ และยังส่งผลร้ายกับตัวคุณอีก ครั้งหน้าต้องตัดสินใจใหม่ดีๆว่าจะใช่ไม้อ่อนหรือไม้แข็งกับพวกมัน");

                mainImg.setImageResource(R.drawable.sence_die);
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
        getSupportActionBar().setDisplayShowTitleEnabled(false);

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
            donate = extras.getInt("donate");
            //The key argument here must match that used in the other activity
        }
    }
}
