package com.dutradev.migrainebuddy.EditRecord;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dutradev.migrainebuddy.R;

public class AttackTypesActivity extends AppCompatActivity {
    public boolean isDonKnow = false;
    public boolean isMigraine = false;
    public boolean isTension = false;
    public boolean isCluster = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attack_types);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void testClick(View v){
        finish();
    }

    public void dontknowClick(View v){

        if(!isDonKnow){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
        }

        isDonKnow = !isDonKnow;
    }

    public void migraineClick(View v){

        if(!isMigraine){
            v.setBackground(getResources().getDrawable(R.drawable.ic_pain_migraine_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_pain_migraine));
        }

        isMigraine = !isMigraine;
    }

    public void tensionClick(View v){

        if(!isTension){
            v.setBackground(getResources().getDrawable(R.drawable.ic_tension_headache_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_tension_headache));
        }

        isTension = !isTension;
    }

    public void clusterClick(View v) {

        if (!isCluster) {
            v.setBackground(getResources().getDrawable(R.drawable.ic_cluster_pressed));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_cluster));
        }

        isCluster = !isCluster;
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
}
