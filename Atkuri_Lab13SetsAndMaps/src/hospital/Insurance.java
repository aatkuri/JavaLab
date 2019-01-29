/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Contains insurance details
 * @author Ashok Atkuri
 */
public interface Insurance {

    /**
     *
     */
    static double BASE_PREMIUM_AMOUNT = 600.00;

    /**
     *
     * @return
     * @throws InvalidInsuranceIDException
     */
    String checkHealthInsurancePlan()
                                   throws InvalidInsuranceIDException;

    /**
     *
     * @param PremiumPaid
     * @param billGenerated
     * @return
     * @throws NegativeAmountException
     */
    double calcAmountPayableToHospital(double PremiumPaid,
                                   double billGenerated)
                            throws NegativeAmountException;    
}
