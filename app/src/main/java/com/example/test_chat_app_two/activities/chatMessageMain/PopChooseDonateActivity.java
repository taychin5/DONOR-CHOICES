package com.example.test_chat_app_two.activities.chatMessageMain;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_chat_app_two.activities.homePage.Home_activity;
import com.example.test_chat_app_two.activities.homePage.fragment_home.DonateFragment;
import com.example.test_chat_app_two.value_class.DonateList;
import com.example.test_chat_app_two.value_class.MessageThisSeason;
import com.example.test_chat_app_two.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PopChooseDonateActivity extends AppCompatActivity {

    public TextView headTxt;
    public TextView description;
    int hit;
    int choosePath;

    private ImageView btn_close;
    private Button btn_chose;
    boolean choose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_choose_donate);

        // load value from mainChatActivity
        loadSendValue();

        // set pop layout
        setPopLayout();

        // set text pop event
        setText();

        final AlertDialog.Builder AlertDialogBuilder;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialogBuilder = new AlertDialog.Builder(PopChooseDonateActivity.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            AlertDialogBuilder = new AlertDialog.Builder(PopChooseDonateActivity.this);
        }



        btn_close = findViewById(R.id.close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_chose = (Button)findViewById(R.id.chose_btn);
        btn_chose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        AlertDialogBuilder.setTitle("คุณแน่ใจที่จะบริจาค")
        .setMessage("เรากำลังจะส่ง SMS เพื่อทำการบริจาคให้กับมูลนิธิสืบนาคะเสถียริ")
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String phoneNumber = "0879811901";
                String messageSms = "T send path " +Integer.toString(MainChatActivity.path);

                sendSms(phoneNumber,messageSms);

                sendNotification();

                MessageThisSeason messageStorage = new MessageThisSeason();
                int newPath = messageStorage.generateNextPath(choose, MainChatActivity.path);

                String des = messageStorage.getChooseDescription(MainChatActivity.path, choose, 0);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
                String format = sdf.format(Calendar.getInstance().getTime());
                SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm");
                String format2 = sdf1.format(Calendar.getInstance().getTime());
                DonateList donateList = new DonateList(format2,format, 1,MessageThisSeason.getThisCharity(), MainChatActivity.path, des);
                DonateFragment.donateListArrayList.add(donateList);

                MainChatActivity.path = newPath;
                MainChatActivity.hit = 0;
                MainChatActivity.donate += 5;

                MainChatActivity.sendBtn.setVisibility(View.VISIBLE);
                MainChatActivity.sendBtn.setY(MainChatActivity.sendBtn.getHeight()+10);
                MainChatActivity.sendBtn.animate()
                        .translationY(0).setInterpolator(new AccelerateInterpolator(2));

                MainChatActivity.buttonOnLeft.setVisibility(View.GONE);
                MainChatActivity.buttonOnRight.setVisibility(View.GONE);
                setChooseToChat();

                finish();
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




    }

    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public void sendSms(String phoneNumber , String Message){
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber,null,"Test send for donate",null,null);

    }

    void setText(){
        MessageThisSeason messageStorage = new MessageThisSeason();

        headTxt = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.text_des);

        headTxt.setText("\"  " +messageStorage.getChooseDescription(MainChatActivity.path,choose,0) +"  \"");

        description.setText(messageStorage.getChooseDescription(MainChatActivity.path,choose,1));
    }

    void setPopLayout(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width),(int)(height*0.7)+70);
        System.out.println("height = " + height*0.4);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.BOTTOM;
        params.x = 0;
        params.y =0;
        getWindow().setAttributes(params);
    }

    void loadSendValue (){
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            choosePath = extras.getInt("choosePath");
            hit = extras.getInt("hit");
            choose = extras.getBoolean("choose");
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
                        .setContentTitle("ทำการบริจาคเรียบร้อย")
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
    private void setChooseToChat() {

        MessageThisSeason messageStorage = new MessageThisSeason();

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setId(MainChatActivity.totalHit);
        chatMessage.setMessage(messageStorage.getChooseDescription(choosePath, choose, 0));
        chatMessage.setDate(DateFormat.getDateTimeInstance().format(new Date()));
        // change to action bubble
        chatMessage.setMe(8);

        MainChatActivity.messages.add(chatMessage);
    }
}
