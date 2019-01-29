/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.*;
import exceptions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Application launches from this class
 * @author Ashok Atkuri
 */
public class LibraryDriver {

    public static void main(String[] args) throws FileNotFoundException {
        //1. Declare and initialize a scanner object "sc" to read from the file "library.txt"
        Scanner sc = new Scanner(new File("library.txt"));
        //2. Create an object for LibraryMangament with variable name as lmList.
        LibraryManagement lmList = new LibraryManagement();
        //3. while library.txt has more data(While loop starts here) 
        while (sc.hasNext()) {
            switch (sc.nextLine()) {
                //If the passed type is "Student" then, Read in the data "courses", "age", "name".
                // Create an object for Student named as "student" and initlaize the multiple argument contructor 
                // of Student class with above read values.
                case "Student":
                    String studCoursesTaken = sc.nextLine();
                    int studAge = sc.nextInt();
                    sc.nextLine();
                    String studName = sc.nextLine();
                    Student stud = new Student(studCoursesTaken, studName, studAge);
                    assignValues(sc, lmList, stud);
                    break;
                // Else if the passed type is "Faculty", then read in data "department","name","age".
                // Create an object for Faculty named as "faculty" and initialize the multiple
                // argument constructor of Faculty class with above read values.
                case "Faculty":
                    Faculty faculty = new Faculty(sc.nextLine(), sc.nextLine(),
                            Integer.parseInt(sc.nextLine()));
                    assignValues(sc, lmList, faculty);
                    break;
            }
        }
        //  Iterate through the "lmList.getMemberList()" and print the student details.

        System.out.println("--------------------------------------\n"
                + "Printing Student details\n"
                + "--------------------------------------");
        for (Member m : lmList.getMemberList()) {
            if (m instanceof Student) {
                System.out.println(m.toString() + "\n");
            }
        }
        //  Iterate through the "lmList.getMemberList()" and print the faculty details.
        System.out.println("--------------------------------------\n"
                + "Printing Faculty details\n"
                + "--------------------------------------");
        for (Member m : lmList.getMemberList()) {
            if (m instanceof Faculty) {
                System.out.println(m.toString() + "\n");
            }
        }
    }

    private static void assignValues(Scanner sc, LibraryManagement lmList,
            Member member) {
        boolean datesFlag = true;
        // while library.txt has more data(While loop starts here) 
        while (datesFlag) {
            switch (sc.nextLine()) {
                // 3.a If the passed type is "Book", then read in the authors names(firstName,middleName,lastName) separated by commas.
                // Create author array and initialize the correct multiple argument constructor of Author based on
                // first name, middle name and lastname. Read in copyright year, edition, genre and title.
                // Create an object for Book named as "book" and initialize the multiple argument constructor with above read values
                // Using a try-catch block, add the the book to the student by 
                // calling addItems() method.
                case "Book":
                    String a[] = sc.nextLine().split(",");
                    Author authors[] = new Author[a.length];
                    for (int i = 0; i < a.length; i++) {
                        String name[] = a[i].split(" ");
                        authors[i] = new Author(name[0],
                                name.length > 2 ? name[1] : null,
                                name[name.length - 1]);
                    }
                    int copyrightYear = Integer.parseInt(sc.nextLine());
                    double edition = Double.parseDouble(sc.nextLine());
                    Genre genre = Genre.valueOf(sc.nextLine()
                            .toUpperCase());
                    String title = sc.nextLine();
                    Book book = new Book(authors, copyrightYear, edition,
                            genre, title);
                    try {
                        member.addItems(book);
                    } catch (MaximumItemsReachedException ex) {
                        System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        System.out.println(ex);
                    }
                    break;
                // 3.b Else If the passed type is "DVD", then read in the data "rating", "storage capacity", "title".
                // Create an object for DVD named as "dvd" and initlaize the multiple argument contructor of DVD class.
                // Using a try-catch block, add the the DVD to the student by calling addItems() method.
                case "DVD":
                    MPAA_Rating rating = MPAA_Rating
                            .valueOf(sc.nextLine().toUpperCase());
                    double storage = Double.parseDouble(sc.nextLine());
                    title = sc.nextLine();
                    DVD dvd = new DVD(rating, storage, title);
                    try {
                        member.addItems(dvd);
                    } catch (MaximumItemsReachedException ex) {
                        System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        System.out.println(ex);
                    }
                    break;
                // 3.c Else if the passed type is "Device" then, Read in the data "title".
                // Create an object for Device named as "device" and initialize the multiple argument constructor of Device class
                // with above read value.
                // Using a try-catch block, add the device to the student calling addItems() method.
                case "Device":
                    Device device = new Device(sc.nextLine());
                    try {
                        member.addItems(device);
                    } catch (MaximumItemsReachedException ex) {
                        System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        System.out.println(ex);
                    }
                    break;
                // 3.d Else if the passed type is "Dates", then read in the due date and actual return date.
                // Create an object for LibraryManagement named as "lm1" and initialize the multiple argument 
                // constructor of LibraryManagement class with student object, due date and return date.
                // Print the "lm1" object. Invoke addMembers() on "lmList" object and add the "student".
                case "Dates":
                    String dueDate = sc.nextLine();
                    String returnDate = sc.nextLine();
                    datesFlag = false;//come out of the loop using "break" keyword.
                    LibraryManagement lm1
                            = new LibraryManagement(member, dueDate, returnDate);
                    System.out.println(
                            "\n**********************************\n"
                            + lm1 + "\n**********************************\n");
                    lmList.addMembers(member);
                    break;
            }
        }
    }
}
