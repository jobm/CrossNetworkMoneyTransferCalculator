package com.example.kimaiga.transfercalculator;

/**
 * Created by kimaiga on 11/9/15.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mnumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mnumOfTabs = NumOfTabs;
    }

    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SafaricomFragment tab1 = new SafaricomFragment();
                return tab1;
            case 1:
                AirtelFragment tab2 = new AirtelFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnumOfTabs;
    }
}