package com.phattarapong.viewpagerwithtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.phattarapong.viewpagerwithtab.OneFragment;
import com.phattarapong.viewpagerwithtab.ThreeFragment;
import com.phattarapong.viewpagerwithtab.TwoFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phattarapong on 27-Jul-17.
 */

public class MyPageAdapter extends FragmentStatePagerAdapter {
    List<String> tabTitle;
    @Override

    public CharSequence getPageTitle(int position) {
        return tabTitle.get(position);
    }

    public MyPageAdapter(FragmentManager fm, List<String> title) {
        super(fm);
        tabTitle = new ArrayList<String>();
        tabTitle = title;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OneFragment();
            case 1:
                return new TwoFragment();
            case 2:
                return new ThreeFragment();
            default:
                return new OneFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
