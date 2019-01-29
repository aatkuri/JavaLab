/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Enumeration of Meal.
 * @author Ashok Atkuri
 */
public enum Meal {

    /**
     * Cost of VEG meal.
     */
    VEG(10),

    /**
     * Cost of NON_VEG meal.
     */
    NON_VEG(11),

    /**
     * Cost of HINDU_MEAL meal.
     */
    HINDU_MEAL(13),

    /**
     * NO meal selected.
     */
    NO(0);

    private final double mealPrice;

    //private constructor for enum Meal.
    private Meal(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    /**
     * Gets the cost of the selected meal.
     * @return Double type meal price value.
     */
    public double getMealPrice() {
        return mealPrice;
    }   
   
}
