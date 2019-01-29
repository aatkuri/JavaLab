/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * Author represents a writer of a book
 * @author Ashok Atkuri
 */
public class Author {
    /**
     * First name of the Author
     */
    private String firstName;
    /**
     * Middle name of the Author
     */
    private String middleName;
    /**
     * Last name of the Author
     */
    private String lastName;    

    /**
     * Initializes the variables of Author     
     * @param firstName first name of the Author
     * @param lastName last name of the Author
     */
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Initializes the variables of Author     
     * @param firstName first name of the Author
     * @param lastName middle name of the Author
     * @param middleName last name of the Author
     */
    public Author(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    /**
     * Returns the first name of the Author     
     * @return String first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the Author     
     * @param firstName first name of the Author
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the Middle name of the Author     
     * @return String Middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name of the Author     
     * @param middleName middle name of the Author
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Returns the last name of the Author     
     * @return String last name
     */
    public String getLastName() {
        return lastName;
    }

     /**
     * Sets the last name of the Author     
     * @param lastName - last name of the Author
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns private instance variables in given format. For example: If
     * firstName is "Alfred", middleName is "Lord" and lastName is "Tennyson" it
     * returns "Tennyson, A. L." If there is no middleName, it returns
     * "Tennyson, A."     *
     * @return String representation of Author name
     */
    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName.toUpperCase().charAt(0) + 
               (this.middleName != null ? ". " +
                this.middleName.toUpperCase().charAt(0) + "." : ".");                 
    }
}
