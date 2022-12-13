package com.example.Recycle_view;


import android.os.Parcel;

public class DataModel {

    String name;
    int id_;
    int image;
    String des;

    public DataModel(String name, int id_, int image,String des) {
        this.name = name;
        this.id_ = id_;
        this.image=image;
        this.des=des;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }

    public String getDes() {return des;}

}