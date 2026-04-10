package com.vidit.facade;

//The Facade Design Pattern provides a unified interface to a set of interfaces in a subsystem.
// This Java design pattern simplifies complex system interactions.

// We can think of it as borrowing some basic/common functionalities
// from multiple similar classes and providing a single interface for usage to the client.

public class Main {

  public static void main(String[] args) {
    HomeTheaterFacade homeTheater = new HomeTheaterFacade();
    homeTheater.action(Action.ON);
    homeTheater.action(Action.PLAY);
    homeTheater.action(Action.PAUSE);
    homeTheater.action(Action.OFF);

  }
}
