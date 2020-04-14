package com.example.busolympic.SportEvent;

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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SportsEventHome extends Fragment {

    private SportsEventAdapter sportsEventAdapter;
    private ArrayList<SportsDetail> sportsDetailsArrLst = new ArrayList<>();
    private ArrayList<String[]> events =new ArrayList<>();
    private String line;
    private String[] lineArr;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=v.findViewById(R.id.event_list_recyclerview);
        sportsEventAdapter=new SportsEventAdapter(sportsDetailsArrLst,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(sportsEventAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        InputStream inputStream =this.getResources().openRawResource(R.raw.input);

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

        boolean run = true;
        while(run){
            try {
                if (!((line=bufferedReader.readLine())!= null)) {break;}
                else{
                    if(line.contains("Event")){
                        line=line.replace(":",",");
                        lineArr=line.split(",");
                        for(int i=0;i<lineArr.length;i++){
                            lineArr[i]=lineArr[i].trim();
                        }
                        events.add(lineArr);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(int i=0;i<events.size();i++){
            sportsDetailsArrLst.add(new SportsDetail(R.drawable.olympic,events.get(i)[1],events.get(i)[2],events.get(i)[3],events.get(i)[4],events.get(i)[5],events.get(i)[6],events.get(i)[7],events.get(i)[8]));
        }

    }
}
