/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This class contains the Supervisor details
 * @author Ashok Atkuri
 */
public class Supervisor extends Person{

    /**
     * no-argument constructor that calls the super class no-argument 
     * constructor
     */
    public Supervisor() {
    }

    /**
     * Four argument constructor that initializes the super class instance 
     * variables
     * @param firstName contains the firstName of the supervisor
     * @param lastName contains the lastName of the supervisor
     * @param phoneNumber contains the phoneNumber of the supervisor
     * @param emailID contains the emailID of the supervisor
     */
    public Supervisor(String firstName, String lastName, String phoneNumber, String emailID) {
        super(firstName, lastName, phoneNumber, emailID);
    }

    /**
     * This method should return the name of the supervisor. 
     * Refer to the sample output that prints the name of the supervisor to 
     * know the forma
     * @return a value of type String
     */
    @Override
    public String getFullName() {
        return super.firstName + " " + super.lastName 
               +" ( "+ super.firstName.trim().toUpperCase().charAt(0)
               +"." + super.lastName.trim().toUpperCase().charAt(0) + " )";
    }

     /**
     * This method return the full name of the supervisor and invoke the super 
     * class toString()
     * @return a value of type String
     */
    @Override
    public String toString() {
        return "supervisor Details:\n" +
               "Name of the supervisor: " + this.getFullName() +
               "\nContact Details: " + super.toString();
    }
}
