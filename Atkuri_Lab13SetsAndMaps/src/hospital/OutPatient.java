/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;

/**
 * Contains calculation of assigning patients to doctor and calculation of billing
 * @author Ashok Atkuri
 */
public class OutPatient extends AbstractHospitalInfo {

    private Patient patient;

    /**
     *
     */
    public OutPatient() {
    }

    /**
     *
     * @param hospitalName
     * @param hospitalAddress
     * @param patient
     */
    public OutPatient(String hospitalName, String hospitalAddress, Patient patient) {
        super(hospitalName, hospitalAddress);
        this.patient = patient;
    }

    /**
     *
     * @param billingDetails
     * @return
     */
    @Override
    public double calcBill(String billingDetails) {
        double bill = 0.0;
        String[] items = billingDetails.split(",");
        for (String i : items) {
            if (i != null) {
                switch (i) {
                    case "Diphtheria":
                        bill += 10.25;
                        break;
                    case "Tetanus":
                        bill += 12.99;
                        break;
                    case "Acellular pertussis":
                        bill += 17.89;
                        break;
                    case "Haemophilus influenzae":
                        bill += 7.5;
                        break;
                    case "Pneumococcal conjugate":
                        bill += 9.9;
                        break;
                    default:
                        bill += EMERGENCY_FEE;
                }
            }
        }
        return BASE_CONSULTATION_FEE + bill;
    }
    
    /**
     *
     * @param doctorList
     * @param patient
     */
    @Override
    public void assignPatientsToDoctor(java.util.List<Doctor> doctorList,
                                   Patient patient){
        for(Doctor d:doctorList){
            if(patient.getDoctorToVisit().equals(d.getName())){
                if(super.getPatientsMappedToDoctor().containsKey(d))
                    super.getPatientsMappedToDoctor().get(d).add(patient);
                else{
                    super.getPatientsMappedToDoctor().put(d, new HashSet<>());
                    super.getPatientsMappedToDoctor().get(d).add(patient);
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + patient.toString();
    }   
    
}
