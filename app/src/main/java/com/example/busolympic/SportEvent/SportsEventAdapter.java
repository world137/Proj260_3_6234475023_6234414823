package com.example.busolympic.SportEvent;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busolympic.ItemClickListener;
import com.example.busolympic.R;

import java.util.ArrayList;

public class SportsEventAdapter extends RecyclerView.Adapter<SportsEventAdapter.MyViewHolder> {

    private ArrayList<SportsDetail> mArrayList;
    private Context context;

    public SportsEventAdapter(ArrayList<SportsDetail> mArrayList, Context context) {
        this.mArrayList = mArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_event_card_view,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(mArrayList.get(position).getImage());
        holder.sportName.setText(mArrayList.get(position).getSportName());
        holder.eventType.setText(mArrayList.get(position).getEventType());
        holder.athleteGender.setText(mArrayList.get(position).getAthleteGender());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                Intent intent = new Intent(context, DetailOfBus.class);
                intent.putExtra(DetailOfBus.EXTRA_SPORTS_EVENT, mArrayList.get(position));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView image;
        private TextView sportName;
        private TextView eventType;
        private TextView athleteGender;
        private ItemClickListener itemClickListener;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.ImV_swimming);
            sportName=itemView.findViewById(R.id.TV_bus_type);
            eventType=itemView.findViewById(R.id.TV_amount_of_seat);
            athleteGender=itemView.findViewById(R.id.TV_bus_departure);

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
