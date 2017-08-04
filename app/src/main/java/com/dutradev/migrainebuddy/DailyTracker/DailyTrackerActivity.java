package com.dutradev.migrainebuddy.DailyTracker;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.dutradev.migrainebuddy.CatchActivity;
import com.dutradev.migrainebuddy.R;

public class DailyTrackerActivity extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_tracker);
        actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }

        FragmentManager fragmentManager = getFragmentManager();
        Fragment newFragment = Help1Fragment.newInstance(getApplicationContext());
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frameLayout, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.daily_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }else if(id == R.id.action_catch){
            Intent intent = new Intent(this, CatchActivity.class);
            startActivity(intent);
        }else if(id == R.id.action_ask){
            FragmentManager fragmentManager = getFragmentManager();
            Fragment newFragment = Help1Fragment.newInstance(getApplicationContext());
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

            actionBar = getSupportActionBar();
            if(actionBar != null) {
                actionBar.hide();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
