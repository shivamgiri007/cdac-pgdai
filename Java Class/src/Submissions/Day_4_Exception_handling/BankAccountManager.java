package Submissions.Day_4_Exception_handling;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankAccountManager {
    private static BankAccount[] accounts = new BankAccount[100]; // Array to hold up to 100 accounts
    private static int accountCount = 0; // To keep track of the number of accounts

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            String[] parts = command.split(" ");

            switch (parts[0].toLowerCase()) {
                case "createaccount":
                    createAccount(parts);
                    break;
                case "deposit":
                    deposit(parts);
                    break;
                case "withdraw":
                    withdraw(parts);
                    break;
                case "balance":
                    checkBalance(parts);
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

    private static void createAccount(String[] parts) {
        if (parts.length != 4) {
            System.out.println("Usage: createAccount <accountNumber> <accountHolderName> <initialBalance>");
            return;
        }
        String accountNumber = parts[1];
        String accountHolderName = parts[2];
        double initialBalance;

        try {
            initialBalance = Double.parseDouble(parts[3]);
        } catch (NumberFormatException e) {
            System.out.println("Initial balance must be a valid number.");
            return;
        }

        // Check if the account already exists
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Account with number " + accountNumber + " already exists.");
                return;
            }
        }

        // Create a new account and add it to the array
        accounts[accountCount] = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accountCount++;
        System.out.println("Account created: " + accountNumber + " for " + accountHolderName);
    }

    private static void deposit(String[] parts) {
        if (parts.length != 3) {
            System.out.println("Usage: deposit <accountNumber> <amount>");
            return;
        }
        String accountNumber = parts[1];
        double amount;

        try {
            amount = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Deposit amount must be a valid number.");
            return;
        }

        // Find the account and deposit the amount
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    private static void withdraw(String[] parts) {
        if (parts.length != 3) {
            System.out.println("Usage: withdraw <accountNumber> <amount>");
            return;
        }
        String accountNumber = parts[1];
        double amount;

        try {
            amount = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Withdrawal amount must be a valid number.");
            return;
        }

        // Find the account and withdraw the amount
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    private static void checkBalance(String[] parts) {
        if (parts.length != 2) {
            System.out.println("Usage: balance <accountNumber>");
            return;
        }
        String accountNumber = parts[1];

        // Find the account and check the balance
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Balance for account " + accountNumber + ": " + accounts[i].getBalance());
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }
}
