package com.example.test_chat_app_two.chatMessageMain;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.test_chat_app_two.HidingScrollListener;
import com.example.test_chat_app_two.MessageThisSeason;
import com.example.test_chat_app_two.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.droidsonroids.gif.GifImageView;


public class MainActivity extends AppCompatActivity {




    private RecyclerView messagesContainer;
    private ChatAdapterRecylerView adapter;

    public static Button sendBtn;
    public static Button buttonOnLeft;
    public static Button buttonOnRight;
    public static TextView textView;

    private RelativeLayout relativeLayout;
    private List<ChatMessage> chatHistory;
    private List<ChatMessage> messages = new ArrayList<>();
    public static int hit;
    public static int totalHit;
    public static int path ;
    GifImageView gifImageView;
    private Toolbar toolbar;
    private Toolbar toolbarTop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_main);

        initControls();
        loadHistory();

    }

    @Override
    public void onResume(){
        super.onResume();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    private void initControls() {

        messagesContainer = (RecyclerView) findViewById(R.id.messagesContainer);
        sendBtn = (Button) findViewById(R.id.chatSendButton);
        gifImageView = findViewById(R.id.gifImageMain);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

        toolbarTop = (Toolbar) findViewById(R.id.toolbartop);
       setSupportActionBar(toolbarTop);
        setTitle(getString(R.string.app_name));
        toolbarTop.setTitleTextColor(getResources().getColor(android.R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        TextView meLabel = (TextView) findViewById(R.id.meLbl);
        TextView companionLabel = (TextView) findViewById(R.id.friendLabel);
        companionLabel.setText("My Buddy");// Hard Coded


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
       // layoutManager.setStackFromEnd(true);

        //layoutManager.scrollToPositionWithOffset(hit, 20);


        messagesContainer.setLayoutManager(layoutManager);
        adapter = new ChatAdapterRecylerView(messages);
        messagesContainer.setAdapter(adapter);



        messagesContainer.setOnScrollListener(new HidingScrollListener() {
            @Override
            public void onHide() {hideToolBat();}

            @Override
            public void onShow() {showToolBat();}
        });
        messagesContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToolBat();
            }
        });




        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideToolBat();
                ChatMessage chatMessage = new ChatMessage();
                MessageThisSeason messageStorage = new MessageThisSeason();

                chatMessage.setId(totalHit);
                chatMessage.setMessage(messageStorage.getMessage(path, hit));
                chatMessage.setDate(DateFormat.getDateTimeInstance().format(new Date()));
                chatMessage.setMe(messageStorage.isMe(path, hit));
                chatMessage.setDone(messageStorage.isdone(path, hit));


                if (chatMessage.isDone() == true) {
                    sendBtn.setVisibility(v.INVISIBLE);

                    relativeLayout = findViewById(R.id.relativeLayoutBtn);

                    buttonOnLeft = new Button(MainActivity.this);
                    buttonOnLeft.setText("chose left");
                    buttonOnLeft.setId(R.id.lef_btn);

                    buttonOnLeft.setGravity(Gravity.LEFT);
                    buttonOnLeft.setX(500);
                    buttonOnLeft.animate().translationX(0).setInterpolator(new AccelerateInterpolator(2));



                    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

                    relativeLayout.addView(buttonOnLeft, lp);

                    buttonOnLeft.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getApplicationContext(), PopActivity.class);
                            intent.putExtra("hit", hit);
                            intent.putExtra("chose", true);
                            startActivity(intent);

                        }
                    });


                    buttonOnRight = new Button(MainActivity.this);
                    buttonOnRight.setText("chose Right");
                    buttonOnRight.setId(R.id.lef_btn);
                    buttonOnRight.setX(-500);
                    buttonOnRight.animate().translationX(0).setInterpolator(new AccelerateInterpolator(2));
                    buttonOnRight.setGravity(Gravity.RIGHT);

                    RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

                    relativeLayout.addView(buttonOnRight, lp2);

                    buttonOnRight.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getApplicationContext(), PopActivity.class);
                            intent.putExtra("hit", hit);
                            intent.putExtra("chose", false);
                            startActivity(intent);
                        }
                    });
//set new btn
                     textView = new TextView(MainActivity.this);
                    RelativeLayout.LayoutParams lptext = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                    lptext.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    lptext.addRule(RelativeLayout.CENTER_IN_PARENT);



                    textView.setText("Chose your destiny \n please choose carefully ");
                    textView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                    relativeLayout.addView(textView, lptext);



                } else {
                    messages.add(chatMessage);
                    chatHistory.add(chatMessage);
                    adapter.notifyItemInserted(messages.size() - 1);
                    sendBtn.setVisibility(v.VISIBLE);
                    GifImageGenerator();
                    messagesContainer.smoothScrollToPosition(messages.size()-1);

                } //set new btn
                totalHit++;
                hit++;
            }
        });

    }


    private void GifImageGenerator() {

    }


    private void hideToolBat(){

        toolbar.animate().translationY(toolbar.getHeight()*20).setInterpolator(new AccelerateInterpolator(2));
       // toolbarTop.animate().translationY(-toolbarTop.getHeight()).setInterpolator(new AccelerateInterpolator(2));


//                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mFabButton.getLayoutParams();
//                int fabBottomMargin = lp.bottomMargin;
//                mFabButton.animate().translationY(mFabButton.getHeight()+fabBottomMargin).setInterpolator(new AccelerateInterpolator(2)).start();
    }

    private void showToolBat(){
        toolbar.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));
     //   toolbarTop.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));
//                mFabButton.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();


    }

    private void loadHistory(){

        chatHistory = new ArrayList<ChatMessage>();
        for(int i = 0;i<chatHistory.size();i++){
            ChatMessage chatMessageHis = new ChatMessage();
            chatMessageHis.setId(i);
            chatMessageHis.setMessage(chatHistory.get(i).getMessage());
            chatMessageHis.setDate(chatHistory.get(i).getDate());
            chatMessageHis.setMe(chatHistory.get(i).getIsme());
        }
        adapter = new ChatAdapterRecylerView(chatHistory);
        messagesContainer.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

}








