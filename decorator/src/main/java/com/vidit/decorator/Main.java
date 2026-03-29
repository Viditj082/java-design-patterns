package com.vidit.decorator;

public class Main {

  public static void main(String[] args) {

    Burger vegburger = new VegBurger();
    System.out.println("Cost of Veg Burger: "+vegburger.getCost());
    vegburger = new Cheese(vegburger);
    System.out.println("Cost of Veg Burger with Cheese: "+vegburger.getCost());
    vegburger = new Patty(vegburger);
    System.out.println("Cost of Veg Burger with Cheese and Patty: "+vegburger.getCost());

    Burger mexicanburger = new MexicanBurger();
    System.out.println("Cost of Veg Burger: "+mexicanburger.getCost());
    mexicanburger = new Cheese(mexicanburger);
    System.out.println("Cost of Veg Burger with Cheese: "+mexicanburger.getCost());
    mexicanburger = new Patty(mexicanburger);
    System.out.println("Cost of Veg Burger with Cheese and Patty: "+mexicanburger.getCost());

  }

}
