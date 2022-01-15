package com.app.assigmenttask.activity.homescreen.adpter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.app.assigmenttask.R;
import com.app.assigmenttask.activity.homescreen.model.RerestaurantModel;
import com.app.assigmenttask.activity.seated.ui.SeatedActivity;
import com.app.assigmenttask.activity.tableview.ui.TableViewActivity;
import com.app.assigmenttask.retrofit.HostSelectionInterceptor;
import com.app.assigmenttask.utils.util;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.util.List;

import okhttp3.HttpUrl;

public class RerestauranAdapter extends RecyclerView.Adapter<RerestauranAdapter.ViewHolder> {
    private final List<RerestaurantModel.DataDTO.RestaurantsDTO.Datam> rerestaurantModelList;
    private Context context;
    private HostSelectionInterceptor hostSelectionInterceptor;


    // RecyclerView recyclerView;
    public RerestauranAdapter(List<RerestaurantModel.DataDTO.RestaurantsDTO.Datam> rerestaurantModelList, Context context, HostSelectionInterceptor hostSelectionInterceptor) {
        this.rerestaurantModelList = rerestaurantModelList;
        this.context = context;
        this.hostSelectionInterceptor = hostSelectionInterceptor;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_restaurant, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final RerestaurantModel.DataDTO.RestaurantsDTO.Datam rerestaurantModel = rerestaurantModelList.get(position);
        if (rerestaurantModel.getLogo() != null) {
            if (rerestaurantModel.getLogo().getImage() != null) {
                Log.e("", "" + rerestaurantModel.getLogo().getImage());
                Glide.with(context)
                        .load(rerestaurantModel.getImages().get(0).getImage())
                        .placeholder(R.drawable.placeholder)
                        .transition(DrawableTransitionOptions.withCrossFade(200))
                        .into(holder.imgLogo);

            }

        }
        holder.txtName.setText(rerestaurantModel.getName());
        holder.txtAddress.setText(rerestaurantModel.getAddress());
        holder.txtCity.setText(rerestaurantModel.getCity());
        holder.btnSeated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpUrl newUrl = HttpUrl.parse(util.BASE_URL_);
                hostSelectionInterceptor.setHost(newUrl);
                context.startActivity(new Intent(context, SeatedActivity.class));
            }
        });
        holder.btnTableView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpUrl newUrl = HttpUrl.parse(util.BASE_URL_);
                hostSelectionInterceptor.setHost(newUrl);
                context.startActivity(new Intent(context, TableViewActivity.class));
            }
        });


    }


    @Override
    public int getItemCount() {
        return rerestaurantModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgLogo;
        public TextView txtName, txtAddress, txtCity;
        public AppCompatButton btnSeated, btnTableView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imgLogo = (ImageView) itemView.findViewById(R.id.imgLogo);
            this.txtName = (TextView) itemView.findViewById(R.id.txtName);
            this.txtAddress = (TextView) itemView.findViewById(R.id.txtAddress);
            this.txtCity = (TextView) itemView.findViewById(R.id.txtCity);
            this.btnSeated = (AppCompatButton) itemView.findViewById(R.id.btnSeated);
            this.btnTableView = (AppCompatButton) itemView.findViewById(R.id.btnTableView);
        }
    }
}
