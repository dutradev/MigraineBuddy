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

import com.dutradev.migrainebuddy.EditRecord.MenstruationActivity;
import com.dutradev.migrainebuddy.R;

public class TriggersActivity extends AppCompatActivity {
    public boolean isNoIdea = false;
    public boolean isStress = false;
    public boolean isLackSleep = false;
    public boolean isWokeUp = false;
    public boolean isInterruptedSleep = false;
    public boolean isAnxiety = false;
    public boolean isSkippedMeal = false;
    public boolean isWeather = false;
    public boolean isStorm = false;
    public boolean isHumidity = false;
    public boolean isNeckPain = false;
    public boolean isAlcohol = false;
    public boolean isBright = false;
    public boolean isCaffeine = false;
    public boolean isDehydration = false;
    public boolean isProcessedFood = false;
    public boolean isAllergyReaction = false;
    public boolean isOdd = false;
    public boolean isRebound = false;
    public boolean isSinus = false;
    public boolean isAgedCheese = false;
    public boolean isChocolate = false;
    public boolean isSkippedBeta = false;
    public boolean isSkippedMegnesium = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triggers);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , MenstruationActivity.class);
        startActivity(intent);
        finish();
    }

    public void NoIdeaClick(View v){
        if(!isNoIdea){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }
        isNoIdea = !isNoIdea;
        setSkipButton();
    }

    public void StressClick(View v){
        if(!isStress){
            v.setBackground(getResources().getDrawable(R.drawable.ic_depressed_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_depressed));
            count --;
        }
        isStress = !isStress;
        setSkipButton();
    }

    public void LackSleepClick(View v){
        if(!isLackSleep){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wakeup_sleep_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wakeup_sleep));
            count --;
        }
        isLackSleep = !isLackSleep;
        setSkipButton();
    }

    public void WokeUpClick(View v){
        if(!isWokeUp){
            v.setBackground(getResources().getDrawable(R.drawable.ic_irregular_sleep_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_irregular_sleep));
            count --;
        }
        isWokeUp = !isWokeUp;
        setSkipButton();
    }

    public void InterruptedSleepClick(View v){
        if(!isInterruptedSleep){
            v.setBackground(getResources().getDrawable(R.drawable.ic_interrupted_sleep_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_interrupted_sleep));
            count --;
        }
        isInterruptedSleep = !isInterruptedSleep;
        setSkipButton();
    }

    public void AnxietyClick(View v){
        if(!isAnxiety){
            v.setBackground(getResources().getDrawable(R.drawable.ic_anxiety_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_anxiety));
            count --;
        }
        isAnxiety = !isAnxiety;
        setSkipButton();
    }

    public void SkippedMealClick(View v){
        if(!isSkippedMeal){
            v.setBackground(getResources().getDrawable(R.drawable.ic_skipped_meal_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_skipped_meal));
            count --;
        }
        isSkippedMeal = !isSkippedMeal;
        setSkipButton();
    }

    public void WeatherClick(View v){
        if(!isWeather){
            v.setBackground(getResources().getDrawable(R.drawable.ic_weather_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_weather));
            count --;
        }
        isWeather = !isWeather;
        setSkipButton();
    }

    public void StormClick(View v){
        if(!isStorm){
            v.setBackground(getResources().getDrawable(R.drawable.ic_storm_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_storm));
            count --;
        }
        isStorm = !isStorm;
        setSkipButton();
    }

    public void HumidityClick(View v){
        if(!isHumidity){
            v.setBackground(getResources().getDrawable(R.drawable.ic_atmospheric_humidity_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_atmospheric_humidity));
            count --;
        }
        isHumidity = !isHumidity;
        setSkipButton();
    }

    public void NeckPainClick(View v){
        if(!isNeckPain){
            v.setBackground(getResources().getDrawable(R.drawable.ic_neck_pain_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_neck_pain));
            count --;
        }
        isNeckPain = !isNeckPain;
        setSkipButton();
    }

    public void AlcoholClick(View v){
        if(!isAlcohol){
            v.setBackground(getResources().getDrawable(R.drawable.ic_alcohol_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_alcohol));
            count --;
        }
        isAlcohol = !isAlcohol;
        setSkipButton();
    }

    public void BrightClick(View v){
        if(!isBright){
            v.setBackground(getResources().getDrawable(R.drawable.ic_bright_light_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_bright_light));
            count --;
        }
        isBright = !isBright;
        setSkipButton();
    }

    public void CaffeineClick(View v){
        if(!isCaffeine){
            v.setBackground(getResources().getDrawable(R.drawable.ic_caffeine_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_caffeine));
            count --;
        }
        isCaffeine = !isCaffeine;
        setSkipButton();
    }

    public void DehydrationClick(View v){
        if(!isDehydration){
            v.setBackground(getResources().getDrawable(R.drawable.ic_dehydration_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_dehydration));
            count --;
        }
        isDehydration = !isDehydration;
        setSkipButton();
    }

    public void ProcessedFoodClick(View v){
        if(!isProcessedFood){
            v.setBackground(getResources().getDrawable(R.drawable.ic_food_processed_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_food_processed));
            count --;
        }
        isProcessedFood = !isProcessedFood;
        setSkipButton();
    }

    public void AllergyReactionClick(View v){
        if(!isAllergyReaction){
            v.setBackground(getResources().getDrawable(R.drawable.ic_allergy_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_allergy));
            count --;
        }
        isAllergyReaction = !isAllergyReaction;
        setSkipButton();
    }

    public void OddClick(View v){
        if(!isOdd){
            v.setBackground(getResources().getDrawable(R.drawable.ic_odd_smell_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_odd_smell));
            count --;
        }
        isOdd = !isOdd;
        setSkipButton();
    }

    public void ReboundClick(View v){
        if(!isRebound){
            v.setBackground(getResources().getDrawable(R.drawable.ic_rebound_headache_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_rebound_headache));
            count --;
        }
        isRebound = !isRebound;
        setSkipButton();
    }

    public void SinusClick(View v){
        if(!isSinus){
            v.setBackground(getResources().getDrawable(R.drawable.ic_sinus_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_sinus));
            count --;
        }
        isSinus = !isSinus;
        setSkipButton();
    }

    public void AgedCheeseClick(View v){
        if(!isAgedCheese){
            v.setBackground(getResources().getDrawable(R.drawable.ic_aged_cheese_presed));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_aged_cheese_normal));
            count --;
        }
        isAgedCheese = !isAgedCheese;
        setSkipButton();
    }

    public void ChocolateClick(View v){
        if(!isChocolate){
            v.setBackground(getResources().getDrawable(R.drawable.ic_chocolate_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_chocolate));
            count --;
        }
        isChocolate = !isChocolate;
        setSkipButton();
    }

    public void SkippedBetaClick(View v){
        if(!isSkippedBeta){
            v.setBackground(getResources().getDrawable(R.drawable.ic_medication_press));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_medication));
            count --;
        }
        isSkippedBeta = !isSkippedBeta;
        setSkipButton();
    }

    public void SkippedMegnesiumClick(View v){
        if(!isSkippedMegnesium){
            v.setBackground(getResources().getDrawable(R.drawable.ic_liquid_bottle_pressed));
            count ++;
        }
        else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_liquid_bottle));
            count --;
        }
        isSkippedMegnesium = !isSkippedMegnesium;
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
