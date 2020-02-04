package com.example.fragmentapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();

        if(findViewById(R.id.frament_contanier )!=null)
        {
             if(savedInstanceState!=null)
             {
                 return;
             }

            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
             FragmentOne fragmentOne = new FragmentOne();
             fragmentTransaction.add(R.id.frament_contanier,fragmentOne,null);
             fragmentTransaction.commit();
        }
    }
}
