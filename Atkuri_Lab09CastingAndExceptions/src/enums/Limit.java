/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * This ENUM contains number of items student or faculty can check out
 * @author Ashok Atkuri
 */
public enum Limit {
    /**
     * Item limit with value 4
     */
    FACULTY(4),
    /**
     * Item limit with value 3
     */
    STUDENT(3);
    /**
     * specifies the item limit
     */
    private final int itemLimit;

    private Limit(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public int getItemLimit() {
        return itemLimit;
    }

}
