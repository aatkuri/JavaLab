/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semafori;

/**
 *
 * @author S530458
 */
public class DistanceLight {
    private int distanceFromStart;
    private int redLightTime;
    private int greenLightTime;

    public DistanceLight(int distanceFromStart, int redLightTime, int greenLightTime) {
        this.distanceFromStart = distanceFromStart;
        this.redLightTime = redLightTime;
        this.greenLightTime = greenLightTime;
    }

    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }

    public int getRedLightTime() {
        return redLightTime;
    }

    public void setRedLightTime(int redLightTime) {
        this.redLightTime = redLightTime;
    }

    public int getGreenLightTime() {
        return greenLightTime;
    }

    public void setGreenLightTime(int greenLightTime) {
        this.greenLightTime = greenLightTime;
    }
    
    
    
}
