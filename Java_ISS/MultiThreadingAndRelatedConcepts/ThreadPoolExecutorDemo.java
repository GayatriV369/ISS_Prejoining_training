package MultiThreadingAndRelatedConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 executed"));
        executor.submit(() -> System.out.println("Task 2 executed"));
        executor.shutdown();
    }
}