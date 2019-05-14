import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SavingsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SavingsTest
{
    /**
     * Default constructor for test class SavingsTest
     */
    public SavingsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testSavings()
    {
        
        Money money1 = new Money(100,00);
         double interest =.25 ;

        Savings a4 = new Savings("Shadman", "321321", money1, interest);
       
        a4.addInterest();
        
        Money actual = a4.getBalance();
        Money expected = new Money(125,00);
        
        
        //when balance is under overDraft
        assertTrue("Error in TestSavings", actual.equals(expected));
    
    }
}






