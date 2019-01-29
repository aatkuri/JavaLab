/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exceptions.NoFineException;

/**
 * Library represents a building or room containing collections of books,
 * periodicals, and sometimes films and recorded music for people to read,
 * borrow, or refer to.
 * @author Ashok Atkuri
 */
public interface Library {
    /**
     * Represents library code in String and assign "NWM" as its value
     */
    static String LIBRARY_CODE = "NWM";
    
    /**
     * @param dateTime1 Due date of an item in format "MM/dd/yyyy HH:mm:ss"
     * @param dateTime2 Actual return date of an item in format "MM/dd/yyyy
     * HH:mm:ss"
     * @return double - Payable amount to library
     * @throws NoFineException if return date is less than due date
     */
    double calculateFine(java.lang.String dateTime1,
                     java.lang.String dateTime2)
              throws NoFineException;
}
