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

public class MenstruationActivity extends AppCompatActivity {
    public boolean isNo = false;
    public boolean isNoComingSoon = false;
    public boolean isYes = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menstruation);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(MenstruationActivity.this, RecordMigraineActivity.class);
        startActivity(intent);
    }

    public void NoClick(View v){
        if(!isNo){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }
        isNo = !isNo;
        setSkipButton();
    }

    public void NoComingSoonClick(View v){
        if(!isNoComingSoon){
            v.setBackground(getResources().getDrawable(R.drawable.ic_menstrual_coming_soon_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_menstrual_coming_soon));
            count --;
        }
        isNoComingSoon = !isNoComingSoon;
        setSkipButton();
    }

    public void YesClick(View v){
        if(!isYes){
            v.setBackground(getResources().getDrawable(R.drawable.ic_menstrual_yes_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_menstrual_yes));
            count --;
        }
        isYes = !isYes;
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
        lnLayoutSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenstruationActivity.this, RecordMigraineActivity.class);
                startActivity(intent);
            }
        });
    }
}
