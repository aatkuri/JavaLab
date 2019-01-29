/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Exception thrown when negative amounts are found
 * @author Ashok Atkuri
 */
public class NegativeAmountException extends Exception {

    /**
     * Creates a new instance of <code>NegativeAmountException</code> without
     * detail message.
     */
    public NegativeAmountException() {
    }

    /**
     * Constructs an instance of <code>NegativeAmountException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeAmountException(String msg) {
        super(msg);
    }
}
