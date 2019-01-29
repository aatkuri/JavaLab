/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This interface is used to check whether the job is available or not
 * @author Ashok Atkuri
 */
public interface Available extends Applicable, Eligible {

    /**
     * This abstract method checks whether the job is available or not based on 
     * the closing date of the job. This will be implemented in 
     * Application class.
     * @return a value of type String
     */
    String checkAvailabilityOfJob();
}
