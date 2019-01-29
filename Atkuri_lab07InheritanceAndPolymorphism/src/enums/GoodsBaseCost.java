/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * ENUM GoodsBaseCost
 * @author Ashok Atkuri
 */
public enum GoodsBaseCost {

    /**
     * InitialCostForLowWeight and initialCostForHeavyWeight of ANIMALS.
     */
    ANIMALS(1000, 2000),

    /**
     * InitialCostForLowWeight and initialCostForHeavyWeight of CHEMICAL.
     */
    CHEMICAL(1000, 3000),

    /**
     * InitialCostForLowWeight and initialCostForHeavyWeight of WOOD.
     */
    WOOD(900, 2000),

    /**
     * InitialCostForLowWeight and initialCostForHeavyWeight of VEHICLES.
     */
    VEHICLES(1100, 2500),

    /**
     * InitialCostForLowWeight and initialCostForHeavyWeight of OTHERS.
     */
    OTHERS(800, 1600);
    
    private final double initialCostForLowWeight;
    private final double initialCostForHeavyWeight;

    private GoodsBaseCost(double initialCostForLowWeight, double initialCostForHeavyWeight) {
        this.initialCostForLowWeight = initialCostForLowWeight;
        this.initialCostForHeavyWeight = initialCostForHeavyWeight;
    }

    /**
     * Getter to return the value of InitialCostForLowWeight
     * @return The value of InitialCostForLowWeight of type double.
     */
    public double getInitialCostForLowWeight() {
        return initialCostForLowWeight;
    }

    /**
     * Getter to return the value of InitialCostForHeavyWeight
     * @return The value of InitialCostForHeavyWeight of type double.
     */
    public double getInitialCostForHeavyWeight() {
        return initialCostForHeavyWeight;
    }
}
