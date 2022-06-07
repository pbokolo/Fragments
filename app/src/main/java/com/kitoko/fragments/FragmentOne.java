package com.kitoko.fragments;

import androidx.fragment.app.Fragment;

/**
 * Cette classe definit le controleur d'un fragment
 * Il herite de la classe Fragment du package androidx.fragment.app
 */
public class FragmentOne extends Fragment {

    /**
     * Constructeur
     */
    public FragmentOne(){
        // Appelle le constructeur par defaut de la classe mere
        // Et lui passe le layout qui sera affiche par le fragment
        super(R.layout.fragment_one);

    }

}
