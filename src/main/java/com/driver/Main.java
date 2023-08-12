package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza vegPizza = new Pizza(300);
    vegPizza.addExtraCheese();
    vegPizza.addExtraToppings();
    vegPizza.addPaperBag();
    System.out.println("Example 1:");
    System.out.println(vegPizza.generateBill());

    System.out.println();

    DeluxePizza nonVegDeluxePizza = new DeluxePizza(400);
    nonVegDeluxePizza.addExtraCheese();
    nonVegDeluxePizza.addPaperBag();
    System.out.println("Example 2:");
    System.out.println(nonVegDeluxePizza.generateBill());
  }
}
