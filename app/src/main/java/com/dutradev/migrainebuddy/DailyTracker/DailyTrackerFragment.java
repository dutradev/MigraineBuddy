package com.dutradev.migrainebuddy.DailyTracker;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.dutradev.migrainebuddy.CustomGridAdapter;
import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 04/11/2016.
 */

public class DailyTrackerFragment extends Fragment {
    private static Context mContext;
    private String[] titles = {"No idea", "Stress", "Lack of sleep", "Woke up 2h late",
            "Interrupted sleep", "Anxiety", "Skipped meal", "Very variable weather", "Storm",
            "Humidity above 80%", "Neck pain", "Alcohol", "Bright sun/dehydration", "Caffeine",
            "Dehydration", "Processed food", "Allergy reaction", "Odd/Strong smell",
            "Rebound headache", "Sinus", "Aged cheese", "Chocolate", "Add New", "Remove items",
            "Arrange items", "Catch"};
    private int[] icons = {R.drawable.ic_wizard_none, R.drawable.ic_depressed,
            R.drawable.ic_wakeup_sleep, R.drawable.ic_irregular_sleep, R.drawable.ic_anxiety,
            R.drawable.ic_skipped_meal, R.drawable.ic_weather, R.drawable.ic_storm,
            R.drawable.ic_atmospheric_humidity, R.drawable.ic_neck_pain, R.drawable.ic_alcohol,
            R.drawable.ic_bright_light, R.drawable.ic_caffeine, R.drawable.ic_dehydration,
            R.drawable.ic_food_processed, R.drawable.ic_allergy, R.drawable.ic_odd_smell,
            R.drawable.ic_rebound_headache, R.drawable.ic_sinus, R.drawable.ic_aged_cheese_normal,
            R.drawable.ic_chocolate, R.drawable.ic_wizard_add, R.drawable.ic_wizard_delete,
            R.drawable.ic_arrange, R.drawable.ic_catch_button};
    private int[] selectedIcons = {R.drawable.ic_wizard_none_pressed, R.drawable.ic_depressed_press,
            R.drawable.ic_wakeup_sleep_press, R.drawable.ic_irregular_sleep_press,
            R.drawable.ic_anxiety_press, R.drawable.ic_skipped_meal_press, R.drawable.ic_weather_press,
            R.drawable.ic_storm_press, R.drawable.ic_atmospheric_humidity_press,
            R.drawable.ic_neck_pain_press, R.drawable.ic_alcohol_press,
            R.drawable.ic_bright_light_press, R.drawable.ic_caffeine_press,
            R.drawable.ic_dehydration_press, R.drawable.ic_food_processed_press,
            R.drawable.ic_allergy_press, R.drawable.ic_odd_smell_press,
            R.drawable.ic_rebound_headache_press, R.drawable.ic_sinus_press,
            R.drawable.ic_aged_cheese_presed, R.drawable.ic_chocolate_press,
            R.drawable.ic_wizard_add_pressed, R.drawable.ic_wizard_delete_pressed,
            R.drawable.ic_arrange_pressed, R.drawable.ic_catch_button_pressed};

    public static DailyTrackerFragment newInstance(Context context){
        DailyTrackerFragment fragment = new DailyTrackerFragment();
        mContext = context;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
            actionBar.show();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.daily_tracker_fragment, container, false);
        GridView gridView = (GridView) v.findViewById(R.id.gridView);
        CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), titles, icons, selectedIcons);
        gridView.setAdapter(customGridAdapter);
        return v;
    }
}
