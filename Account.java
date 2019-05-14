/**
 * Write a description of class Account here.
 *
 * @author (Nicole & Shadman)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    private String name;
    private String id;
    private Money balance;
    
    public Account(String name, String id, Money balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    //Getter method for name
    public String getName()
    {
        return this.name;
    }
    //Getter for id
    public String getid()
    {
        return this.id;
    }
    //Getter for balance
    public Money getBalance()
    {
        return balance;
    }
    //Depositing money 
    public void deposit (Money cash)
    {
        this.balance=balance.add(cash);
    }

    public void withdraw (Money cash)
    {
        this.balance=balance.subtract(cash);
    }

    public void transfer (Account account, Money money)
    {
        withdraw(money);
        account.deposit(money);
    }

    //String
    public String toString()
    {
        return ("Name: " + name + " ID:" + id + " Balance: " + balance);
    }

    public boolean equals (Account account)
    {
        if (balance.equals(account.getBalance()))
            return true;
        else
            return false;
    }
}
