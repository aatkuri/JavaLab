/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam1a;

/**
 *
 * @author Ashok Atkuri
 */
public class Lamp {
    private int hoursOn;
    private boolean powered;
    private String location;

    public Lamp(String location) {
        this.hoursOn = 0;
        this.powered = false;
        this.location = location;
    }

    public Lamp(int hoursOn, boolean powered, String location) {
        this.hoursOn = hoursOn;
        this.powered = powered;
        this.location = location;
    }

    public int getHoursOn() {
        return hoursOn;
    }

    public boolean isPowered() {
        return powered;
    }

    public String getLocation() {
        return location;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    @Override
    public String toString() {
        return "Lamp{" + "hoursOn=" + hoursOn + ", powered=" + powered + ", location=" + location + '}';
    }
    
    public void increaseHoursOn(int amount){
        if(amount > 0)
            this.hoursOn += amount;
    }
    
    public double computePowerUsed(double watts){
        return this.hoursOn * watts;
    }
    
    public String middlePartOfLocation(){
        int firstSpace = location.indexOf(" "), 
            lastSpace = location.lastIndexOf(" ");
        if(firstSpace == lastSpace)
            return null;
        else
            return location.substring(firstSpace + 1, lastSpace);
            
    }
}
