/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.MPAA_Rating;
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
public class DVDTest {

    private DVD dvd;
    
    public DVDTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dvd = new DVD(MPAA_Rating.G, 1.5, "The Hunger Games");
    }

    @After
    public void tearDown() {
        dvd = null;
    }

    /**
     * Test of toString method, of class DVD.
     */
    @Test
    public void testToString() {
        DVD instance = new DVD(MPAA_Rating.G, 2.5, "Captain America");
        String expResult = "Title : Captain America, Available : false, ID : NWM_DVD_2, rating : G, storageCapacity : 2.5\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of generateUniqueID method, of class DVD.
     */
    @Test
    public void testGenerateRackID() {
        String[] expResult = {"bca.1.2", "cat.1.2", "catdog.1.2",
            "hocolctea.1.2", "abxabxabxabxabxabxabx.1.2", "bcaefdhigkljmnkpqostrvwuyzx231564897.1.2",
            "bcaefdhigkljmnkpqostrvwuyzx231564.1.2"};
        String[] input = {"abc","tca","tcagdo","chocolate","xabxabxabxabxabxabxab",
            "abcdefghijklkmnopqrstuvwxyz1234567890","abcdefghijklkmnopqrstuvwxyz12345678"};
        String result[] = new String[input.length];
        for (int i = 0; i < expResult.length; i++) {
            DVD instance = new DVD(MPAA_Rating.G, 1.2, input[i]);
            result[i] = instance.generateRackID();
        }
        assertArrayEquals(expResult, result);
    }

    
    /**
     * Test of getRating method, of class DVD.
     */
    @Test
    public void testGetRating() {
        MPAA_Rating expResult = MPAA_Rating.G;
        MPAA_Rating result = dvd.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRating method, of class DVD.
     */
    @Test
    public void testSetRating() {
        MPAA_Rating expResult = MPAA_Rating.PG;
        dvd.setRating(MPAA_Rating.PG);
        MPAA_Rating result = dvd.getRating();
       assertEquals(expResult, result);
    }

    /**
     * Test of getStorageCapacity method, of class DVD.
     */
    @Test
    public void testGetStorageCapacity() {
        double expResult = 1.5;
        double result = dvd.getStorageCapacity();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setStorageCapacity method, of class DVD.
     */
    @Test
    public void testSetStorageCapacity() {
        double storageCapacity = 2.4;
        dvd.setStorageCapacity(storageCapacity);
        double result = dvd.getStorageCapacity();
        assertEquals(storageCapacity, result, 0);
    }

    /**
     * Test of generateUniqueID method, of class DVD.
     */
    @Test
    public void testGenerateUniqueID() {
        String expResult = "NWM_DVD_3";
        String result = dvd.generateUniqueID();
        assertEquals(expResult, result);
    }

}
