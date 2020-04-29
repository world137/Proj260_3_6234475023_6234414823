package com.example.busolympic.SportEvent;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.busolympic.SportEvent.DetailOfBus;
import com.example.busolympic.BusEvents.BusTimeTable;
import com.example.busolympic.BusEvents.BusTimeTableHome;
import com.example.busolympic.BusEvents.SecondMainActivity;
import com.example.busolympic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DetailOfBus extends AppCompatActivity {

    public static final String EXTRA_SPORTS_EVENT="extra sport events";


    private TextView header,venue,date,startTime,duration,travel;
    private ImageView image , back ,book;
    public String bus;
//    private ArrayList<BusDetail> mArrayList;
//    private Context context;
//    public DetailOfBus(ArrayList<BusDetail> mArrayList, Context context) {
//        this.mArrayList = mArrayList;
//        this.context = context;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_of_bus);
        back=findViewById(R.id.back);
        header=findViewById(R.id.TV_event_header);
        venue=findViewById(R.id.TV_place);
        date=findViewById(R.id.TV_date);
        startTime=findViewById(R.id.TV_startTime);
        duration=findViewById(R.id.TV_duration);
        travel=findViewById(R.id.TV_time_travel);
        book=findViewById(R.id.book);

        final SportsDetail sportsDetail=getIntent().getParcelableExtra(EXTRA_SPORTS_EVENT);


        header.setText(sportsDetail.getSportName());
        venue.setText("Venue: "+sportsDetail.getEventVenue());
        date.setText("Date: "+sportsDetail.getEventDate());
        startTime.setText("Start:"+sportsDetail.getEventStartTime());
        duration.setText("Duration: "+sportsDetail.getEventDuration());
        travel.setText("Travel by bus: "+sportsDetail.getEventBusTravelTime());
        bus = venue.toString();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                FragmentManager fragmentManager = getActivity.getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                BusTimeTableHome busTimeTableHomeFragment = new BusTimeTableHomeFragment();
//                busTimeTableHomeFragment.setArguments(bundle);
//
//                fragmentTransaction.replace(R.id.fragment_container_2, busTimeTableHomeFragment);
//                fragmentTransaction.commit();
//                BusTimeTableHome bsh = new BusTimeTableHome() ;
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.fragment_container,BusTimeTableHome).commit();
                Intent intent = new Intent(DetailOfBus.this, SecondMainActivity.class);
                startActivity(intent);

            }
        });

        BottomNavigationView bnv = findViewById(R.id.bottom_menu_bar);
        bnv.setOnNavigationItemSelectedListener(navListener);

    }
    public String getVenue(){
        return bus ;
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
