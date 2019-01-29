/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Contains Hospital information
 * @author Ashok Atkuri
 */
public interface Hospital {

    /**
     *
     */
    static double EMERGENCY_FEE = 30.0;

    /**
     *
     */
    static double BASE_CONSULTATION_FEE = 20.0;
    
    /**
     *
     * @param billingDetails
     * @return
     */
    double calcBill(java.lang.String billingDetails);

    /**
     *
     * @param doctorList
     * @param patient
     */
    void assignPatientsToDoctor(java.util.List<Doctor> doctorList,
                            Patient patient);
}
