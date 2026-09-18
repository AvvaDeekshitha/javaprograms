class Account {
    int accountNumber;
    double balance;
    String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred Rs." + amount +
                               " to Account " + receiver.accountNumber);
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, "Savings");
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: Rs." + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount(101, 10000, 5);

        CurrentAccount current =
            new CurrentAccount(102, 5000, 3000);

        System.out.println("----- SAVINGS ACCOUNT -----");
        savings.displayDetails();
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.calculateInterest();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        current.displayDetails();
        current.deposit(3000);
        current.withdraw(9000);

        System.out.println("\n----- TRANSFER -----");
        savings.transfer(current, 2000);

        System.out.println("\n----- FINAL DETAILS -----");
        savings.displayDetails();
        current.displayDetails();
    }
}
