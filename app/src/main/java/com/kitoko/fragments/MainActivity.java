package com.kitoko.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeBtn = findViewById(R.id.clickMeBtn);

        clickMeBtn.setOnClickListener(v -> {

            // 1-Recupere le fragment manager a partir de l'activite
            FragmentManager fragmentManager = getSupportFragmentManager();
            // 2-Initialise l'operation de transaction(changement de fragment dans le fragment manager)
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            // 3-Precise l'endroit ou sera afficher le fragment ainsi que la classe du fragment a afficher
            // 4-Effectue l'operation via la methode commit()
            fragmentTransaction.add(R.id.fragmentContainer, FragmentOne.class, null).commit();

           /* getSupportFragmentManager() // Recupere le fragment manager de l'activite
                    .beginTransaction() // Lance une operation de transaction
                    .add(R.id.fragmentContainer, FragmentOne.class, null) // Definit l'endroit a afficher le fragment et le fragment a afficher
                    .commit(); // Effectue l'operation*/

        });

    }
}