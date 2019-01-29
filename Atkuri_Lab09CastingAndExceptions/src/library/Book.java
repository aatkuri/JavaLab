/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Genre;
import java.util.Random;

/**
 * Book represents a written or printed work consisting of pages glued together
 * along one side and bound in covers
 * @author Ashok Atkuri
 */
public class Book extends Item {
    /**
     * authors An array of Authors
     */
    private Author[] authors;
    /**
     * Copyright year of book
     */
    private int copyrightYear;
    /**
     * Edition of book
     */
    private double edition;
     /**
     * Genre of book
     */
    private Genre genre;
    /**
     * Unique ID of book
     */
    private String bookID;
    /**
     * Rack Number of book in the library
     */
    private String rackNo;
    /**
     * Rack counter initialized to 0
     */
    public static int rackCounter = 0;

    /**
     * Initializes the variables of this class and the super class. Assign
     * <code>generateUniqueID()</code> to <code>bookID</code> and
     * <code>generateRackID()</code> to <code>rackNo</code>.     
     * @param authors An array of Authors
     * @param copyrightYear Copyright year of book
     * @param edition Edition of book
     * @param genre Genre of book
     * @param title title of book
     */
    public Book(Author[] authors, int copyrightYear, double edition, Genre genre, String title) {
        super(title);
        this.authors = authors;
        this.copyrightYear = copyrightYear;
        this.edition = edition;
        this.genre = genre;
        this.bookID = generateUniqueID();
        this.rackNo = generateRackID();
    }   

    /**
     * Returns an array of Author     
     * @return Array Author array
     */
    public Author[] getAuthors() {
        return authors;
    }

    /**
     * Sets Authors of a book
     *
     * @param authors Author array
     */
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    /**
     * Returns the copyright year of the book     
     * @return Integer copyright year
     */
    public int getCopyrightYear() {
        return copyrightYear;
    }

     /**
     * Sets the copyright year of the book
     *
     * @param copyrightYear copyright year of the book
     */
    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

     /**
     * Returns edition of the book 
     * @return double edition of the book
     */
    public double getEdition() {
        return edition;
    }

    /**
     * Sets edition of the book
     *
     * @param edition edition of the book
     */
    public void setEdition(double edition) {
        this.edition = edition;
    }

    /**
     * Returns genre of the book
     *
     * @return Genre genre of the book
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets genre of the book
     *
     * @param genre genre of the book
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * This method generates rack identification number to keep the book at a
     * particular location in the library. The rack ID is generated by using the
     * following algorithm.
     * <br>
     * <br>
     * <i> Generate any two random alphabets in
     * uppercase.rackCounter.copyrightYear </i>
     * <br>
     * Then increment the rackCounter.
     * <br>
     * <br>
     * <h3>Examples</h3>
     * <table border="1" summary="generates rack id">
     * <tbody><tr>
     * <th>Copyright year</th>
     * <th> RackID</th>
     * </tr>
     * <tr>
     * <td> 2011 </td>
     * <td> AT.0.2011  </td>
     * </tr>
     * <tr>
     * <td> 2014 </td>
     * <td> PW.1.2104 </td>
     * </tr>
     * </tbody></table>
     *
     * @return `String RackNo of book
     */
    @Override
    public String generateRackID() {
       String newRackID =  generateRandomCharacter() +""+
                           generateRandomCharacter() +"."+
                           rackCounter +"."+ getCopyrightYear();
       this.rackCounter++;
       return newRackID;
    }

    /**
     * This method concatenates LIBRARY_CODE, "_B_", counter and returns it.     *
     * @return String Unique ID of Book
     */
    @Override
    public String generateUniqueID() {
        return LIBRARY_CODE + "_B_" + counter;
    }
    
    //Method to generate random character.
    private char generateRandomCharacter(){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        int randomNumber = rand.nextInt(26);
        return alphabets.charAt(randomNumber);
    }

    /**
     * Invoke super.toString() and concatenate <code>bookID</code>,
     * <code>rackNo</code>, <code>edition</code> and authors.
     * <br>
     * For Example:
     * <br>
     * <code>
     * Title: THE HUNGER GAMES, Available: false, BookID: NWM_B_1, RackNo: EB.1.2011, Edition: 2.0,
     * Authors: Arml, D. L., Tan, P., Teck, T.
     * </code>
     *
     * @return String representation of Book
     */
    @Override
    public String toString() {
        String authorNames="";
        for(Author a:authors){
            authorNames+=", "+a.toString();
        }
        return super.toString()
                +", BookID: "+bookID
                +", RackNo: "+rackNo
                +", Edition: "+edition
                +", Authors: "+(authors.length>0?authorNames.substring(2):"");
    }        
}