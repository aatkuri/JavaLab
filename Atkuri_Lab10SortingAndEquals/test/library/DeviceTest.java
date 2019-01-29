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
public class DeviceTest {
    Device instance;
    public DeviceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Device("laptop");        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of calculateFine method, of class Device.
     */
    @Test
    public void testCalculateFine() throws Exception {
        System.out.println("Test calculateFine");
        String dateTime1 = "12/30/2017 10:05:00";
        String dateTime2 = "12/30/2017 10:00:00";        
        double expResult = 0.0;
        double result = instance.calculateFine(dateTime1, dateTime2);
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of generateRackID method, of class Device.
     */
    @Test
    public void testGenerateRackID() {
        System.out.println("Test generateRackID");        
        String expResult = "ptop_D_" + instance.generateUniqueID().length();
        String result = instance.generateRackID();
        assertEquals(expResult, result);        
    }

    /**
     * Test of generateUniqueID method, of class Device.
     */
    @Test
    public void testGenerateUniqueID() {
        System.out.println("Test generateUniqueID");        
        String expResult = "NWM_D_" + Item.counter;
        String result = instance.generateUniqueID();
        assertEquals(expResult, result);        
    }

    /**
     * Test of toString method, of class Device.
     */
    @Test
    public void testToString() {
        System.out.println("toString");        
        String expResult = "Title: laptop, Available: false, DeviceID: NWM_D_1, RackNo: ptop_D_7";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
