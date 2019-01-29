/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * Class to store cards using Arrays.
 * @author Ashok Atkuri
 */
public class CardsArray {
    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    private static final  int DECK_SIZE = 5;
    private int clubsCount;
    private int diamondsCount;
    private int heartsCount;
    private int spadesCount;

    /**
     *Constructor with no arguments.
     */
    public CardsArray() {
        this.clubs = new Card[DECK_SIZE];
        this.diamonds = new Card[DECK_SIZE];
        this.hearts = new Card[DECK_SIZE];
        this.spades = new Card[DECK_SIZE];
        this.clubsCount = this.diamondsCount = this.heartsCount 
                 = this.spadesCount = 0;
    }

    /**
     * Getter to return the value of Clubs count.
     * @return integer count of Clubs.
     */
    public int getClubsCount() {
        return clubsCount;
    }

    /**
     * Getter to return the value of Diamonds count.
     * @return integer count of Diamonds.
     */
    public int getDiamondsCount() {
        return diamondsCount;
    }

    /**
     * Getter to return the value of Hearts count.
     * @return integer count of Hearts.
     */
    public int getHeartsCount() {
        return heartsCount;
    }

    /**
     * Getter to return the value of Spades count.
     * @return integer count of Spades.
     */
    public int getSpadesCount() {
        return spadesCount;
    }
    
    /**
     * Method to add a card to the respective array based on the type of the card.
     * @param c Card to add to its respective array.
     */
    public void addCardsToArray(Card c){
        switch(c.getType()){
            case "clubs" : 
                if(clubsCount<DECK_SIZE){
                    clubs[clubsCount] = c;
                    clubsCount += 1;
                }
                else{
                    removeCardsFromArray(0,"clubs");
                    addCardsToArray(c);
                }
                break;
            case "diamonds" : 
                if(diamondsCount<DECK_SIZE){
                    diamonds[diamondsCount] = c;
                    diamondsCount += 1;
                }
                else{
                    removeCardsFromArray(0,"diamonds");
                    addCardsToArray(c);
                }
                break;
            case "hearts" :
                if(heartsCount<DECK_SIZE){
                    hearts[heartsCount] = c;
                    heartsCount += 1;
                }
                else{
                    removeCardsFromArray(0,"hearts");
                    addCardsToArray(c);
                }
                break;
            case "spades" : 
                if(spadesCount<DECK_SIZE){
                    spades[spadesCount] = c;
                    spadesCount += 1;
                }
                else{
                    removeCardsFromArray(0,"spades");
                    addCardsToArray(c);
                }
                break;
            default : 
                break;
        }
    }    
    
    /**
     * Method to remove the card from the given position in respective card type.
     * @param position Position to remove in Deck.
     * @param cardType Card Type to remove.
     */
    public void removeCardsFromArray(int position, String cardType)
    {
        switch (cardType.toLowerCase()) {
            case "clubs":
                if(position <= this.clubsCount && position >= 0)
                {
                    remove(position,this.clubs,this.clubsCount);
                    this.clubsCount -= 1;                    
                }                
                break;
            case "diamonds":
                if(position <= this.diamondsCount && position >= 0)
                {
                    remove(position,this.diamonds,this.diamondsCount);
                    this.diamondsCount -= 1;                    
                }   
                
                break;
            case "hearts":
                if(position <= this.heartsCount && position >= 0)
                {
                    remove(position,this.hearts,this.heartsCount);
                    this.heartsCount -= 1;                    
                }   
                
                break;
            case "spades":
                if(position <= this.spadesCount && position >= 0)
                {
                    remove(position,this.spades,this.spadesCount);
                    this.spadesCount -= 1;                    
                }   
                
                break;
            default:
                
                break;
        } 
    }
    
    private void remove(int position, Card[] cardArray, int count)
    {
      for( int i = position; i < count - 1 ; i++)
      {
          cardArray[i] = cardArray[i + 1];
      }
      cardArray[count - 1] = null;
    }    
    
   @Override
   public String toString(){
       return "\nHearts Array:[ "+this.getCards(hearts)+" ]"
                + "\nDiamonds Array:[ "+this.getCards(diamonds)+" ]"
                + "\nSpades Array:[ "+this.getCards(spades)+" ]"
                + "\nClubs Array:[ "+this.getCards(clubs)+" ]";
       
   }
   
   private String getCards(Card[] cards){
       String cardNumbers = "";
       for(Card c:cards){
           if(c!=null)
           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers.trim();
   }
}
