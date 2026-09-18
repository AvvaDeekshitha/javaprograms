class BankAccount {
    private double balance;

    void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Balance: Rs." + account.getBalance());
    }
}
