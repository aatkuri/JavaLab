/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam1a;

import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class LampDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Testing the Lamp class");
        System.out.print("Enter the Location of Light1\n");
        String locationName = inputObject.nextLine();
        Lamp light1 = new Lamp(locationName);
        System.out.println(light1);
        System.out.println(light1.getHoursOn() + " " + light1.isPowered() + " "
                         + light1.getLocation());
        System.out.println("Enter the hours on, powered status, and location "
                + "for light 2");
        int hoursOn = inputObject.nextInt();
        boolean powered = inputObject.nextBoolean();
        String location = inputObject.nextLine().trim();
        Lamp light2 = new Lamp(hoursOn, powered, location);
        System.out.println(light2);
        light2.increaseHoursOn(20);
        System.out.println("\n" + light1 + "\n" + light2);
        light2.increaseHoursOn(-100);
        light1.setPowered(true);
        System.out.println("\n" + light1 + "\n" + light2);
        light1.setPowered(false);
        System.out.println(light1);
        System.out.println("Power used is " + light1.computePowerUsed(75.0));
        System.out.println("Power used is " + light2.computePowerUsed(40.0));
        System.out.println("Middle part for light 1 is " 
                + light1.middlePartOfLocation());
        System.out.println("Middle part for light 2 is " 
                + light2.middlePartOfLocation());
        System.out.println("Testing on Lamp completed.");       
        
    }
    
}
