package com.example.test_chat_app_two.activities.homePage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.chatMessageMain.MainChatActivity;
import com.example.test_chat_app_two.activities.homePage.fragment_home.DonateFragment;
import com.example.test_chat_app_two.activities.homePage.fragment_home.HomeFragment;
import com.example.test_chat_app_two.activities.homePage.fragment_home.ReadFragment;
import com.example.test_chat_app_two.value_class.MainStory;

import java.util.ArrayList;

public class Home_activity extends AppCompatActivity implements DonateFragment.OnFragmentInteractionListener {


    public static ArrayList<MainStory> mainStoryList;

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;

    private ActionBarDrawerToggle drawerToggle;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content, new HomeFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    transaction.replace(R.id.content, new ReadFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    transaction.replace(R.id.content, new DonateFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        installAllStory();

        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.bubble_out_9);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, new HomeFragment()).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private void installAllStory() {
        mainStoryList = new ArrayList<MainStory>();
        MainStory newMainStory = new MainStory();
        newMainStory.setMainImage(R.drawable.sence1_1);
        newMainStory.setNewActivity("Home_activity");
        newMainStory.setStoryTitle("this");
        newMainStory.setCharity("serb");

        mainStoryList.add(newMainStory);


        MainStory newMainStory1 = new MainStory();
        newMainStory1.setMainImage(R.drawable.sence1_2);
        newMainStory1.setNewActivity("Home_activity1");
        newMainStory1.setStoryTitle("this");
        newMainStory1.setCharity("serb");

        mainStoryList.add(newMainStory1);

        MainStory newMainStory2 = new MainStory();
        newMainStory2.setMainImage(R.drawable.giphy);
        newMainStory2.setNewActivity("Home_activity1");
        newMainStory2.setStoryTitle("abc");
        newMainStory2.setCharity("ban park");

        mainStoryList.add(newMainStory2);

        for (int i = 0; i < mainStoryList.size(); i++) {
            System.out.println("Text = " + i + mainStoryList.get(i).getStoryTitle() + mainStoryList.get(i).getMainImage());

        }
    }

}
