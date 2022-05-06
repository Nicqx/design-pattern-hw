package com.company.factory;

public class HouseFactory{
    public static House getHouse(int height){
        if(height < 10) return new SmallHouse(height);
        else return new BigHouse(height);
    }
}
