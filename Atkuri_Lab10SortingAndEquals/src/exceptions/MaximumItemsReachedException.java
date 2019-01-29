/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Exception thrown when items added are more than the size of array length
 * @author Ashok Atkuri
 */
public class MaximumItemsReachedException extends Exception {

    /**
     * Creates a new instance of <code>MaximumItemsReachedException</code>
     * without detail message.
     */
    public MaximumItemsReachedException() {
    }

    /**
     * Constructs an instance of <code>MaximumItemsReachedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public MaximumItemsReachedException(String msg) {
        super(msg);
    }
}
