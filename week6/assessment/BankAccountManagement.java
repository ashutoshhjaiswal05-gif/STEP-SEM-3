class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public void displayAccount() {
        System.out.printf("Acc No: %s | Holder: %s | Balance: $%.2f\n", accountNumber, accountHolder, balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC12345", "Charlie", 1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.displayAccount();
    }
}
