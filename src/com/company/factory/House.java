package com.company.factory;

public abstract class House {
    public abstract String getType();
    public abstract int getHeight();

    @Override
    public String toString(){
        return "Type=" + this.getType() + " Height=" + this.getHeight();
    }
}
