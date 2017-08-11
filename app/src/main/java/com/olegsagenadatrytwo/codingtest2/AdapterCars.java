package com.olegsagenadatrytwo.codingtest2;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by omcna on 8/11/2017.
 */

public class AdapterCars extends RecyclerView.Adapter<AdapterCars.ViewHolder>{

    ArrayList<Car> carsList = new ArrayList<>();
    public static final String TAG = "AdapterCars";

    public AdapterCars(ArrayList<Car> cars) {
        this.carsList = cars;
    }

    public void setCarsList(ArrayList<Car> cars){
        this.carsList = cars;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cars_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Car c = carsList.get(position);
        holder.tvModel.setText(c.getModel());
        holder.tvType.setText(c.getType());
        holder.tvYear.setText(c.getYear());

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " +carsList.size());
        return carsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvModel;
        TextView tvType;
        TextView tvYear;
        public ViewHolder(View itemView) {
            super(itemView);
            tvModel = (TextView) itemView.findViewById(R.id.tvModel);
            tvType = (TextView) itemView.findViewById(R.id.tvType);
            tvYear = (TextView) itemView.findViewById(R.id.tvYear);
        }
    }
}
