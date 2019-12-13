package com.example.travelocal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FlightsFragment extends Fragment {
    String[] country = {"New York", "Japan", "Korea", "San Francisco", "Taiwan", "China", "Malaysia", "Singapore"};
    private View view;
    private Context context;
    private RecyclerView recyclerView;
    private List<Flights> flightsList = new ArrayList<>();
    private FlightsAdapter mAdapter;



    public FlightsFragment(Context ctx){
        this.context = ctx;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return view = inflater.inflate(R.layout.fragment_flights, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (context, android.R.layout.select_dialog_item, country);
        AutoCompleteTextView actv  =  view.findViewById(R.id.autoCompleteTextView);
        AutoCompleteTextView actv1  =  view.findViewById(R.id.autoCompleteTextView2);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv1.setThreshold(1);
        actv1.setAdapter(adapter);

        recyclerView = view.findViewById(R.id.recycler_view);
        mAdapter = new FlightsAdapter(flightsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onStart() {
        super.onStart();
        flightsList.clear();
        flightsList.add(new Flights(R.drawable.norway, "Norway", "1200"));
        flightsList.add(new Flights(R.drawable.tokyo, "japan", "900"));
    }

}
