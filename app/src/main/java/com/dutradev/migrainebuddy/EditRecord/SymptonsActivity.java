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

import com.dutradev.migrainebuddy.EditRecord.AuraActivity;
import com.dutradev.migrainebuddy.R;

public class SymptonsActivity extends AppCompatActivity {

    public boolean isNone = false;
    public boolean isPoundingPain = false;
    public boolean isPulsatingPain = false;
    public boolean isThrobbingPain = false;
    public boolean isWorsePainIfMoving = false;
    public boolean isNausea = false;
    public boolean isVomiting = false;
    public boolean isSensitiveToLight = false;
    public boolean isSensitiveToNoise = false;
    public boolean isNeckPain = false;
    public boolean isGiddiness = false;
    public boolean isNasalCongestion = false;
    public boolean isInsomnia = false;
    public boolean isDepressedMood = false;
    public boolean isAnxiety = false;
    public boolean isSensitivityToSmell = false;
    public boolean isHeat = false;
    public boolean isRingingInEars = false;
    public boolean isFatigue = false;
    public boolean isBlurredVision = false;
    public boolean isMoody = false;
    public boolean isDiarrhea = false;
    public boolean isConfusion = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptons);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , AuraActivity.class);
        startActivity(intent);
        finish();
    }

    public void NoneClick(View v){

        if(!isNone){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }

        isNone = !isNone;
        setSkipButton();
    }

    public void PoundingPainClick(View v){

        if(!isPoundingPain){
            v.setBackground(getResources().getDrawable(R.drawable.ic_pounding_pain_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_pounding_pain));
            count --;
        }

        isPoundingPain = !isPoundingPain;
        setSkipButton();
    }

    public void PulsatingPainClick(View v){

        if(!isPulsatingPain){
            v.setBackground(getResources().getDrawable(R.drawable.ic_pulsating_pain_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_pulsating_pain));
            count --;
        }

        isPulsatingPain = !isPulsatingPain;
        setSkipButton();
    }

    public void ThrobbingPainClick(View v){

        if(!isThrobbingPain){
            v.setBackground(getResources().getDrawable(R.drawable.ic_throbbing_pain_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_throbbing_pain));
            count --;
        }

        isThrobbingPain = !isThrobbingPain;
        setSkipButton();
    }

    public void WorsePainIfMovingClick(View v){

        if(!isWorsePainIfMoving){
            v.setBackground(getResources().getDrawable(R.drawable.ic_worse_pain_moving_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_worse_pain_moving));
            count --;
        }

        isWorsePainIfMoving = !isWorsePainIfMoving;
        setSkipButton();
    }

    public void NauseaClick(View v){

        if(!isNausea){
            v.setBackground(getResources().getDrawable(R.drawable.ic_nausea_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_nausea));
            count --;
        }

        isNausea = !isNausea;
    }

    public void VomitingClick(View v){

        if(!isVomiting){
            v.setBackground(getResources().getDrawable(R.drawable.ic_vomiting_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_vomiting));
            count --;
        }

        isVomiting = !isVomiting;
        setSkipButton();
    }

    public void SensitiveToLightClick(View v){

        if(!isSensitiveToLight){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitive_light_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitive_light));
            count --;
        }

        isSensitiveToLight = !isSensitiveToLight;
        setSkipButton();
    }

    public void SensitiveToNoiseClick(View v){

        if(!isSensitiveToNoise){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitive_noise_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitive_noise));
            count --;
        }

        isSensitiveToNoise = !isSensitiveToNoise;
        setSkipButton();
    }

    public void NeckPainClick(View v){

        if(!isNeckPain){
            v.setBackground(getResources().getDrawable(R.drawable.ic_neck_pain_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_neck_pain));
            count --;
        }

        isNeckPain = !isNeckPain;
        setSkipButton();
    }

    public void GiddinessClick(View v){

        if(!isGiddiness){
            v.setBackground(getResources().getDrawable(R.drawable.ic_dizziness_presed));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_dizziness_normal));
            count --;
        }

        isGiddiness = !isGiddiness;
        setSkipButton();
    }

    public void NasalCongestionClick(View v){

        if(!isNasalCongestion){
            v.setBackground(getResources().getDrawable(R.drawable.ic_nasal_congestion_presed));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_nasal_congestion_normal));
            count --;
        }

        isNasalCongestion = !isNasalCongestion;
        setSkipButton();
    }

    public void InsomniaClick(View v){

        if(!isInsomnia){
            v.setBackground(getResources().getDrawable(R.drawable.ic_insomnia_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_insomnia));
            count --;
        }

        isInsomnia = !isInsomnia;
        setSkipButton();
    }

    public void DepressedMoodClick(View v){

        if(!isDepressedMood){
            v.setBackground(getResources().getDrawable(R.drawable.ic_depressed_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_depressed));
            count --;
        }

        isDepressedMood = !isDepressedMood;
        setSkipButton();
    }

    public void AnxietyClick(View v){

        if(!isAnxiety){
            v.setBackground(getResources().getDrawable(R.drawable.ic_anxiety_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_anxiety));
            count --;
        }

        isAnxiety = !isAnxiety;
        setSkipButton();
    }

    public void SensitivityToSmellClick(View v){

        if(!isSensitivityToSmell){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitivity_to_smell_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sensitivity_to_smell));
            count --;
        }

        isSensitivityToSmell = !isSensitivityToSmell;
        setSkipButton();
    }

    public void HeatClick(View v){

        if(!isHeat){
            v.setBackground(getResources().getDrawable(R.drawable.ic_heat_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_heat));
            count --;
        }

        isHeat = !isHeat;
        setSkipButton();
    }

    public void RingingInEarsClick(View v){

        if(!isRingingInEars){
            v.setBackground(getResources().getDrawable(R.drawable.ic_ringing_in_ears_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_ringing_in_ears));
            count --;
        }

        isRingingInEars = !isRingingInEars;
        setSkipButton();
    }

    public void FatigueClick(View v){

        if(!isFatigue){
            v.setBackground(getResources().getDrawable(R.drawable.ic_fatigue_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_fatigue));
            count --;
        }

        isFatigue = !isFatigue;
        setSkipButton();
    }

    public void BlurredVisionClick(View v){

        if(!isBlurredVision){
            v.setBackground(getResources().getDrawable(R.drawable.ic_blurry_vision_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_blurry_vision));
            count --;
        }

        isBlurredVision = !isBlurredVision;
        setSkipButton();
    }

    public void MoodyClick(View v){

        if(!isMoody){
            v.setBackground(getResources().getDrawable(R.drawable.ic_moody_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_moody));
            count --;
        }

        isMoody = !isMoody;
        setSkipButton();
    }

    public void DiarrheaClick(View v){

        if(!isDiarrhea){
            v.setBackground(getResources().getDrawable(R.drawable.ic_diarrhea_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_diarrhea));
            count --;
        }

        isDiarrhea = !isDiarrhea;
        setSkipButton();
    }

    public void ConfusionClick(View v){

        if(!isConfusion){
            v.setBackground(getResources().getDrawable(R.drawable.ic_confusion_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_confusion));
            count --;
        }

        isConfusion = !isConfusion;
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
