# ATM
CSC 175 Intermediate Programming
Spring 2019
Project Assignment


This project builds upon previous lab exercises and examples of Dialog Boxes and File I/O.
Design and implement an ADT representing a bank. The data of the ADT should include a collection (which could be an array or ListInterface or Vector or preferably an ArrayList) of Account. You may reuse the ADT Account you implemented for lab. Add to your ADT Account a compareTo(Account acc) method for comparing two Account objects, based on their account numbers. For the ADT Bank, include operations for adding a new account (account numbers must be unique; no duplicates allowed), removing an account (given the account number), sorting (you may use one of the following: selection sort, insertion sort, mergesort, or quicksort; see SortsClass.java ), searching for the account information (name and balance) associated with a given account number, depositing an amount to a given account, and withdrawing an amount from a given account; when implementing these operations, reuse when possible the methods of the ADT Account.

Design and implement a bank ATM driver class with methods for each of the following (use additional helper classes and methods as needed):
Read account information into a Bank object from a file: in_accounts.txt . Each line of the input file has info for one account, i.e. id, name, balance. (This was a 4/17 lab exercise.)
Ask the user to login by entering id, using a dialog box or standard input.
Validate id.
Ask the user to enter a transaction (check balance / deposit / withdraw) using a dialog box or standard input.
Validate the transaction.
Execute the transaction.
When the user is done, write all account information (one line per account) in sorted ascending order of account ids, to an output file out_accounts.txt (see example of writing text to a file (which uses predefined classes in the java.io package: PrintWriter and FileWriter, so import java.io.PrintWriter; import java.io.FileWriter;), taken from examples of Dialog Boxes and File I/O).
"Validate" means check that the user input is valid (depending on how you read it in). Take appropriate action in the case of the user entering invalid data (e.g. displaying a message to the user and allowing the user to try again) rather than crashing or using the invalid data in subsequent operations.
Your application should not crash upon an exception being thrown; rather it should be caught and handled appropriately (e.g. no change to the account and a message to the user).
Once you have the above working, incorporate overdraft protection by introducing a subclass of Account called Checking (previous lab exercise), which has an instance variable overdraftMaximum and overrides the withdraw method of Account so that it checks whether the amount to be withdrawn exceeds the balance by more than overdraftMaximum; if so, it throws an exception: InsufficientFundsException; otherwise, it performs the withdrawal. For example, if the balance is 100.00, and the account is a regular checking account (no overdraft protection), then the account holder can withdraw up to 100.00; if the balance is 100.00, and the account has overdraft protection with an overdraft maximum of 50.00, then the account holder can withdraw up to 150.00. Each line of the input file now looks like this: id, name, balance, account type (s = savings, c = checking), and overdraft maximum (if account type is checking) or interest rate (if account type is savings). Note: your application should not crash upon an InsufficientFundsException being thrown; rather it should be caught and handled appropriately (i.e. no change to the account and a message to the user). If you did not do the lab exercises on Savings and InsufficientFundsException because you did the corresponding exercises for the game Explore, that is ok -- just hand in those exercises (and substitute "r = regular account" in place of "s = savings", in the description above).
