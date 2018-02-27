package com.example.test_chat_app_two;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;



public class PopActivity extends Activity {

    private Button btn_close;
    private Button btn_chose;

    int hit;
    int path;
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

}
