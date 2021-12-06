package com.personal.FinalProject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class WeightActivity2 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_history);



        ArrayList<weightHistoryView> exampleList = new ArrayList<>();
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));
        exampleList.add(new weightHistoryView(R.drawable.ic_launcher_background, "Date", "Weight"));

        mRecyclerView = findViewById(R.id.weightRecycler);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}