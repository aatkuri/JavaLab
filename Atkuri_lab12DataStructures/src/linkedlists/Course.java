package linkedlists;

/**
 * @author Ashok Atkuri
 */
public class Course {

    private String courseID;
    private String courseName;
    private int creditHours;

    /**
     *
     * @param courseID
     * @param courseName
     * @param creditHours
     */
    public Course(String courseID, String courseName, int creditHours) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return courseID + " " + creditHours + " " + courseName;
    }
}
