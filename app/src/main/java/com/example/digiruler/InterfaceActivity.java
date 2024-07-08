package com.example.digiruler;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class InterfaceActivity extends AppCompatActivity {
    private RecyclerView measureListRecycleView;
    private RecyclerView.Adapter measureListAdapter;
    private List<MeasureItem> measureList;
    private RecyclerView.LayoutManager measureListLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        // RecyclerView setup
        measureListRecycleView = findViewById(R.id.measure_list);
        measureListRecycleView.setHasFixedSize(true);

        // Use a linear layout manager
        measureListLayoutManager = new LinearLayoutManager(this);
        measureListRecycleView.setLayoutManager(measureListLayoutManager);

        // Initialize list
        measureList = new ArrayList<>();

        // Add MeasureItem objects to the list
        measureList.add(new MeasureItem("Inches", CalcInches.class));
        measureList.add(new MeasureItem("Centimeters", CalcCenti.class));

        // Set the adapter
        measureListAdapter = new MeasureListAdapter(measureList, this);
        measureListRecycleView.setAdapter(measureListAdapter);
    }
}
