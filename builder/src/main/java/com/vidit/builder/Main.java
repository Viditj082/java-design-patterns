package com.vidit.builder;

public class Main {

  public static void main(String[] args) {

    User user = new User.Userbuilder().setUsername("username").setAge(20).build();

    System.out.println(user.toString());

  }

}
