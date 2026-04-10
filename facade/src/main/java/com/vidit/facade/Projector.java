package com.vidit.facade;

public class Projector implements Device{
  @Override
  public void on() {
    System.out.println("Projector is on");
  }

  @Override
  public void off() {
    System.out.println("Projector is off");
  }

  @Override
  public void play() {
    System.out.println("Projector is playing");
  }

  @Override
  public void pause() {
    System.out.println("Projector is paused");
  }
}
