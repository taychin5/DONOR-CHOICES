package com.example.test_chat_app_two.chatMessageMain;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
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


public class MainChatActivity extends AppCompatActivity {


    private RecyclerView messagesContainer;
    private ChatAdapterRecylerView adapter;

    public static Button sendBtn;
    public static Button buttonOnLeft;
    public static Button buttonOnRight;
    public static TextView textView;

    private RelativeLayout relativeLayout;
    private List<ChatMessage> chatHistory;
    public static List<ChatMessage> messages = new ArrayList<>();
    public static int hit;
    public static int totalHit;
    public static int path;
    GifImageView gifImageView;
    private Toolbar toolbarTop;

    private ConstraintLayout characterIndex;

    public static int health = 100;

    private static final int MESSAGE_RIGHT = 0;
    private static final int MESSAGE_LEFT = 1;
    private static final int MESSAGE_RIGHT_THINK = 2;
    private static final int MESSAGE_RIGHT_HURT = 3;
    private static final int MESSAGE_LEFT_HURT = 4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_main);

        ProgressBar hpBar = (ProgressBar) findViewById(R.id.hp_bar);
        hpBar.setProgress(health);
        initControls();


        // loadHistory(messages);

    }

    @Override
    public void onResume() {
        super.onResume();
        GifImageGenerator();
        //loadHistory(chatHistory);

        adapter.notifyItemInserted(messages.size() - 1);

        if (messages.size() != 0) {
            messagesContainer.smoothScrollToPosition(messages.size() - 1);

        }

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

        toolbarTop = (Toolbar) findViewById(R.id.toolbartop);
        setSupportActionBar(toolbarTop);
        setTitle(getString(R.string.app_name));
        toolbarTop.setTitleTextColor(getResources().getColor(android.R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        characterIndex = (ConstraintLayout) findViewById(R.id.index_character_conLay);


        messagesContainer.setLayoutManager(new WrapContentLinearLayoutManager(MainChatActivity.this));
        adapter = new ChatAdapterRecylerView(messages);
        messagesContainer.setAdapter(adapter);


        messagesContainer.setOnScrollListener(new HidingScrollListener() {
            @Override
            public void onHide() {
                hideCharacterIndex();
            }

            @Override
            public void onShow() {
                showCharacterIndex();
            }
        });
        messagesContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCharacterIndex();
            }
        });


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("path  " + path + "  hit   " + hit);

                hideCharacterIndex();

                MessageThisSeason messageStorage = new MessageThisSeason();

                boolean isDone = messageStorage.isdone(path, hit);

                if (isDone == true) {

                    chooseWhatToDO(v);

                } else {

                    //  CREATE MESSAGE

                    ChatMessage chatMessage = new ChatMessage();
                    chatMessage.setId(totalHit);
                    chatMessage.setMessage(messageStorage.getMessage(path, hit));
                    chatMessage.setDate(DateFormat.getDateTimeInstance().format(new Date()));
                    chatMessage.setMe(messageStorage.isMe(path, hit));

                    sendBtn.setVisibility(v.VISIBLE);
                    messages.add(chatMessage);

                    GifImageGenerator();
                    displayChat();

                    if(chatMessage.getIsme()==MESSAGE_RIGHT_HURT){
                        HPgen(0,20);
                    }


                } //set new btn
                totalHit++;
                hit++;
            }
        });

    }

    private void GifImageGenerator() {
        switch (path) {
            case 0:
                if (hit >= 3) {
                    gifImageView.setImageResource(R.drawable.sence1_2);
                }
                break;
        }

    }

    private void displayChat() {
        System.out.println(messages.size());
        adapter.notifyItemInserted(messages.size());
        messagesContainer.smoothScrollToPosition(messages.size());
    }

    private void hideCharacterIndex() {
        // toolbarTop.animate().translationY(-toolbarTop.getHeight()).setInterpolator(new AccelerateInterpolator(2));

        sendViewToBack(characterIndex);
        characterIndex.animate().translationY(characterIndex.getHeight() * 20).setInterpolator(new AccelerateInterpolator(2));
//                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mFabButton.getLayoutParams();
//                int fabBottomMargin = lp.bottomMargin;
//                mFabButton.animate().translationY(mFabButton.getHeight()+fabBottomMargin).setInterpolator(new AccelerateInterpolator(2)).start();
    }

    private void showCharacterIndex() {
        //   toolbarTop.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));
//                mFabButton.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
        characterIndex.animate().translationY(0).setInterpolator(new AccelerateInterpolator(2)).withEndAction(new Runnable() {
            @Override
            public void run() {
                characterIndex.bringToFront();
            }
        });


    }

    private void createChoiceButton(View v) {
        sendBtn.setVisibility(v.INVISIBLE);

        relativeLayout = findViewById(R.id.relativeLayoutBtn);

        buttonOnRight = new Button(MainChatActivity.this);
        buttonOnRight.setText("choose right");
        buttonOnRight.setId(R.id.left_btn);
        buttonOnRight.setGravity(Gravity.RIGHT);
        buttonOnRight.setX(-500);
        buttonOnRight.animate().translationX(0).setInterpolator(new AccelerateInterpolator(2));


        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        relativeLayout.addView(buttonOnRight, lp);

        buttonOnLeft = new Button(MainChatActivity.this);
        buttonOnLeft.setText("choose left");
        buttonOnLeft.setId(R.id.right_btn);
        buttonOnLeft.setX(500);
        buttonOnLeft.animate().translationX(0).setInterpolator(new AccelerateInterpolator(2));
        buttonOnLeft.setGravity(Gravity.LEFT);

        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        relativeLayout.addView(buttonOnLeft, lp2);

        textView = new TextView(MainChatActivity.this);
        RelativeLayout.LayoutParams lptext = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        lptext.addRule(RelativeLayout.CENTER_HORIZONTAL);
        lptext.addRule(RelativeLayout.CENTER_IN_PARENT);


        textView.setText("Chose your destiny \n please choose carefully ");
        textView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
        relativeLayout.addView(textView, lptext);


    }

    private void ChoiceView(View v, final int leftToDo, final int rightToDo) {


        final int DO_CHOICE = 0;
        final int DO_CHOICE_DONATE = 1;
        final int DO_FIGHT = 2;

        createChoiceButton(v);

        Activity nextactLeft = new Activity();


        buttonOnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch (leftToDo) {
                    case DO_CHOICE:
                        Intent intentLeft1 = new Intent(getApplicationContext(), PopChooseActivity.class);
                        intentLeft1.putExtra("hit", hit);
                        intentLeft1.putExtra("choose", true);
                        startActivity(intentLeft1);
                        break;

                    case DO_CHOICE_DONATE:
                        Intent intentLeft2 = new Intent(getApplicationContext(), PopChooseDonateActivity.class);
                        intentLeft2.putExtra("hit", hit);
                        intentLeft2.putExtra("choose", true);
                        startActivity(intentLeft2);
                        break;

                    case DO_FIGHT:
                        Intent intentLeft3 = new Intent(getApplicationContext(), PopChooseActivity.class);
                        intentLeft3.putExtra("hit", hit);
                        intentLeft3.putExtra("choose", true);
                        startActivity(intentLeft3);
                        break;
                }


            }
        });


        buttonOnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rightToDo) {
                    case DO_CHOICE:
                        Intent intentRight1 = new Intent(getApplicationContext(), PopChooseActivity.class);
                        intentRight1.putExtra("hit", hit);
                        intentRight1.putExtra("choose", false);
                        startActivity(intentRight1);
                        break;

                    case DO_CHOICE_DONATE:
                        Intent intentRight2 = new Intent(getApplicationContext(), PopChooseDonateActivity.class);
                        intentRight2.putExtra("hit", hit);
                        intentRight2.putExtra("choose", false);
                        startActivity(intentRight2);
                        break;

                    case DO_FIGHT:
                        Intent intentRight3 = new Intent(getApplicationContext(), PopChooseActivity.class);
                        intentRight3.putExtra("hit", hit);
                        intentRight3.putExtra("choose", false);
                        startActivity(intentRight3);
                }
            }
        });


    }

    private void chooseWhatToDO(View v) {


        MessageThisSeason messageStorage = new MessageThisSeason();

        int whatToDoLeft = messageStorage.getWhatToDO(path, true);
        int whatToDoRight = messageStorage.getWhatToDO(path, false);

        ChoiceView(v, whatToDoLeft, whatToDoRight);

    }

    public void HPgen(int whatToDo, int decreaseOrIncrease) {

        final int HP_DECREASE = 0;
        final int HP_INCREASE = 1;


        switch (whatToDo) {
            case HP_DECREASE:

                health -= decreaseOrIncrease;

                break;
            case HP_INCREASE:

                health += decreaseOrIncrease;

                if (health > 100) health = 100;

                break;

            default:

                break;
        }

        // Check if die

        if (health <= 0) {
            //game over
            health = 0;
            displayHP();
            // finish();
        } else {

            displayHP();
        }


    }

    public void displayHP() {
        // display HP
        ProgressBar hpBar = (ProgressBar) findViewById(R.id.hp_bar);
        hpBar.setProgress(health);

    }


    public static void sendViewToBack(final View child) {
        final ViewGroup parent = (ViewGroup) child.getParent();
        if (null != parent) {
            parent.removeView(child);
            parent.addView(child, 0);
        }
    }
}

class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    //... constructor
    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            Log.e("probe", "meet a IOOBE in RecyclerView");
        }
    }
}








