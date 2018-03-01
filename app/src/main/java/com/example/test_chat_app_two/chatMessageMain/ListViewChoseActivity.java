package com.example.test_chat_app_two.chatMessageMain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.test_chat_app_two.R;





public class ListViewChoseActivity extends AppCompatActivity {

    private RecyclerView itemContainer;
    private ChoseAdapterRecyclerView adapter ;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_chose);

        int image_list [] = {R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher};

        itemContainer = (RecyclerView) findViewById(R.id.recyclerView);
        itemContainer.setHasFixedSize(true);
        itemContainer.setSelected(true);


         layoutManager = new LinearLayoutManager(this);
        itemContainer.setLayoutManager(layoutManager);

        adapter = new ChoseAdapterRecyclerView(image_list,this);
        itemContainer.setAdapter(adapter);


    }
}
