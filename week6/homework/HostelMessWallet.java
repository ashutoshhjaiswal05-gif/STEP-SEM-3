class MessWallet {
    String rollNo;
    double balance;

    public MessWallet(String rollNo, double initialBalance) {
        this.rollNo = rollNo;
        this.balance = initialBalance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void deductMeal(double cost) {
        if (balance >= cost) {
            balance -= cost;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.printf("Roll No: %s | Mess Wallet Balance: $%.2f\n", rollNo, balance);
    }
}

public class HostelMessWallet {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet("21CS101", 500.0);
        wallet.deductMeal(80.0);
        wallet.addMoney(200.0);
        wallet.displayBalance();
    }
}
