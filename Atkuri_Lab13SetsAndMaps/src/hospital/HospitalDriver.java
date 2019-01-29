/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Application launches from this class
 * @author Ashok Atkuri
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException Throws if file is not found
     * @throws hospital.InvalidDoctorSizeException
     * @throws java.text.ParseException Parse the exception if there parsing has
     * problems
     */
    public static void main(String[] args) throws FileNotFoundException, InvalidDoctorSizeException, ParseException {

        //1. Declare and initialize a scanner object "sc" to read from the file "input.txt"
        Scanner stdin = new Scanner(new File("input.txt"));
        //2.Declare variables docname, SpecialityType, officeHours, hospitalName and hospitalAddress of type String.
        String docname, specialityType, officeHours, hospitalName, hospitalAddress;
        // Create an object for AbstarctHospitalInfo with variable name as hospitalInfo and initialize it with OutPatient class.
        AbstractHospitalInfo hospitalInfo = new OutPatient();

        // Read the first and second line and store the data into "hospitalName" and "hospitalAddress"
        hospitalName = stdin.nextLine();
        hospitalAddress = stdin.nextLine();

        System.out.println("****************************************\n"
                + "Patient Details: ");
        //3. while input.txt has more data(While loop starts here) {
        while (stdin.hasNext()) {

            //  If the Passed type is "Doctor" then, Read in the data, and store them to the respective variables such as,
            //  docname, specialityType, officeHours. Initlaize the multiple argument contructor of Doctor class with the mentioned variables.
            String individual = stdin.nextLine();
            if (individual.equals("Doctor")) {
                docname = stdin.nextLine();
                specialityType = stdin.nextLine();
                officeHours = stdin.nextLine();
                Doctor docObj = new Doctor(docname, officeHours, specialityType);
                //  Using a try , catch block add the the doctor to the hospitalInfo. 
                try {
                    hospitalInfo.addDoctors(docObj);
                } catch (InvalidDoctorSizeException ide) {
                    throw ide;
                }

                //  3a. Else store the data into genderstring variable. Now declare a variable gender of type char and store the character at
                //      0th position of genderstring in gender.
            } else {
                System.out.println("****************************************");
                String genderString = individual;
                char gender = genderString.charAt(0);
                //Read the next line and store into a variable age of type int. 
                int age = 0;
                try {
                    age = Integer.parseInt(stdin.nextLine());
                    if (age == 0) {
                        throw new ParseException("Error while parsing Age", 0);
                    }
                } catch (ParseException pe) {
                    throw new ParseException("Error in Parsing data", pe.getErrorOffset());
                }
                //      scan the next four lines and read the first name, last name, insurane Id and doctor to visit of patient.
                String fName = stdin.nextLine(), 
                       lName = stdin.nextLine();
                int insuranceID = Integer.parseInt(stdin.nextLine());
                String doctorToVist = stdin.nextLine();
                //      Create an object for Patient named as patient and initlaize the multiple argument contructor of Patient class with the mentioned variables.
                Patient patient = new Patient(fName, lName, insuranceID, age, gender, doctorToVist);
                //      Create an object for OutPatient named as outPatient and initialize the multiple argument constructor with hospitalName,
                //      hospitalAddress and patient variables.
                OutPatient outPatient = new OutPatient(hospitalName, hospitalAddress, patient);

                //  3a(i) Test the toString method of OutPatient class.
                System.out.println(outPatient);               

                // Assign patient to the doctor from the available doctors list in the hospital info
                // by invoking assignPatientsToDoctor() method on hospitalInfo object
                hospitalInfo.assignPatientsToDoctor(hospitalInfo.getAvailableDoctorsList(), patient);

                //    Create a variable billingDetails of type String and scan the data, also create a variable billGenerated of type double and invoke the calculate bill method
                //    of outPatient using the scanned billing details. Print the bill generated.             
                String billingDetails = stdin.nextLine();
                double billGenerated = outPatient.calcBill(billingDetails);
                System.out.println("Bill Amount Generated before Insurance deduction:" + billGenerated);
                // Create a variable InsuranceCompany of type String and scan the data, also create a variable  
                //InsuranceCoverage of type double and parse the data
                String insuranceCompany = stdin.nextLine();
                double insuranceCoverage = Double.parseDouble(stdin.nextLine());
                // if the age is less than 16
                if (age < 16) {
                    // create an object for ChildInsurance of variable name childInsurance and invoke multiple argument contructor of childInsurance class.
                    ChildInsurance childInsurance = new ChildInsurance(insuranceCompany, insuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVist);
                    //         Test the toString method of child insurance class. Using try catch block invoke the chekcHealthInsurancePlan in childinsurance class and store the returned value in                    
                    //         inusrancePlanName variable of type String,create a variable premiumPaid of type double and scan the data. Now using one more try catch block
                    //         invoke the calcAmountPayableToHospital method of child insurance class and store the returned value in amountPayable variable of type double and print it.
                    System.out.println(childInsurance);
                    String insurancePlanName = "";
                    try {
                        insurancePlanName = childInsurance.checkHealthInsurancePlan();
                    } catch (InvalidInsuranceIDException iiie) {
                        System.out.println(iiie);
                    }
                    double premiumPaid = Double.parseDouble(stdin.nextLine());
                    try {
                        double amountPayable = childInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                        System.out.println("Amount to be paid by after insurance deduction: " + amountPayable);
                    } catch (NegativeAmountException nae) {
                        System.out.println(nae);
                    }
                } // else 
                else {
                    // create an object for AdultInsurance of variable name adultInsurance and invoke multiple argument contructor of AdultInsurance class.
                    AdultInsurance adultInsurance = new AdultInsurance(insuranceCompany, insuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVist);
                    //         Test the toString method of adult insurance class. Using try catch block invoke the chekcHealthInsurancePlan in adultinsurance class and store the returned value in
                    //         inusrancePlanName variable of type String,create a variable premiumPaid of type double and scan the data. Now using one more try catch block
                    //         invoke the calcAmountPayableToHospital method of Adult insurance class and store the returned value in amountPayable variable of type double and print it.
                    System.out.println(adultInsurance);
                    String insurancePlanName = "";
                    try {
                        insurancePlanName = adultInsurance.checkHealthInsurancePlan();
                    } catch (InvalidInsuranceIDException iiie) {
                        System.out.println(iiie);
                    }
                    double premiumPaid = Double.parseDouble(stdin.nextLine());
                    try {
                        double amountPayable = adultInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                        System.out.println("Amount to be paid by after insurance deduction: " + amountPayable);
                    } catch (NegativeAmountException nae) {
                        System.out.println(nae);
                    }
                }
                System.out.println("****************************************");
            }
            // while loop ends
        }

        // print all the Patients assigned to doctor "Lisa DiStefano".
        // For Loop ends
        System.out.println("Patients assigned to doctor \"Lisa DiStefano\": \n"
                + "****************************************");
        for (Doctor d : hospitalInfo.getAvailableDoctorsList()) {
            if (d.getName().equals("Lisa DiStefano")) {
                System.out.println(hospitalInfo.getPatientsMappedToDoctor().get(d));
            }
        }

    }// Main method Ends
}// Class Ends
