/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Class contains patient details
 * @author Ashok Atkuri
 */
public class Patient {
    private String fName;
    private String lName;
    private int insuranceID;    
    private int age;
    private char gender;
    private String doctorToVisit;

    /**
     *
     */
    public Patient() {
    }

    /**
     *
     * @param fName
     * @param lName
     * @param insuranceID
     * @param age
     * @param gender
     * @param doctorToVisit
     */
    public Patient(String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        this.fName = fName;
        this.lName = lName;
        this.insuranceID = insuranceID;
        this.age = age;
        this.gender = gender;
        this.doctorToVisit = doctorToVisit;
    }

    /**
     *
     * @return
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     *
     * @return
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     *
     * @return
     */
    public int getInsuranceID() {
        return insuranceID;
    }

    /**
     *
     * @param insuranceID
     */
    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public char getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public String getDoctorToVisit() {
        return doctorToVisit;
    }

    @Override
    public String toString() {
        return "\nFirst Name: " +this.fName+
               "\nLast Name: " +this.lName+
               "\nInsurance ID: " +this.insuranceID+ 
               "\nAge: " +this.age+
               "\nGender: " +this.gender;
    }
}
