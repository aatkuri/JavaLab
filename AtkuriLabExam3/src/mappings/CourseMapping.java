/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Instructor
 */
public class CourseMapping implements Iterable {

    private HashMap<Person, LinkedList<Course>> studentEnrollment;
    

    public CourseMapping() {
        this.studentEnrollment = new HashMap<>();
    }

    /**
     * This method adds a new entry to the studentEnrollment. The first
     * parameter is the key for entry. Second parameter should be appended to
     * the linked list value of the person in hashMap. Hint: If courses
     * associated to the person is null then add the person with new
     * LinkedList<> to the hashMap.
     *
     * @param person
     * @param course
     */
    public void addEnrollments(Person person, Course course) {
        if (studentEnrollment.containsKey(person)) {
            if (studentEnrollment.get(person) == null) {
                this.studentEnrollment.put(person, new LinkedList<>());
                this.studentEnrollment.get(person).add(course);
            }
            else{
                this.studentEnrollment.get(person).add(course);
            }
        } else {
            this.studentEnrollment.put(person, new LinkedList<>());
            this.studentEnrollment.get(person).add(course);
        }        
    }

    /**
     * This method returns the number of students who have taken the course in
     * given semester with the faculty
     *
     * @param facultyName
     * @param semester
     * @param courseNo
     * @return
     */
    public int findNumberOfStudents(String facultyName, String semester, String courseNo) {
        
        int noOfStudents = 0;
        for(Person p:studentEnrollment.keySet()){
            for(Course c:studentEnrollment.get(p)){
                System.out.println(c.getFaculty().getName());
                if(c.getFaculty().getName().equals(facultyName)
                        && c.getSemester().equals(semester)
                        && c.getCourseNo().equals(courseNo)){                    
                    noOfStudents += 1;
                }
            }
        }
        
        return noOfStudents;
    }

    /**
     * This method returns set of all the courses taught by given faculty.
     *
     * @param facultyName
     * @return
     */
    public Set<String> findCoursesTaught(String facultyName) {
        HashSet<String> coursesSet = new HashSet<>();
        
        for(LinkedList<Course> c:studentEnrollment.values()){
            for(Course cc : c){
                if(cc.getFaculty().getName().equals(facultyName))
                    coursesSet.add(cc.getCourseNo());
            }
        }        
        return coursesSet;            
    }

    /**
     * This method returns list of students enrolled for a course in given
     * semester
     *
     * @param course
     * @param semester
     * @return
     */
    public List<Person> findStudentsEnrolled(String course, String semester) {
        List<Person> personList = new ArrayList<>();
        
        for(Person p:studentEnrollment.keySet()){
            for(Course c:studentEnrollment.get(p)){
                if(c.getSemester().equals(semester)
                        && c.getCourseNo().equals(course)){
                    personList.add(p);
                }
            }
        }
        
        return personList;
    }

    /**
     * This is the getter method for instance variable.
     *
     * @return
     */
    public HashMap<Person, LinkedList<Course>> getStudentEnrollment() {
        return studentEnrollment;
    }

    /**
     * This method returns an iterator over studentEnrollment.
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return this.studentEnrollment.entrySet().iterator();
    }

    /**
     * This methods returns size of the hashMap
     *
     * @return
     */
    public int size() {
        return this.studentEnrollment.size();
    }

}
