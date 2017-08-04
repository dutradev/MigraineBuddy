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

public class MedicationActivity extends AppCompatActivity {
    public boolean isNoMedication = false;
    public boolean hasZomig = false;
    public boolean hasRelpax = false;
    public boolean hasMaxalt = false;
    public boolean hasParacetamol = false;
    public boolean hasTopiramate = false;
    public boolean hasIbuprofen = false;
    public boolean hasSumatriptan = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , ReliefActivity.class);
        startActivity(intent);
        finish();
    }

    public void NoMedicationClick(View v){

        if(!isNoMedication){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }

        isNoMedication = !isNoMedication;
        setSkipButton();
    }

    public void ZomigClick(View v){

        if(!hasZomig){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasZomig = !hasZomig;
        setSkipButton();
    }

    public void RelpaxClick(View v){

        if(!hasRelpax){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasRelpax = !hasRelpax;
        setSkipButton();
    }

    public void MaxaltClick(View v){

        if(!hasMaxalt){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasMaxalt = !hasMaxalt;
        setSkipButton();
    }

    public void ParacetamolClick(View v){

        if(!hasParacetamol){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasParacetamol = !hasParacetamol;
        setSkipButton();
    }

    public void TopiramateClick(View v){

        if(!hasTopiramate){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasTopiramate = !hasTopiramate;
        setSkipButton();
    }

    public void IbuprofenClick(View v){

        if(!hasIbuprofen){
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_oral_medicine));
            count --;
        }

        hasIbuprofen = !hasIbuprofen;
        setSkipButton();
    }

    public void SumatriptanClick(View v){

        if(!hasSumatriptan){
            v.setBackground(getResources().getDrawable(R.drawable.ic_injection_selected));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_injection));
            count --;
        }

        hasSumatriptan = !hasSumatriptan;
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
