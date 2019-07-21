package com.preeti.replaceloginfrag;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            return;
        }

        LoginFragment loginFragment=new LoginFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1,loginFragment);
        fragmentTransaction.commit();
    }

    public void loginsuccess(String uname){

        WelcomeFragment welcomeFragment=new WelcomeFragment();
        Bundle bundle=new Bundle();
        bundle.putString("Uname",uname);
        welcomeFragment.setArguments(bundle);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container1,welcomeFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
