/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S530458
 */
public class StudentTest {
    Student instance;
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Student("IOS,HCI,DV", "Mike Husser", 20);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkCoursesTaken method, of class Student.
     */
    @Test
    public void testCheckCoursesTaken() throws Exception {
        System.out.println("checkCoursesTaken");        
        boolean expResult = true;
        boolean result = instance.checkCoursesTaken();
        assertEquals(expResult, result);        
    }

    /**
     * Test of compareTo method, of class Student.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Member t = instance;        
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);        
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");        
        String expResult = "MemberID: "+ instance.getMemberID() +"\n" +
                           "Name: Mike Husser\n" +
                           "Age: 20\n" +
                           "Courses Taken: IOS,HCI,DV";                         
                           
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
