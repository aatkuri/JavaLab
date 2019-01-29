/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import ship.*;

/**
 * Utility class 
 * @author Ashok Atkuri
 */
public class Utility {

    /**
     * No argument constructor
     */
    public Utility(){
    }
    
    /**
     * Method to calculate distance between two points.
     * Formula to calculate distance Distance = SquareRoot((x2−x1)^2+(y2−y1)^2).
     * @param p1 Value of x and y coordinates of source of type Point.
     * @param p2 Value of x and y coordinates of destination of type Point.
     * @return
     */
    public static double getDistance(Point p1,Point p2){
        return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2));
    }
    
    /**
     * Method to calculate distance from other ships.
     * @param ship Ship which we need to calculate distance from.
     * @param ships List of Ships that distance need to be calculate.
     */
    public static void knowHowFarIsYourShipFromOthers(Ship ship,ArrayList<Ship> ships){
        String summary = "";
            ships.remove(ship);
            if(ships.size()>0){
            summary="Distance between "+ship.getShipName()+" and" ;
            for(Ship s:ships){
                summary+="\n 		  "+s.getShipName()+":"
                        +String.format("%.2f", getDistance(ship.getSourceLocation()
                                ,s.getSourceLocation()));
            }
            System.out.println(summary);
        }
    }
} 
