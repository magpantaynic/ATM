/**
 * Write a description of class Bank here.
 *
 * @author (Nicole & Shadman)
 * @version (a version number or a date)
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Bank implements BankInterface
{
    private String nameOfBank;
    private Account[] accounts;
    private int numOfAccounts;
    private  int MAX=1000;

    public Bank(String name)
    {
        nameOfBank = name;
        accounts= new Account[MAX];
        numOfAccounts=0;
    }

    public void addAccount (Account a1)
    {
        accounts[numOfAccounts]=a1;
        numOfAccounts++;
        
    }

    public Account search(String AccountId)
    {

        /*  for (int i=0; i<numOfAccounts;i++)
        {
        String id= accounts[i].getid();

        if (id.equals(AccountId))
        return accounts[i];          
        }
         */
        int index=binarySearch(accounts, 0, numOfAccounts, AccountId);

        if(index==-1)
        {
            return null;
        }
        return accounts[index];
    }

    public void deposit(String id, Money cash)
    {
        Account acc = search(id);
        acc.deposit(cash);
    }

    public void withdraw(String id, Money cash)
    {
        Account acc = search(id);
        acc.withdraw(cash);
    }

    public String toString()
    {
        String result= "The name of the Bank: " + nameOfBank + "The number of accounts: " + numOfAccounts;
        return result;
    }

    public static int binarySearch(Account[] accounts, int first, int numOfAccounts, String ID) {
        // Searches the array items anArray[first] through
        // anArray[last] for value by using a binary search.
        // Precondition: 0 <= first, last <= SIZE-1, where
        // SIZE is the maximum size of the array, and
        // anArray[first] <= anArray[first+1] <= ... <= anArray[last].
        // Postcondition: If value is in the array, the method
        // returns the index of the array item that equals value;
        // otherwise the method returns -1.

        int index;

        if (first> numOfAccounts) {
            index = -1;      // value not in original array
        } 
        else {

            // Invariant: If value is in anArray, 
            // anArray[first] <= value <= anArray[last]
            int mid = (first + numOfAccounts)/2;

            if (ID.equals( accounts[mid].getid())) {
                index = mid;  // value found at anArray[mid]
            } 
            else if (ID.compareTo( accounts[mid].getid()) < 0) {
                index = binarySearch(accounts, first, mid-1, ID);   // point X
            } 
            else {
                index = binarySearch(accounts, mid+1, numOfAccounts, ID);    // point Y
            }  // end if
        }  // end if

        return index;
    }  // end binarySearch

    public void writer(String copyFileName)
    {
        PrintWriter ofStream = null;
        try
        {
            ofStream = new PrintWriter(new FileWriter(copyFileName));
            String line;

            for(int i=0; i<numOfAccounts; i++)
            {
                // Get next account, at index i
                Account oneAccount = accounts[i];                
                ofStream.println(oneAccount.toString());
            }

            ofStream.close();
        }
        catch(IOException e)
        {
            System.out.println("Error copying file");
        }   //end catch
        finally
        {
            if (ofStream != null)
            {
                ofStream.close();
            } //end if
        }
    }
}
