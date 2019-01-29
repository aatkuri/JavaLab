/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Enumeration of Airline.
 * @author Ashok Atkuri.
 */
public enum Airline {

    /**
     * DELTA Airline Economy class price, Business class price and Discount.
     */
    DELTA(750, 1500, 10),

    /**
     * US_AIRWAYS Airline Economy class price, Business class price and Discount.
     */
    US_AIRWAYS(570, 1400, 11),

    /**
     * UNITED Airline Economy class price, Business class price and Discount.
     */
    UNITED(700, 1450, 9),

    /**
     * CATHAY_PACIFIC Airline Economy class price, Business class price and Discount.
     */
    CATHAY_PACIFIC(710, 1480, 8),

    /**
     * AIR_CANADA Airline Economy class price, Business class price and Discount.
     */
    AIR_CANADA(640, 1590, 10),

    /**
     * AMERICAN_AIRLINES Airline Economy class price, Business class price and Discount.
     */
    AMERICAN_AIRLINES(560, 1200, 6),

    /**
     * AIR_FRANCE Airline Economy class price, Business class price and Discount.
     */
    AIR_FRANCE(450, 1100, 5),

    /**
     * AIR_INDIA Airline Economy class price, Business class price and Discount.
     */
    AIR_INDIA(590, 1080, 9),

    /**
     * JETBLUE Airline Economy class price, Business class price and Discount.
     */
    JETBLUE(430, 890, 5),

    /**
     * QANTAS Airline Economy class price, Business class price and Discount.
     */
    QANTAS(670, 1200, 9);

    private final double economyPrice;
    private final double businessPrice;
    private final double discount;

    //Private constructor for enum Airline.
    private Airline(double economyPrice, double businessPrice, double discount) 
    {
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.discount = discount;
    }

    /**
     * Gets the price of Economy class. 
     * @return Double value of economy class price.
     */
    public double getEconomyPrice() {
        return economyPrice;
    }

    /**
     * Gets the price of Business class. 
     * @return Double value of business class price.
     */
    public double getBusinessPrice() {
        return businessPrice;
    }

    /**
     * Gets the value of Discount. 
     * @return Double value of discount.
     */
    public double getDiscount() {
        return discount;
    }
}
