/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 * Class Point
 * @author Ashok Atkuri
 */
public class Point {
    private double x;
    private double y;
    
    /**
     * Parameterized constructor of class Point. 
     * @param x value to initialize the attribute x.
     * @param y value to initialize the attribute y.
     */
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the value of attribute x.
     * @return The value in attribute x of type double.
     */
    public double getX() {
        return x;
    }

    /**
     * Setter to change the value of attribute x.
     * @param x to set the value of attribute x.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the value of attribute y.
     * @return The value in attribute y of type double.
     */
    public double getY() {
        return y;
    }

    /**
     * Setter to change the value of attribute y.
     * @param y to set the value of attribute y.
     */
    public void setY(double y) {
        this.y = y;
    }   
}
