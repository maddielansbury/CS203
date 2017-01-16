package bankapp;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author maddielansbury
 */
public class BankSystem {
    
    private final ArrayList<BankAccount> accounts;
    
    /**
     * Creates a BankSystem with an ArrayList of BankAccounts as accounts.
     */
    public BankSystem() {
        accounts = new ArrayList<>();
    }
    
    /**
     * Adds a new BankAccount to the accounts ArrayList.
     * @param name The name for the account.
     * @param balance The balance for the account.
     */
    public void add(String name, double balance) {
        BankAccount account = new BankAccount(name, balance);
        accounts.add(account);
    }
    
    /**
     * Prints accounts, the list of all BankAccounts.
     */
    public void print() {
        for (BankAccount account : accounts) {
            System.out.println(account.getName() + " " + account.getBalance());
        }
    }
    
    /**
     * Sorts accounts by increasing balance order.
     */
    public void sort() {
        Collections.sort(accounts);
    }
    
}
