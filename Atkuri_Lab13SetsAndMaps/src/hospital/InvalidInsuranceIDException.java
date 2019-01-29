/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Exception thrown when invalid id details are found
 * @author Ashok Atkuri
 */
public class InvalidInsuranceIDException extends Exception {

    /**
     * Creates a new instance of <code>InvalidInsuranceIDException</code>
     * without detail message.
     */
    public InvalidInsuranceIDException() {
    }

    /**
     * Constructs an instance of <code>InvalidInsuranceIDException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidInsuranceIDException(String msg) {
        super(msg);
    }
}
