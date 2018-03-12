package com.example.test_chat_app_two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Toddy on 01/03/2018.
 */

public interface ItemClickListener {
    void onClick(View view , int position , boolean isLongClick );

    class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }
    }
}
