package com.example.test_chat_app_two.activities.chatMessageMain;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_chat_app_two.value_class.MessageThisSeason;
import com.example.test_chat_app_two.R;

import java.text.DateFormat;
import java.util.Date;


public class PopChooseActivity extends Activity {

    public TextView headTxt;
    public TextView description;
    int hit;
    int choosePath;
    boolean choose;
    private Button btn_close;
    private Button btn_chose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_choose);

        // load value from mainChatActivity
        loadSendValue();

        // set pop layout
        setPopLayout();

        // set text pop event
        setText();

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

                MessageThisSeason messageStorage = new MessageThisSeason();
                int newPath = messageStorage.generateNextPath(choose, MainChatActivity.path);

                MainChatActivity.path = newPath;
                MainChatActivity.hit = 0;

                MainChatActivity.sendBtn.setVisibility(View.VISIBLE);
                MainChatActivity.sendBtn.setY(MainChatActivity.sendBtn.getHeight()+10);
                MainChatActivity.sendBtn.animate()
                        .translationY(0).setInterpolator(new AccelerateInterpolator(2));

                MainChatActivity.buttonOnLeft.setVisibility(View.GONE);
                MainChatActivity.buttonOnRight.setVisibility(View.GONE);


                setChooseToChat();
                finish();

            }
        });
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

    private void setChooseToChat() {

        MessageThisSeason messageStorage = new MessageThisSeason();

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setId(MainChatActivity.totalHit);
        chatMessage.setMessage(messageStorage.getChooseDescription(choosePath, choose, 0));
        chatMessage.setDate(DateFormat.getDateTimeInstance().format(new Date()));
        // change to action bubble
        chatMessage.setMe(5);

        MainChatActivity.messages.add(chatMessage);
    }

    void setPopLayout(){
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
    }

    void setText(){
        MessageThisSeason messageStorage = new MessageThisSeason();

        headTxt = (TextView) findViewById(R.id.pop_head);
        description = (TextView) findViewById(R.id.text_des);

        headTxt.setText(messageStorage.getChooseDescription(MainChatActivity.path,choose,0));
        description.setText(messageStorage.getChooseDescription(MainChatActivity.path,choose,1));
    }
}
