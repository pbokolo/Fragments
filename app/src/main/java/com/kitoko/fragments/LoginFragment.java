package com.kitoko.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LoginFragment extends Fragment {

    public LoginFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Deserialise la vue
        // C'est l'equivalent de setContentView() dans une activite
        View vue = inflater.inflate(R.layout.fragment_login, container, false);

        Button conBtn = vue.findViewById(R.id.conBtn);

        conBtn.setOnClickListener(v -> {

            // 1-Recupere le fragment manager de l'activite hote
            // 2-Initialiser une transaction(navigation ou alors changement de fragment a afficher) a partir du fragment manager
            // 3-Remplace l'ancien fragment par le nouveau
            // 4-Ajoute le fragment dans le backstack(pour mettre en place une navigation fluide)
            // 5-Commit(effectue la navigation)
            FragmentManager fragMan = getParentFragmentManager();
            FragmentTransaction fragTrans = fragMan.beginTransaction();
            fragTrans.replace(R.id.fragmentContainer, MainFragment.class, null);
            fragTrans.addToBackStack("nav");
            fragTrans.commit();



        });

        return vue;
    }
}