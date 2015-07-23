package com.example.suellencolangelo.viewpagerwithfragments.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suellencolangelo.viewpagerwithfragments.R;

/**
 * Created by suellencolangelo on 15/07/15.
 */
public class ThirdFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);
        return view;
    }
}
