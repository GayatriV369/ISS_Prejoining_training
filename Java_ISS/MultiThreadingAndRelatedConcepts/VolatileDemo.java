package MultiThreadingAndRelatedConcepts;

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread writer = new Thread(() -> {
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            flag = true;
            System.out.println("Flag set to true");
        });

        Thread reader = new Thread(() -> {
            while (!flag) { /* busy wait */ }
            System.out.println("Flag detected as true");
        });

        writer.start();
        reader.start();
        writer.join();
        reader.join();
    }
}