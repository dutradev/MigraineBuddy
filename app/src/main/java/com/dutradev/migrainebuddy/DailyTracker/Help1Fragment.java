package com.dutradev.migrainebuddy.DailyTracker;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 04/11/2016.
 */

public class Help1Fragment extends Fragment {
    private static Context mContext;
    public static Help1Fragment newInstance(Context context){
        Help1Fragment fragment = new Help1Fragment();
        mContext = context;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_help_step1, container, false);
        ImageView btnNext = (ImageView) v.findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                Fragment newFragment = Help2Fragment.newInstance(mContext);
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.frameLayout, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return v;
    }
}
