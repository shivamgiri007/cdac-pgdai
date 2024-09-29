"""1. Define a class to represent a bank account. Include the following members: 
Data Members:
a.Name of the Depositor
b.Account Number
c.Type of Account
d.Balance amount in the account
Data Methods:
a.To assign initial values
b.To deposit an amount
c.To withdraw an amount
d.To display name and balance.

Output:
1. New customer
2. Deposit
3. Withdrawal
4. Display
5. Exit"""

class BankAccount:
    def __init__(self, name, account_number, account_type, balance=0.0):
        self.name = name  
        self.account_number = account_number  
        self.account_type = account_type  
        self.balance = balance  

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print("Deposited: ",amount ," New Balance: ",self.balance)
        else:
            print("Invalid deposit amount.")

    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
            print("Withdrawn: ",amount ," New Balance: ",self.balance)
        else:
            print("Invalid withdrawal amount or insufficient funds.")

    def display(self):
        print("Account Holder: ",self.name)
        print("Account Number: ",self.account_number)
        print("Account Type: ",self.account_type)
        print("Balance: ",self.balance)

def main():
    account = None
    
    while True:
        print("\n1. New Customer")
        print("2. Deposit")
        print("3. Withdrawal")
        print("4. Display")
        print("5. Exit")
        
        choice = int(input("Enter your choice: "))
        
        if choice == 1:
            name = input("Enter the name of the depositor: ")
            account_number = input("Enter the account number: ")
            account_type = input("Enter the type of account: ")
            account = BankAccount(name, account_number, account_type)
            print("New account created successfully.")
        
        elif choice == 2:
            if account:
                amount = float(input("Enter amount to deposit: "))
                account.deposit(amount)
            else:
                print("No account found. Please create an account first.")
        
        elif choice == 3:
            if account:
                amount = float(input("Enter amount to withdraw: "))
                account.withdraw(amount)
            else:
                print("No account found. Please create an account first.")
        
        elif choice == 4:
            if account:
                account.display()
            else:
                print("No account found. Please create an account first.")
        
        elif choice == 5:
            print("Exiting the program.")
            break
            
        else:
            print("Invalid choice. Please try again.")


main()
