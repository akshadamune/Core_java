class Task extends Thread {

    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println(
                    Thread.currentThread().getName() + " running " + i);
        }
    }
}

public class Thread_SchedularExample {

    public static void main(String[] args) {

        Task t1 = new Task();
        Task t2 = new Task();

        t1.setName("FCT - Task1");
        t2.setName("FCT - Task2");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
    }
}
