class Cart {
    private double[] prices;
    private int count;

    public Cart(int maxItems) {
        prices = new double[maxItems];
        count = 0;
    }

    public void addPrice(double price) {
        if (count < prices.length && price > 0) {
            prices[count++] = price;
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += prices[i];
        }
        return total;
    }

    public int getItemCount() {
        return count;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Cart cart = new Cart(10);
        cart.addPrice(250);
        cart.addPrice(99);
        cart.addPrice(151);
        System.out.println("Total: " + cart.getTotal() + " | Item Count: " + cart.getItemCount());
    }
}
