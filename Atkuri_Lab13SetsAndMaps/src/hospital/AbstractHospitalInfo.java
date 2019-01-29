/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Adds the doctors and contains information of the hospital
 * @author Ashok Atkuri
 */
public abstract class AbstractHospitalInfo implements Hospital {
    private String hospitalName;
    private String hospitalAddress;
    private List<Doctor> availableDoctorsList;
    private HashMap<Doctor,HashSet<Patient>> patientsMappedToDoctor;
    
    /**
     * Initializes available doctors list to new Array list. 
     * Also initializes patients mapped to doctor to new HashMap.
     */
    public AbstractHospitalInfo(){
        this.availableDoctorsList = new ArrayList<Doctor>();
        this.patientsMappedToDoctor = new HashMap<Doctor,HashSet<Patient>>();
    }

    /**
     * Assigns each of the parameter value to the respective attributes.
     * availableDoctorsList is initialized to empty array list and patientsMappedToDoctor is initialized to an empty Hash map
     * @param hospitalName Name of the hospital
     * @param hospitalAddress Address of the hospital
     */
    public AbstractHospitalInfo(String hospitalName, String hospitalAddress) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.availableDoctorsList = new ArrayList<Doctor>();
        this.patientsMappedToDoctor = new HashMap<Doctor,HashSet<Patient>>();
    }

    /**
     * Returns the name of the hospital
     * @return Name of hospital
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Returns the address of the hospital
     * @return Hospital Address
     */
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    /**
     * Returns the List of available doctors
     * @return Doctors List
     */
    public List<Doctor> getAvailableDoctorsList() {
        return availableDoctorsList;
    }
    
    /**
     * Sets the available list of doctors
     * @param availableDoctorsList availableDoctorsList - Available doctors list
     */
    public void setAvailableDoctorsList(List<Doctor> availableDoctorsList) {
        this.availableDoctorsList = availableDoctorsList;
    } 

    /**
     * Returns the Hash map of patients mapped to doctor
     * @return patients mapped to Doctor
     */
    public HashMap<Doctor, HashSet<Patient>> getPatientsMappedToDoctor() {
        return patientsMappedToDoctor;
    }   
    
    /**
     * Returns the Emergency fee in dollars
     * @return Emergency fee
     */
    public static double getEMERGENCY_FEE(){
        return EMERGENCY_FEE;
    }
    
    /**
     * Returns the base consultation fee in dollars
     * @return Consultation fee
     */
    public static double getBASE_CONSULTATION_FEE(){
        return BASE_CONSULTATION_FEE;
    }     
    
    /**
     * Adds doctors to the getAvailableDoctorsList
     * @param doctor - doctor of type Doctor
     * @throws InvalidDoctorSizeException - Throws if the doctors list size is less than 0.
     */
    public void addDoctors(Doctor doctor)
                throws InvalidDoctorSizeException{
        if(getAvailableDoctorsList().size() < 0)
            throw  new InvalidDoctorSizeException();
        this.getAvailableDoctorsList().add(doctor);
    }
    
    /**
     * Calculates bill in dollars that a patient needs to pay
     * @param billingDetails - Details of the bill
     * @return Bill amount a patient needs to pay
     */
    public abstract double calcBill(java.lang.String billingDetails);
    
    /**
     * Assign patients to doctor.
     * @param doctorList - List of doctors
     * @param patient - contains patient details
     */
    public abstract void assignPatientsToDoctor(java.util.List<Doctor> doctorList,
                                            Patient patient);

    @Override
    public String toString() {
        return "HospitalName: " +this.hospitalName + ", HospitalAddress: " + this.hospitalAddress;
    }   
    
}
