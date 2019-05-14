/**
 * Write a description of class BankInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface BankInterface
{

    public void addAccount (Account a1);

    /** Adds an account to bank
     *  Precondition: Requires an account that includes Name, ID, and balance
     *  Postcondition: Adds the account to bank, increasing number of accounts
     **/

    public Account search(String AccountId);

    /** Searches account in bank based on ID
     * Precondition: Requires an ID, implements binarySearch
     * Post condition: returns account found based on ID
     */

    public void deposit(String id, Money cash);

    /** Deposits money to account in bank
     * Precondition: Requires ID using search method, requires a Money object,
     * uses the deposit method found in Account class
     * Postcondition: Deposits (adds to balance) Money object into account found using search method
     */

    public void withdraw(String id, Money cash);

    /** Withdraws money from account in bank
     * Precondition: Requires ID using search method, requires a Money object,
     * uses the deposit method found in Account class
     * Postcondition: Withdraws (subtracts from balance) Money object from account found using search method
     */

    public String toString();

    /** Converts to String
     * Precondition: none
     * Postcondition: Returns bank name and account (which is converted to string)
     */
    
    //Precondition: Accounts sorted
    //Postcondition: All accounts are written to a file named given in parameter
    public void writer(String copyFileName);
}
