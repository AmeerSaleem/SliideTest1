package com.example.sliidetest1.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.sliidetest1.ViewPagerFragments.Fragment1;

import java.util.ArrayList;
import java.util.List;

public class ViewpagerFragmentAdapter extends FragmentStatePagerAdapter{

    public ArrayList<Fragment1> fragments;

    public ViewpagerFragmentAdapter(FragmentManager fm, ArrayList<Fragment1> fragments) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.fragments = fragments;
    }


    @Override
    public Fragment1 getItem(int i) {
        switch (i)
        {
            case 0:
                return fragments.get(0); //ChildFragment1 at position 0
            case 1:
                return fragments.get(1); //ChildFragment2 at position 1
            case 2:
                return fragments.get(2); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }



    @Override
    public int getCount() {
        return this.fragments.size();
    }
}