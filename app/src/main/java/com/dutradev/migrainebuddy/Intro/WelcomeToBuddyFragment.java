package com.dutradev.migrainebuddy.Intro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dutradev.migrainebuddy.Account.AlreadyAccountActivity;
import com.dutradev.migrainebuddy.Account.CreateAccountActivity;
import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 07/11/2016.
 */

public class WelcomeToBuddyFragment extends Fragment implements View.OnClickListener{
    private int[] layouts = new int[]{
            R.layout.intro_slide_1,
            R.layout.intro_slide_2,
            R.layout.intro_slide_3,
            R.layout.intro_slide_4,
            R.layout.welcome_to_mirgraine_buddy};
    private static int mPos;
    private static Context mContext;

    public static WelcomeToBuddyFragment newInstance(Context context, int pos){
        WelcomeToBuddyFragment fragment = new WelcomeToBuddyFragment();
        mContext = context;
        Bundle b = new Bundle();
        b.putInt("Position", pos);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPos = getArguments().getInt("Position");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(layouts[mPos], container, false);
        if(mPos == 4) {
            Button btnCreate = (Button) view.findViewById(R.id.btnCreateAccount);
            Button btnHaveAccount = (Button) view.findViewById(R.id.btnHaveAnAccount);
            btnCreate.setOnClickListener(this);
            btnHaveAccount.setOnClickListener(this);
        }
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCreateAccount:
                Intent intentCreate = new Intent(mContext, CreateAccountActivity.class);
                startActivity(intentCreate);
                break;
            case R.id.btnHaveAnAccount:
                Intent intentHave = new Intent(mContext, AlreadyAccountActivity.class);
                startActivity(intentHave);
                break;
        }
    }
}

