package com.kitoko.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment {


    public MainFragment() {
        // Appelle le constructeur de la classe mere
        // Avec le layout de ce fragment
        // C'est un autre equivalent de setContentView()
        super(R.layout.fragment_main);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}