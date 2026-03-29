package com.vidit.factory.Singleton;

public class BillPughImplementation {

  private BillPughImplementation()
  {
     if(InstanceHolder.INSTANCE != null)
     {
       throw new IllegalStateException("Already initialized.");
     }
  }

  private static class InstanceHolder{
    private static final BillPughImplementation INSTANCE = new BillPughImplementation();
  }

  public static BillPughImplementation getInstance(){
    return InstanceHolder.INSTANCE;
  }

}
