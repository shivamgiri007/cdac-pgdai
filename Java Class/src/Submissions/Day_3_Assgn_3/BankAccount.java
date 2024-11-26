package ClassSolutions.Day_3_Assgn_3;
//Q 5    Design a class to represent bank account. Include members:
//a.    Data members
//i.      Name of depositor
//ii.    Account number
//iii.    Type of account
//iv.    Balance amount
//b.    Methods
//i.    To assign value  
//ii.    To deposit amount
//iii.    To withdraw amount
//iv.    To display name and balance .

class BankAccount {
    // Data members
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display name and balance
    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Main method to demonstrate the BankAccount class
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("John Doe", "123456789", "Savings", 1000.0);

        // Display account details
        account.display();

        // Deposit some amount
        account.deposit(500.0);
        account.display();

        // Withdraw some amount
        account.withdraw(200.0);
        account.display();

        // Attempt to withdraw more than the balance
        account.withdraw(1500.0);
        account.display();
    }
}
