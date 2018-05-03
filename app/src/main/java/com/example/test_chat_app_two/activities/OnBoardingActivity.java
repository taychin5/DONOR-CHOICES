package com.example.test_chat_app_two.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;

import me.relex.circleindicator.CircleIndicator;

public class OnBoardingActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter sliderAdapter;

    private TextView[] mDots;

    public  Button btnNext;
    private Button btnPrev;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        mSlideViewPager = findViewById(R.id.sildeViewPager);


        mSlideViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position>=2){
                    btnNext.setText("เริ่มการผจญภัย");
                }else {
                    btnNext.setText("ต่อไป");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mSlideViewPager);

        btnNext = findViewById(R.id.nextBtn);
        btnPrev = findViewById(R.id.prevBtn);

        btnPrev.setText("กลับ");
        btnNext.setText("ต่อไป");


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(mSlideViewPager.getCurrentItem()==2){
                        first_activity.firstTime=false;
                        Intent intent = new Intent(OnBoardingActivity.this,MainChatActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        mSlideViewPager.setCurrentItem(mSlideViewPager.getCurrentItem() + 1);
                        if(mSlideViewPager.getCurrentItem()==2){
                            btnNext.setText("เริ่มการผจญภัย");
                        }else {
                            btnNext.setText("ต่อไป");
                        }
                    }
            }
        });


        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSlideViewPager.getCurrentItem() == 0) {
                    finish();
                }else{
                    mSlideViewPager.setCurrentItem(mSlideViewPager.getCurrentItem()-1);
                }
            }

        });

    }


    }

class SliderAdapter extends PagerAdapter{

    Context context ;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    //Array

    public int[] slideImage = {
            R.drawable.ob1,
            R.drawable.ob2,
            R.drawable.ob3
    };

    public String[] slide_headings = {
            "เริ่มผจญภัย",
            "ตัดสินใจ",
            "บริจาค"
    };

    public String[] slide_des = {
            "กดปุ่มด้านล่าง เพื่อสนุกกับเนื้อเรื่อง",
            "เลือกทางเลือกที่คุณคิดว่าใช่ ทุกทางเลือก\nมีผลกระทบต่อเนื้อเรื่อง",
            "ปุ่มทางเลือกสีทองเป็นปุ่มเลือกเพื่อบริจาค\nเราจะทำการบริจาคให้กับมูลนิธิเจ้าของเรื่องทันที\nผ่านระบบ SMS เป็นจำนวนเงิน 5 บาทต่อครั้ง"
    };


    //test
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (ConstraintLayout) object;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = view.findViewById(R.id.slide_image);
        TextView slideHead = view.findViewById(R.id.slide_heading);
        TextView slideDes = view.findViewById(R.id.slide_des);

        slideHead.setText(slide_headings[position]);
        slideDes.setText(slide_des[position]);
        if(position==2) {
            slideHead.setTextColor(Color.parseColor("#fbb03b"));
        }else {
            slideHead.setTextColor(Color.parseColor("#1978e0"));
        }

        slideImageView.setImageResource(slideImage[position]);

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((ConstraintLayout) object);
    }
}
