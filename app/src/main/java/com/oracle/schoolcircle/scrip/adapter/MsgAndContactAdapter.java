package com.oracle.schoolcircle.scrip.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 田帅 on 2017/2/10.
 */

public class MsgAndContactAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private List<String> mTitleList;

    public MsgAndContactAdapter(FragmentManager fm, List<Fragment> list, List<String> mTitleList) {
        super(fm);
        this.list = list;
        this.mTitleList = mTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
