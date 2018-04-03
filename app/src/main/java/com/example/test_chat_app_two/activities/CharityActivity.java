package com.example.test_chat_app_two.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.value_class.CharityInfo;

import org.w3c.dom.Text;

public class CharityActivity extends AppCompatActivity {

    private String charityName;
    private CharityInfo charityInfo;

    private TextView charitynameTxt;
    private TextView charityDesTxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity);

        loadSendValue();

        charityInfo = new CharityInfo(charityName);


        charitynameTxt = (TextView) findViewById(R.id.charity_name);
        charityDesTxt = (TextView) findViewById(R.id.charityDes);



        charitynameTxt.setText(charityName);
        charityDesTxt.setText(charityInfo.getCharityInfo());



    }

    private void loadSendValue(){
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            charityName = extras.getString("charityName");
            System.out.println(charityName);
            //The key argument here must match that used in the other activity
        }
    }
}
