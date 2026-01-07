public class BankAccount {

    // Instance variables (state)
    private String accountHolder;
    private double balance;

    // Constructor (runs when object is created)
    public BankAccount(String name, double startingBalance) {
        accountHolder = name;
        balance = startingBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }

    // Display account info
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    // Program entry point
    public static void main(String[] args) {

        // Create an object using constructor
        BankAccount account = new BankAccount("Alex Johnson", 500.00);

        // Use object methods
        account.displayAccount();
        account.deposit(200);
        account.withdraw(100);
        account.displayAccount();
    }
}
