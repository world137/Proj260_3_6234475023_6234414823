package com.example.busolympic.BusEvents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busolympic.R;
import com.example.busolympic.BusEvents.BusDetail;
import com.example.busolympic.SportEvent.DetailOfBus;
import com.example.busolympic.SportEvent.SportsDetail;
import com.example.busolympic.SportEvent.SportsEventAdapter;
import com.example.busolympic.SportEvent.SportsEventHome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import java.io.InputStreamReader;
import java.util.ArrayList;
public class BusTimeTableHome extends Fragment {
    private ArrayList<String[]> events =new ArrayList<>();
    private String line;
    private String[] lineArr;
    private BusTimeTable busTimeTableAdapter;
    private ArrayList<BusDetail> busTimeTableDetailsArrLst;
    private RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bus_time_table, container, false);
        recyclerView = v.findViewById(R.id.bus_list_recyclerview);
        busTimeTableAdapter = new BusTimeTable(busTimeTableDetailsArrLst, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(busTimeTableAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        InputStream inputStream = this.getResources().openRawResource(R.raw.input);
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//        boolean run = true;
//        while (run) {
//            try {
//                if (!((line = bufferedReader.readLine()) != null)) {
//                    break;
//                } else {
//                    if (line.contains("Bus")) {
//                        line = line.replace(":", ",");
//                        lineArr = line.split(",");
//                        for (int i = 0; i < lineArr.length; i++) {
//                            lineArr[i] = lineArr[i].trim();
//                        }
//                        events.add(lineArr);
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int i = 0; i < events.size(); i++) {
////            busTimeTableDetailsArrLst = new ArrayList<>();
//            busTimeTableDetailsArrLst.add(new BusDetail(events.get(i)[1], events.get(i)[2], events.get(i)[3], events.get(i)[4],events.get(i)[5],events.get(i)[6],events.get(i)[7]));
//        }
//
//    }
//}
        DetailOfBus db = new DetailOfBus();

        if(db.getVenue()==("Venue: Olympic Stadium")){
            busTimeTableDetailsArrLst = new ArrayList<>();
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "16.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "17.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "18.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "18.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "19.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "19.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "20.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Olympic Stadium", "20.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "18.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "18.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "19.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "19.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "20.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type B", "Olympic Stadium", "20.30", "30", "5", "4", "1000"));
        }else if(db.getVenue()==("Venue: Tokyo Aquatics Centre")){
            busTimeTableDetailsArrLst = new ArrayList<>();
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "08.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "08.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "09.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "09.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "10.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "10.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "11.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "11.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "12.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "12.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "13.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "13.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "14.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "14.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "15.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "15.30", "30", "5", "4", "1000"));
        }else if(db.getVenue()==("Venue: Tokyo International Forum")){
            busTimeTableDetailsArrLst = new ArrayList<>();
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "11.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "11.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "12.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "12.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "13.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "13.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "14.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "14.30", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "15.00", "30", "5", "4", "1000"));
            busTimeTableDetailsArrLst.add(new BusDetail("Type A", "Tokyo Aquatics Centre", "15.30", "30", "5", "4", "1000"));
        }else{
            busTimeTableDetailsArrLst = new ArrayList<>();
            busTimeTableDetailsArrLst.add(new BusDetail("Type C", "Error", "XX.xx", "666", "0", "0", "10000000"));

        }


    }
}
