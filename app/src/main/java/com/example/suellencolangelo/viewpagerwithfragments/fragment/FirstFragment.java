package com.example.suellencolangelo.viewpagerwithfragments.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suellencolangelo.viewpagerwithfragments.R;

/**
 * Created by suellencolangelo on 14/07/15.
 */
public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        return view;
    }
}
