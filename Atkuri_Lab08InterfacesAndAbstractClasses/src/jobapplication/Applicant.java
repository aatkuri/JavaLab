/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobapplication;

/**
 * This class contains the details about the applicant
 * @author Ashok Atkuri
 */
public class Applicant extends Person {
    /**
     * The integer value that stores the age of the applicant
     */
    int	age;
    /**
     * The string value that stores the education qualification of the applicant
     */
    String educationQualification;
    /**
     * The integer value that stores the level of communication of the applicant
     */
    int	levelOfCommunication;
    /**
     * The boolean value that stores true if the applicant has work experience, false otherwise
     */
    boolean workExperience;

    /**
     * no-argument constructor does nothing
     */
    public Applicant() {
    }
    
    /**
     * Eight argument constructor initializes the instance variables
     * @param workExperience - Work Experience of the applicant
     * @param educationQualification - Education qualification of the applicant
     * @param levelOfCommunication - Level of communication skills that the applicant has. This may include 1/2/3/4/5 depending on whether the applicant excellent, knowledgeable, proficient, average, familiar
     * @param age - Age of the applicant
     * @param firstName - FirstName of the applicant
     * @param lastName - LastName of the applicant
     * @param phoneNumber - PhoneNumber of the applicant
     * @param emailID - email ID of the applicant
     */
    public Applicant(boolean workExperience,
            String educationQualification,
            int levelOfCommunication,
            int age,
            String firstName,
            String lastName,
            String phoneNumber,
            String emailID){
        super(firstName, lastName, phoneNumber, emailID);
        this.age = age;
        this.educationQualification = educationQualification;
        this.levelOfCommunication = levelOfCommunication;
        this.workExperience = workExperience;
    }
        
    /**
     * This getter method is used to access the age of the applicant.
     * @return a value of type integer
     */
    public int getAge() {
        return age;
    }

    /**
     * This setter method is used to set the age of the applicant.
     * @param age - the argument to the method
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This getter method is used to get the educational qualification of the applicant.
     * @return a value of type String
     */
    public String getEducationQualification() {
        return educationQualification;
    }

    /**
     * This setter method is used to set the educational qualification of the applicant.
     * @param educationQualification - the argument to the method
     */
    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    /**
     * This getter method is used to access the level of communication the applicant has.
     * @return a value of String
     */
    public int getLevelOfCommunication() {
        return levelOfCommunication;
    }

    /**
     * This setter method is used to set the level of communication skills the applicant has.
     * @param levelOfCommunication - the argument to the method
     */
    public void setLevelOfCommunication(int levelOfCommunication) {
        this.levelOfCommunication = levelOfCommunication;
    }

    /**
     * This method returns the work experience of the applicant
     * @return work experience of type boolean
     */
    public boolean isWorkExperience() {
        return workExperience;
    }

    /**
     * This Setter method is used to set the work experience of the applicant with the argument passed to the method
     * @param workExperience - the argument to the method
     */
    public void setWorkExperience(boolean workExperience) {
        this.workExperience = workExperience;
    }
        
    /**
     * The abstract method from person class will be implemented in this class. Return the name in the format of firstName followed by a comma and space followed by lastName
     * @return a value of type string
     */
    @Override
    public String getFullName() {
        return super.lastName +", " + super.firstName;
    }

    /**
     * Overridden toString method to print the name of the applicant by invoking getFullName() method and invoke the super class toString() method and concatenate the string "EducationQualification of the applicant: " with educationQualification of the applicant
     * @return a value of type string
     */
    @Override
    public String toString() {
        return "Applicant Details\n" + 
                "Name of the applicant: " + this.getFullName() +
                "Contact Details: " + super.toString() +
                "EducationQualification of the applicant: " + this.educationQualification;
    }
}
