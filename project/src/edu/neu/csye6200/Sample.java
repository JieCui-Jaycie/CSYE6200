package edu.neu.csye6200;
import java.text.SimpleDateFormat;
import java.util.Date;

class Cart {
    private static final String REVISION = "1.0";
    private double total;
    private double cashPaid;
    private double change;

    public Cart() {
        this.total = 0;
        this.cashPaid = 0;
        this.change = 0;
    }

    public void addItem(Item item) {
        this.total += item.getPrice();
    }

    public void checkout(double cash) {
        this.cashPaid = cash;
        this.change = cash - total;
    }

    public String getReceipt() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        return "Receipt:\n" +
               "Date: " + date + "\n" +
               "Items:\n" + this +
               "Total: $" + total + "\n" +
               "Paid: $" + cashPaid + "\n" +
               "Change: $" + change;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Assuming there's a way to get all items, for simplicity, we'll just return an empty string
        return sb.toString();
    }

    public static void demo() {
        Cart cart = new Cart();
        // Creating items and adding them to the cart
        cart.addItem(new Item("Apple", 0.99));
        cart.addItem(new Item("Bread", 1.99));
        cart.addItem(new Item("Milk", 2.49));

        // Checkout and pay
        cart.checkout(20);

        // Show receipt
        System.out.println(cart.getReceipt());
    }
}

class Item {
    private static final String REVISION = "1.0";
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

public class Sample {
    public static void main(String[] args) {
        Cart.demo();
    }
}