package com.example.busolympic.SportEvent;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.busolympic.BusEvents.SecondMainActivity;
import com.example.busolympic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailOfBus extends AppCompatActivity {

    public static final String EXTRA_SPORTS_EVENT="extra sport events";

    private TextView header,venue,date,startTime,duration,travel;
    private Button book;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_of_bus);

        header=findViewById(R.id.TV_event_header);
        venue=findViewById(R.id.TV_place);
        date=findViewById(R.id.TV_date);
        startTime=findViewById(R.id.TV_startTime);
        duration=findViewById(R.id.TV_duration);
        travel=findViewById(R.id.TV_time_travel);
        image=findViewById(R.id.ImV_view_demo);
        book=findViewById(R.id.BTN_book);

        SportsDetail sportsDetail=getIntent().getParcelableExtra(EXTRA_SPORTS_EVENT);


        header.setText(sportsDetail.getSportName());
        venue.setText("Venue: "+sportsDetail.getEventVenue());
        date.setText("Date: "+sportsDetail.getEventDate());
        startTime.setText("Start:"+sportsDetail.getEventStartTime());
        duration.setText("Duration: "+sportsDetail.getEventDuration());
        travel.setText("Travel by bus: "+sportsDetail.getEventBusTravelTime());
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailOfBus.this, SecondMainActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bnv = findViewById(R.id.bottom_menu_bar_2);
        bnv.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch(item.getItemId()){
                case R.id.nav_home:
                    break;

                case R.id.nav_booking:
                    break;

                case R.id.nav_profile:
                    break;
            }
            return true;
        }
    };

}
