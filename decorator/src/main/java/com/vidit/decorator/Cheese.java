package com.vidit.decorator;

public class Cheese extends BurgerAddon{

  public Cheese(Burger burger)
  {
    super(burger);
  }

  @Override
  public Integer getCost() {
    return this.getBurger().getCost()+20;
  }
}
