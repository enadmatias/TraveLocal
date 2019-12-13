package com.example.travelocal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecommendedActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Flights> flightsList = new ArrayList<>();
    private FlightAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);


        recyclerView = findViewById(R.id.recycler_view1);
        mAdapter = new FlightAdapter(flightsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        flightsList.add(new Flights(R.drawable.iceland, "Iceland" , "1500", "2.5"));
        flightsList.add(new Flights(R.drawable.auckland, "New Zealand", "2500", "5.0"));
        flightsList.add(new Flights(R.drawable.finland, "Finland", "3500", "5.0"));
        flightsList.add(new Flights(R.drawable.switzerland, "switzerland", "4000", "5.0"));
    }
}
