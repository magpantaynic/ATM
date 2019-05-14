import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CheckingTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CheckingWithdrawTest
{
    /**
     * Default constructor for test class CheckingTestTest
     */
    public CheckingWithdrawTest()
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
    public void TestCheckingWithdrawal()
    {
        Money money1 = new Money(100,00);
        Checkings a3 = new Checkings("Shadman", "321321", money1);
        Money cash3 = new Money (80, 00);

        a3.withdraw(cash3);

        Money actual=a3.getBalance();
        Money expected=new Money(20,00);

        //when balance is under overDraft
        assertTrue("Error in TestCheckingWithdrawal", actual.equals(expected));

    }

    @Test (expected = InsufficientFundsException.class)
    public void testOverwithdraw() {
        // Create a checking account.
        Money money2 = new Money(100,00);
        Checkings acc = new Checkings("Nicole", "123123", money2);

        // Withdraw an amount that should cause an exception of type InsufficientFundsException...
        acc.withdraw( new Money(200, 0) );
    }

}
