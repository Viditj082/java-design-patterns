package com.vidit.facade;

public class Speaker implements Device{
  @Override
  public void on() {
    System.out.println("Speaker is on");
  }

  @Override
  public void off() {
    System.out.println("Speaker is off");
  }

  @Override
  public void play() {
    System.out.println("Speaker is playing");
  }

  @Override
  public void pause() {
    System.out.println("Speaker is paused");
  }
}
