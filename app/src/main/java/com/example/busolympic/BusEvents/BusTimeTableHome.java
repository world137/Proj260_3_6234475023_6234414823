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

import java.util.ArrayList;


public class BusTimeTableHome extends Fragment {

    private String data = "";
    private BusTimeTableAdapter busTimeTableAdapter;
    private ArrayList<BusTimeTableDetail> busTimeTableDetailsArrLst;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bus_time_table, container, false);
        recyclerView = v.findViewById(R.id.bus_list_recyclerview);
        busTimeTableAdapter = new BusTimeTableAdapter(busTimeTableDetailsArrLst, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(busTimeTableAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        busTimeTableDetailsArrLst = new ArrayList<>();
        busTimeTableDetailsArrLst.add(new BusTimeTableDetail("Type A", "Tokyo stadium", "12.30", "30", "5", "4", "10000"));
        busTimeTableDetailsArrLst.add(new BusTimeTableDetail("Type B", "Tokyo stadium", "12.30", "30", "5", "4", "10000"));

    }
}
