/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

/**
 * This is class to calculate GPA.
 * @author Ashok Atkuri
 */
public class StudentGpaCalculator {
    private String firstName;
    private String lastName;
    private String studentId;
    private String gradeOfSubject1;
    private String gradeOfSubject2;
    private String gradeOfSubject3;
    private final int numberOfCreditHrs;

    /**
     * This is the parameterized Constructor.
     * @param firstName
     * @param lastName
     * @param studentId
     * @param gradeOfSubject1
     * @param gradeOfSubject2
     * @param gradeOfSubject3
     */
    public StudentGpaCalculator(String firstName, String lastName, 
            String studentId, String gradeOfSubject1, String gradeOfSubject2, 
            String gradeOfSubject3) {
        this.numberOfCreditHrs = 3;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gradeOfSubject1 = gradeOfSubject1;
        this.gradeOfSubject2 = gradeOfSubject2;
        this.gradeOfSubject3 = gradeOfSubject3;
    }

    /**
     * This is the getter to retrieve the value of firstName.
     * @return String Returns the value in firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is the setter to set the value of firstName.
     * @param firstName This is the parameter to set first Name. 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is the getter to retrieve the value of lastName.
     * @return String Returns the value in lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is the setter to set the value of lastName.
     * @param lastName This is the parameter to set lastName. 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is the getter to retrieve the value of studentId.
     * @return String Returns the value in studentId.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This is the setter to set the value of studentId.
     * @param studentId This is the parameter to set studentId. 
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * This is the getter to retrieve the value of gradeOfSubject1.
     * @return String Returns the value in gradeOfSubject1.
     */
    public String getGradeOfSubject1() {
        return gradeOfSubject1;
    }

    /**
     * This is the setter to set the value of gradeOfSubject1.
     * @param gradeOfSubject1 This is the parameter to set gradeOfSubject1. 
     */
    public void setGradeOfSubject1(String gradeOfSubject1) {
        this.gradeOfSubject1 = gradeOfSubject1;
    }

    /**
     * This is the getter to retrieve the value of gradeOfSubject2.
     * @return String Returns the value in gradeOfSubject2.
     */
    public String getGradeOfSubject2() {
        return gradeOfSubject2;
    }

    /**
     * This is the setter to set the value of gradeOfSubject2.
     * @param gradeOfSubject2 This is the parameter to set gradeOfSubject2. 
     */
    public void setGradeOfSubject2(String gradeOfSubject2) {
        this.gradeOfSubject2 = gradeOfSubject2;
    }

    /**
     * This is the getter to retrieve the value of gradeOfSubject3.
     * @return String Returns the value in gradeOfSubject3.
     */
    public String getGradeOfSubject3() {
        return gradeOfSubject3;
    }

    /**
     * This is the setter to set the value of gradeOfSubject3.
     * @param gradeOfSubject3 This is the parameter to set gradeOfSubject3. 
     */
    public void setGradeOfSubject3(String gradeOfSubject3) {
        this.gradeOfSubject3 = gradeOfSubject3;
    }
    
    /**
     * This is the look up method to get the grade equivalent.
     * @param grade This is the grade. 
     * @return double Returns the equivalent of the parameter grade.
     */
    private double getGradeEquivalent(String grade)
    {
        double gradeEquivalent = 0.0;
        
        if(grade != null)
        {
            switch (grade) {
                case "A":
                case "a":
                    gradeEquivalent = 4.0;
                    break;
                case "B":
                case "b":
                    gradeEquivalent = 3.0;
                    break;
                case "C":
                case "c":
                    gradeEquivalent = 2.0;
                    break;
                case "D":
                case "d":
                    gradeEquivalent = 1.0;
                    break;
                case "F":
                case "f":
                    gradeEquivalent = 0.0;
                    break;
                default:
                    gradeEquivalent = 0.0;
                    break;
            }
        }        
        return gradeEquivalent;
    }
    
    /**
     * Method to calculate GPA
       Process to calculate GPA:
         GradeEquvalent * noOf CreditHours for particular Subject which are 
         known as quality points.
       GPA = Sum of all quality points divided by Total no of Credit Hours for 
             the term obtained by adding credit hours of each subject.
     * @return double Returns the final calculated GPA of the student.
     */

    public double calculateGpa()
    {
        double gpa = 0.0;
        double qualityPoints = 0.0;      
        
        qualityPoints = 
               getGradeEquivalent(this.gradeOfSubject1) * numberOfCreditHrs + 
               getGradeEquivalent(this.gradeOfSubject2) * numberOfCreditHrs +
               getGradeEquivalent(this.gradeOfSubject3) * numberOfCreditHrs;
        
        gpa = qualityPoints/(numberOfCreditHrs * 3);
        gpa = ((int)(gpa * 100))/100.0;
        return gpa;
    }

    @Override
    //Method to print details of StudentGpaCalculator.
    public String toString() {
        return "***Student Gpa Calculator***\n " + "firstName: " + firstName + 
                "\n lastName: " + lastName + "\n studentId: " + studentId + 
                "\n gradeOfSubject1: " + gradeOfSubject1 
                + "\n gradeOfSubject2: " 
                + gradeOfSubject2 + "\n gradeOfSubject3: " + gradeOfSubject3 
                + "\n " + "numberOfCreditHrs for each subject: " 
                + numberOfCreditHrs + "\n " 
                + "Your Final GPA: " + calculateGpa();
    }    
}
 