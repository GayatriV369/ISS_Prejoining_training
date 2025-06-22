package MultiThreadingAndRelatedConcepts;

public class ThreadSafeInstanceDemo {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() { return count; }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeInstanceDemo obj = new ThreadSafeInstanceDemo();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) obj.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) obj.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final count: " + obj.getCount());
    }
}