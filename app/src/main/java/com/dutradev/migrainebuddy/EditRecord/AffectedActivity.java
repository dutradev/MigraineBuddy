package com.dutradev.migrainebuddy.EditRecord;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dutradev.migrainebuddy.R;

public class AffectedActivity extends AppCompatActivity {
    public boolean isNotAffected = false;
    public boolean isMissedSchool = false;
    public boolean isMissedWork = false;
    public boolean isMissedSocial = false;
    public boolean isSlowerHome = false;
    public boolean isSlowerWork = false;
    public boolean isMissedFamily = false;
    public boolean isNotSleep = false;
    public boolean isWokeUp = false;
    public boolean isNoScreen = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affected);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , LocationActivity.class);
        startActivity(intent);
        finish();
    }

    public void NotAffectedClick(View v){
        if(!isNotAffected){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }
        isNotAffected = !isNotAffected;
        setSkipButton();
    }

    public void MissedSchoolClick(View v){
        if(!isMissedSchool){
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_school_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_school));
            count --;
        }
        isMissedSchool = !isMissedSchool;
        setSkipButton();
    }

    public void MissedWorkClick(View v){
        if(!isMissedWork){
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_work_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_work));
            count --;
        }
        isMissedWork = !isMissedWork;
        setSkipButton();
    }

    public void MissedSocialClick(View v){
        if(!isMissedSocial){
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_social_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_missed_social));
            count --;
        }
        isMissedSocial = !isMissedSocial;
        setSkipButton();
    }

    public void SlowerHomeClick(View v){
        if(!isSlowerHome){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sluggish_house_work_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sluggish_house_work));
            count --;
        }
        isSlowerHome = !isSlowerHome;
        setSkipButton();
    }

    public void SlowerWorkClick(View v){
        if(!isSlowerWork){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sluggish_work_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sluggish_work));
            count --;
        }
        isSlowerWork = !isSlowerWork;
        setSkipButton();
    }

    public void MissedFamilyClick(View v){
        if(!isMissedFamily){
            v.setBackground(getResources().getDrawable(R.drawable.ic_no_family_time_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_no_family_time));
            count --;
        }
        isMissedFamily = !isMissedFamily;
        setSkipButton();
    }

    public void NotSleepClick(View v){
        if(!isNotSleep){
            v.setBackground(getResources().getDrawable(R.drawable.ic_insomnia_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_insomnia));
            count --;
        }
        isNotSleep = !isNotSleep;
        setSkipButton();
    }

    public void WokeUpClick(View v){
        if(!isWokeUp){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wakeup_sleep_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wakeup_sleep));
            count --;
        }
        isWokeUp = !isWokeUp;
        setSkipButton();
    }

    public void NoScreenClick(View v){
        if(!isNoScreen){
            v.setBackground(getResources().getDrawable(R.drawable.ic_no_phone_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_no_phone));
            count --;
        }
        isNoScreen = !isNoScreen;
        setSkipButton();
    }

    public void AddClick(View v){
        if(!isAdd){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_add_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_add));
        }
        isAdd = !isAdd;
    }

    public void RemoveClick(View v){
        if(!isRemove){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_delete_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_delete));
        }
        isRemove = !isRemove;
    }

    public void ArrangeClick(View v){
        if(!isArrange){
            v.setBackground(getResources().getDrawable(R.drawable.ic_arrange_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_arrange));
        }
        isArrange = !isArrange;
    }

    public void setSkipButton(){
        LinearLayout lnLayoutSkip = (LinearLayout)findViewById(R.id.lnLayoutSkip);
        TextView tvSkip = (TextView)findViewById(R.id.tvConfirm);
        if (count > 0){
            lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#03B0B7")));
            tvSkip.setText("NEXT");
        }else {
            lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#F1634C")));
            tvSkip.setText("SKIP");
        }
    }

}
