/**
 * Write a description of class atm here.
 *
 * @author (Nicole and Shadman)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class ATM
{
    public static void main(String[] args) 
    {
        try
        {
            // Read data from a file into a Bank.
            // Each line of the file has info for one account.  
            BankInterface myBank = readFromFile("accounts.txt"); //make sure you create a notepad with the accounts info
            // Print all the data stored in the bank.
            System.out.println (myBank);

            String numStr, result;
            int num, again;
            Account accountResult;
            do 
            {
                numStr = JOptionPane.showInputDialog ("Enter your Account ID: ");

                accountResult = myBank.search(numStr);

                if (accountResult != null)
                    JOptionPane.showMessageDialog (null, accountResult);

            }
            while (accountResult == null);

            //Number 4: Ask user to pick a transaction
            String[] choices = { "Withdraw", "Check Balance", "Deposit"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
                    "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
                    // default
                    // icon
                    choices, // Array of choices
                    choices[1]); // Initial choice
            System.out.println(input); 

            // Execute transaction.
            executeTransaction(accountResult, input);   
            System.out.println(accountResult);
            // 7. Write file
            myBank.writer("out_accounts.txt");
        } //end of try

        catch (IOException ioe) {
            System.out.println("IOException in main: " + ioe.getMessage()); 
            ioe.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Exception in main: " + e.getMessage());
            e.printStackTrace();
        } // end catch
    }

    // Precondition: input is "Withdraw", "Check Balance", or "Deposit".
    public static void executeTransaction(Account accountExecute, String input)
    {
        // if input is "Check Balance", show the balance of accountExecute
        // else if input is "Deposit", ask user for amount, call deposit method on accountExecute
        // else ask user for amount, call "Withdraw" method on accountExecute
        JOptionPane panel = new JOptionPane();

        if(input.equals("Check Balance"))
        {
            Money cash = accountExecute.getBalance();
            //System.out.println(cash);
            panel.showMessageDialog(null, "Your account balance: " + cash.toString());
        }
        else if(input.equals("Deposit"))
        {
            String amountStr = panel.showInputDialog("How many cents would you like to deposit ?: ");
            long amountLong = Long.parseLong(amountStr);

            Money amountMoney = new Money(amountLong);
            accountExecute.deposit(amountMoney);
        }
        else // Invariant: input is "Withdraw"
        {
            String amountStr = panel.showInputDialog("How many cents would you like to withdraw ?: ");
            long amountLong = Long.parseLong(amountStr);

            Money amountMoney = new Money(amountLong);
            accountExecute.withdraw(amountMoney);

        }
    }

    /**
     * readFromFile:    **** INSERT COMMENTS ****
     * 
     */
    public static BankInterface readFromFile (String fileName) throws IOException
    {
        // Creata a bank.
        BankInterface myBank = new Bank("Nicole and Shadman ");

        // Open a file for reading.
        Scanner inputSource = new Scanner (new File(fileName));

        // while there are more tokens to read from the input source...
        while (inputSource.hasNext()) 
        {
            // Read one line of input from the file into an Account object
            Account acct = InputManager.readOneAccountFrom (inputSource);
            // Store the account info in the bank.
            myBank.addAccount(acct);
        } // end while

        return myBank;
    } // end readFromFile
}
