/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.ArrayList;

/**
 * Class PassengerShip inherits Ship
 * @author Ashok Atkuri
 */
public class PassengerShip extends Ship{
    private double basePrice;
    private ArrayList<String> facilities;
    
    /**
     * Parameterized constructor for class PassengerShip
     * @param manufacturerName value to initialize attribute manufacturerName of ship class.
     * @param modelSeries value to initialize attribute modelSeries of ship class.
     * @param shipName value to initialize attribute shipName of ship class.
     * @param sourceLocation value to initialize attribute sourceLocation of ship class.
     * @param destinationLocation value to initialize attribute destinationLocation of ship class.
     * @param model value to initialize attribute model of ship class.
     * @param basePrice value to initialize attribute basePrice of  PassengerShip class.
     */
    public PassengerShip(String manufacturerName,int modelSeries,
            String shipName,Point sourceLocation,Point destinationLocation,
            String model,double basePrice){
        super(manufacturerName,modelSeries,shipName,sourceLocation,
                destinationLocation,model);
        this.basePrice = basePrice;
        this.facilities = new ArrayList<String>();
    }
    
    /**
     * No parameter constructor of class PassengerShip.
     */
    public PassengerShip(){
        super();
    }

    /**
     * Gets the value of attribute basePrice.
     * @return The value in attribute basePrice of type double.
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Setter to change the value of attribute basePrice.
     * @param basePrice to set the value of attribute basePrice.
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * Gets the value of attribute facilities.
     * @return The value in attribute basePrice of type ArrayList of String.
     */
    public ArrayList<String> getFacilities() {
        return facilities;
    }

    /**
     * Setter to change the value of attribute facilities.
     * @param facilities to set the value of attribute facilities.
     */
    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }
    
    /**
     * Method to separate the facilities and return as list. 
     * @param options concatenated facilities string that need to be separated individually.  
     * @return The list of individually separated facilities of type ArrayList of String.
     */
    public ArrayList<String> addFacilities(String options){
        ArrayList<String> facilities=new ArrayList<String>();
        for(String facility:options.split(",")){
            facilities.add(facility);
        }
        return facilities;
    }
    
    /**
     * Method to calculate the cost.
     * @return the base cost of the ship of type double. 
     */
    public double calculateCost(){
        return basePrice;
    }
    
    @Override
    public String toString(){
        return facilities.toString();
    }
}
