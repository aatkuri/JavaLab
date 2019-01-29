/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class CourseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //Create a Scanner object to read Student and course details from "input.txt" file.
        Scanner stdin = new Scanner(new File("input.txt"));

        //Create an object of CourseMapping and name it as "enrollments".
        CourseMapping enrollments = new CourseMapping();
        String name = null;
        String[] inputStrings;
        Course crs = null;

        //Declare an object for Person, name it as "student" and initialize it to null
        Person student = null;

        //while input.txt has more data(While loop starts here) {
        while (stdin.hasNext()) {
            name = stdin.nextLine();
            //Read the first line,If the passed type is "Student" then, read in the "name".
            if (name.equals("Student")) {
                //Create an object for Person with above read value and assign it to "student" variable.
                student = new Person(stdin.nextLine());
            } else {
                //Else, read the next line, It will be in the following order: courseNo, faculty name and semester 	//separated by comma separator.
                inputStrings = name.split("-");
                // With above read values, create an object Course and name it as "course".
                crs = new Course(inputStrings[0], inputStrings[2], new Person(inputStrings[1]));
                //Invoke addEnrollments() on "enrollments" object and add the "student","course".
                enrollments.addEnrollments(student, crs);
            }

            // } (while loop ends here)
        }
        // Print number of students enrolled in "44460" in "Fall 2016" with "Charles Badami"
        System.out.println("Number of students enrolled in \"44460\" in \"Fall 2016\" with \"Dr. Charles Badami\"\n"
                +enrollments.findNumberOfStudents("Charles Badami", "Fall 2016", "44460"));

        // Print courses taught by "Aziz Fellah"
        System.out.println("Courses taught by \"Aziz Fellah\":\n"+enrollments.findCoursesTaught("Aziz Fellah"));
        // Print students enrolled for "44692" in "Fall 2017"
        System.out.println("Students enrolled for \"44692\" in \"Fall 2017\"\n"+enrollments.findStudentsEnrolled("44692", "Fall 2017"));
        // Print size of the hash map.
        System.out.println("Size of the hash map: "+enrollments.size());
    }

}
