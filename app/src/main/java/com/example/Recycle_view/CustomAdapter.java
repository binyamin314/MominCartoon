package com.example.Recycle_view;

//import android.support.annotation.NonNull;
//import android.support.v7.widget.CardView;
//import android.support.v4.widget.RecyclerView;
//import android.widget.ScrollView;

//import android.widget.
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {


    private ArrayList<DataModel> dataSet;

    public CustomAdapter(ArrayList<DataModel> dataSet) {

        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
       CardView cardView;
       TextView textViewName;
       TextView textDes;
       ImageView imageViewIcon;


       ImageButton button;

       public MyViewHolder (View itemView )
       {
           super(itemView);


           ////(CardView)
           //textDes = itemView.findViewById(R.id.textDes);
           cardView = itemView.findViewById(R.id.card_view);
           textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
           imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);


       }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.cards_layout2, parent ,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override

    public void onBindViewHolder(@NonNull MyViewHolder viewHolder,  int listPosition) {

        TextView textViewName = viewHolder.textViewName;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;
        textViewName.setText(dataSet.get(listPosition).getName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());

        String des2 = dataSet.get(listPosition).getDes();


        String s = String.valueOf(viewHolder.textViewName.getText());
        int ime = dataSet.get(listPosition).getImage();

        //String des = String.valueOf(viewHolder.textDes.getText());
        //int d = viewHolder.imageViewIcon.getImageAlpha();



        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Bundle bundle = new Bundle();
                bundle.putInt("imageViewIcon",ime);
                bundle.putString("textDes",des2);
                bundle.putString("textViewName",s);

                Navigation.findNavController(v).navigate(R.id.action_cards_layout_to_fragmentTwo,bundle);

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}


