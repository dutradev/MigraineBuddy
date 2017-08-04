package com.dutradev.migrainebuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dutradev.migrainebuddy.Menu.ViewPagerAdapter;

public class MyRecordsActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_records);
        final ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
        }

        viewPager = (ViewPager) findViewById(R.id.my_records_viewpager);
        setupViewPager(viewPager);

        tabs = (TabLayout) findViewById(R.id.my_records_tabs);
        tabs.setupWithViewPager(viewPager);
        createTabIcons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_record, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }else if(id == R.id.action_export){

        }else if(id == R.id.action_add){
            Intent intent = new Intent(this, SleepTimeActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void createTabIcons() {
        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("MIGRAINE");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_migraine, 0, 0);
        tabs.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("SLEEP");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_sleep, 0, 0);
        tabs.getTabAt(1).setCustomView(tabTwo);
    }

    public void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(MigraineRecordsFragment.newInstance(), "MIGRAINE");
        viewPagerAdapter.addFragment(SleepRecordsFragment.newInstance(), "SLEEP");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
