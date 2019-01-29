/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


/**
 * Application launches from this class
 *
 * @author Instructor
 */
public class LibraryDriver {

    public static void main(String[] args) throws FileNotFoundException {
        //1. Declare and initialize a scanner object "sc" to read from the file "library.txt"
        
       //2. Create an object for LibraryMangament with variable name as lmList.
        
        //3. while library.txt has more data(While loop starts here) 
        
            //If the passed type is "Student" then, Read in the data "courses", "age", "name".
            // Create an object for Student named as "student" and initlaize the multiple argument contructor 
            // of Student class with above read values.
                // while library.txt has more data(While loop starts here) 
                    // 3.a If the passed type is "Book", then read in the authors names(firstName,middleName,lastName) separated by commas.
                    // Create author array and initialize the correct multiple argument constructor of Author based on
                    // first name, middle name and lastname. Read in copyright year, edition, genre and title.
                    // Create an object for Book named as "book" and initialize the multiple argument constructor with above read values
                    // Using a try-catch block, add the the book to the student by 
                    // calling addItems() method.
                    // 3.b Else If the passed type is "DVD", then read in the data "rating", "storage capacity", "title".
                    // Create an object for DVD named as "dvd" and initlaize the multiple argument contructor of DVD class.
                    // Using a try-catch block, add the the DVD to the student by calling addItems() method.
                    // 3.c Else if the passed type is "Device" then, Read in the data "title".
                    // Create an object for Device named as "device" and initialize the multiple argument constructor of Device class
                    // with above read value.
                    // Using a try-catch block, add the device to the student calling addItems() method.
                    // 3.d Else if the passed type is "Dates", then read in the due date and actual return date.
                    // Create an object for LibraryManagement named as "lm1" and initialize the multiple argument 
                    // constructor of LibraryManagement class with student object, due date and return date.
                    // Print the "lm1" object. Invoke addMembers() on "lmList" object and add the "student".
                    //come out of the loop using "break" keyword.
            
            // Else if the passed type is "Faculty", then read in data "department","name","age".
            // Create an object for Faculty named as "faculty" and initialize the multiple
            // argument constructor of Faculty class with above read values.
            // while library.txt has more data(While loop starts here) { 
            // Repeat the steps 3.a,3.b,3.c,3.d. 
            // Note : "faculty"  is used instead of "student" while implementing the above steps.
            
            
        
           //  Iterate through the "lmList.getMemberList()" and print the student details.
           //  Iterate through the "lmList.getMemberList()" and print the faculty details.
           
    }
}