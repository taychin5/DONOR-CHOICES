package com.example.test_chat_app_two.chatMessageMain;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_chat_app_two.MessageThisSeason;
import com.example.test_chat_app_two.R;


public class PopActivity extends Activity {

    private Button btn_close;
    private Button btn_chose;

    int hit;
    boolean chose;




    public TextView txtHit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            hit = extras.getInt("hit");
            chose = extras.getBoolean("chose");
            //The key argument here must match that used in the other activity
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        txtHit = (TextView)findViewById(R.id.hit_index);
        txtHit.setText(""+hit);



        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y= -20;

        getWindow().setAttributes(params);

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

                String phoneNumber = "0879811901";
                String messageSms = "T send path " +Integer.toString(MainActivity.path);

                sendSms(phoneNumber,messageSms);

                sendNotification(view);

                MessageThisSeason messageStorage = new MessageThisSeason();
                int newPath = messageStorage.generateNextPath(chose,MainActivity.path);

                MainActivity.path = newPath;
                MainActivity.hit = 0;

                MainActivity.sendBtn.setVisibility(View.VISIBLE);
                MainActivity.sendBtn.setY(MainActivity.sendBtn.getHeight()+10);
                MainActivity.sendBtn.animate()
                        .translationY(0).setInterpolator(new AccelerateInterpolator(2));

                MainActivity.buttonOnLeft.setVisibility(View.GONE);
                MainActivity.buttonOnRight.setVisibility(View.GONE);
                MainActivity.textView.setVisibility(view.GONE);
                finish();

            }
        });




    }

    public void sendSms(String phoneNumber , String Message){
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber,null,"Test send for donating",null,null);

    }

    void sendNotification(View view){

        Intent intent = new Intent(this, MainActivity.class);
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

        mNotificationManager.notify(MainActivity.path,mBuilder.build());

    }

}
