package com.vidit.facade;

public class Lights implements Device {
  @Override
  public void on() {
    System.out.println("Lights are on");
  }

  @Override
  public void off() {
    System.out.println("Lights are off");
  }

  @Override
  public void play() {
    System.out.println("Lights are playing");
  }

  @Override
  public void pause() {
    System.out.println("Lights are paused");
  }
}
