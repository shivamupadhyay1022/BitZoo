package com.solaris.bitzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.solaris.bitzone.fragments.ClubFragment;
import com.solaris.bitzone.fragments.CourseFragment;
import com.solaris.bitzone.fragments.HomeFragment;

import java.util.HashMap;

public class LandingActivity extends AppCompatActivity {

    int fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Fragment contactfragment = new HomeFragment();
        openfragment(contactfragment);
        fragment = 1;



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.m_home:
                        Toast.makeText(LandingActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        if(fragment != 1){
                            Fragment contactfragment = new HomeFragment();
                            openfragment(contactfragment);
                            fragment= 1;
                        }
                        return true;
                    case R.id.m_course:
                        Toast.makeText(LandingActivity.this, "Course", Toast.LENGTH_SHORT).show();
                        if(fragment != 2){
                            Fragment Coursefragment = new CourseFragment();
                            openfragment(Coursefragment);
                            fragment= 2;
                        }
                        return true;

                    case R.id.m_club:
                        Toast.makeText(LandingActivity.this, "Clubs", Toast.LENGTH_SHORT).show();
                        if(fragment != 3){
                            Fragment Clubfragment = new ClubFragment();
                            openfragment(Clubfragment);
                            fragment= 3;
                        }
                        return true;
                }
                return true;
            }
        });
        
    }

    public void openfragment (Fragment fragment){
        androidx.fragment.app.FragmentManager fm1 = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction transaction1 = fm1.beginTransaction();
        transaction1.replace(R.id.fragment_container, fragment);
        transaction1.commit();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}