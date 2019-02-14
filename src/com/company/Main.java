package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        sequence s = sequence.i();

        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();

        RunnableDemo R3 = new RunnableDemo( "Thread-3");
        R3.start();

        RunnableDemo R4 = new RunnableDemo( "Thread-4");
        R4.start();

        System.out.println(s.getValue());

    }
}
