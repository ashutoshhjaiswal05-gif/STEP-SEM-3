abstract class PaymentTransaction {
    String type;
    double amount;
    public PaymentTransaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public abstract double getAdjustedAmount();
}

class CardPayment extends PaymentTransaction {
    public CardPayment(double amount) { super("CARD", amount); }
    @Override public double getAdjustedAmount() { return amount * 1.02; } // 2% fee
}

class WalletPayment extends PaymentTransaction {
    public WalletPayment(double amount) { super("WALLET", amount); }
    @Override public double getAdjustedAmount() { return amount * 1.01; } // 1% fee
}

class UpiPayment extends PaymentTransaction {
    public UpiPayment(double amount) { super("UPI", amount); }
    @Override public double getAdjustedAmount() { return amount; } // 0% fee
}

public class PaymentSystemFeeCalculator {
    public static void main(String[] args) {
        PaymentTransaction t1 = new CardPayment(1000.0);
        PaymentTransaction t2 = new WalletPayment(500.0);
        PaymentTransaction t3 = new UpiPayment(2000.0);
        System.out.printf("%s: %.2f\n", t1.type, t1.getAdjustedAmount());
        System.out.printf("%s: %.2f\n", t2.type, t2.getAdjustedAmount());
        System.out.printf("%s: %.2f\n", t3.type, t3.getAdjustedAmount());
    }
}
