class SetPriority implements Runnable {

    public void run() {
        System.out.println(
                Thread.currentThread().getName() +
                        " is running");
    }
}

public class Pri_Thread {

    public static void main(String[] args) {

        SetPriority task = new SetPriority();

        Thread t1 = new Thread(task, "FCT - Task1");
        Thread t2 = new Thread(task, "FCT - Task2");
        Thread t3 = new Thread(task, "FCT - Task3");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        t3.setPriority(Thread.NORM_PRIORITY); // 5

        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.getName());
    }
}