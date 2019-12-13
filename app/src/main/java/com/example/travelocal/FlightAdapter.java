package com.example.travelocal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlightAdapter extends RecyclerView.Adapter <FlightAdapter.ViewHolder>{

    private List<Flights> flightsList;

    public FlightAdapter(List<Flights> flightsList) {
        this.flightsList = flightsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.image.setImageResource(flightsList.get(position).getPhoto());
     holder.place.setText(flightsList.get(position).getPlace());
     holder.price.setText(flightsList.get(position).getPrice());
     holder.rates.setText(flightsList.get(position).getRates());
    }

    @Override
    public int getItemCount() {
        return flightsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView place, price, rates;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         image = itemView.findViewById(R.id.imageView_places_flight);
         place = itemView.findViewById(R.id.txtView_places);
         price = itemView.findViewById(R.id.txtView_prices);
         rates = itemView.findViewById(R.id.txtView_rates);
        }
    }
}
