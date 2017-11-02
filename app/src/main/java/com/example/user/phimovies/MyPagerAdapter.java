package com.example.user.phimovies;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;

    public MyPagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public int getCount()
    {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return FirstTabFragment.newInstance(0, "В прокате");
            case 1:
                return SecondTabFragment.newInstance(1, "Популярное");
            default:
                return FirstTabFragment.newInstance(0, "В прокате");
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position)
    {
        return "Page " + position;
    }

}
