/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

/**
 *
 * @author Ashok Atkuri
 */
public class Course {
    
    private String courseNo;
    
    private String semester;
    
    private Person faculty;

    public Course(String courseNo, String semester, Person faculty) {
        this.courseNo = courseNo;
        this.semester = semester;
        this.faculty = faculty;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public String getSemester() {
        return semester;
    }

    public Person getFaculty() {
        return faculty;
    }
}
