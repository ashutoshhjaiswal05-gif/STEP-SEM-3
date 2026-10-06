public class PiggyBank {
    private final String id;
    private double balance;

    public PiggyBank(String id) {
        this.id = id;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1001");
        pb.deposit(50.0);
        System.out.println("Balance after deposit: " + pb.getBalance());
        boolean success = pb.withdraw(20.0);
        System.out.println("Withdraw 20 success: " + success + " | New Balance: " + pb.getBalance());
    }
}
