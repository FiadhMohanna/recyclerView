package com.example.dania.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_and_routine);

        //Setting the ArrayList and the RecyclerView
        ArrayList<String> titles = new ArrayList<>();

        titles.add("Weekday");
        titles.add("Weekend");
        titles.add("Vacation");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        CommonAdapter adapter = new CommonAdapter(this, titles);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
