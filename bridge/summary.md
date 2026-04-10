# Bridge Design Pattern: Java Summary

The **Bridge Pattern** is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—**Abstraction** and **Implementation**—which can be developed independently.

---

## 1. The Core Structure

- **Abstraction:** High-level control logic (The "What"). It maintains a reference to the Implementor.
- **Refined Abstraction:** Extended variants of the high-level logic (e.g., Priority vs. Regular).
- **Implementor (The Bridge):** The interface for platform-specific logic (The "How").
- **Concrete Implementors:** The actual platform-specific code (e.g., Windows vs. Linux).

---

## 2. Code Example: OS-Independent File Downloader

### The Implementor (The "How")
```java
// The Bridge Interface
interface OS {
    void downloadData(String url);
}

// Concrete Implementor A
class WindowsOS implements OS {
    @Override
    public void downloadData(String url) { 
        System.out.println("Windows: Downloading via BITS Service: " + url); 
    }
}

// Concrete Implementor B
class LinuxOS implements OS {
    @Override
    public void downloadData(String url) { 
        System.out.println("Linux: Downloading via wget: " + url); 
    }
}