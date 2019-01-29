/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This abstract class will have the details of a Person like first name, last name, phone number, emailID
 * @author Ashok Atkuri
 */
public abstract class Person {
    /**
     * stores the firstName of the person
     */
    String firstName;
    /**
     * stores the lastName of the person
     */
    String lastName;
    /**
     * stores the phone number of the person
     */
    String phoneNumber;
    /**
     * 	stores the email ID of the person
     */
    String emailID;

    /**
     * no-argument constructor initializes all the instant variables to 
     * default values.
     */
    public Person() {
    }

    /**
     * Four Parameterized constructor initializes the instant variables
     * @param firstName contains the firstName of the person
     * @param lastName contains the lastName of the person
     * @param phoneNumber contains the phone number of the person
     * @param emailID contains the emailID of the person
     */
    public Person(String firstName, String lastName, String phoneNumber, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }

    /**
     * Getter method to access the firstName
     * @return a value of type string
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method to set the firstName with the argument passed to the method
     * @param firstName the argument to the method
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter method to access the lastName
     * @return a value of type string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method to set the lastName of the person with the argument 
     * passed to the method
     * @param lastName the argument to the method
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter method to access the phone number
     * @return a value of type string
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method to set the phone number of the person with the argument 
     * passed to the method
     * @param phoneNumber the argument to the method
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter method to get the emailD of the person
     * @return a value of type string
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * Setter method to set the emilID of the person with the argument passed 
     * to the method
     * @param emailID the argument to the method
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    /**
     * This method will format the phone number entered by the user, 
     * in the format of +1(xxx)xxx-xxxx
     * @param phoneNumber the argument to the method which is of type String
     * @return formatted phone number of type String
     */
    public String getFormattedPhoneNumber(String phoneNumber){
        return "+1"+"(".concat(phoneNumber.substring(0, 3)).concat(")")
               .concat(phoneNumber.substring(3, 6)).concat("-")
               .concat(phoneNumber.substring(6, 10));
    }
    
    /**
     * Abstract method to get the full name of the method that will be 
     * implemented in Applicant and Supervisor
     * @return a value of type string
     */
    public abstract String getFullName();

    /**
     * This toString method returns Contact details
     * (emailID and formatted phone number) of type String
     * @return  a value of type String
     */
    @Override
    public String toString() {
        return  emailID +", "+ this.getFormattedPhoneNumber(this.phoneNumber);
    }
}
