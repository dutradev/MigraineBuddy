package com.dutradev.migrainebuddy;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.dutradev.migrainebuddy.Intro.IntroductionPagerAdapter;
import com.dutradev.migrainebuddy.Intro.prefManager;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private IntroductionPagerAdapter introductionPagerAdapter;
    private com.dutradev.migrainebuddy.Intro.prefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }

        // Checking for first time launch - before calling setContentView()
        prefManager = new prefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.introduction_pager);

        // making notification bar transparent
        changeStatusBarColor();

        introductionPagerAdapter = new IntroductionPagerAdapter(getSupportFragmentManager() ,this);
        viewPager.setAdapter(introductionPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
    }

    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        //startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        finish();
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    /**
     * Making notification bar transparent
     */
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
