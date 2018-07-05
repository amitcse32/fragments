package com.cssoft.fragments;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();

                if(item.getItemId()==R.id.one) {
                    HomeFragment obj=new HomeFragment("HOME");
                    transaction.add(R.id.frameLayout, obj);
                }
                if(item.getItemId()==R.id.two) {
                    HomeFragment obj=new HomeFragment("TRENDING");
                    transaction.add(R.id.frameLayout, obj);
                }
                if(item.getItemId()==R.id.three) {
                    HomeFragment obj=new HomeFragment("SUBSCRIPTION");
                    transaction.add(R.id.frameLayout, obj);
                }
                if(item.getItemId()==R.id.four) {
                    HomeFragment obj=new HomeFragment("MESSAGE");
                    transaction.add(R.id.frameLayout, obj);
                }
                if(item.getItemId()==R.id.five) {
                    HomeFragment obj=new HomeFragment("PROFILE");
                    transaction.add(R.id.frameLayout, obj);
                }

                transaction.commit();


                return true;
            }
        });



        bottomNavigationView.setSelectedItemId(R.id.three);
    }


}
