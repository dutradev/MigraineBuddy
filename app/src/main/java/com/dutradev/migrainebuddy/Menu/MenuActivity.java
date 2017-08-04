package com.dutradev.migrainebuddy.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dutradev.migrainebuddy.BuddiesFragment;
import com.dutradev.migrainebuddy.MeFragment;
import com.dutradev.migrainebuddy.NotificationActivity;
import com.dutradev.migrainebuddy.R;
import com.dutradev.migrainebuddy.ReportFragment;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager;
    private TabLayout tabs;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        }

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close){
            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if(actionBar != null){
                    actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
                }
                invalidateOptionsMenu();
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                if(actionBar != null){
                    actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
                }
                invalidateOptionsMenu();
            }
        };
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        toggle.setDrawerIndicatorEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(1);
    }

    public void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(ReportFragment.newInstance(), "REPORTS");
        viewPagerAdapter.addFragment(MeFragment.newInstance(getBaseContext()), "ME");
        viewPagerAdapter.addFragment(BuddiesFragment.newInstance(getBaseContext()), "BUDDIES");
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.migraine, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.action_notification){
            Intent intent = new Intent(this, NotificationActivity.class);
            startActivity(intent);
        }else if(id == android.R.id.home){
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id == R.id.nav_settings){
            Intent intent = new Intent(this, SettingActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_my_profile){
            Intent intent = new Intent(this, MyProfileActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setVisibility(View.VISIBLE);
//        setSupportActionBar(toolbar);