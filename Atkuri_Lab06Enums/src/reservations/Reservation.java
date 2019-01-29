/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Class for Reservation.
 * @author Ashok Atkuri
 */
public class Reservation {

    private Route route;
    private Airline airline;
    private String cabin;
    private Hotel hotel;
    private Meal meal;

    /**
     * Constructor for class Reservation.
     * @param route Value to initialize the route attribute of type Route. 
     * @param airline Value to initialize the airline attribute of type Airline. 
     * @param cabin Value to initialize the cabin attribute of type String. 
     * @param hotel Value to initialize the route attribute of type Hotel. 
     * @param meal Value to initialize the route attribute of type Meal. 
     */
    public Reservation(Route route, Airline airline, String cabin, Hotel hotel, 
            Meal meal) {
        this.route = route;
        this.airline = airline;
        this.cabin = cabin;
        this.hotel = hotel;
        this.meal = meal;
    }

    /**
     * Gets the value of attribute route.
     * @return The value of type Route.
     */
    public Route getRoute() {
        return route;
    }
    
    /**
     * Method to calculate the Airline fare.
     * @return The double type of the calculated Airline fare.
     */
    public double calcAirlinefare(){
        
        if(this.cabin.equals("ECONOMY"))
        {
            if(!this.route.isWeekend())
                return this.airline.getEconomyPrice() - 
                 (this.airline.getEconomyPrice() * (airline.getDiscount()/100));
            else
                return this.airline.getEconomyPrice();
        }
        else if(this.cabin.equals("BUSINESS"))
        {
            if(!route.isWeekend())
                return this.airline.getBusinessPrice()-
                 (this.airline.getBusinessPrice() * (airline.getDiscount()/100));   
            else
                return this.airline.getBusinessPrice();
        }                
        return 0.0;
    }
    
    /**
     * Method to calculate the Room cost.
     * @return the double type of the calculated Room cost.
     */
    public double calcRoomCost(){
        return this.hotel.getRoomCost();
    }
    
    /**
     * Method to calculate the Meal price.
     * @return the double type of the calculated Meal price.
     */
    public double calcMealPrice(){
        return this.meal.getMealPrice();
    }
    
    /**
     * Method to calculate the Total fare.
     * @return the double type of the calculated Total fare.
     */
    public double calcTotalFare(){
        return calcAirlinefare() + calcMealPrice() + calcRoomCost();
    }

    @Override
    public String toString() {       
        return route.toString() + ", Airline : " + this.airline.name() + ", Cabin : " + this.cabin +
               ", Hotel : " + this.hotel.name() + ", Meal : " + this.meal.name()
               + ", Total fare : $" + calcTotalFare();
    }
    
}
