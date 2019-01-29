/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Instructor
 */
public class CourseMappingTest {
    
    CourseMapping instance;
    
    
    public CourseMappingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CourseMapping();     
        instance.addEnrollments(new Person("Jayden Smith"), new Course("44460", "Fall 2016", new Person("Charles Badami")));
        instance.addEnrollments(new Person("Ravva Vamsi"), new Course("44618", "Fall 2016", new Person("Aziz Fellah")));
        instance.addEnrollments(new Person("Bruce Dunn"), new Course("44692", "Fall 2016", new Person("Ankit Chaudhary")));
        instance.addEnrollments(new Person("Charlie Goodchap"), new Course("44460", "Fall 2016", new Person("Charles Badami")));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEnrollments method, of class CourseMapping.
     */
    @Test
    public void testAddEnrollments() {
       instance.addEnrollments(new Person("Carmen Carson"), new Course("44664", "Fall 2016", new Person("Michael Oudshoorn")));
        int result = instance.getStudentEnrollment().size();
        int expResult = 5;
        assertEquals(expResult, result);
    }

    /**
     * Test of findNumberOfStudents method, of class CourseMapping.
     */
    @Test
    public void testFindNumberOfStudents() {
        int expResult = 2;
        int result = instance.findNumberOfStudents("Charles Badami", "Fall 2016", "44460");
        assertEquals(expResult, result);
    }

    /**
     * Test of findCoursesTaught method, of class CourseMapping.
     */
    @Test
    public void testFindCoursesTaught() {
        String facultyName = "Aziz Fellah";       
        Set<String> result = instance.findCoursesTaught(facultyName);
        assertEquals(true, result.contains("44618"));
    }

    /**
     * Test of findStudentsEnrolled method, of class CourseMapping.
     */
    @Test
    public void testFindStudentsEnrolled() {
        String course = "44692";
        String semester = "Fall 2016";
        List<Person> result = instance.findStudentsEnrolled(course, semester);
        String expResult = "Bruce Dunn";
        for(Person p : result){
            assertEquals(expResult, p.getName());
        }
    }

    /**
     * Test of getStudentEnrollment method, of class CourseMapping.
     */
    @Test
    public void testGetStudentEnrollment() {
        
        int expResult = instance.size();
        HashMap<Person, LinkedList<Course>> result = instance.getStudentEnrollment();
        assertEquals(expResult, result.size());
        
    }

 
    /**
     * Test of size method, of class CourseMapping.
     */
    @Test
    public void testSize() {
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
}
