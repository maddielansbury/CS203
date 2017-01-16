package bankapp;

/**
 *
 * @author maddielansbury
 */
public class BankApp {

    /**
     * Creates a new BankSystem and adds several accounts with names and
     * balances to it. Then prints all of the accounts, sorts them, and prints
     * them again.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankSystem sys = new BankSystem();
        sys.add("Maddie", 500);
        sys.add("Marlon", 175.50);
        sys.add("Alvaro", 3005000.05);
        sys.add("Nicole", 7500);
        sys.add("Fran", 0);
        sys.add("Manda", 45320.32);
        sys.add("Carter", 20.01);
        sys.sort();
        sys.print();
    }
    
}
