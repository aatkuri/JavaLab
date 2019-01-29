/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * Class to represent individual card.
 * @author Ashok Atkuri
 */
public class Card {
    private int number;
    private String type;

    /**
     * Constructor which initializes attributes with given parameters.
     * @param number
     * @param type
     */
    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    /**
     * Getter to return the value on card.
     * @return Integer Returns number on Card.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter to set the value of Card.
     * @param number to set the value of Card.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter to return the value of type of card.
     * @return String Returns the type of Card.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter to set the value of Type.
     * @param type to set the value of type of Card.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }
}
