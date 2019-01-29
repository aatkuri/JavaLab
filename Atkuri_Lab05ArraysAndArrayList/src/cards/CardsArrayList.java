/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 * Class to store Cards using Lists.
 * @author Ashok Atkuri 
*/
public class CardsArrayList {
    private ArrayList<Card> clubs;
    private ArrayList<Card> diamonds;
    private ArrayList<Card> hearts;
    private ArrayList<Card> spades;

    /**
     *Constructor with no - arguments.
     */
    public CardsArrayList() {
        clubs = new  ArrayList<Card>();
        diamonds = new  ArrayList<Card>();
        hearts = new  ArrayList<Card>();
        spades = new  ArrayList<Card>();
    }

    /**
     * Getter to return the list of Clubs.
     * @return List Returns list of Clubs.
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     * Getter to return the list of Diamonds.
     * @return List Returns list of Diamonds.
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     * Getter to return the list of Hearts.
     * @return List Returns list of Hearts.
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     * Getter to return the list of Spades.
     * @return List Returns list of Spades.
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }
    
    /**
     * Method to add the card to its respective List.
     * @param c Card to add its respective List.
     * @return String Returns a card which is added to list if addition is successful.
     */
    public String addCardsToList(Card c){
        String message = null;
        
        switch (c.getType().toLowerCase()) {
            case "clubs":
                this.clubs.add(c);
                message = c.toString() + "added successfully";
                break;
            case "diamonds":
                this.diamonds.add(c);
                message = c.toString() + "added successfully";
                break;
            case "hearts":
                this.hearts.add(c);
                message = c.toString() + "added successfully";
                break;
            case "spades":
                this.spades.add(c);
                message = c.toString() + "added successfully";
                break;
            default:
                message = c.toString() + "is not a valid card.";
                break;
        }        
        return message;
    }
    
    /**
     * Method to remove the card from the given position in respective card type.
     * @param position Position to remove in Deck.
     * @param c Card Type to remove.
     * @return String Returns the removed card from list.
     */
    public String removeCardsFromList(int position, ArrayList<Card> c){
    
        if(position < 0 || position >= c.size())
            return "ArrayList size underflow, card cannot be removed.";
        else
        {
            return c.remove(position).toString() + "Card is removed successfully!";
        }
    }

    @Override
   public String toString(){
       return "Hearts ArrayList:[ "+this.getCards(hearts)+" ]"
                + "\nDiamonds ArrayList:[ "+this.getCards(diamonds)+" ]"
                + "\nSpades ArrayList:[ "+this.getCards(spades)+" ]"
                + "\nClubs ArrayList:[ "+this.getCards(clubs)+" ]";
       
   }
   
   private String getCards(ArrayList<Card> cards){
       String cardNumbers = "";
       for(Card c:cards){
           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers.trim();
   }
}
