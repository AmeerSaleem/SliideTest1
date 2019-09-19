package com.example.sliidetest1.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.sliidetest1.Adapters.ViewpagerFragmentAdapter;
import com.example.sliidetest1.R;
import com.example.sliidetest1.ViewPagerFragments.Fragment1;

import java.util.ArrayList;

public class ViewPagerParentFragment extends Fragment {

    ArrayList<Fragment1> fragments4ViewpagerTrial;
    ViewPager viewPagerTrial;
    public static ViewpagerFragmentAdapter vpAdapterTrial;
    private int Id = 1;
    public ViewPagerParentFragment(ArrayList<Fragment1> fragments4ViewpagerTrial) {
        this.fragments4ViewpagerTrial = fragments4ViewpagerTrial;
//        vpAdapterTrial = new ViewpagerFragmentAdapter(getChildFragmentManager(),fragments4ViewpagerTrial);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trial,container,false);

        viewPagerTrial = v.findViewById(R.id.viewpagerId_trial);
        vpAdapterTrial = new ViewpagerFragmentAdapter(getChildFragmentManager(),fragments4ViewpagerTrial);
        viewPagerTrial.setAdapter(vpAdapterTrial);
        viewPagerTrial.setId(Id++);
        viewPagerTrial.setSaveFromParentEnabled(false);
        viewPagerTrial.setOffscreenPageLimit(2);

        return v;
    }
}