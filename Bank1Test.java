import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Bank1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Bank1Test
{
    /**
     * Default constructor for test class Bank1Test
     */
    public Bank1Test()
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
    public void TestAddBank1()
    {
        Bank1 _bank = new Bank1("TD Bank");
        Money money1=new Money (3,50);
        ListArrayBased a1=new ListArrayBased ();
        
        Account acc=new Account ("Shadman", "223344", money1);
        _bank.addAccount(acc);
        Account expected=_bank.search("223344");
        Account actual=acc;
        
        
        Account acc2=new Account ("Nicole", "443322", money1);
        _bank.addAccount(acc2);
        Account expected2=_bank.search("443322");
         Account actual2=acc2;
  

        assertTrue ("Error in TestaddAccount", expected.equals(actual));  
        assertTrue ("Error in TestaddAccount", expected2.equals(actual2)); 
    }

    }
    

