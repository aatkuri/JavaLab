/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.GoodsBaseCost;
import java.util.ArrayList;
import util.Utility;

/**
 * Class CargoShip inherits Ship
 * @author Ashok Atkuri
 */
public class CargoShip extends Ship{
    private ArrayList<Good> goods;
        
    /**
     * Parameterized constructor for class CargoShip
     * @param manufacturerName value to initialize attribute manufacturerName of ship class.
     * @param modelSeries value to initialize attribute modelSeries of ship class.
     * @param shipName value to initialize attribute shipName of ship class.
     * @param sourceLocation value to initialize attribute sourceLocation of ship class.
     * @param destinationLocation value to initialize attribute destinationLocation of ship class.
     * @param model value to initialize attribute model of ship class.
     */
    public CargoShip(String manufacturerName,int modelSeries,
            String shipName,Point sourceLocation,Point destinationLocation,
            String model){
        super(manufacturerName,modelSeries,shipName,sourceLocation,
                destinationLocation,model);
        goods = new ArrayList<Good>();
    }
    
    /**
     * No-Parameter constructor of class CargoShip.
     */
    public CargoShip(){
        super();        
    }
    
    /**
     * Method to add Goods to the CargoShip.
     * @param options Value to add to goods list. 
     * @return The list of Goods. 
     */
    public ArrayList<Good> addGoods(Good options){
        goods.add(options);
        return goods;
    }

    /**
     * Method to get distance between two locations.
     * @return The distance between two locations of type double. 
     */
    public double getDistance(){
        return Utility.getDistance(super.getSourceLocation(), super.getDestinationLocation());
    }
    
    /**
     * Method to calculate Based on weight and distance
     * @return The cost based on the stock weight and distance, of type double.
     */
    public double calcCostBasedOnWeightNDist(){
        double dist = getDistance(),rate,amount = 0;
        if(dist<1000)
            rate=1.33;
        else
            rate=2.60;
        for(Good g:goods){
            GoodsBaseCost gbc = GoodsBaseCost.valueOf(g.getType().toUpperCase());
            if(g.getStockWeight()<2000){
                amount += gbc.getInitialCostForLowWeight() + dist*rate;
            }else
                amount += gbc.getInitialCostForHeavyWeight() + dist*rate;
        }        
        return amount;
    }
    
    /**
     * Method to calculate cost with including tax. 
     * @return The final cost needs to be payable to the ship, of type double. 
     */
    public double calculateCostWithTax(){
        double rate = 0;
        for(Good g:goods){
            GoodsBaseCost gbc = GoodsBaseCost.valueOf(g.getType().toUpperCase());
            switch(gbc.name()){
                case "CHEMICAL" :
                    rate = 14;
                    break;
                case "WOOD" :
                    rate = 10;
                    break;
                case "FOOD" :
                    rate = 12;
                    break;
                default :
                    rate = 8;
                    break;
            }
        }
        return calcCostBasedOnWeightNDist()*(1 + (rate / 100));
    }
    
    @Override
    public String toString(){
        return "The total cost calculated to carry the stock is: $"
                +String.format("%.2f", calculateCostWithTax());
    }
}
