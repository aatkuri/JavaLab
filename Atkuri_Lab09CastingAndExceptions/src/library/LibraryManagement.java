/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.NoFineException;
import java.util.ArrayList;
import java.util.List;

/**
 * Library Management represents check-in and check-out dates of items by a
 * member
 * @author Ashok Atkuri
 */
public class LibraryManagement {

    /**
     * library member object
     */
    private Member member;
    /**
     * Due date of an Item in "MM/dd/yyyy HH:mm:ss"
     */
    private String dueDate;
    /**
     * Return date of an Item in "MM/dd/yyyy HH:mm:ss"
     */
    private String actualReturnDate;
    /**
     * List of members
     */
    private List<Member> memberList;

    /**
     * Initializes the variables of this class and initializes the memberList
     * with ArrayList.
     *
     * @param member Library member object
     * @param dueDate Due date of an Item in "MM/dd/yyyy HH:mm:ss"
     * @param actualReturnDate Return date of an Item in "MM/dd/yyyy HH:mm:ss"
     */
    public LibraryManagement(Member member, String dueDate, String actualReturnDate) {
        this.member = member;
        this.dueDate = dueDate;
        this.actualReturnDate = actualReturnDate;
        this.memberList = new ArrayList<Member>();
    }

    /**
     * Initializes the memberList with ArrayList
     */
    public LibraryManagement() {
        this.memberList = new ArrayList<Member>();
    }

    /**
     * Returns the members list of library
     *
     * @return List member list
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /**
     * This method add members to the memberList
     *
     * @param member Library member object
     */
    public void addMembers(Member member) {
        this.memberList.add(member);
    }

    /**
     * This method returns the total fine by calculating individual fine for
     * each item checked out by library member.
     *
     * @return double Total fine payable to library
     */
    public double totalFine() {
        double totalFine = 0.0;
        for (Item i : this.member.getItems()) {
            if (i != null) {
                try {
                    totalFine += i.calculateFine(actualReturnDate, dueDate);
                } catch (NoFineException e) {
                    totalFine += 0.0;
                }
            }
        }
        return totalFine;
    }

    /**
     * Returns all the private instance variables and total fine.
     * <br>
     * For example:
     * <br>
     * <code>member.toString()</code>
     * +<code> "Due Date: 12/30/2017 10:00:00 Return Date: 12/30/2017 10:05:00 Fine Amount: 0.0"</code>
     *
     * @return String
     */
    @Override
    public String toString() {
        return this.member.toString() + "\nDue Date: " + this.dueDate + " Return Date: "
                + this.actualReturnDate + " Fine Amount: " + this.totalFine();
    }

}
