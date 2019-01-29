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
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Instructor
 */
public class MovieMappingTest {
   MovieMapping instance;
    
    public MovieMappingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new MovieMapping();   
        instance.addMovie(new Person("Russel Crowe"), new Movie("20k",new Person("Pete Docter"),"2014"));
        instance.addMovie(new Person("Russel Crowe"), new Movie("100k",new Person("Trivikram"),"2015"));
        instance.addMovie(new Person("Tom Cruise"), new Movie("40k",new Person("Matt Besser"),"2013"));
        instance.addMovie(new Person("Kelvin Spacey"), new Movie("50k",new Person("David Wain"),"2013"));
        
    }
    
     
    @Test
    public void testAddMovie() {
        
        instance.addMovie(new Person("Bala Krishna"), new Movie("20k",new Person("Teja"),"2016"));
        int result = instance.getActorsActed().size();
        int expResult = 5;
        assertEquals(expResult, result);
          
    }

    
    @Test
    public void testFindNumberOfActors() {
        int expResult = 0;
        int result = instance.findNumberOfActors("Mite Michell", "2014", "40k");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testFindRevenuesMadeByDirector() {
        String directorName = "Matt Besser";       
        Set<String> result = instance.findRevenuesMadeByDirector(directorName);
        assertEquals(true, result.contains("40k"));
    }

    
    @Test
   public void testFindActorsActed() {
        String revenue = "40k";
        String year = "2013";
        List<Person> result = instance.findActorsActed(revenue, year);
        String expResult = "Tom Cruise";
        for(Person p : result){
            assertEquals(expResult, p.getName());
        }
    }

    
    @Test
    public void testGetActorsActed() {
        
        int expResult = instance.size();
        HashMap<Person, LinkedList<Movie>> result = instance.getActorsActed();
        assertEquals(expResult, result.size());
        
    }

    @Test
    public void testSize() {
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    
}
    