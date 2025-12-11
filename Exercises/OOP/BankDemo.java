package OOP;

import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("Awvyyy", "BB1234", 1000.0);
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        double amount;


        while (true) {
            System.out.println("\nChoose action:");
            System.out.println("1 - Show balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nBalance: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter amount: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }

}


class BankAccount {
    private String owner;
    private String accountNumber;
    private double balance;

    public BankAccount(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be a positive amount.");
            return;
        }
        balance += amount;
        System.out.println("\nDeposited " + amount + " New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw must be a positive amount.");
            return;
        }
        if (amount > balance){
            System.out.println("Not enough funds. Current balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("\nWithdrawn: " + amount + " New balance: " + balance);
    }
}


