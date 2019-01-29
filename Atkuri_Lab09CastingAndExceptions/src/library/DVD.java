/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.MPAA_Rating;
import static interfaces.Library.LIBRARY_CODE;
import static library.Item.counter;

/**
 * DVD represents a type of compact disc able to store large amounts of data,
 * especially high-resolution audiovisual material
 * @author Ashok Atkuri
 */
public class DVD extends Item {

    /**
     * MPAA rating of DVD
     */
    private MPAA_Rating rating;
    /**
     * Storage capacity of DVD in GB
     */
    private double storageCapacity;
    /**
     * Unique ID of DVD
     */
    private String dvdID;

    /**
     * Initializes the variables of this class and the super class. Assign
     * <code>generateUniqueID()</code> to <code>dvdID</code>.
     *
     * @param rating Rating of DVD
     * @param storageCapacity Storage Capacity of DVD
     * @param title Title of DVD
     */
    public DVD(MPAA_Rating rating, double storageCapacity, String title) {
        super(title);
        this.rating = rating;
        this.storageCapacity = storageCapacity;
        this.dvdID = generateUniqueID();
    }

    /**
     * Returns MPAA rating of DVD
     *
     * @return MPAA_Rating rating of DVD
     */
    public MPAA_Rating getRating() {
        return rating;
    }

     /**
     * Sets MPAA rating of DVD
     *
     * @param rating Rating of DVD
     */
    public void setRating(MPAA_Rating rating) {
        this.rating = rating;
    }

    /**
     * Returns the storage capacity of DVD
     *
     * @return double Storage capacity of DVD
     */
    public double getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * Sets the storage capacity of DVD
     *
     * @param storageCapacity Storage capacity of DVD
     */
    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * This method generates rack identification number to keep the DVD at a
     * particular location in the library. The rack ID is generated by using the
     * following algorithm.
     * <br>
     * <i>Place the first character after the next two characters of DVD title.
     * </i>
     * Repeat the process for each subsequent group of three characters. Ignore
     * any group of fewer than 3 chars at end. At last append the storage
     * capacity as shown below.
     * <br>
     * <br>
     * <h3>Examples</h3>
     * <table border="1" summary="generates rack id">
     * <tbody><tr>
     * <th>Storage Capacity</th>
     * <th>DVD title</th>
     * <th> RackID</th>
     * </tr>
     * <tr>
     * <td> 1.2 </td>
     * <td> chocolate </td>
     * <td> hocolctea.1.2 </td>
     * </tr>
     * <tr>
     * <td> 1.5 </td>
     * <td> sanjay </td>
     * <td> ansayj.1.5 </td>
     * </tr>
     * <tr>
     * <td> 1.4 </td>
     * <td> tcagdo </td>
     * <td> catdog.1.4 </td>
     * </tr>
     * <tr>
     * <td> 2.7 </td>
     * <td> xabxabxabxabxabxabxab </td>
     * <td> abxabxabxabxabxabxabx.2.7 </td>
     * </tr>
     * </tbody></table>
     *
     * @return String Rack ID
     */
    @Override
    public String generateRackID() {
        return formatDVDTitle(this.getTitle()) +"."+ this.getStorageCapacity();
    }

    //Method to format dvd title
    private String formatDVDTitle(String title) {
        String returnString = "";
        for (int i = 0; i < title.length(); i += 3) {
            if (i + 2 < title.length()) {
                returnString += formatString(title.substring(i, i + 2 + 1));
            } else {
                returnString += title.substring(i, title.length());
            }
        }
        return returnString;
    }

    //Method to swap the character of string
    private String formatString(String s) {
        return s.substring(1) + s.charAt(0);
    }

    /**
     * This method concatenates <code>LIBRARY_CODE</code>, "_DVD_",
     * <code>counter</code> and returns it.
     *
     * @return String Unique ID of DVD
     */
    @Override
    public String generateUniqueID() {
        return LIBRARY_CODE + "_DVD_" + counter;
    }

    /**
     * Invoke super.toString() and concatenate <code>dvdID</code>,
     * <code>rating</code> and <code>storageCapacity</code>
     * <br>
     * For example:
     * <br>
     * <code>
     * Title: HarryPoter1, DVD ID: NWM_DVD_3, Rating: R, Storage Capacity: 1.2
     * </code>
     *
     * @return String To string representation of DVD
     */
    @Override
    public String toString() {
        return super.toString()
                + ", DVD ID: "+dvdID
                + ", Rating: "+rating
                + ", Storage Capacity: "+storageCapacity;
    }
}
