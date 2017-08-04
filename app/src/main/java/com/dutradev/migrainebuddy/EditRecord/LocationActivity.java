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

public class LocationActivity extends AppCompatActivity {
    public boolean isHome = false;
    public boolean isSchool = false;
    public boolean isWork = false;
    public boolean isTransits = false;
    public boolean isBed = false;
    public boolean isOut = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , TriggersActivity.class);
        startActivity(intent);
        finish();
    }

    public void HomeClick(View v){
        if(!isHome){
            v.setBackground(getResources().getDrawable(R.drawable.ic_stay_indoor_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_stay_indoor));
            count --;
        }
        isHome = !isHome;
        setSkipButton();
    }

    public void WorkClick(View v){
        if(!isWork){
            v.setBackground(getResources().getDrawable(R.drawable.ic_work_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_work));
            count --;
        }
        isWork = !isWork;
        setSkipButton();
    }

    public void SchoolClick(View v){
        if(!isSchool){
            v.setBackground(getResources().getDrawable(R.drawable.ic_school_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_school));
            count --;
        }
        isSchool = !isSchool;
        setSkipButton();
    }

    public void TransitClick(View v){
        if(!isTransits){
            v.setBackground(getResources().getDrawable(R.drawable.btn_commuting_clicked));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.btn_commuting_normal));
            count --;
        }
        isTransits = !isTransits;
        setSkipButton();
    }

    public void BedClick(View v){
        if(!isBed){
            v.setBackground(getResources().getDrawable(R.drawable.ic_bed_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_bed));
            count --;
        }
        isBed = !isBed;
        setSkipButton();
    }

    public void OutClick(View v){
        if(!isOut){
            v.setBackground(getResources().getDrawable(R.drawable.ic_bed_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_bed));
            count --;
        }
        isOut = !isOut;
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
