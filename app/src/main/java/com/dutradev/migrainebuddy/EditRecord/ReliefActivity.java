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

public class ReliefActivity extends AppCompatActivity {
    public boolean isNoRelief = false;
    public boolean isDarkRoom = false;
    public boolean isSleep = false;
    public boolean isYoga = false;
    public boolean isStayIndoor = false;
    public boolean isIcePacks = false;
    public boolean isFood = false;
    public boolean isCaffeine = false;
    public boolean isHotShower = false;
    public boolean isColdShower = false;
    public boolean isDrinkWater = false;
    public boolean isHeatPad = false;
    public boolean isAdd = false;
    public boolean isRemove = false;
    public boolean isArrange = false;

    public  int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relief);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
    }

    public void botherClick(View v){
        finish();
    }

    public void skipClick(View v){
        Intent intent = new Intent(this , SymptonsActivity.class);
        startActivity(intent);
        finish();
    }

    public void NoReliefClick(View v){
        if(!isNoRelief){
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none_pressed));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_wizard_none));
            count --;
        }
        isNoRelief = !isNoRelief;
        setSkipButton();
    }

    public void DarkRoomRestClick(View v){
        if(!isDarkRoom){
            v.setBackground(getResources().getDrawable(R.drawable.ic_dark_room_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_dark_room));
            count --;
        }
        isDarkRoom = !isDarkRoom;
        setSkipButton();
    }

    public void SleepClick(View v){
        if(!isSleep){
            v.setBackground(getResources().getDrawable(R.drawable.ic_rest_sleep_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_rest_sleep));
            count --;
        }
        isSleep = !isSleep;
        setSkipButton();
    }

    public void YogaClick(View v){
        if(!isYoga){
            v.setBackground(getResources().getDrawable(R.drawable.ic_yoga_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_yoga));
            count --;
        }
        isYoga = !isYoga;
        setSkipButton();
    }

    public void StayIndoorClick(View v){
        if(!isStayIndoor){
            v.setBackground(getResources().getDrawable(R.drawable.ic_stay_indoor_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_stay_indoor));
            count --;
        }
        isStayIndoor = !isStayIndoor;
        setSkipButton();
    }

    public void IcePacksClick(View v){
        if(!isIcePacks){
            v.setBackground(getResources().getDrawable(R.drawable.ic_ice_pack_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_ice_pack));
            count --;
        }
        isIcePacks = !isIcePacks;
        setSkipButton();
    }

    public void FoodClick(View v){
        if(!isFood){
            v.setBackground(getResources().getDrawable(R.drawable.ic_food_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_food));
            count --;
        }
        isFood = !isFood;
        setSkipButton();
    }

    public void CaffeineClick(View v){
        if(!isCaffeine){
            v.setBackground(getResources().getDrawable(R.drawable.ic_caffeine_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_caffeine));
            count --;
        }
        isCaffeine = !isCaffeine;
        setSkipButton();
    }

    public void HotShowerClick(View v){
        if(!isHotShower){
            v.setBackground(getResources().getDrawable(R.drawable.ic_hot_shower_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_hot_shower));
            count --;
        }
        isHotShower = !isHotShower;
        setSkipButton();
    }

    public void ColdShowerClick(View v){
        if(!isColdShower){
            v.setBackground(getResources().getDrawable(R.drawable.ic_cold_shower_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_cold_shower));
            count --;
        }
        isColdShower = !isColdShower;
        setSkipButton();
    }

    public void DrinkWaterClick(View v){
        if(!isDrinkWater){
            v.setBackground(getResources().getDrawable(R.drawable.ic_drink_water_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_drink_water));
            count --;
        }
        isDrinkWater = !isDrinkWater;
        setSkipButton();
    }

    public void HeatPadClick(View v){
        if(!isHeatPad){
            v.setBackground(getResources().getDrawable(R.drawable.ic_heat_pad_press));
            count ++;
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.ic_heat_pad));
            count --;
        }
        isHeatPad = !isHeatPad;
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
