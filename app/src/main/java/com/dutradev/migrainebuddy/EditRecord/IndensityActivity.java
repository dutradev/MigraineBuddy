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

public class IndensityActivity extends AppCompatActivity {
    public boolean istextview_10 = false;
    public boolean istextview_9 = false;
    public boolean istextview_8 = false;
    public boolean istextview_7 = false;
    public boolean istextview_6 = false;
    public boolean istextview_5 = false;
    public boolean istextview_4 = false;
    public boolean istextview_3 = false;
    public boolean istextview_2 = false;
    public boolean istextview_1 = false;


    public TextView textview_10;
    public TextView textview_9;
    public TextView textview_8;
    public TextView textview_7;
    public TextView textview_6;
    public TextView textview_5;
    public TextView textview_4;
    public TextView textview_3;
    public TextView textview_2;
    public TextView textview_1;

    public TextView textview_hurtsworst1;
    public TextView textview_sevese1;
    public TextView textview_mild1;
    public TextView textview_maderate1;
    public TextView textview_hustsabit1;

    public TextView textview_hurtsworst2;
    public TextView textview_sevese2;
    public TextView textview_mild2;
    public TextView textview_maderate2;
    public TextView textview_hustsabit2;

    int count = 0;

    LinearLayout layout_hurtsabit;
    LinearLayout layout_mild;
    LinearLayout layout_severe;
    LinearLayout layout_hurtworst;
    LinearLayout layout_moderate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indensity);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }

        textview_1 = (TextView) findViewById(R.id.textview_1);
        textview_2 = (TextView) findViewById(R.id.textview_2);
        textview_3 = (TextView) findViewById(R.id.textview_3);
        textview_4 = (TextView) findViewById(R.id.textview_4);
        textview_5 = (TextView) findViewById(R.id.textview_5);
        textview_6 = (TextView) findViewById(R.id.textview_6);
        textview_7 = (TextView) findViewById(R.id.textview_7);
        textview_8 = (TextView) findViewById(R.id.textview_8);
        textview_9 = (TextView) findViewById(R.id.textview_9);
        textview_10 = (TextView) findViewById(R.id.textview_10);

        textview_hurtsworst1 = (TextView) findViewById(R.id.textview_hurtsworst1);
        textview_sevese1 = (TextView) findViewById(R.id.textview_sevese1);
        textview_mild1 = (TextView) findViewById(R.id.textview_mild1);
        textview_hustsabit1 = (TextView) findViewById(R.id.textview_hustsabit1);
        textview_maderate1 = (TextView) findViewById(R.id.textview_maderate1);

        textview_hurtsworst2 = (TextView) findViewById(R.id.textview_hurtsworst2);
        textview_sevese2 = (TextView) findViewById(R.id.textview_sevese2);
        textview_mild2 = (TextView) findViewById(R.id.textview_mild2);
        textview_hustsabit2 = (TextView) findViewById(R.id.textview_hustsabit2);
        textview_maderate2 = (TextView) findViewById(R.id.textview_maderate2);

        layout_hurtworst = (LinearLayout) findViewById(R.id.layout_hurtworst);
        layout_severe = (LinearLayout) findViewById(R.id.layout_severe);
        layout_mild = (LinearLayout) findViewById(R.id.layout_mild);
        layout_hurtsabit = (LinearLayout) findViewById(R.id.layout_hurtsabit);
        layout_moderate = (LinearLayout) findViewById(R.id.layout_moderate);


    }

    public void setbackground1(View view) {
        count++;
        setSkipButton();
        if (!istextview_1) {
            textview_1.setBackgroundColor(Color.parseColor("#78d327"));
            textview_hustsabit1.setBackgroundColor(Color.parseColor("#78d327"));
            textview_hustsabit2.setBackgroundColor(Color.parseColor("#78d327"));
            layout_hurtsabit.setBackgroundColor(Color.parseColor("#78d327"));
            textview_hustsabit1.setText("Hursts a litte");
            textview_hustsabit2.setText("Pain is present but does not limit activity");


            //textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            // layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            //textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            //textview_hustsabit2.set("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            //textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            //textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_1 = false;
    }

    public void setbackground2(View view) {
        count++;
        setSkipButton();
        if (!istextview_2) {
            textview_2.setBackgroundColor(Color.parseColor("#8dd826"));
            textview_hustsabit1.setBackgroundColor(Color.parseColor("#8dd826"));
            textview_hustsabit2.setBackgroundColor(Color.parseColor("#8dd826"));
            layout_hurtsabit.setBackgroundColor(Color.parseColor("#8dd826"));
            textview_hustsabit1.setText("Hursts a litte");
            textview_hustsabit2.setText("Pain is present but does not limit activity");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            //textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            //layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            //textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            //textview_hustsabit2.setText("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            //textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            //textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));


        } else {

        }
        istextview_2 = false;
    }

    public void setbackground3(View view) {
        count++;
        setSkipButton();
        if (!istextview_3) {
            textview_3.setBackgroundColor(Color.parseColor("#a3d824"));
            textview_mild1.setBackgroundColor(Color.parseColor("#a3d824"));
            textview_mild2.setBackgroundColor(Color.parseColor("#a3d824"));
            layout_mild.setBackgroundColor(Color.parseColor("#a3d824"));
            textview_mild1.setText("Hursts litte more");
            textview_mild2.setText("Can do most  activities");


            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            //textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            //textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            //textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_3 = false;
    }

    public void setbackground4(View view) {
        count++;
        setSkipButton();
        if (!istextview_4) {
            textview_4.setBackgroundColor(Color.parseColor("#bad823"));
            textview_mild1.setBackgroundColor(Color.parseColor("#bad823"));
            textview_mild2.setBackgroundColor(Color.parseColor("#bad823"));
            layout_mild.setBackgroundColor(Color.parseColor("#bad823"));
            textview_mild1.setText("Hursts litte more");
            textview_mild2.setText("Can do most  activities");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            //textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            //textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            //textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_3 = false;
    }

    public void setbackground5(View view) {
        count++;
        setSkipButton();
        if (!istextview_5) {
            textview_5.setBackgroundColor(Color.parseColor("#ced822"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#ced822"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#ced822"));
            layout_moderate.setBackgroundColor(Color.parseColor("#ced822"));
            textview_maderate1.setText("Hursts more");
            textview_maderate2.setText("Unable to do some activities");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            //textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            //textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            //textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_5 = false;
    }

    public void setbackground6(View view) {
        count++;
        setSkipButton();
        if (!istextview_6) {
            textview_6.setBackgroundColor(Color.parseColor("#dbd821"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#dbd821"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#dbd821"));
            layout_moderate.setBackgroundColor(Color.parseColor("#dbd821"));
            textview_maderate1.setText("Hursts more");
            textview_maderate2.setText("Unable to do some activities");


            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            //textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            //textview_maderate1.setText("");
            textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            //textview_maderate2.setText("");
            textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_6 = false;
    }

    public void setbackground7(View view) {
        count++;
        setSkipButton();
        if (!istextview_7) {
            textview_7.setBackgroundColor(Color.parseColor("#e4c421"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#e4c421"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#e4c421"));
            layout_severe.setBackgroundColor(Color.parseColor("#e4c421"));
            textview_sevese1.setText("Hursts a lot");
            textview_sevese2.setText("Unable to do most activities");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            //textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            //textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            //textview_sevese2.setText("");
            textview_hurtsworst2.setText("");


            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_7 = false;
    }

    public void setbackground8(View view) {
        count++;
        setSkipButton();
        if (!istextview_8) {
            textview_8.setBackgroundColor(Color.parseColor("#e7a321"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#e7a321"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#e7a321"));
            layout_severe.setBackgroundColor(Color.parseColor("#e7a321"));
            textview_sevese1.setText("Hursts a lot");
            textview_sevese2.setText("Unable to do most activities");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            //textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            //textview_sevese1.setText("");
            textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            //textview_sevese2.setText("");
            textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_8 = false;
    }

    public void setbackground9(View view) {
        count++;
        setSkipButton();
        if (!istextview_9) {
            textview_9.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#e77b22"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst1.setText("Hursts worst");
            textview_hurtsworst2.setText("Excruciating");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            //textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            //textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            //textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_9 = false;
    }

    public void setbackground10(View view) {
        count++;
        setSkipButton();
        if (!istextview_10) {
            textview_10.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst2.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst1.setBackgroundColor(Color.parseColor("#e77b22"));
            layout_hurtworst.setBackgroundColor(Color.parseColor("#e77b22"));
            textview_hurtsworst1.setText("Hursts worst");
            textview_hurtsworst2.setText("Excruciating, unable to do any activities");

            textview_1.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_2.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_3.setBackgroundColor(Color.parseColor("#cbe984"));
            textview_4.setBackgroundColor(Color.parseColor("#d8e984"));
            textview_5.setBackgroundColor(Color.parseColor("#e4e983"));
            textview_6.setBackgroundColor(Color.parseColor("#ebe983"));
            textview_7.setBackgroundColor(Color.parseColor("#f0de83"));
            textview_8.setBackgroundColor(Color.parseColor("#f2cb83"));
            textview_9.setBackgroundColor(Color.parseColor("#f2b583"));
            //textview_10.setBackgroundColor(Color.parseColor("#f2a683"));

            layout_hurtsabit.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_mild.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_moderate.setBackgroundColor(Color.parseColor("#FFFFFF"));
            layout_severe.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //layout_hurtworst.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit1.setText("");
            textview_mild1.setText("");
            textview_maderate1.setText("");
            textview_sevese1.setText("");
            //textview_hurtsworst1.setText("");

            textview_hustsabit2.setText("");
            textview_mild2.setText("");
            textview_maderate2.setText("");
            textview_sevese2.setText("");
            //textview_hurtsworst2.setText("");

            textview_hustsabit1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_hurtsworst1.setBackgroundColor(Color.parseColor("#FFFFFF"));

            textview_hustsabit2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_mild2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_maderate2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textview_sevese2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //textview_hurtsworst2.setBackgroundColor(Color.parseColor("#FFFFFF"));

        } else {

        }
        istextview_10 = false;
    }

    public void botherClick(View v) {
        finish();
    }

    public void skipClick(View v) {
        Intent intent = new Intent(this, MedicationActivity.class);
        startActivity(intent);
        finish();
    }

    public void setSkipButton() {
        LinearLayout lnLayoutSkip = (LinearLayout) findViewById(R.id.lnLayoutSkip);
        TextView tvSkip = (TextView) findViewById(R.id.tvConfirm);
        if (count > 0) {
            lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#03B0B7")));
            tvSkip.setText("NEXT");
        } else {
        }
        lnLayoutSkip.setBackground(new ColorDrawable(Color.parseColor("#F1634C")));
        tvSkip.setText("SKIP");
    }
}
