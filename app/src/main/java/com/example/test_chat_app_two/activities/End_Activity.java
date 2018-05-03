package com.example.test_chat_app_two.activities;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;
import com.example.test_chat_app_two.activities.chatMessageMain.PopChooseDonateActivity;
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
    private Button donateBtn;
    private TextView charity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        loadSendValue();

        initToolbar();
        initButton();
        setTextAndImage();

        final AlertDialog.Builder AlertDialogBuilder;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialogBuilder = new AlertDialog.Builder(End_Activity.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            AlertDialogBuilder = new AlertDialog.Builder(End_Activity.this);
        }

        donateBtn = findViewById(R.id.donate);
        donateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogBuilder.setTitle("คุณแน่ใจที่จะบริจาคเพิ่มเติม")
                        .setMessage("เรากำลังจะส่ง SMS เพื่อทำการบริจาคให้กับมูลนิธิสืบนาคะเสถียริ เพิ่ม 5 บาท")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String phoneNumber = "0879811901";
                                String messageSms = "T send path " +Integer.toString(MainChatActivity.path);

                                sendSms(phoneNumber,messageSms);
                                sendNotification();

                                donate+=5;
                                donateTxt.setText(donate+"  บาท");

                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                // do nothing
                            }
                        }).setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });
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

    void sendNotification(){
        String CHANNEL_ID = "my_channel_01";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        Intent intent = new Intent(this, Home_activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher_new)
                        .setContentTitle("ทำการบริจาคเพิ่มเติ่มเรียบร้อย")
                        .setContentText("ขอบคุณสำหรับการบริจาคให้กับ มูลนิธิสืบนาคะเสถียร")
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .setContentIntent(pendingIntent)
                        .setAutoCancel(true)
                        .setChannelId(CHANNEL_ID);



        // Gets an instance of the NotificationManager service//
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, "Channel human readable title", importance);
            mNotificationManager.createNotificationChannel(mChannel);
        }
        mNotificationManager.notify(001 , mBuilder.build());
    }

    public void sendSms(String phoneNumber , String Message){
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber,null,"Test send for donate",null,null);

    }
}
