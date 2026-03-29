package com.vidit.decorator;

import lombok.Getter;

@Getter
public abstract class BurgerAddon implements Burger{

  private Burger burger;

  public BurgerAddon(Burger burger)
  {
    this.burger = burger;
  }
}
