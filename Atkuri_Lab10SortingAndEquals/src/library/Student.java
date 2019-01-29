/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;
import exceptions.InvalidNumberOfCourses;

/**
 * A person who is studying at a school or college.
 *
 * @author Ashok Atkuri
 */
public class Student extends Member {

    /**
     * Courses taken by a student in a semester.
     */
    private String coursesTaken;

    /**
     * Initializes the variables of this class and the super class. Initialize
     * the Item array with itemLimit as its size from Limit ENUM and set it to
     * the items of the super class.
     *
     * @param coursesTaken Courses taken by student
     * @param name Name of the student
     * @param age Age of the student
     */
    public Student(String coursesTaken, String name, int age) {
        super(name, age);
        this.coursesTaken = coursesTaken;
        super.setItems(new Item[Limit.STUDENT.getItemLimit()]);
    }

    /**
     * This method returns true if the number of courses taken by a student is
     * less than or equal to 3. Else, throw InvalidNumberOfCourses exception.
     *
     * @return boolean checks weather courses taken
     * @throws InvalidNumberOfCourses If number of courses taken is greater than
     */
    public boolean checkCoursesTaken()
            throws InvalidNumberOfCourses {
        String[] courses = this.coursesTaken.split(",");
        if (courses.length > 3) {
            throw new InvalidNumberOfCourses();
        }
        return true;
    }

    /**
     * Overridden compareTo method. This method compares the memberID's of the
     * students returns -1/0/1 depending on the result from the compareTo
     * method. -1 if this object's memberID is less than t object's memberID, 0
     * if both are equal, 1 if above conditions are failed
     *
     * @param t Member object
     * @return integer (-1/0/1)
     */
    @Override
    public int compareTo(Member t) {
        if (this.getMemberID().compareTo(t.getMemberID()) < 0) {
            return -1;
        } else if (this.getMemberID().compareTo(t.getMemberID()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Invoke super.toString() and concatenate the coursesTaken
     *
     * @return String representation of Student in the given format.
     *
     * <br>
     * For example:
     * <br>
     * <code>
     * MemberID: 919649853
     * <br>
     * Name: John Snow
     * <br>
     * Age: 19
     * <br>
     * Title: THE HUNGER GAMES, Available: false, BookID: NWM_B_1, RackNo:
     * SH.1.2011, Edition: 2.0, Authors: Arml, D. L., Tan, P., Teck, T.
     * <br>
     * Title: THE GIVER, Available: false, BookID: NWM_B_2, RackNo: GY.2.2010,
     * Edition: 4.0, Authors: Sierra, K., Goss, J., tek, L.
     * <br>
     * Title: android charger, Available: false, DeviceID: NWM_D_3, RackNo:
     * droid Charger_D_7
     * <br>
     * Courses Taken: HCI,Android,IOS
     * </code>
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nCourses Taken: " + coursesTaken;
    }
}
