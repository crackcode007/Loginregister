package com.helpmate24;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by dell on 06-09-2016.
 */
public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroFragment.newInstance(Color.parseColor("#03A9F4"), position); // blue
            case 1:
                return IntroFragment.newInstance(Color.parseColor("#ffff00"), position); // yellow
            case 2:
                return IntroFragment.newInstance(Color.parseColor("#03A9F4"), position); // blue
            default:
                return IntroFragment.newInstance(Color.parseColor("#4CAF50"), position); // green
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}