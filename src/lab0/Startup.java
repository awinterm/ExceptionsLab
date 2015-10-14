package lab0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Instlogin
 */
public class Startup {
    
    private String lastName;
    private String firstName;
    private Date hireDate;
    private int vacationDays;
    private String ssn;
    private boolean b;


    
    public static void main(String[] args) {
        Startup start = new Startup();
        SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
        Employee emp = new Employee(
            "Mark",
            "Smith",
            "333333333",
            start.hireDate,
            start.vacationDays);
         
        try {
            emp.setHireDate(fmt.parse("12-01-2016"));
        } catch (ParseException e){
            System.out.println("ParseException was thrown... but since its a checked exception, I'm not sure why this matters");
        }
        
        
        String fullNameInCaps = 
                
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
    }
}
