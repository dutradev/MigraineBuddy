package com.dutradev.migrainebuddy.Intro;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dutradev.migrainebuddy.Intro.WelcomeToBuddyFragment;
import com.dutradev.migrainebuddy.R;

/**
 * Created by dutradev on 16/10/2016.
 */
public class IntroductionPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private int[] layouts = new int[]{
                R.layout.intro_slide_1,
                R.layout.intro_slide_2,
                R.layout.intro_slide_3,
                R.layout.intro_slide_4,
                R.layout.welcome_to_mirgraine_buddy};

    public IntroductionPagerAdapter(FragmentManager fragmentManager, Context context){
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position) {
        return WelcomeToBuddyFragment.newInstance(mContext, position);
    }
}
