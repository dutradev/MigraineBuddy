package com.dutradev.migrainebuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dutradev on 03/11/2016.
 */

public class ReportFragment extends Fragment {

    public static ReportFragment newInstance(){
        ReportFragment fragment = new ReportFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_report, container, false);
        return v;
    }
}
