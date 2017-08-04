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
import android.widget.Button;

import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 04/11/2016.
 */

public class Help3Fragment extends Fragment {
    private static Context mContext;
    public static Help3Fragment newInstance(Context context){
        Help3Fragment fragment = new Help3Fragment();
        mContext = context;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_help_step3, container, false);
        Button btnNext = (Button) v.findViewById(R.id.btnNext);
        Button btnBack = (Button) v.findViewById(R.id.btnBack);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                Fragment newFragment = Help4Fragment.newInstance(mContext);
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.frameLayout, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                if(fragmentManager.getBackStackEntryCount() > 0){
                    fragmentManager.popBackStack();
                }
            }
        });
        return v;
    }
}
