package com.vidit.facade;

import java.util.List;

public class HomeTheaterFacade {

  private List<Device> devices;

  public HomeTheaterFacade() {
    this.devices = List.of(new Projector(), new Speaker(), new Lights());
  }

  public void action(Action action)
  {
    switch (action)
    {
      case ON -> devices.forEach(Device::on);
      case OFF -> devices.forEach(Device::off);
      case PLAY -> devices.forEach(Device::play);
      case PAUSE -> devices.forEach(Device::pause);
    }
  }
}
