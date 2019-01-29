/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Enumeration of Hotel.
 * @author Ashok Atkuri.
 */
public enum Hotel {

    /**
     * SINGLE room price.
     */
    SINGLE(150),

    /**
     * DOUBLE room price.
     */
    DOUBLE(200),

    /**
     * KING room price.
     */
    KING(250),

    /**
     * QUEEN room price.
     */
    QUEEN(300),

    /**
     * NO room selected.
     */
    NO(0);

    private final double roomCost;

    //private constructor of enum hotel.
    private Hotel(double roomCost) {
        this.roomCost = roomCost;
    }

    /**
     * Gets the cost of type room.
     * @return double value of cost of room value.
     */
    public double getRoomCost() {
        return roomCost;
    }  
}
