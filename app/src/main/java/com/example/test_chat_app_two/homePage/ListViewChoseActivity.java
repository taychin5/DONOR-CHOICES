package com.example.test_chat_app_two.homePage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.homePage.ChoseAdapterRecyclerView;


public class ListViewChoseActivity extends AppCompatActivity {

    private RecyclerView itemContainer;
    private ChoseAdapterRecyclerView adapter ;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_chose);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int image_list [] = {R.drawable.template,R.mipmap.ic_launcher, R.mipmap.ic_launcher};

        itemContainer = (RecyclerView) findViewById(R.id.recyclerView);
        itemContainer.setHasFixedSize(true);
        itemContainer.setSelected(true);


         layoutManager = new LinearLayoutManager(this);
        itemContainer.setLayoutManager(layoutManager);

        adapter = new ChoseAdapterRecyclerView(image_list,this);
        itemContainer.setAdapter(adapter);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
