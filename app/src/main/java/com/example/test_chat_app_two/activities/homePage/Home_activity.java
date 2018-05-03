package com.example.test_chat_app_two.activities.homePage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.test_chat_app_two.R;
import com.example.test_chat_app_two.activities.homePage.fragment_home.DonateFragment;
import com.example.test_chat_app_two.activities.homePage.fragment_home.HomeFragment;
import com.example.test_chat_app_two.activities.homePage.fragment_home.ReadFragment;
import com.example.test_chat_app_two.value_class.MainStory;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Home_activity extends AppCompatActivity implements DonateFragment.OnFragmentInteractionListener {


    public static ArrayList<MainStory> mainStoryList;

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    public static TextView toolbarTxt;
    private ActionBarDrawerToggle drawerToggle;
    public static BottomNavigationViewEx bnve;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    toolbarTxt.setText("Donor choices");
                    transaction.replace(R.id.content, new HomeFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    toolbarTxt.setText("Explore");
                    transaction.replace(R.id.content, new ReadFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    toolbarTxt.setText("Donate History");
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

        bnve = (BottomNavigationViewEx) findViewById(R.id.navigation);
        //bnve.setIconSize(50, 50);
        bnve.enableItemShiftingMode(false);
        bnve.enableAnimation(false);
        bnve.setTextVisibility(true);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Athiti-Medium.ttf");
        bnve.setTypeface(type);
        toolbarTxt = findViewById(R.id.toolbar_title);
        toolbarTxt.setText("Donor choices");


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, new HomeFragment()).commit();
    }
    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
    public static int pxToDp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
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

//    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
//    }

    private void installAllStory() {
        mainStoryList = new ArrayList<MainStory>();

        MainStory newMainStory = new MainStory();
        newMainStory.setMainImage(R.drawable.pic_dog);
        newMainStory.setNewActivity("Home_activity");
        newMainStory.setStoryTitle("การเดินทางของตูบ");
        newMainStory.setCharity("มูลนิธิเพื่อการรักษาสุนัขจรจัด");
        newMainStory.setDes("บทความที่ฉันได้เขียน" +
                "มาจากบทเรียนที่เธอเคยเรียน" +
                "วาจาที่ฉันเอ่ยไป" +
                "มาจากอารมณ์ที่เธอผ่านเจอ" +
                "เพียงการเดินทางเพียงหนึ่งสัปดาห์" +
                "หนึ่งเดือนหนึ่งปีมันมีความหมาย" +
                "ทำให้เติบโตเรียนรู้เข้าใจได้มากกว่า" +
                "" +
                "การเดินทางของฉันและเธอคือการเรียนรู้" +
                "การเรียนรู้ของเราสองคนคือความเข้าใจ" +
                "เธอเข้าใจและฉันเข้าใจก็ทำให้เรามั่นใจ" +
                "" +
                "การเดินทางของฉันและเธอคือการเรียนรู้" +
                "การเรียนรู้ของเราสองคนคือความเข้าใจ" +
                "เธอเข้าใจและฉันเข้าใจก็ทำให้เรามั่นใจ" +
                "ในสิ่งนั้น" +
                "สิ่งที่เราเรียนรู้ส่งเสริมต่อการก้าวเดิน" +
                "เรื่องราวที่เราเผชิญอยู่ที่เราเข้าใจมันไหม");


        mainStoryList.add(newMainStory);


        MainStory newMainStory1 = new MainStory();
        newMainStory1.setMainImage(R.drawable.sence_mountain);
        newMainStory1.setNewActivity("Home_activity1");
        newMainStory1.setStoryTitle("ป่าตะวันตก ในคืนนั้น");
        newMainStory1.setCharity("มูลสืบนาคะเสถียร");
        newMainStory1.setDes("อยากให้เธอได้รับรู้ว่าฉันดีใจ" +
                "มากเท่าไรที่ได้เจอเธอ" +
                "วันที่เคยเหงาและเดียวดาย" +
                "เปลี่ยนแปลงไปเพราะว่ามีเธอ" +
                "ที่ทำให้ฉันนั้นได้เข้าใจ" +
                "ว่าความจริงแล้วตลอดมา" +
                "ที่ฉันนั้นต้องการก็คือเธอและเธอคนเดียว" +
                "แค่ฉันมีเธอ ข้างๆ กัน อยู่ตรงนี้" +
                "Right Here With Me" +
                "ฉันก็ Finn ไปได้เสมอ" +
                "แค่ฉันมีเธอ ข้างๆ กัน อย่างวันนี้" +
                "Just You And Me" +
                "ฉันก็ Finn ไปได้ทุกวัน" +
                "Nanana Nanana" +
                "ฉันก็ Finn ไปได้ทุกวัน");

        mainStoryList.add(newMainStory1);

        MainStory newMainStory2 = new MainStory();
        newMainStory2.setMainImage(R.drawable.sence_run);
        newMainStory2.setNewActivity("Home_activity1");
        newMainStory2.setStoryTitle("การเดินทางของทหารพราน");
        newMainStory2.setCharity("มูลนิธิเพื่อทหารพราน");
        newMainStory2.setDes("ช่วงแรกของการก่อตั้งทหารพรานบางคนเป็นอาชญากรที่ต้องคำพิพากษาแต่ได้มีการผ่อนผันโทษ[ บางส่วนก็สมัครเข้าเป็นทหารพรานเพื่อให้ได้รับพื้นที่ทำกิน" +
                "ในบางพื้นที่ก็ใช้ทหารพรานทำหน้าที่แทนกองอาสารักษาดินแดน ซึ่งเป็นกำลังพลเรือนที่ปกป้องประชาชนในท้องถิ่นจากกองโจร จนถึงปลาย พ.ศ. 2524 ทหารพรานเข้าแทนที่ 80% ของหน่วยทหารปกติในการปฏิบัติภารกิจตามแนวชายแดนพม่า กัมพูชาและมาเลเซีย[8]\n" +
                "ทหารพรานมีประวัติศาสตร์ที่เจ็บช้ำ โดยเป็นหน่วยที่มักถูกกล่าวหาว่ากระทำการโหดร้าย ใช้อำนาจโดยไม่ถูกต้องและมีส่วนพัวพันกับการค้ายาเสพติด นอกจากนี้ยังมีรายงานว่าหน่วยทหารพรานมีอันธพาลท้องถิ่นส่วนมาก ซึ่งมักใช้สถานะของตนก่ออาชญากรรมต่อเพื่อนพลเมืองต่อไป มีการปฏิรูปหลายครั้งนับตั้งแต่ พ.ศ. 2523" +
                "โดยเฉพาะอย่างยิ่งการคัดเลือกทหารใหม่ ซึ่งเป็นมืออาชีพมากกว่าที่เคยเป็นเมื่อยี่สิบปีก่อน ");

        mainStoryList.add(newMainStory2);

        MainStory newMainStory3 = new MainStory();
        newMainStory3.setMainImage(R.drawable.kid);
        newMainStory3.setNewActivity("Home_activity");
        newMainStory3.setStoryTitle("แง่ๆ เด็กร้อง แง่ๆ");
        newMainStory3.setCharity("บ้านเด็กอ่อนพญาไทย");
        newMainStory3.setDes("เธอพยายามหานางแบบใหม่ ๆ เพื่อฝึกทักษะการแต่งหน้าสำหรับโครงหน้าที่แตกต่างกัน อีกทั้งเรียนรู้ทฤษฎีการแต่งหน้าอย่างจริงจัง เรียนแต่งหน้าเทคนิคพิเศษ (สเปเชียลเอฟเฟกต์) และแต่งหน้าแฟนซีด้วย\n" +
                "\"ถ้าชอบอะไร ลงมือทำเลย วางแผนเลยและบอกตัวเองว่าเป้าหมายของตัวเองคืออะไร แล้วต้องไปให้ถึง\"");

        mainStoryList.add(newMainStory3);


        MainStory newMainStory4 = new MainStory();
        newMainStory4.setMainImage(R.drawable.sence1_2);
        newMainStory4.setNewActivity("Home_activity1");
        newMainStory4.setStoryTitle("การเปลี่ยนแปลง");
        newMainStory4.setCharity("มูลนิธิสร้างรอยยิ้ม");
        newMainStory4.setDes("ไม่เอาอีกแล้ว ฉันพอทีกับความรัก" +
                "ทุ่มเทกี่ครั้ง ฉันก็ยังต้องผิดหวัง" +
                "กี่ทีกี่ครั้งที่เสียน้ำตา" +
                "เจ็บจนอ่อนล้าฉันซ้ำเกินไป" +
                "\n" +
                "วิ่งตามแค่ไหนก็ได้เพียงเงา" +
                "กับความเหงาใจ แค่เท่านั้น" +
                "ได้เจอกับเธอ ก็เริ่มเข้าใจในความรัก" +
                "คนที่บอบซ้ำ ได้มาเจอกับความหวัง" +
                "\n" +
                "จากสิ่งที่คิดว่ามันว่างเปล่า" +
                "ที่เราไขว่คว้าไม่เคยมีจริง" +
                "เธอนำความรักแท้จริงเข้ามาผูกพันในหัวใจ" +
                "และวันนี้ฉันเปลี่ยนไป");

        mainStoryList.add(newMainStory4);

        MainStory newMainStory5 = new MainStory();
        newMainStory5.setMainImage(R.drawable.kao);
        newMainStory5.setNewActivity("Home_activity1");
        newMainStory5.setStoryTitle("วิ่งแบบพี่ตูน");
        newMainStory5.setCharity("ก้าวคนละก้าว");
        newMainStory5.setDes("วิ่งแบบพี่ตูน วิ่งแบบพี่ตูน วิ่งแบบพี่ตูน วิ่งวิ่งวิ่งวิ่งวิ่งแบบพี่ตูน วิ่งแบบพี่ตูนวิ่งแบบพี่ตูน วิ่งแบบพี่ตูน วิ่งแบบพี่ตูน วิ่งวิ่งวิ่งวิ่งวิ่งแบบพี่ตูน วิ่งแบบพี่ตูน");

        mainStoryList.add(newMainStory5);







        for (int i = 0; i < mainStoryList.size(); i++) {
            System.out.println("Text = " + i + mainStoryList.get(i).getStoryTitle() + mainStoryList.get(i).getMainImage());

        }
    }

}
