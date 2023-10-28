class PrinterDemo2 extends Thread {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("rahul")) {
            synchronized (lock1) {
                System.out.println(name + " is holding lock1");
                // Do not release the lock1
                try {
                    lock1.wait(); // Wait indefinitely
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println(name + " is holding lock2");
                // Do not release the lock2
                try {
                    lock2.wait(); // Wait indefinitely
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }
}

public class Deadlock {
    public static void main(String[] args) {
        PrinterDemo2 p1 = new PrinterDemo2();
        PrinterDemo2 p2 = new PrinterDemo2();
        p1.setName("rahul");
        p2.setName("sweta");
        p1.start();
        p2.start();
    }
}
