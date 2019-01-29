/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This ENUM contains Motion Picture Association of America(MPAA) rating description and age restriction for DVD
 * @author Ashok Atkuri
 */
public enum MPAA_Rating {
    /**
     * Rating description is "General Audiences" and age restriction value 0
     */
    G("General Audiences", 0),
    /**
     * Rating description is "Adults Only" and age restriction value 18
     */
    NC_17("Adults Only", 18),
    /**
     * Rating description is "Parental Guidance Suggested" and age restriction
     * value 12
     */
    PG("Parental Guidance Suggested", 12),
    /**
     * Rating description is "Parents Strongly Cautioned" and age restriction
     * value 13
     */
    PG_13("Parents Strongly Cautioned", 13),
    /**
     * Rating description is "Restricted" and age restriction value 17
     */
    R("Restricted", 17);
    /**
     * specifies the age restriction
     */
    private final int age;
    /**
     * specifies the rating description
     */
    private final String description;

    /**
     * This getter method is used to access the age restriction     *
     * @return Integer This returns age restriction
     */
    public int getAge() {
        return age;
    }
    
    private MPAA_Rating(String description, int age) {
        this.age = age;
        this.description = description;
    }

    /**
     * This getter method is used to access the rating description     *
     * @return Integer This returns rating description
     */
    public String getDescription() {
        return description;
    }
}
