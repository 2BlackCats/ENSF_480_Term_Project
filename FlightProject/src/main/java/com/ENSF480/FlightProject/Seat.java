package com.ENSF480.FlightProject;

public abstract class Seat {
    private int customerID;

    public int getCustomer(){
        return this.customerID;
    }

    public void setCustomer(int customerID){
        this.customerID = customerID;
    }


}
