package com.example.Recycle_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class cards_layout extends Fragment {

    private ArrayList<DataModel> dataSet=new ArrayList<>();
    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter addapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cards_layout, container, false);
        recycleView = view.findViewById(R.id.my_recycler_view);

        for(int i=0 ; i<MyData.nameArray.length ; i++)//to Creat card from all array
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i],
                    MyData.desArray[i]
            ));
        }
        addapter = new CustomAdapter(dataSet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recycleView.setLayoutManager(linearLayoutManager);
        recycleView.setAdapter(addapter);

        return view;
    }
}