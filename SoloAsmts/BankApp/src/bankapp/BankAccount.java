package bankapp;

/**
 *
 * @author maddielansbury
 */
public class BankAccount implements Comparable<BankAccount> {
    
    private String name = "";
    private double balance = 0;

    /**
     * Creates a new BankAccount with a name and a balance.
     * @param name The name for the account.
     * @param balance The balance for the account.
     */
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    /**
     * @return The name of the account.
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return The balance of the account.
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Allows comparison between BankAccounts by balance.
     * @param other The BankAccount to compare to.
     * @return 1 if balance is greater than the balance of the other account,
     * -1 if balance is less than the balance of the other account, and 0 if the
     * balance is equal to the balance of the other account.
     */
    @Override
    public int compareTo(BankAccount other) {
        if(balance > other.balance) return 1;
        if(balance < other.balance) return -1;
        return 0;
    }
    
}
