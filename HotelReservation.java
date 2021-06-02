package com.hotelreservation;

import java.util.ArrayList;

public class HotelReservation 
{
    ArrayList<Hotel> hotelList = new ArrayList<>();
    public void printWelcomeMessage() 
    {
        System.out.println("Welcome to the Hotel Reservation Program");
    }

    public void addHotelDetails() 
    {
    	//Call Values in constructor
        hotelList.add(new Hotel("Lakewood", 110));
        hotelList.add(new Hotel("Bridgewood", 150));
        hotelList.add(new Hotel("Ridgewood", 220));
    }

}