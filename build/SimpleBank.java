import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Starting balance
        boolean isRunning = true;

        System.out.println("--- Welcome to Java Bank ---");

        while (isRunning) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited $" + deposit);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Successfully withdrew $" + withdrawal);
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using Java Bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
