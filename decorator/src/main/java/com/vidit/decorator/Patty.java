package com.vidit.decorator;

public class Patty extends BurgerAddon{


  public Patty(Burger burger)
  {
   super(burger);
  }

  @Override
  public Integer getCost() {
    return this.getBurger().getCost()+40;
  }

}
