package com.example.dania.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;


public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.ItemViewHolder> {

    ArrayList<String> titles;
    Context context;

     enum Color {
         BLUE,
         ORANGE,
         YELLOW,
         GREEN
    }


    public CommonAdapter(Context context, ArrayList<String> source) {
        this.context = context;
        this.titles = source;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO 1: Create the View of the item
        
        //TODO 2: Create a ViewHolder that will hold the item
        
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        //TODO: 3: Set the text of the TextView (bind the TextView to the data)
        

        if (titles.size() > 3) {
            Random randomNumGenerator = new Random();
            int randomIndex = randomNumGenerator.nextInt(3);
            Color [] colorArray = {Color.BLUE, Color.ORANGE, Color.YELLOW, Color.GREEN};
            Color SelectedColor = colorArray [randomIndex];

            switch (SelectedColor) {
                case BLUE:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.blue));
                    break;
                case ORANGE:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.orange));
                    break;
                case YELLOW:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.yellow));
                case GREEN:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.green));
            }

        } else {
            switch (position) {
                case 0:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.blue));
                    break;
                case 1:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.orange));
                    break;
                case 2:
                    holder.itemFrame.setBackgroundColor(context.getResources().getColor(R.color.yellow));
            }
        }
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        //Have the views here so after they are inflated they can be accessed from onBindView:
        TextView itemText;
        FrameLayout itemFrame;

        public ItemViewHolder(View itemView) {
            super(itemView);
            //TODO 4: Inflate the TextView and the frame
            

            //Set onClick listener on every item
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO 5: Create an explicitly intent to open RoutineActivity and add extra to indicate which item was clicked
                    //If we are already in routine activity then the click on any item should do nothing (hint: check the size of the ArrayList to know in which Activity you're)
                    
                }
            });
        }
    }
}
