package com.test;

// import statement  
import java.io.*;

// The ThreadJoin class is the child class of the class Thread  
 public class ThreadJoin extends Thread
{
    // overriding the run method
    public void run()
    {
        for (int j = 0; j < 2; j++)
        {
            try
            {
// sleeping the thread for 300 milli seconds  
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }
// catch block for catching the raised exception  
            catch(Exception e)
            {
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println( j );
        }
    }
}

 class ThreadJoinExample
{
    // main method
    public static void main (String argvs[]) throws  Exception
    {

        // Create a thread
        Thread myThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Value " + i);
            }
        });

        // Start the thread
        myThread.start();

        // Wait for the thread to finish before continuing
        myThread.join(500);

        System.out.println("Thread has finished, and now I can proceed with the main thread.");
    }
}  