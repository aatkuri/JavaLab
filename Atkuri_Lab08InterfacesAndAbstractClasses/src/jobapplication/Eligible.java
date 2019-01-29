/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This interface is used to check the eligibility of a applicant by checking 
 * the applicants qualification and age.
 * @author Ashok Atkuri
 */
public interface Eligible {

    /**
     * This abstract method is used to check the Qualification of the applicant. 
     * This will be implemented in Application class
     * @return a value of type boolean
     */
    boolean checkAge();

    /**
     * This abstract method checks the age of the applicant. This will be 
     * implemented in Application class
     * @return a value of type boolean
     */
    boolean checkQualification();
}
