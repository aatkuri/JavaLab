/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test Class for equals and hashCode methods
 *
 * @author Ashok Atkuri
 */
public class EqualsAndHashCodeTest {

    /**
     *
     */
    @Test
    public void equalsTest1() {
        //Declare a boolean variable expectedResult and assign false to it
        boolean expResult = false;
        //Create two FacultyList objects fLsit1 and fLsit2 
        FacultyList fList1 = new FacultyList();
        FacultyList fList2 = new FacultyList();
        //Add different list of faculty names to fList1 and fList2
        fList1.addFacultyNames("Charles Kero");
        fList1.addFacultyNames("Frank Herbert");
        fList2.addFacultyNames("Hari Kiran");
        fList2.addFacultyNames("Sansa Stark");
        //Test the objects on equals method written in FacultyList class
        boolean result = fList1.equals(fList2);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void equalsTest2() {
        ////Declare a boolean variable expectedResult and assign false to it
        boolean expResult = false;
        //Create two FacultyList objects fLsit1 and fLsit2 
        FacultyList fList1 = new FacultyList();
        FacultyList fList2 = new FacultyList();
        //Assign fList1 to fList2
        fList1 = fList2;
        //Test the objects on equals method written in FacultyList class
        boolean result = fList1.equals(fList2);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void hashCodeTest1() {
        //Declare two integer variables expectedResult, input
        int expectedResult, input;
        //Create two FacultyList objects fLsit1 and fLsit2 
        FacultyList fList1 = new FacultyList();
        FacultyList fList2 = new FacultyList();
        //Add list of faculty names to fList1 and fList2 (with atleast one name different from other list)
        fList1.addFacultyNames("Charles Kero");
        fList1.addFacultyNames("Frank Herbert");
        fList2.addFacultyNames("Charles Kero");
        fList2.addFacultyNames("Sansa Stark");
        //Invoke hashCode() method on fLsit1 and assign the result to expectedResult
        expectedResult = fList1.hashCode();
        //Invoke hashCode() method on fList2 and assign the result to input
        input = fList2.hashCode();
        //Test expectedResult, input
        assertEquals(expectedResult, input);

    }

    /**
     *
     */
    @Test
    public void hashCodeTest2() {
        //Declare two integer variables expectedResult, input
        int expectedResult, input;
        //Create two FacultyList objects fLsit1 and fLsit2 
        FacultyList fList1 = new FacultyList();
        FacultyList fList2 = new FacultyList();
        //Add a list of faculty names to fLsit1 object
        fList1.addFacultyNames("Charles Kero");
        fList1.addFacultyNames("Frank Herbert");
        //Assign fList1 to fList2
        fList1 = fList2;
        //Invoke hashCode() method on fLsit1 and assign the result to expectedResult
        expectedResult = fList1.hashCode();
        //Invoke hashCode() method on fList2 and assign the result to input
        input = fList2.hashCode();
        //Test expectedResult, input
        assertEquals(expectedResult, input);

    }
}
