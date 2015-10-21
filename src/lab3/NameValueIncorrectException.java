/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author andre_000
 */
public class NameValueIncorrectException extends Exception {
    private static final String MSG = "You Must enter your name in the correct format.";
    
        
    public NameValueIncorrectException() {
    super(MSG);
    }

    public NameValueIncorrectException(String message) {
        super(MSG);
    }

    public NameValueIncorrectException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NameValueIncorrectException(Throwable cause) {
        super(MSG);
    }
    
}
