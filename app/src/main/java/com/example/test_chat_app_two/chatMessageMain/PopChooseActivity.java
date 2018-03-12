package com.example.test_chat_app_two.chatMessageMain;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.example.test_chat_app_two.MessageThisSeason;
import com.example.test_chat_app_two.R;


public class PopChooseActivity extends Activity {

    private Button btn_close;
    private Button btn_chose;

    int hit;
    boolean choose;

    public TextView headTxt;
    public TextView description;



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
                MainChatActivity.textView.setVisibility(View.GONE);
                finish();

            }
        });
    }

    void loadSendValue (){
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            hit = extras.getInt("hit");
            choose = extras.getBoolean("choose");
            //The key argument here must match that used in the other activity
        }
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
