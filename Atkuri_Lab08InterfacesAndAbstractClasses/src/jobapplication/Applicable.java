/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This interface is used to check whether the applicant is applicable to apply for the job or not
 * @author Ashok Atkuri
 */
public interface Applicable {

    /**
     * This abstract method returns true if the candidate passes the background check else false.
     * @return whether the applicant is eligible or not eligible of type String
     */
    boolean haveAGoodBackGround();

    /**
     * This abstract method returns true if the candidate passes the background check else false.
     * @return true if the candidate passes the background check, of type a boolean.
     */
    String verifyBackGround();
}
