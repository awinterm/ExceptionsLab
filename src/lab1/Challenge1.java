package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        String fullName;   
        fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = "";
        
        while(lastName.isEmpty())
        try {
            
        lastName = app.extractLastName(fullName);
        
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "You must enter a name in the correct format. Please try again.");
            fullName = JOptionPane.showInputDialog("Enter full name (use Format: first name, last name):");
        }
        
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    // could have thrown a null pointer instead of testing for null, however this also checks for empty string.
    
    
    
    public String extractLastName(String fullName) {
        if (fullName.isEmpty() || fullName == null){
            throw new IllegalArgumentException("Your Full name cannot be empty.");
        }         
        String[] nameParts = fullName.split(" ");
        if (nameParts.length > 2 || nameParts.length < 2){
            throw new IllegalArgumentException("Incorrect Format");
        } 
        // would test for numbers however Jim brought up that one girl with the name 7.
        // also Prince had a symbol for a few years. I wonder if he hot-keyed that for emails and whatnot.
        
        return nameParts[nameParts.length - 1];
    }

}
