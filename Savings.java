/**
 * Write a description of class Savings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class Savings extends Account
{
   private double interestRate;
   Money balance=getBalance();

   public Savings(String accName,String ID, Money accBal, double interest)//double s
   {
       super ( accName, ID,  accBal);
       this.interestRate = interest;
       
   }

   public void addInterest()
   {       
       double balDouble=(double)(this.getBalance().getDollars()*100+this.getBalance().getCents());
  
       long interestCents = (long)(balDouble * interestRate);
       Money Interest=new Money ((interestCents));
       super.deposit(Interest);
       
   }
	
}
