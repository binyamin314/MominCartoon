package com.example.Recycle_view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.DatabaseMetaData;


public class fragmentTwo extends Fragment {
    ImageView imageView;
    TextView textname,textdes;
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;



    public fragmentTwo() {
        // Required empty public constructor
    }
    public static fragmentTwo newInstance(String param1, String param2) {
        fragmentTwo fragment = new fragmentTwo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_two, container, false);

        TextView textView = view.findViewById(R.id.textName);
        textView.setText(getArguments().getString("textViewName"));

        ImageView imageView = view.findViewById(R.id.imageView_fragmentTwo);
        imageView.setImageResource(getArguments().getInt("imageViewIcon"));

        TextView textdes = view.findViewById(R.id.textDes);
        textdes.setText(getArguments().getString("textDes"));

        return view;
    }


}