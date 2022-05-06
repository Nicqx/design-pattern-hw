package com.company.factory;

public class SmallHouse extends House{
    private String type="SmallHouse";
    private int height;

    public SmallHouse(int height){
        this.height = height;
    }

    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public int getHeight(){
        return this.height;
    }
}