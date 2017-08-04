package com.dutradev.migrainebuddy.EditRecord;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dutradev.migrainebuddy.R;

public class DurationActivity extends AppCompatActivity {
    public boolean isJustNow = false;
    public  boolean is15MinuteAgo = false;
    public  boolean is15MinuteAgo1 = false;
    public  boolean is30MinuteAgo = false;
    public  boolean is30MinuteAgo1 = false;
    public  boolean is1HourAgo = false;
    public  boolean is1HourAgo1 = false;
    public  boolean isNotYet = false;
    public  boolean isOtherTime = false;
    public  boolean isOtherTime1 = false;

    public int count = 0;

    ImageView img_JustNow, img_15m1, img_15m2, img_30m1,img_30m2, img_1hour1, img_1hour2, img_othertime1, img_othertime2, img_NotYet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duration);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }

        img_JustNow = (ImageView)findViewById(R.id.justnow);
        img_15m1 =(ImageView) findViewById(R.id.tw_15mins1);
        img_15m2 =(ImageView) findViewById(R.id.tw_15mins2);
        img_30m1 =(ImageView) findViewById(R.id.tw_30mins1);
        img_30m2 =(ImageView) findViewById(R.id.tw_30mins2);
        img_1hour1 =(ImageView) findViewById(R.id.tw_1hour1);
        img_1hour2 =(ImageView) findViewById(R.id.tw_1hour2);
        img_othertime1 = (ImageView)findViewById(R.id.tw_othertime1);
        img_othertime2 = (ImageView)findViewById(R.id.tw_othertime2);
        img_NotYet = (ImageView)findViewById(R.id.tw_notyet);
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , IndensityActivity.class);
        startActivity(intent);
        finish();
    }


    public void setIsJustNow(View view)
    {
        if(!isJustNow)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_just_now_press));

            img_15m1.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m1.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour1.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime1.setBackground(getResources().getDrawable(R.drawable.ic_input_time));

            count ++;

        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_just_now));
            count --;
        }

        isJustNow = !isJustNow;
        setSkipButton();
    }

    public void setis15MinuteAgo(View view)
    {
        if(!is15MinuteAgo)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago_press));

            img_JustNow.setBackground(getResources().getDrawable(R.drawable.ic_just_now));
            img_30m1.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour1.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime1.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            count --;
        }
        is15MinuteAgo = !is15MinuteAgo;
        setSkipButton();
    }

    public void setis15MinuteAgo1(View view)
    {
        if(!is15MinuteAgo1)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago_press));

            img_NotYet.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish));
            img_30m2.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour2.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime2.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            count --;
        }
        is15MinuteAgo1 = !is15MinuteAgo1;
        setSkipButton();
    }

    public void setis30MinuteAgo(View view)
    {
        if(!is30MinuteAgo)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago_press));

            img_JustNow.setBackground(getResources().getDrawable(R.drawable.ic_just_now));
            img_15m1.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_1hour1.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime1.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            count --;

        }
        is30MinuteAgo = !is30MinuteAgo;
        setSkipButton();
    }

    public void setis30MinuteAgo1(View view)
    {
        if(!is30MinuteAgo1)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago_press));

            img_NotYet.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish));
            img_15m2.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_1hour2.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime2.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            count --;

        }
        is30MinuteAgo1 = !is30MinuteAgo1;
        setSkipButton();
    }

    public void setIs1HourAgo(View view)
    {
        if(!is1HourAgo)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago_press));

            img_JustNow.setBackground(getResources().getDrawable(R.drawable.ic_just_now));
            img_15m1.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m1.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_othertime1.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            count --;
        }
        is1HourAgo = !is1HourAgo;
        setSkipButton();
    }

    public void setIs1HourAgo1(View view)
    {
        if(!is1HourAgo1)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago_press));

            img_NotYet.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish));
            img_15m2.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m2.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_othertime2.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            count --;
        }
        is1HourAgo1 = !is1HourAgo1;
        setSkipButton();
    }

    public void setIsOtherTime(View view)
    {
        if(!isOtherTime)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago_press));
            img_JustNow.setBackground(getResources().getDrawable(R.drawable.ic_just_now));
            img_15m1.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m1.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour1.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count --;

        }
        isOtherTime = !isOtherTime;
        setSkipButton();
    }

    public void setIsOtherTime1(View view)
    {
        if(!isOtherTime1)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago_press));
            img_NotYet.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish));
            img_15m2.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m2.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour2.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            count ++;
        }else{
            view.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count --;

        }
        isOtherTime1 = !isOtherTime1;
        setSkipButton();
    }

    public void setIsNotYet(View view)
    {
        if(!isNotYet)
        {
            view.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish));
            count ++;
        }else {
            view.setBackground(getResources().getDrawable(R.drawable.ic_not_yet_finish_press));
            img_15m2.setBackground(getResources().getDrawable(R.drawable.ic_15min_ago));
            img_30m2.setBackground(getResources().getDrawable(R.drawable.ic_30min_ago));
            img_1hour2.setBackground(getResources().getDrawable(R.drawable.ic_1hour_ago));
            img_othertime2.setBackground(getResources().getDrawable(R.drawable.ic_input_time));
            count --;
        }
        isNotYet = !isNotYet;
        setSkipButton();
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
