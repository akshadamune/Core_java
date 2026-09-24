class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Multithreding_Example {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        // run() → contains the task/code that the thread performs. (perfrom in
        // overriding)
        // start() → starts a new thread and then automatically calls run().

        Thread t3 = new Thread();
        t3.start();
        System.out.println(t3.getName());
    }
}