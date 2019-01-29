/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 * Class Good
 * @author Ashok Atkuri
 */
public class Good {
    private String type;
    private int stockID;
    private double stockWeight;

    /**
     * Parameterized constructor of class Good.
     * @param type value to initialize the attribute type.
     * @param stockID value to initialize the attribute stockID.
     * @param stockWeight value to initialize the attribute stockWeight.
     */
    public Good(String type,int stockID,double stockWeight){
        this.type = type;
        this.stockID = stockID;
        this.stockWeight = stockWeight;
    }
    
    /**
     * Getter to return the value of type.
     * @return The value in attribute type of type String. 
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of attribute type.
     * @param type value to set the value of attribute type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter to return the value of stockID.
     * @return The value in attribute stockID of type integer. 
     */
    public int getStockID() {
        return stockID;
    }

    /**
     * Sets the value of attribute stockID.
     * @param stockID value to set the value of attribute stockID.
     */
    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    /**
     * Getter to return the value of stockWeight.
     * @return The value in attribute stockWeight of type double. 
     */
    public double getStockWeight() {
        return stockWeight;
    }

    /**
     * Sets the value of attribute StockWeight.
     * @param stockWeight value to set the value of attribute StockWeight.
     */
    public void setStockWeight(double stockWeight) {
        this.stockWeight = stockWeight;
    }
}
