/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * Device list represents a list of devices the library issued to the members.
 * This is an Anonymous Class.
 * @author Ashok Atkuri
 */
public abstract class AnonymousDeviceList {

    public AnonymousDeviceList() {
    }
    
    /**
     * Method that is used to collect all the devices issued to the members
     *
     * @return String device list
     */
    public abstract String deviceList();
}
