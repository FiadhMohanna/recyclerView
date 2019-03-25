package com.example.dania.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public class RoutineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_and_routine);

        //Setting the ArrayList and the RecyclerView
        ArrayList<String> titles = new ArrayList<>();

        //TODO 6: Declare a RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //TODO 7: Declare an object of the adapter
        CommonAdapter commonAdapter = new CommonAdapter(this, titles);

        //TODO 8: link the adapter to the RecyclerView
        recyclerView.setAdapter(commonAdapter);

        int clickedItemPosition = getIntent().getIntExtra("selected_item", 0);

        switch (clickedItemPosition) {
            case 0:
                titles.add(getString(R.string.wakeup_routine));
                titles.add(getString(R.string.breakfast_routine));
                titles.add(getString(R.string.work_routine));
                titles.add(getString(R.string.launch_routine));
                titles.add(getString(R.string.back_from_work_routine));
                titles.add(getString(R.string.family_routine));
                titles.add(getString(R.string.sleep_routine));

                LinearLayoutManager layoutManager = new LinearLayoutManager(this);
                recyclerView.setLayoutManager(layoutManager);
                break;

            case 1:
                titles.add(getString(R.string.wakeup_routine));
                titles.add(getString(R.string.breakfast_routine));
                titles.add(getString(R.string.exercise_routine));
                titles.add(getString(R.string.launch_routine));
                titles.add(getString(R.string.family_routine));
                titles.add(getString(R.string.photos_routine));
                titles.add(getString(R.string.reading_routine));
                titles.add(getString(R.string.sleep_routine));

                //TODO 9: Define a GridLayoutManager
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

                //TODO 10: link the LayoutManager to the RecyclerView
                recyclerView.setLayoutManager(gridLayoutManager);
                break;

            case 2:
                titles.add(getString(R.string.wakeup_routine));
                titles.add(getString(R.string.breakfast_routine));
                titles.add(getString(R.string.exercise_routine));
                titles.add(getString(R.string.family_routine));
                titles.add(getString(R.string.travel_routine));
                titles.add(getString(R.string.photos_routine));
                titles.add(getString(R.string.sleep_routine));
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager);
        }

    }
}
