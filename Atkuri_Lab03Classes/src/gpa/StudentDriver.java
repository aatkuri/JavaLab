/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StudentGpaCalculator student; //Reference of StudentGpaCalculator
        
        // To get input from user
        Scanner scannerObject = new Scanner(System.in); 
        
        //Get the values from user.
        System.out.println("***Enter Student Details *****");
        System.out.println("Enter the Student First name:");
        String studentFirstName = scannerObject.nextLine();
        
        System.out.println("Enter the Student Last name:");
        String studentLastName = scannerObject.nextLine();
        
        System.out.println("Enter the Student ID:");
        String studentId = scannerObject.nextLine();
        
        System.out.println("***Enter Student Grades*****");
        System.out.println("Enter the Grade in Subject1:");
        String studentGrade1 = scannerObject.nextLine();
        
        System.out.println("Enter the Grade in Subject2:");
        String studentGrade2 = scannerObject.nextLine();
        
        System.out.println("Enter the Grade in Subject3:");
        String studentGrade3 = scannerObject.nextLine();
        
        //Assigning the input values to student object to calculate GPA.
        student = new StudentGpaCalculator(studentFirstName, studentLastName, 
                studentId, studentGrade1, studentGrade2, studentGrade3);
        
        //Print the student details and GPA.
        System.out.println(student);
    }    
}
