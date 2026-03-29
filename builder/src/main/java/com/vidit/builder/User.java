package com.vidit.builder;

public class User {

  private final String username;
  private final int age;

  private User(Userbuilder userbuilder)
  {
    this.username = userbuilder.username;
    this.age = userbuilder.age;
  }

  public static class Userbuilder{
    private String username;
    private int age;

    public Userbuilder setUsername(String username) {
      this.username = username;
      return this;
    }

    public Userbuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", age=" + age +
        '}';
  }

}

