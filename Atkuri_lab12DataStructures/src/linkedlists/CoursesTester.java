package linkedlists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ashok Atkuri
 */
public class CoursesTester {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Atkuri_ALinkedList<Course> myCourses = new Atkuri_ALinkedList<>();
        String courseID;
        String courseName;
        int credHrs;

        Scanner in = new Scanner(new File("courses.txt"));

        while (in.hasNext()) {
            courseID = in.nextLine();
            courseName = in.nextLine();
            credHrs = in.nextInt();
            myCourses.addFirst(new Course(courseID, courseName, credHrs));
            if (in.hasNext()) {
                in.nextLine();
            }
        }
        System.out.println(myCourses);
        System.out.println(myCourses.size() + " courses in the list");
        System.out.println("deleting " + myCourses.removeFirst());
        System.out.println(myCourses.size() + " courses in the list");
    }
}
