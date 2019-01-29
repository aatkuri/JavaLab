/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 * Exception thrown when invalid doctor size is found
 * @author Ashok Atkuri
 */
public class InvalidDoctorSizeException extends Exception {

    /**
     * Creates a new instance of <code>InvalidDoctorSizeException</code> without
     * detail message.
     */
    public InvalidDoctorSizeException() {
    }

    /**
     * Constructs an instance of <code>InvalidDoctorSizeException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidDoctorSizeException(String msg) {
        super(msg);
    }
}
