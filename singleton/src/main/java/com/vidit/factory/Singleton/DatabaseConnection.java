package com.vidit.factory.Singleton;

public enum DatabaseConnection {
  INSTANCE;

  // You can add fields just like a regular class
  private String connectionUrl = "jdbc:postgresql://localhost:5432/mydb";

  // You can add methods
  public void connect() {
    System.out.println("Connecting to: " + connectionUrl);
  }

  public String getConnectionUrl() {
    return connectionUrl;
  }
}

//public class Main {
//  public static void main(String[] args) {
//    // Access the singleton instance directly
//    DatabaseConnection db = DatabaseConnection.INSTANCE;
//    db.connect();
//  }
//}


// The Enum Singleton is widely regarded as the most robust way to implement the pattern in Java. It was
// popularized by Joshua Bloch in Effective Java because it solves several
// deep-seated issues that plague class-based implementations (like Reflection and Serialization) with almost zero
// boilerplate code.

//Why it is the "Gold Standard"?

// 1. Absolute Thread SafetyThe JVM guarantees that enum constants are instantiated in a thread-safe manner
// during class loading. You don't need synchronized blocks, volatile keywords, or double-checked locking.
// It is handled natively by the ClassLoader.
//
// 2. Immunity to Reflection AttacksIn class-based Singletons,
// a developer can use setAccessible(true) on a private constructor to create a second instance.
// The Enum Defense: The Java reflection inner-workings explicitly check if a class is an enum.
// If you try to reflectively instantiate an enum, the JVM throws an IllegalArgumentException stating
// "Cannot reflectively create enum objects."3. Built-in Serialization SupportStandard Singletons
// require you to implement readResolve() to prevent the serialization mechanism from creating
// a new instance when the object is "de-serialized" from a file or network.
// The Enum Defense: Java ensures that during deserialization, only the existing constant is linked back.
// It is impossible to have two instances of the same enum constant in one JVM.
//
// The Trade-offs (Cons)While powerful, there are two specific limitations to keep in mind:
// 1. No Lazy Initialization: Enum constants are created as soon as the Enum class is referenced.
// If your Singleton is a "heavy" object (e.g., it loads 1GB of data into cache),
// it will take up that memory immediately upon class loading, even if you don't use it yet.
//
// 2.No Inheritance: Enums in Java cannot extend another class (because they implicitly extend java.lang.Enum).
// They can, however, implement interfaces.Comparison SummaryFeatureClass-based (Bill Pugh)Enum-basedThread SafetyHigh
// (Internal)High (Native)Lazy LoadingYesNoReflection SafeNoYesSerialization SafeRequires readResolve()Yes (Automatic)