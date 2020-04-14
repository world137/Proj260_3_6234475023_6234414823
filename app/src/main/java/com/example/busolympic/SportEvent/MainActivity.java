package com.example.busolympic.SportEvent;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.busolympic.Bookingfragment;
import com.example.busolympic.Profilefragment;
import com.example.busolympic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = findViewById(R.id.bottom_menu_bar_2);
        bnv.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_2,new SportsEventHome()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch(item.getItemId()){
                case R.id.nav_home:
                    selectedFragment = new SportsEventHome();
                    break;

                case R.id.nav_booking:
                    selectedFragment = new Bookingfragment();
                    break;

                case R.id.nav_profile:
                    selectedFragment = new Profilefragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_2,selectedFragment).commit();
            return true;
        }
    };

}

