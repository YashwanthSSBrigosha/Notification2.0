package com.example.notification20;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AllNotificationAdapter extends RecyclerView.Adapter<AllNotificationAdapter.AllNotificationViewHolder>{

    ArrayList<AllNotificationModel> allNotificationModels;

    public AllNotificationAdapter(ArrayList<AllNotificationModel> allNotificationModels) {
        this.allNotificationModels = allNotificationModels;
    }

    @NonNull
    @Override
    public AllNotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_for_all_notification,parent,false);
        AllNotificationViewHolder anvh = new AllNotificationViewHolder(view);
        return anvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AllNotificationViewHolder holder, int position) {

        AllNotificationModel currentModel = allNotificationModels.get(position);

        holder.title.setText(currentModel.getTitle());
        holder.date.setText(currentModel.getDate());
        holder.time.setText(currentModel.getTime());

    }

    @Override
    public int getItemCount() {
        return allNotificationModels.size();
    }

    public class AllNotificationViewHolder extends RecyclerView.ViewHolder{

        TextView title,date,time;

        public AllNotificationViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.all_notification_title);
            date = itemView.findViewById(R.id.date_tv);
            time = itemView.findViewById(R.id.time_tv);
        }


    }
}
