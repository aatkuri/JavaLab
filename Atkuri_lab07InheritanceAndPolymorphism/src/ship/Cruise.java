/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;

/**
 * Class Cruise inherits PassengerShip
 * @author Ashok Atkuri
 */
public class Cruise extends PassengerShip{

    /**
     * Parameterized constructor for class Cruise
     * @param manufacturerName value to initialize attribute manufacturerName of ship class.
     * @param modelSeries value to initialize attribute modelSeries of ship class.
     * @param shipName value to initialize attribute shipName of ship class.
     * @param sourceLocation value to initialize attribute sourceLocation of ship class.
     * @param destinationLocation value to initialize attribute destinationLocation of ship class.
     * @param model value to initialize attribute model of ship class.
     * @param basePrice value to initialize attribute model of PassengerShip class.
     */
    public Cruise(String manufacturerName,int modelSeries,
            String shipName,Point sourceLocation,Point destinationLocation,
            String model,double basePrice){
        super(manufacturerName,modelSeries,shipName,sourceLocation,
                destinationLocation,model,basePrice);        
    }
    
    /**
     * No-Parameter constructor of class CargoShip.
     */
    public Cruise(){
        super();
    }
    
    /**
     * Method to calculate cost based on facilities and base price.
     * @return The value total cost of type double.
     */
    @Override
    public double calculateCost(){
        double cost = 0.0;
        for(String facility:super.getFacilities()){
            cost += Facilities.valueOf(facility.toUpperCase()).getFacilityPrice();
        }
        return cost + super.getBasePrice();
    }
    
    @Override
    public String toString(){
        return "Cruise Name: "+super.getShipName()+", "
                +super.getModel()+super.getModelSeries()+"\n" +
               "The Base price of the ticket is: $"
                +String.format("%.1f", super.getBasePrice())+"\n" +
               "The facilities chosen are: "+super.toString()+" "
                + "and the total cost calculated is: $"
                +String.format("%.1f", this.calculateCost());
    }
}
