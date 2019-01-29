/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;
import util.Utility;

/**
 * Class Ferry inherits PassengerShip
 * @author Ashok Atkuri
 */
public class Ferry extends PassengerShip{
    private double time;
    
    /**
     * Parameterized constructor for class Ferry
     * @param manufacturerName value to initialize attribute manufacturerName of ship class.
     * @param modelSeries value to initialize attribute modelSeries of ship class.
     * @param shipName value to initialize attribute shipName of ship class.
     * @param sourceLocation value to initialize attribute sourceLocation of ship class.
     * @param destinationLocation value to initialize attribute destinationLocation of ship class.
     * @param model value to initialize attribute model of ship class.
     * @param basePrice value to initialize attribute model of PassengerShip class.
     * @param time value to initialize attribute time of Ferry class.
     */
    public Ferry(String manufacturerName,int modelSeries,
            String shipName,Point sourceLocation,Point destinationLocation,
            String model,double basePrice,double time){
        super(manufacturerName,modelSeries,shipName,sourceLocation,
                destinationLocation,model,basePrice);
    this.time = time;
    }
    
    /**
     * No-Parameter constructor of class CargoShip.
     */
    public Ferry(){
        super();
    }

    /**
     * Getter to return the value of attribute time.
     * @return The value of attribute time of type double. 
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the value of attribute time.
     * @param time of type double to set the value of attribute time.
     */
    public void setTime(double time) {
        this.time = time;
    }
    
    /**
     * Method to calculate the speed of the ferry ship.
     * @return The speed of the ferry of type double.
     */
    public double getSpeed() {
        return Utility.getDistance(super.getSourceLocation(), super.getDestinationLocation())/this.time;
    }

    /**
     * This method overrides the calculateCost() of PassengerShip class. This method calculates the cost based upon the facilities. 
     * @return The value of the sum of basePrice and the total cost calculated for the facilities of type double.
     */
    @Override
    public double calculateCost(){
        double cost=0.0;
        for(String facility:super.getFacilities()){
            cost += Facilities.valueOf(facility.toUpperCase()).getFacilityPrice();
        }
        return cost+super.getBasePrice();
    }

    @Override
    public String toString(){
        return "Ferry Name: "+super.getShipName()+", "
                +super.getModel()+super.getModelSeries()+"\n" +
               "The Base price of ticket is: $"
                +String.format("%.1f", super.getBasePrice())+"\n" +
               "The facilities chosen are "+super.toString()+" "
                + "and the total cost is: $"
                +String.format("%.1f", this.calculateCost())+"\n" +
                "The Speed at which the ferry is travelling: "
                +String.format("%.2f", this.getSpeed())+"mph";
    }
}
