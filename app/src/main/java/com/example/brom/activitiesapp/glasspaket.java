package com.example.brom.activitiesapp;

import android.util.Size;

/**
 * Created by a14oscna on 2018-05-16.
 */

public class glasspaket {
    public String name;
    public int price;
    public String location;
    public String company;
    public String category;
    public int size;
    public String comment;

    public glasspaket(String name, String company, int price, int size, String category, String comment, String location){
        this.name = name;
        this.location = location;
        this.company = company;
        this.category = category;
        this.price = price;
        this.comment = comment;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getSize(){
        return size;
    }

    public String getLocation(){
        return location;
    }

    public String getCategory(){
        return category;
    }

    public String getCompany(){
        return company;
    }

    public String getComment(){
        return comment;
    }


    public String toastText(){
        return name + " - " + comment + " Pris: " + price + "kr. Tillverkare: " + company + ". Storlek: " + size + "mg.";
    }

    @Override
    public String toString() {
        return name;
    }

}
