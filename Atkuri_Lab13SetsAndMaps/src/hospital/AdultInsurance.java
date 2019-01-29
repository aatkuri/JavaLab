/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Class contains details of adult insurance
 *
 * @author Ashok Atkuri
 */
public class AdultInsurance extends AbstractInsurance {

    /**
     * Initializes the variables by calling the super class constructor
     *
     * @param InsuranceCompanyName - Name of the insurance company
     * @param InsuranceCoverage - Insurance coverage for an adult
     * @param fName - First Name of the Adult
     * @param lName - Last Name of the Adult
     * @param insuranceID - Insurance ID of the Adult
     * @param age - Age of the adult
     * @param gender - Gender of the adult
     * @param doctorToVisit - Name of the doctor to visit
     */
    public AdultInsurance(String InsuranceCompanyName, double InsuranceCoverage, String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        super(InsuranceCompanyName, InsuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVisit);
    }

    /**
     * Calculates the amount payable to hospital by the adult customer. If the
     * premium paid by the customer is less than zero exception is thrown. Else
     * if premium paid by customer is greater than base premium amount then
     * amount payable is 0.75 times of bill generated. Else if premium paid by
     * customer is less than or equal to base premium amount and premium paid by
     * the customer is greater than half of base premium amount, amount payable
     * is 0.45 times of bill generated. Else amount payable is equal to bill
     * generated.
     *
     * @param PremiumPaidByCustomer - Premium paid by the adult in dollars
     * @param billGenerated - Bill generated in the hospital in dollars
     * @return Amount an adult needs to pay to the hospital(Amount payable)
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
            return 0.75 * billGenerated;
        } else if (PremiumPaidByCustomer <= BASE_PREMIUM_AMOUNT && PremiumPaidByCustomer > (0.5 * BASE_PREMIUM_AMOUNT)) {
            return 0.45 * billGenerated;
        } else {
            return billGenerated;
        }
    }

    @Override
    /*
    *Returns Insurance company name and Insurance coverage in given format. 
     For example: 
     Insurance Company Name: Lewermark Insurance, Insurance Coverage: 500.0
     */
    public String toString() {
        return "Insurance Company Name: " + getInsuranceCompanyName()
                + ", Insurance Coverage: " + getInsuranceCoverage();
    }
}
