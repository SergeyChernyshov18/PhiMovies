package com.example.user.phimovies.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.phimovies.MyPagerAdapter;
import com.example.user.phimovies.R;

public class MainFragment extends Fragment {
    MyPagerAdapter adapterViewPager;
    ViewPager pager;
    TabLayout tabs;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pager = view.findViewById(R.id.vpPager);
        tabs = view.findViewById(R.id.tabs);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapterViewPager = new MyPagerAdapter(getChildFragmentManager());
        pager.setAdapter(adapterViewPager);
        tabs.setupWithViewPager(pager);
    }
}
