package com.company.factory;

public class BigHouse extends House{
    private String type="BigHouse";
    private int height;

    public BigHouse(int height){
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
