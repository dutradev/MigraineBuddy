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

public class MigraineRecordsFragment extends Fragment {
    public static MigraineRecordsFragment newInstance(){
        MigraineRecordsFragment fragment = new MigraineRecordsFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.migraine_records_fragment, container, false);
        return v;
    }
}
