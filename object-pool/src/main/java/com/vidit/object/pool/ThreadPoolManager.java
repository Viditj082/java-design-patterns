package com.vidit.object.pool;

import java.util.HashSet;
import java.util.Set;

public class ThreadPoolManager {

  private static final Integer SIZE = 10;

  private static final Runnable TASK = ()-> System.out.println("Task is running.");

  private Set<Thread> availableThreads = new HashSet<>();

  private Set<Thread> inUseThreads = new HashSet<>();

  private ThreadPoolManager()
  {
    if(ThreadPoolManagerHolder.INSTANCE != null)
    {
      throw new IllegalStateException("Already initialized.");
    }
  }

  public void initializeThreadPool()
  {
    for(int i = 0; i < SIZE; i++)
    {
      availableThreads.add(addThread());
    }
  }

  private Thread addThread()
  {
    return new Thread(TASK);
  }

  public Thread getWorkerThread(Runnable task)
  {
    if(availableThreads.isEmpty())
    {
      throw new IllegalStateException("No threads available.");
    }

    Thread thread = availableThreads.iterator().next();
    availableThreads.remove(thread);
    inUseThreads.add(thread);

    return thread;
    }

  public void releaseWorkerThread(Thread thread)
  {
    if(inUseThreads.contains(thread))
    {
      inUseThreads.remove(thread);
      availableThreads.add(thread);
    }
    else
    {
      throw new IllegalStateException("Thread not in use.");
    }
  }

  private static class ThreadPoolManagerHolder{
    private static final ThreadPoolManager INSTANCE = new ThreadPoolManager();
  }

  public static ThreadPoolManager getInstance()
  {
    return ThreadPoolManagerHolder.INSTANCE;
  }

}
