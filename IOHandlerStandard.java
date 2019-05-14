import java.util.Scanner;

/**
 * IOHandlerStandard: uses standard IO for input (via get method) and output (via put method).
 * Note: exceptions are potentially thrown by methods of Scanner; refer to documentation in Java standard library. 
 * 
 * @author (Nicole and Shadman) 
 * @version (a version number or a date)
 */
public class IOHandlerStandard implements IOHandlerInterface
{
    // Attributes
    private Scanner input;
    
    /**
     * constructor: 
     * @param none
     */
    public IOHandlerStandard()
    {
        input = new Scanner (System.in);
    }
    
    /**
     * get: 
     * @param none
     * @return a String from input source, or "invalid" if an exception is thrown.
     */
    public String get(String prompt)
    {
         System.out.println (prompt);
         return input.next();
    } // end get
    
    /**
     * put: 
     * @param a String to write to the selected destination.
     * @return none.
     */
    public void put(String output)
    {
         System.out.println (output);
    } // end put
}
