package MultiThreadingAndRelatedConcepts;

public class BlockSynchronizedDemo {
    private int value = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            value++;
        }
    }

    public int getValue() { return value; }

    public static void main(String[] args) throws InterruptedException {
        BlockSynchronizedDemo obj = new BlockSynchronizedDemo();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 500; i++) obj.increment(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 500; i++) obj.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Value: " + obj.getValue());
    }
}