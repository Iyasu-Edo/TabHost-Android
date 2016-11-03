package com.example.sena.tabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sena on 07/04/2016.
 */
public class TabHost1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.tabhost_uno,container,false);
        return view;
    }
}
