/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import enums.Limit;

/**
 * Faculty represents the teaching staff of a university or college
 * @author Ashok Atkuri
 */
public class Faculty extends Member {
    
    /**
     * Department of the faculty
     */
    private String department;

     /**
     * Initializes the variables of this class and the super class. Initialize
     * the Item array with itemLimit as its size from Limit enum and set it to
     * the items of the super class.
     *
     * @param department Department of the faculty
     * @param name Name of the faculty
     * @param age age of the faculty
     */
    public Faculty(String department, String name, int age) {
        super(name, age);
        this.department = department;
        super.setItems(new Item[Limit.FACULTY.getItemLimit()]);
    }

    /**
     * Returns department of faculty
     *
     * @return String Department of faculty
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of Faculty
     *
     * @param department - Department of faculty
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Method to compare the names of the faculty returns -1/0/1 depending on
     * the comparison result, -1 if this object's faculty name is less than t
     * object's faculty name, 0 if both object's names are same, 1 if above two
     * conditions are failed
     *
     * @param t Member object
     * @return Integer(-1/0/1)
     */
    @Override
    public int compareTo(Member t){
        if(this.getName().compareTo(t.getName()) < 0)
            return -1;
        else if(this.getName().compareTo(t.getName()) == 0)
            return 0;
        else
            return 1;
    }
    
    /**
     * Invoke super.toString() and concatenate the department
     *
     * @return String representation of Faculty in the given format.
     * <br>
     * For example:
     * <br>
     * <code>
     * MemberID: 919649853
     * <br>
     * Name: Mike Husser
     * <br>
     * Age: 34
     * <br>
     * Title: THE HUNGER GAMES, Available: false, BookID: NWM_B_1, RackNo:
     * SH.1.2011, Edition: 2.0, Authors: Arml, D. L., Tan, P., Teck, T.
     * <br>
     * Title: THE GIVER, Available: false, BookID: NWM_B_2, RackNo: GY.2.2010,
     * Edition: 4.0, Authors: Sierra, K., Goss, J., tek, L.
     * <br>
     * Title: android charger, Available: false, DeviceID: NWM_D_3, RackNo:
     * droid Charger_D_7
     * <br>
     * Department: MSACS
     * </code>
     */
    @Override
    public String toString() {
         return super.toString()
                +"\nDepartment: "+department;
    }
}

    