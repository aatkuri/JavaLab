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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Application launches from this class
 *
 * @author Ashok Atkuri
 */
public class LibraryDriver {

    public static void main(String[] args) throws FileNotFoundException {
        //1. Declare and initialize a scanner object "sc" to read from the file "library.txt"
        Scanner stdin = new Scanner(new File("library.txt"));
        //2. Create an object for LibraryMangament with variable name as lmList.
        LibraryManagement lmList = new LibraryManagement();
        //3. Create an object for FacultyList with the variable name as fList
        FacultyList fList = new FacultyList();
        //4. Create an array list of Student with the variable name as studentList
        ArrayList<Student> studentList = new ArrayList<Student>();
        //5. Create an array list of Device with the variable name as deviceList
        ArrayList<Device> deviceList = new ArrayList<Device>();
        //6. Create an array list of Book with the variable name as bookList
        ArrayList<Book> bookList = new ArrayList<Book>();
        //3. while library.txt has more data(While loop starts here) 
        while (stdin.hasNext()) {
            switch (stdin.nextLine()) {
                case "Student":
                    String studCoursesTaken = stdin.nextLine();
                    int studAge = stdin.nextInt();
                    stdin.nextLine();
                    String studName = stdin.nextLine();
                    Student student = new Student(studCoursesTaken, studName, studAge);
                    assignValues(stdin, lmList, student, deviceList, bookList);
                    studentList.add(student);
                    break;
                case "Faculty":
                    Faculty faculty = new Faculty(stdin.nextLine(), stdin.nextLine(),
                            Integer.parseInt(stdin.nextLine()));
                    assignValues(stdin, lmList, faculty, deviceList, bookList);
                    fList.addFaculty(faculty);
                    break;
            }
        }
        System.out.println("--------------------------------------\n"
                + "Printing Student details\n"
                + "--------------------------------------");
        for (Member m : lmList.getMemberList()) {
            if (m instanceof Student) {
                System.out.println(m.toString() + "\n");
            }
        }
        System.out.println("--------------------------------------\n"
                + "Printing Faculty details\n"
                + "--------------------------------------");
        for (Member m : lmList.getMemberList()) {
            if (m instanceof Faculty) {
                System.out.println(m.toString() + "\n");
            }
        }
        
        System.out.println("----------Checking Comparable Interface Implementation---------\n"
                + "-------------------------------------------------------------\n"
                + "Printing Student details sorting in natural order by their ID\n"
                + "-------------------------------------------------------------");
        Collections.sort(studentList);
        for (Member m : studentList) {
            if (m instanceof Student) {
                System.out.println(m.toString() + "\n");
            }
        }
        System.out.println("---------------------------------------------------------------\n"
                + "Printing Faculty details sorting in natural order by their name\n"
                + "---------------------------------------------------------------");
        Collections.sort(fList.getFacultyList());
        for (Member m : fList.getFacultyList()) {
            if (m instanceof Faculty) {
                System.out.println(m.toString() + "\n");
            }
        }
        System.out.println("--------Checking the Comparator Interface Implementation-------\n"
                + "------------------------------------------------------------\n"
                + "Printing List of Books by descending order of their edition\n"
                + "------------------------------------------------------------");
        Collections.sort(bookList, new BookComparator());
        for (Book b : bookList) {
            System.out.println(b.toString() + "\n");

        }

        System.out.println("----------------Anonymous Class Implementation-----------------\n"
                + "------------------------------------------------------\n"
                + "Devices that are issued\n"
                + "------------------------------------------------------");
        AnonymousDeviceList anonymousDList = new AnonymousDeviceList() {
            @Override
            public String deviceList() {
                String listOfDevices = "";
                for (Device d : deviceList) {
                    listOfDevices += d.getTitle() + "\n";
                }
                return listOfDevices;
            }
        };
        System.out.println(anonymousDList.deviceList());

        System.out.println("\n-------Checking the overrided equals and hashCode methods------");
        System.out.println("Answer for: Your inference from test cases for equals()\n "
                + "Default equals() method returns true if the characters in string matches the characters in comparing string,\n "
                + "As we overrided equals() method to check contents of List.\n "
                + "This method will return true if the names in both the faculty list are same\n "
                + "This will result in true, and second test case fails\n\n"
                + "Answer for: Your inference from test cases for hashcode()\n "
                + "Default hashcode() method compares the hashcode generated with two objects and compares it.\n "
                + "As we overrided hashcode() method to create hash code based on listOfNames\n "
                + "This results in creating unique hash code for each object\n "
                + "In our first case we are comparing the hashcode of fList1 and fList2 which has two different\n "
                + "values. This results in different hashcode and will return false when compared\n "
                + "In second case we are creating fList1 object , adding values to it and assigning to fList2\n "
                + "object. This when compared always result in same hashcode and is always true.\n\n"
                + "Answer for: Is all your test cases for equals() passed the tests or not. If not why???\n "
                + "No\n "
                + "First test case passed as we are passing different set of values in list and both doesn't match\n "
                + "which result in satisfying the test case.\n "
                + "In second equals() test case we are assigning fList1 to fList2 and comparing two empty List\n "
                + "which result in true, this is not equal to expected result which is false and fails.\n\n"
                + "Answer for: Is all your test cases for hashcode() passed the tests or not. If not why???\n "
                + "No\n "
                + "we are passing list of different names into two different objects\n "
                + "as the list of names for each object didnt not produce the same hash code \n "
                + "test case failed. It will be satisfied if both the objects has same list of names passed in.\n "
                + "Second test case passed as both are having an empty list of names and will produce\n "
                + "same hash code, which will satisfy the test case."
        );
    }

    private static void assignValues(Scanner sc, LibraryManagement lmList,
            Member member, ArrayList<Device> deviceList, ArrayList<Book> bookList) {
        boolean datesFlag = true;
        while (datesFlag) {
            switch (sc.nextLine()) {
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
                        //System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        //System.out.println(ex);
                    }
                    bookList.add(book);
                    break;
                case "DVD":
                    MPAA_Rating rating = MPAA_Rating
                            .valueOf(sc.nextLine().toUpperCase());
                    double storage = Double.parseDouble(sc.nextLine());
                    title = sc.nextLine();
                    DVD dvd = new DVD(rating, storage, title);
                    try {
                        member.addItems(dvd);
                    } catch (MaximumItemsReachedException ex) {
                        //System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        //System.out.println(ex);
                    }
                    break;
                case "Device":
                    Device device = new Device(sc.nextLine());
                    try {
                        member.addItems(device);
                        deviceList.add(device);
                    } catch (MaximumItemsReachedException ex) {
                        //System.out.println(ex);
                    } catch (UnderAgeException ex) {
                        //System.out.println(ex);
                    }

                    break;
                case "Dates":
                    String dueDate = sc.nextLine();
                    String returnDate = sc.nextLine();
                    datesFlag = false;
                    LibraryManagement lm1
                            = new LibraryManagement(member, dueDate, returnDate);
                    //System.out.println(
                      //      "\n**********************************\n"
                        //    + lm1 + "\n**********************************\n");
                    lmList.addMembers(member);
                    break;
            }
        }
    }
}
