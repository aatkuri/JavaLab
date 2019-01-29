/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Contains child insurance details
 *
 * @author Ashok Atkuri
 */
public class ChildInsurance extends AbstractInsurance {

    /**
     * Initializes the variables by calling super class constructor
     *
     * @param InsuranceCompanyName - Name of the insurance company
     * @param InsuranceCoverage - Insurance coverage for an adult
     * @param fName - First Name of the Adult
     * @param lName - Last Name of the Adult
     * @param insuranceID - Insurance ID of the Adult
     * @param age - Age of the adult in years
     * @param gender - Gender of the adult
     * @param doctorToVisit - Name of the doctor to visit
     */
    public ChildInsurance(String InsuranceCompanyName, double InsuranceCoverage, String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        super(InsuranceCompanyName, InsuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVisit);
    }

    /**
     * Calculates the amount payable to hospital by the child customer. If the
     * premium paid by the customer is less than zero exception is thrown. Else
     * if premium paid by customer is greater than base premium amount then
     * amount payable is 0.8 times of bill generated. Else if premium paid by
     * customer is less than or equal to base premium amount and premium paid by
     * the customer is greater than half of base premium amount, amount payable
     * is 0.5 times of bill generated. Else amount payable is 0.2 times of bill
     * generated.
     *
     * @param PremiumPaidByCustomer - Premium paid by the child in dollars
     * @param billGenerated - Bill generated in the hospital in dollars
     * @return Amount a child needs to pay to the hospital(Amount payable) in
     * dollars
     * @throws NegativeAmountException - If premium paid by the customer is less
     * than zero then this exception is thrown
     */
    @Override
    public double calcAmountPayableToHospital(double PremiumPaidByCustomer,
            double billGenerated)
            throws NegativeAmountException {
        if (PremiumPaidByCustomer < 0) {
            throw new NegativeAmountException();
        } else if (PremiumPaidByCustomer > BASE_PREMIUM_AMOUNT) {
            return 0.8 * billGenerated;
        } else if (PremiumPaidByCustomer <= BASE_PREMIUM_AMOUNT && PremiumPaidByCustomer > (0.5 * BASE_PREMIUM_AMOUNT)) {
            return 0.5 * billGenerated;
        } else {
            return 0.2 * billGenerated;
        }
    }

    @Override
    public String toString() {
        return "Insurance Company Name: " + getInsuranceCompanyName()
                + ", Insurance Coverage: " + getInsuranceCoverage();
    }
}
