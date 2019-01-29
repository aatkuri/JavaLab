/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import interfaces.Library;
import java.util.Date;

/**
 * Item represents a Book, DVD or Device
 * @author Ashok Atkuri
 */
public abstract class Item implements Library {

    /**
     * Counter initialized to zero
     */
    public static int counter;
    /**
     * Available status of an item in library
     */
    private boolean available;
    /**
     * Title of an item
     */
    private String title;

    /**
     * Initializes the title and increments the counter by 1
     *
     * @param title Title of an item
     */
    public Item(String title) {
        this.title = title;
        counter += 1;
    }

    /**
     * Returns the availability status of an item
     *
     * @return boolean availability status
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability status of an item
     *
     * @param available Availability status of an item
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns the title of an item
     *
     * @return String title of an item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of an item
     *
     * @param title title of an item
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * An abstract method to generate rack ID for an item
     * @return  String Rack ID
     */
    public abstract java.lang.String generateRackID();

    /**
     * An abstract method to generate unique ID for an item
     *
     * @return String Unique ID
     */
    public abstract java.lang.String generateUniqueID();

    /**
     * Calculates the fine a member needs to pay to the library in dollars.
     * <br>
     * If return-date (dateTime2) is before due-date (dateTime1),
     * NoFineException is thrown with message "Return date is before due date"
     * <br>
     * Else,
     * <br>
     * If difference between dates is equal to zero then fine is 0.
     * <br>
     * else if difference between dates is is in between [1,7] then fine is $5
     * <br>
     * else if, difference between dates is in between (7,14] then fine is $10
     * <br>
     * else if, difference between dates is in between (14,28] then fine is $20
     * <br>
     * else fine is $100
     *
     * @param dateTime1 Due date of an item in format "MM/dd/yyyy HH:mm:ss"
     * @param dateTime2 Actual return date of an item in format "MM/dd/yyyy
     * HH:mm:ss"
     * @return double Payable amount to library
     * @throws NoFineException if return date(dateTime2) is less than due
     * date(dateTime1)
     */
    @Override
    public double calculateFine(String dateTime1,
            String dateTime2) throws NoFineException {
        Date returnDate = new Date(dateTime1);
        Date dueDate = new Date(dateTime2);
        int daysdiff = 0;
        long diff = returnDate.getTime() - dueDate.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        daysdiff = (int) diffDays;

        if (returnDate.before(dueDate)) {
            throw new NoFineException("Return date is before due date");
        } else {
            if (daysdiff < 1) {
                return 0.0;
            } else if (daysdiff >= 1 && daysdiff <= 7) {
                return 5.0;
            } else if (daysdiff > 7 && daysdiff <= 14) {
                return 10.0;
            } else if (daysdiff > 14 && daysdiff <= 28) {
                return 20.0;
            } else {
                return 100.0;
            }
        }
    }

     /**
     * String representation of Item in given format.
     * <br>
     * For example:
     * <br>
     * <code>
     * Title: The Mummy, Available: true
     * </code>
     *
     * @return String Item details
     */
    @Override
    public String toString() {
        return "Title: " + this.title + ", Available: "
                + (this.available ? "true" : "false");
    }

}
