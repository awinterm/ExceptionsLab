package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        
        while("".equals(lastName)){
        try {
            
            lastName = nameService.extractLastName(fullName);
      
        } catch (NameValueIncorrectException e){
            
            JOptionPane.showMessageDialog(null, e);
            fullName = JOptionPane.showInputDialog("Enter full name (use Format: first name, last name):");
        
        }
        
        }
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
