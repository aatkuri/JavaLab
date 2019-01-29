/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Contains the details of the doctor
 * @author Ashok Atkuri
 */
public class Doctor {
    private String name;
    private String SpecialityType;
    private String officeHours;

    /**
     * Initializes the variables of this class
     * @param name - name of the doctor
     * @param SpecialityType - Specialization of the doctor
     * @param officeHours - Office hours of the doctor
     */
    public Doctor(String name, String SpecialityType, String officeHours) {
        this.name = name;
        this.SpecialityType = SpecialityType;
        this.officeHours = officeHours;
    }

    /**
     * Returns the name of the doctor
     * @return Name of doctor
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the speciality type of the doctor
     * @return Specialization
     */
    public String getSpecialityType() {
        return SpecialityType;
    }

    /**
     * Returns the office hours of the doctor
     * @return Office hours
     */
    public String getOfficeHours() {
        return officeHours;
    }
    
    
}
