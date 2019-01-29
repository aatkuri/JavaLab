/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Faculty List represents a Collected set of faculties
 *
 * @author Ashok Atkuri
 */
public class FacultyList {

    private ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
    private ArrayList<String> listOfNames = new ArrayList<String>();

    public FacultyList() {
    }

    /**
     * Method that adds faculty to the facultyList
     *
     * @param faculty faculty of the faculty member
     */
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    /**
     * Returns the faculty list
     *
     * @return String facultyList
     */
    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    /**
     * Method adds names to the listOfNames
     *
     * @param name name of the faculty argument to the addFacultyNames()
     */
    public void addFacultyNames(String name) {
        listOfNames.add(name);
    }

    /**
     * Overridden equals method. This method checks the two FacultyList objects
     * by checking the list of faculty names in other list with the this object
     * list if both the lists are same then return true otherwise return false
     *
     * @param other FacultyList object
     * @return boolean either true or false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().getSimpleName().equals("FacultyList")) {
            FacultyList temp = (FacultyList) obj;
            if (this.listOfNames.equals(temp.listOfNames)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.listOfNames);
        return hash;
    }

    /**
     * Prints the array list facultyList
     *
     * @return String of faculty names
     */
    @Override
    public String toString() {
        return facultyList + "";
    }
}
