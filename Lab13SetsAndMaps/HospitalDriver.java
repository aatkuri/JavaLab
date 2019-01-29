/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


/**
 * Application launches from this class
 *
 * @author Instructor
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException Throws if file is not found
     * @throws java.text.ParseException Parse the exception if there parsing has
     * problems
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //1. Declare and initialize a scanner object "sc" to read from the file "input.txt"
        
        //2.Declare variables docname, SpecialityType, officeHours, hospitalName and hospitalAddress of type String.
        // Create an object for AbstarctHospitalInfo with variable name as hospitalInfo and initialize it with OutPatient class.
        // Read the first and second line and store the data into "hospitalName" and "hospitalAddress"
        
       
        //3. while input.txt has more data(While loop starts here) {
        //  If the Passed type is "Doctor" then, Read in the data, and store them to the respective variables such as,
        //  docname, specialityType, officeHours. Initlaize the multiple argument contructor of Doctor class with the mentioned variables.
        //  Using a try , catch block add the the doctor to the hospitalInfo. 
        //  3a. Else store the data into genderstring variable. Now declare a variable gender of type char and store the character at
        //      0th position of genderstring in gender.
        //      Read the next line and store into a variable age of type int. 
        //      scan the next four lines and read the first name, last name, insurane Id and doctor to visit of patient.
        //      Create an object for Patient named as patient and initlaize the multiple argument contructor of Patient class with the mentioned variables.
        //      Create an object for OutPatient named as outPatient and initialize the multiple argument constructor with hospitalName,
        //      hospitalAddress and patient variables.
        
                
                //  3a(i) Test the toString method of OutPatient class.
                // Assign patient to the doctor from the available doctors list in the hospital info
                // by invoking assignPatientsToDoctor() method on hospitalInfo object
               

                //    Create a variable billingDetails of type String and scan the data, also create a variable billGenerated of type double and invoke the calculate bill method
                //    of outPatient using the scanned billing details. Print the bill generated.             
                
                
                
                // Create a variable InsuranceCompany of type String and scan the data, also create a variable  
                //InsuranceCoverage of type double and parse the data
                
                // if the age is less than 16
                // create an object for ChildInsurance of variable name childInsurance and invoke multiple argument contructor of childInsurance class.
                //         Test the toString method of child insurance class. Using try catch block invoke the chekcHealthInsurancePlan in childinsurance class and store the returned value in
                //         inusrancePlanName variable of type String,create a variable premiumPaid of type double and scan the data. Now using one more try catch block
                //         invoke the calcAmountPayableToHospital method of child insurance class and store the returned value in amountPayable variable of type double and print it.
                // else 
                // create an object for AdultInsurance of variable name adultInsurance and invoke multiple argument contructor of AdultInsurance class.
                    //         Test the toString method of adult insurance class. Using try catch block invoke the chekcHealthInsurancePlan in adultinsurance class and store the returned value in
                    //         inusrancePlanName variable of type String,create a variable premiumPaid of type double and scan the data. Now using one more try catch block
                    //         invoke the calcAmountPayableToHospital method of Adult insurance class and store the returned value in amountPayable variable of type double and print it.
                
        // while loop ends
            
           
        // print all the Patients assigned to doctor "Lisa DiStefano".
        // For Loop ends
            
         
        }// Main method Ends
     }// Class Ends
