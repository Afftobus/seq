package com.company;

/**
 * Created by afilippov on 14.02.2019.
 */
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    private sequence s;

    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );

        s = sequence.i();
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 10; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i + " seq_value = "+ s.nextVal());
                // Let the thread sleep for a while.
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}