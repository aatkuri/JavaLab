/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Genre;
import enums.MPAA_Rating;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashok Atkuri
 */
public class MemberTest {

    private Member member;

    /**
     *
     */
    public MemberTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
        member = new Student("IOS,HCI,DV", "Mike Husser", 20);
    }

    /**
     *
     */
    @After
    public void tearDown() {
        member = null;
    }

    /**
     * Test of getAge method, of class Member.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 20;
        int result = member.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItems method, of class Member.
     */
    @Test
    public void testSetItems() {
        System.out.println("setItems");
        Author[] authors = {new Author("John", "Snow", "Targaryan"), new Author("Ross", "Taylor")};
        Item[] items = {new DVD(MPAA_Rating.G, 2.5, "Captain America"),
            new Book(authors, 2011, 2, Genre.FANTASY, "The Hobbit")};
        member.setItems(items);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getItems method, of class Member.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        testSetItems();
        Author[] authors = {new Author("John", "Snow", "Targaryan"), new Author("Ross", "Taylor")};
        Item[] expR = {new DVD(MPAA_Rating.G, 2.5, "Captain America"),
            new Book(authors, 2011, 2, Genre.FANTASY, "The Hobbit")};
        Item[] R = member.getItems();
        String[] expResult = {expR[0].getTitle(), expR[1].getTitle()};
        String[] result = {R[0].getTitle(), R[1].getTitle()};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMemberID method, of class Member.
     */
    @Test
    public void testGetMemberID() {
        System.out.println("getMemberID");
        String expResult = "919";
        String result = member.getMemberID().substring(0,3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Mike Husser";
        String result = member.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAge method, of class Member.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 22;
        member.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Member.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Karthik";
        member.setName(name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of generateMemberID method, of class Member.
     */
    @Test
    public void testGenerateMemberID() {
        System.out.println("generateMemberID");
        String expResult = "919";
        String result = member.generateMemberID().substring(0, 3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of addItems method, of class Member.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testAddItems() throws Exception {
        System.out.println("addItems");
        Author[] author = {new Author("Daniel", "Liang", "Arml"), new Author("Paul", "Tan")};
        Item item = new Book(author, 2011, 2, Genre.SCIENCE_FICTION, "The Hunger Games");
        member.addItems(item);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult =  "Name: Mike Husser\n"
                + "Age: 20\n"
                + "Courses Taken: IOS,HCI,DV";
        String[] res=member.toString().split("\n");
        String result = res[1]+"\n"+res[2]+"\n"+res[3];
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
