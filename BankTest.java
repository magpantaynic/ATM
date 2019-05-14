import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BankTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankTest
{
    private Money _amount;
    private Account _account;
    private Bank _bank;
    /**
     * Default constructor for test class BankTest
     */
    public BankTest()
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
        _bank= new Bank(" ");
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
    public void TestaddAccount()
    {
        _bank = new Bank("TD Bank");
        Money money1=new Money (3,50);
        Account a1=new Account ("Nicole", "112233", money1);

        _bank.addAccount(a1);

        Account expected=_bank.search("112233");
        Account actual=a1;

        assertTrue ("Error in TestaddAccount", expected.equals(actual));     

    }

    @Test
    public void Testsearch()
    {
        _bank = new Bank("TD Bank");
        Money money1=new Money (3,50);
        Money money2=new Money (0,50);
        Account a1=new Account ("Nicole", "112233", money1);
        Account a2=new Account ("Shadman", "223344", money2);
        _bank.addAccount(a1);
        _bank.addAccount(a2);

        Account expected2=_bank.search("221344");
        Account actual2= null;

        assertEquals ("Error in Testsearch", expected2, actual2);

    }

    @Test
    public void Testdeposit()
    {
        _bank = new Bank("TD Bank");
        Money money1 = new Money(6,50);
        Account ac1 = new Account("Nicole", "123123", money1);
        Money money2 = new Money (7, 80);
        _bank.addAccount(ac1);
        _bank.deposit("123123", money2);
        Money expected=new Money(14, 30);
        Account actual=_bank.search("123123");

        assertTrue("Error in Testdeposit", expected.equals(actual.getBalance()));        
    }

    @Test
    public void Testwithdraw()
    {
        _bank = new Bank("TD Bank");
        Money money2 = new Money(5,50);
        Account a2 = new Account("Shadman", "321321", money2);
        Money cash2 = new Money (4, 50);
        _bank.addAccount(a2);
        _bank.withdraw("321321", cash2);
        Money expected = new Money (1,00);
        Account actual = _bank.search("321321");

        assertTrue("Error in Testwithdraw", expected.equals(actual.getBalance()));
    }

    @Test
    public void TesttoString()
    {
        _bank = new Bank ("TD Bank");
        _bank = new Bank("TD Bank");
        Money money1=new Money (3,50);
        Money money2=new Money (0,50);
        Account a1=new Account ("Nicole", "112233", money1);
        Account a2=new Account ("Shadman", "223344", money2);
        _bank.addAccount(a1);
        _bank.addAccount(a2);

        String expected= "The name of the Bank: " + "TD Bank"+ "The number of accounts: " + "2";
        String actual= _bank.toString();
        

        assertTrue ("Error in TesttoString", expected.equals(actual));

    }
    @Test
     public void TestCheckingswithdraw()
    {
        _bank = new Bank("TD Bank");
        Money money2 = new Money(100,0);
        Checkings a2 = new Checkings("Shadman", "321321", money2);
        Money cash2 = new Money (80, 00);
        _bank.addAccount(a2);
        _bank.withdraw("321321", cash2);
        
        Money expected = new Money (20,00);
         Money actual = a2.getBalance();

        assertTrue("Error in Testwithdraw", expected.equals(actual));
}
}

