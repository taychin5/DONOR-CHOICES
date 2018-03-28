package com.example.test_chat_app_two.activities.chatMessageMain;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_chat_app_two.activities.homePage.fragment_home.DonateFragment;
import com.example.test_chat_app_two.value_class.DonateList;
import com.example.test_chat_app_two.value_class.MessageThisSeason;
import com.example.test_chat_app_two.R;

public class PopChooseDonateActivity extends AppCompatActivity {

    public TextView txtHit;
    public TextView des;
    int hit;
    boolean chose;
    private Button btn_close;
    private Button btn_chose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            hit = extras.getInt("hit");
            chose = extras.getBoolean("choose");
            //The key argument here must match that used in the other activity
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_choose_donate);

        final AlertDialog.Builder AlertDialogBuilder;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AlertDialogBuilder = new AlertDialog.Builder(PopChooseDonateActivity.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            AlertDialogBuilder = new AlertDialog.Builder(PopChooseDonateActivity.this);
        }

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y= -20;
        getWindow().setAttributes(params);

        MessageThisSeason messageStorage = new MessageThisSeason();

        txtHit = (TextView)findViewById(R.id.pop_head);
        txtHit.setText(""+hit);

        des = (TextView)findViewById(R.id.text_des);
        des.setText(messageStorage.getChooseDescription(MainChatActivity.path,chose,1));



        btn_close = (Button) findViewById(R.id.close_btn);
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

        AlertDialogBuilder.setTitle("Delete entry")
        .setMessage("Are you sure")
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String phoneNumber = "0879811901";
                String messageSms = "T send path " +Integer.toString(MainChatActivity.path);

                // sendSms(phoneNumber,messageSms);

                sendNotification();

                MessageThisSeason messageStorage = new MessageThisSeason();
                int newPath = messageStorage.generateNextPath(chose, MainChatActivity.path);

                String des = messageStorage.getChooseDescription(MainChatActivity.path, chose, 0);
                DonateList donateList = new DonateList(19, 1, MainChatActivity.path, des);
                DonateFragment.donateListArrayList.add(donateList);

                MainChatActivity.path = newPath;
                MainChatActivity.hit = 0;

                MainChatActivity.sendBtn.setVisibility(View.VISIBLE);
                MainChatActivity.sendBtn.setY(MainChatActivity.sendBtn.getHeight()+10);
                MainChatActivity.sendBtn.animate()
                        .translationY(0).setInterpolator(new AccelerateInterpolator(2));

                MainChatActivity.buttonOnLeft.setVisibility(View.GONE);
                MainChatActivity.buttonOnRight.setVisibility(View.GONE);


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

    public void sendSms(String phoneNumber , String Message){
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber,null,"Test send for donate",null,null);

    }

    void sendNotification(){

        Intent intent = new Intent(this, MainChatActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.bubble_in_9)
                        .setContentTitle("Thank for donating")
                        .setContentText("You sending to donating")
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setContentIntent(pendingIntent)
                        .setAutoCancel(true);



        // Gets an instance of the NotificationManager service//

        NotificationManager mNotificationManager =

                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(MainChatActivity.path,mBuilder.build());

    }
}
