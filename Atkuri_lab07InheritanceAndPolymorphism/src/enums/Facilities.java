/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * ENUM Facilities
 * @author Ashok Atkuri
 */
public enum Facilities {

    /**
     * Cost of CASINO facility.
     */
    CASINO(100),

    /**
     * Cost of SPA facility.
     */
    SPA(65),

    /**
     * Cost of GYM facility.
     */
    GYM(50),

    /**
     * Cost of GAMES facility.
     */
    GAMES(80),

    /**
     * Cost of BUFFETRESTAURANT facility.
     */
    BUFFETRESTAURANT(120),

    /**
     * Cost of FOOD facility.
     */
    FOOD(20),

    /**
     * Cost of UPPERDECK facility.
     */
    UPPERDECK(20),

    /**
     * Cost of DRINKS facility.
     */
    DRINKS(10);
    
    private final double facilityPrice;

    private Facilities(double facilityPrice) {
        this.facilityPrice = facilityPrice;
    }    

    /**
     * Getter to return the facility value.
     * @return The cost of the facility of type double.
     */
    public double getFacilityPrice() {
        return facilityPrice;
    }
}
