/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ashok Atkuri
 */
public class RecursionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        Recursion recr;
        ArrayList<Student> studList; 
        String studNames;
        String[] studArray;
        int i = 1;
        while (i != 0) {
            recr = new Recursion();
            studList = new ArrayList<Student>();
            System.out.println("Enter you choice\n1.Sum of 'N' odd numbers"
                    + "\n2.Organizing Student seats"
                    + "\n3.Evaluate Math Expression"
                    + "\n4.Organizing Students with restrictions"
                    + "\n Enter any other number to exit.");
            int choice = stdin.nextInt();
            switch (choice) {
                case 1:
                    stdin.nextLine();
                    System.out.println("Enter the value of N: ");
                    int nvalue = stdin.nextInt();
                    System.out.println("Sum of N odd numbers: " + recr.sumOfOdd(nvalue));
                    break;
                case 2:
                    stdin.nextLine();
                    System.out.println("Enter names of students seperated by ',': ");
                    studNames = stdin.nextLine();
                    studArray = studNames.split(",");
                    for (String s : studArray) {
                        studList.add(new Student(s));
                    }
                    System.out.println("Possible ways to organize Students: \n" + recr.organizeSeats(studList));
                    break;
                case 3:
                    stdin.nextLine();
                    System.out.println("Enter Expression to evaluate: ");
                    String expr = stdin.nextLine();
                    System.out.println("Result: " + recr.evaluateExpression(expr));
                    break;
                case 4:
                    stdin.nextLine();
                    System.out.println("Enter names of students seperated by ',': ");
                    studNames = stdin.nextLine();
                    studArray = studNames.split(",");
                    for (String s : studArray) {
                        studList.add(new Student(s));
                    }
                    System.out.println("Enter name of student1: ");
                    String s1 = stdin.nextLine();
                    System.out.println("Enter name of student2: ");
                    String s2 = stdin.nextLine();
                    System.out.println("Possible ways to organize Students: \n" 
                            + recr.organizeSeatsRestricted(studList,new Student(s1),new Student(s2)));
                    break;
                default:
                    i = 0;
            }
        }
    }
}
