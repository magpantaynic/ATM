/**
 * Write a description of class Checkings here.
 *
 * @author (Shadman and Nicole)
 * @version (a version number or a date)
 */

public class Checkings extends Account
{
    // instance variables - replace the example below with your own

    Money balance=getBalance();
     Money overdraftMax;
   
    public Checkings(String accName, String accID, Money accBal)
    {
        super(accName, accID, accBal);
          overdraftMax= new Money(50,00);
        
    }

    @Override
    public void withdraw (Money cash)
    {

        Money totalAllowed=balance.add(overdraftMax);

        if(cash.compareTo(totalAllowed)==1)
        {
            //throw exception
            System.out.println ("Error");
        }
        else
        {
           super.withdraw(cash);
        }
    }

}
