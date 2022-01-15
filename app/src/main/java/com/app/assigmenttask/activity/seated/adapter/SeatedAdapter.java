package com.app.assigmenttask.activity.seated.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.seated.model.SeatedModel;
import com.app.assigmenttask.activity.seated.ui.SeatedActivity;

import java.util.List;

public class SeatedAdapter extends RecyclerView.Adapter<SeatedAdapter.ViewHolder> {
    private final List<SeatedModel.FloorsDTO> seatedList;
    private Context context;

    // RecyclerView recyclerView;
    public SeatedAdapter(List<SeatedModel.FloorsDTO> seatedList, Context context) {
        this.seatedList = seatedList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_seated, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SeatedModel.FloorsDTO rerestaurantModel = seatedList.get(position);
        if (rerestaurantModel.getUser() != null) {
            holder.txtFull_name.setText(rerestaurantModel.getUser().getFullName());
        }
        holder.txtTable_no.setText(context.getString(R.string.tableno)+" "+rerestaurantModel.getTable_no());
        holder.txtConvertTime.setText(context.getString(R.string.bookingdate)+" "+rerestaurantModel.getConvertTime());
        holder.txtFloorName.setText(rerestaurantModel.getFloorName());
        holder.txtBookingId.setText(context.getString(R.string.booking)+" "+rerestaurantModel.getBookingId());
    }


    @Override
    public int getItemCount() {
        return seatedList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtFull_name, txtTable_no, txtConvertTime, txtFloorName, txtBookingId;
        public ViewHolder(View itemView) {
            super(itemView);
            this.txtFull_name = (TextView) itemView.findViewById(R.id.txtFull_name);
            this.txtTable_no = (TextView) itemView.findViewById(R.id.txtTable_no);
            this.txtConvertTime = (TextView) itemView.findViewById(R.id.txtConvertTime);
            this.txtFloorName = (TextView) itemView.findViewById(R.id.txtFloorName);
            this.txtBookingId = (TextView) itemView.findViewById(R.id.txtBookingId);
        }
    }
}

