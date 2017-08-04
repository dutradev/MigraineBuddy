package com.dutradev.migrainebuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TuyenTran on 23/10/2016.
 */
public class SleepRecordsFragment extends Fragment {
    public static SleepRecordsFragment newInstance(){
        SleepRecordsFragment fragment = new SleepRecordsFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sleep_records_fragment, container, false);
        return v;
    }
}
