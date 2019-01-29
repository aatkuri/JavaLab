/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 *
 * @author Ashok Atkuri
 */
public class Ship {
    private String manufacturerName;
    private int modelSeries;
    private Point sourceLocation;
    private Point destinationLocation;
    private String shipName;
    private String model;
    
   /**
     * Parameterized constructor for class Cruise
     * @param manufacturerName value to initialize attribute manufacturerName of ship class.
     * @param modelSeries value to initialize attribute modelSeries of ship class.
     * @param shipName value to initialize attribute shipName of ship class.
     * @param sourceLocation value to initialize attribute sourceLocation of ship class.
     * @param destinationLocation value to initialize attribute destinationLocation of ship class.
     * @param model value to initialize attribute model of ship class.     
     */
    public Ship(String manufacturerName,int modelSeries,String shipName,
            Point sourceLocation,Point destinationLocation,String model){
        this.manufacturerName = manufacturerName;
        this.modelSeries = modelSeries;
        this.shipName = shipName;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.model = model;
    }
    
    /**
     * No parameter constructor.
     */
    public Ship(){
    }

    /**
     * Getter to return the value of manufacturerName.
     * @return The value in attribute manufacturerName of type String. 
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of attribute manufacturerName.
     * @param manufacturerName value to set the value of attribute manufacturerName.
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * Getter to return the value of modelSeries.
     * @return The value in attribute modelSeries of type integer. 
     */
    public int getModelSeries() {
        return modelSeries;
    }

    /**
     * Sets the value of attribute modelSeries.
     * @param modelSeries value to set the value of attribute modelSeries.
     */
    public void setModelSeries(int modelSeries) {
        this.modelSeries = modelSeries;
    }

    /**
     * Getter to return the value of sourceLocation.
     * @return The value in attribute sourceLocation of type Point. 
     */
    public Point getSourceLocation() {
        return sourceLocation;
    }

    /**
     * Sets the value of attribute sourceLocation.
     * @param sourceLocation value to set the value of attribute sourceLocation.
     */
    public void setSourceLocation(Point sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * Getter to return the value of destinationLocation.
     * @return The value in attribute destinationLocation of type Point. 
     */
    public Point getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of attribute destinationLocation.
     * @param destinationLocation value to set the value of attribute destinationLocation.
     */
    public void setDestinationLocation(Point destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /**
     * Getter to return the value of shipName.
     * @return The value in attribute shipName of type String. 
     */
    public String getShipName() {
        return shipName;
    }
    
    /**
     * Getter to return the value of model.
     * @return The value in attribute model of type String. 
     */
    public String getModel() {
        return model;
    }
    
    @Override
    public String toString(){
        return this.manufacturerName;
    }    
}
