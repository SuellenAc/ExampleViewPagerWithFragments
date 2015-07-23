package com.example.suellencolangelo.viewpagerwithfragments.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.suellencolangelo.viewpagerwithfragments.fragment.FirstFragment;
import com.example.suellencolangelo.viewpagerwithfragments.fragment.SecondFragment;
import com.example.suellencolangelo.viewpagerwithfragments.fragment.ThirdFragment;

/**
 * Created by suellencolangelo on 14/07/15.
 */
public class ViewPagerFragmentAdapter extends FragmentStatePagerAdapter {

    public ViewPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}
