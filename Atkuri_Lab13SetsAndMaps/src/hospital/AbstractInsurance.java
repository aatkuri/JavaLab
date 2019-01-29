/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Contains insurance details and checks the health insurance plans.
 * @author Ashok Atkuri
 */
public abstract class AbstractInsurance extends Patient
implements Insurance {
    private String InsuranceCompanyName;
    private double InsuranceCoverage;

    /**
     * Initializes all the variables in Patient and AbstractInsurance.
     * @param InsuranceCompanyName - Name of the Insurance Company
     * @param InsuranceCoverage - Insurance coverage
     * @param fName - First Name
     * @param lName - Last Name
     * @param insuranceID - Insurance id of the patient
     * @param age - Age of the Patient
     * @param gender - Gender of the Patient
     * @param doctorToVisit - Name of the doctor to visit
     */
    public AbstractInsurance(String InsuranceCompanyName, double InsuranceCoverage, String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        super(fName, lName, insuranceID, age, gender, doctorToVisit);
        this.InsuranceCompanyName = InsuranceCompanyName;
        this.InsuranceCoverage = InsuranceCoverage;
    }

    /**
     * Returns the name of the insurance company
     * @return Insurance company name
     */
    public String getInsuranceCompanyName() {
        return InsuranceCompanyName;
    }

    /**
     * Return the insurance coverage value
     * @return Insurance Coverage
     */
    public double getInsuranceCoverage() {
        return InsuranceCoverage;
    }
    
    /**
     *Checks the insurance plan based on the range of the insurance ID. 
      If the insurance id is greater than 0 and and less than 10000 then insurance plan is "Health maintenance organizations (HMOs) plan". 
      Else if the insurance id is greater than or equal to 10000 and less than 20000 then the insurance plan is "Preferred provider organizations (PPOs) plan". 
      Else if the insurance id is greater than or equal to 20000 and less than 30000 then the insurance plan is "Point-of-service (POS) plan". 
      Else if the insurance id is greater than or equal to 30000 and less than 40000 then the insurance plan is "High-deductible health plans (HDHPs)"
     * @return Insurance Plan
     * @throws InvalidInsuranceIDException - Throws if the invalid insurance id is passed
     */
    @Override
    public String checkHealthInsurancePlan()
                                          throws InvalidInsuranceIDException {
        if(getInsuranceID() > 0 && getInsuranceID() < 10000 )
            return "Health maintenance organizations (HMOs) plan";
        else if(getInsuranceID() > 10000  && getInsuranceID() < 20000)
            return "Preferred provider organizations (PPOs) plan";
        else if(getInsuranceID() > 20000  && getInsuranceID() < 30000)
            return "Point-of-service (POS) plan";
        else if(getInsuranceID() > 30000  && getInsuranceID() < 40000)
            return "High-deductible health plans (HDHPs)";
        else 
            throw new InvalidInsuranceIDException();
    }    
    
    /**
     * Abstract method to calculate the amount payable to hospital
     * @param PremiumPaid - Premium paid to the Hospital
     * @param billGenerated - Bill that has generated
     * @return Amount payable to hospital
     * @throws NegativeAmountException - Throws if the amount is is negative values
     */
    @Override
    public abstract double calcAmountPayableToHospital(double PremiumPaid,
                                                   double billGenerated)
                                            throws NegativeAmountException;
}
