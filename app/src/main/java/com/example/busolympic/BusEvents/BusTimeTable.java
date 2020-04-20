package com.example.busolympic.BusEvents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busolympic.ItemClickListener;
import com.example.busolympic.R;

import java.util.ArrayList;

public class BusTimeTable extends RecyclerView.Adapter<BusTimeTable.MyViewHolder> {

    private ArrayList<BusDetail> mArrayLst;
    private Context context;

    public BusTimeTable(ArrayList<BusDetail> mArrayLst, Context context) {
        this.mArrayLst = mArrayLst;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_bus_card_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.eventduration.setText(mArrayLst.get(position).getBusDeparture());
        holder.busType.setText(mArrayLst.get(position).getBusType());
        //holder.amountOfSeats.setText(mArrayLst.get(position));

    }

    @Override
    public int getItemCount() {
        return mArrayLst.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView eventduration;
        private TextView busType;
        private TextView amountOfSeats;
        private ItemClickListener itemClickListener;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            eventduration=itemView.findViewById(R.id.TV_duration);
            busType=itemView.findViewById(R.id.TV_bus_type);
            amountOfSeats=itemView.findViewById(R.id.TV_amount_of_seats);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClickListener(v, getLayoutPosition());
        }
        public void setItemClickListener(ItemClickListener ic){
            this.itemClickListener=ic;
        }
    }
}


