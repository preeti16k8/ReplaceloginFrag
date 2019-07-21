package com.preeti.replaceloginfrag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    TextView tv_welcome;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_welcome, container, false);
        tv_welcome=(TextView)v.findViewById(R.id.tv_welcome);
        // Inflate the layout for this fragment

        Bundle bundle=getArguments();
        String uname=bundle.getString("Uname");
        tv_welcome.setText("Welcome: "+ uname);
        return v;
    }

}
