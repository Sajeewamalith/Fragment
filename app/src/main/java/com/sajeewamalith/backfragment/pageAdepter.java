package com.sajeewamalith.backfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdepter extends FragmentPagerAdapter {

    private int numofTabs;

    public pageAdepter(FragmentManager fm,int numofTabs){
        super(fm);
        this.numofTabs=numofTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new chatFragment();
            case 1:
                return new statusFragment();
            case 2:
                return new CallFragment();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numofTabs;
    }
}
