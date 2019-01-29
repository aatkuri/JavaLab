/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.util.ArrayList;

/**
 * Class ReservationList.
 * @author Ashok Atkuri
 */
public class ReservationList {
    private ArrayList<Reservation> reserveList;

    /**
     * Constructor with no parameters to initialize reserveList. 
     */
    public ReservationList() {
        reserveList = new ArrayList<Reservation>();
    }

    /**
     * Gets the List of reservations.
     * @return ArrayList type of the reservations.  
     */
    public ArrayList<Reservation> getReserveList() {
        return reserveList;
    }
    
    /**
     * Method to add the reservation to the list.
     * @param reserve Of type reservation to add to list.
     */
    public void addReservation(Reservation reserve){
        this.reserveList.add(reserve);
    }
    
    /**
     * Method to add the Reservation to the list in specified position.
     * @param position Parameter to insert the Reservation object in specified position.
     * @param reserve Of type reservation to add to list.
     */
    public void addReservation(int position, Reservation reserve){
        if(position <= this.reserveList.size())
            this.reserveList.add(position, reserve);
    }
    
    /**
     * Method to return all the Reservation objects having same source based on given string. 
     * @param srcLocation Parameter to match the source string.
     * @return ArrayList of reservation objects.
     */
    public ArrayList<Reservation> findAllSourceLocations(String srcLocation){
        ArrayList<Reservation> matchedList = new ArrayList<Reservation>();
        for(Reservation r:reserveList)
        {
            if(r.getRoute().getSource().equals(srcLocation))
                matchedList.add(r);
        }        
        return matchedList;
    }
}
