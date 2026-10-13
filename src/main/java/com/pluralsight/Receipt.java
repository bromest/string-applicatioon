package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "apples";
        double itemPrice = 2.36;
        int quantity = 3;

        double totalCost = itemPrice * quantity;
        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalCost);
    }
}
