package com.dutradev.migrainebuddy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dutradev.migrainebuddy.DailyTracker.DailyTrackerActivity;
import com.dutradev.migrainebuddy.EditRecord.DurationActivity;

/**
 * Created by dutradev on 21/10/2016.
 */
public class MeFragment extends Fragment {
    private static Context mContext;

    public static MeFragment newInstance(Context context){
        MeFragment fragment = new MeFragment();
        mContext = context;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.me_fragment, container, false);
        Button editMigraineBtn = (Button) v.findViewById(R.id.btnEditMigraine);
        Button dailyTracker = (Button) v.findViewById(R.id.btnDailyTracker);
        Button recordBtn = (Button) v.findViewById(R.id.btnMyRecords);

        editMigraineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DurationActivity.class);
                startActivity(intent);
            }
        });

        dailyTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DailyTrackerActivity.class);
                startActivity(intent);
            }
        });

        recordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MyRecordsActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
