package com.example.test_chat_app_two.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.value_class.CharityInfo;

import org.w3c.dom.Text;

public class CharityActivity extends AppCompatActivity {

    private String charityName;
    private CharityInfo charityInfo;

    private TextView charitynameTxt;
    private TextView charityDesTxt;
    private Toolbar toolbar;


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


        toolbar = (Toolbar)findViewById(R.id.choose_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_chevron_left_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void loadSendValue(){
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            charityName = extras.getString("charityName");
            System.out.println(charityName);
            //The key argument here must match that used in the other activity
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }

        if(item.getItemId()== R.id.mShare){
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT,"my new app");
            startActivity(Intent.createChooser(i,"Share Via"));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
