package com.dutradev.migrainebuddy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by dutradev on 22/10/2016.
 */
public class BuddiesFragment extends Fragment {
    private static Context mContext;

    public static BuddiesFragment newInstance(Context context){
        BuddiesFragment fragment = new BuddiesFragment();
        mContext = context;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.buddies_fragment, container, false);
        LinearLayout hcmLayout = (LinearLayout) v.findViewById(R.id.hcmLayout);

        hcmLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ChatActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
