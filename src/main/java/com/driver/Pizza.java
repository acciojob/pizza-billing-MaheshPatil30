package com.driver;

public class Pizza {
    protected double basePrice;
    protected boolean extraCheeseAdded;
    protected boolean extraToppingsAdded;
    protected boolean paperBagAdded;

    public Pizza(double basePrice) {
        this.basePrice = basePrice;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            basePrice += 80;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            basePrice += (this instanceof DeluxePizza) ? 0 : 70;
        }
    }

    public void addPaperBag() {
        if (!paperBagAdded) {
            paperBagAdded = true;
            basePrice += 20;
        }
    }

    public double calculateTotalPrice() {
        return basePrice;
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            bill.append("Extra Cheese Added: 80\n");
        }
        if (extraToppingsAdded && !(this instanceof DeluxePizza)) {
            bill.append("Extra Toppings Added: 70\n");
        }
        if (extraToppingsAdded && (this instanceof DeluxePizza)) {
            bill.append("Extra Toppings Added: 120\n");
        }
        if (paperBagAdded) {
            bill.append("Paperbag Added: 20\n");
        }
        bill.append("Total Price: ").append(calculateTotalPrice());
        return bill.toString();
    }
}
