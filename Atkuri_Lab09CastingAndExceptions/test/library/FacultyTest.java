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
public class FacultyTest {
    Faculty instance;
    public FacultyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Faculty("MSACS", "Charles Kero", 24);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDepartment method, of class Faculty.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");        
        String expResult = "MSACS";
        String result = instance.getDepartment();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDepartment method, of class Faculty.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "MSACS";        
        instance.setDepartment(department);        
    }

    /**
     * Test of toString method, of class Faculty.
     */
    @Test
    public void testToString() {
        System.out.println("toString");        
        String expResult = "MemberID: "+ instance.getMemberID() +"\n" +
                           "Name: Charles Kero\n" +
                           "Age: 24\n" +
                           "Department: MSACS";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }    
}
