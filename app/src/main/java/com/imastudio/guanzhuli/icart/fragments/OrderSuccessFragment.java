package com.imastudio.guanzhuli.icart.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imastudio.guanzhuli.icart.R;

/**
 * Created by Guanzhu Li on 1/4/2017.
 */
public class OrderSuccessFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_success, container, false);

        return view;
    }
}
