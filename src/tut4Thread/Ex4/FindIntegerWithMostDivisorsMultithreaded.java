package tut4Thread.Ex4;

import java.util.concurrent.atomic.AtomicInteger;

public class FindIntegerWithMostDivisorsMultithreaded {
    private static final int NUM_THREADS = 4; // Adjust the number of threads as needed
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 200000;
    private static final AtomicInteger maxDivisors = new AtomicInteger(0);
    private static final AtomicInteger integerWithMaxDivisors = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];
        int groupSize = (END_RANGE - START_RANGE + 1) / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            final int start = START_RANGE + i * groupSize;
            final int end = (i == NUM_THREADS - 1) ? END_RANGE : start + groupSize - 1;

            threads[i] = new Thread(new DivisorFinder(start, end));
        }

        // Start all threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Integer with the most divisors: " + integerWithMaxDivisors.get());
        System.out.println("Number of divisors: " + maxDivisors.get());
    }

    public static class DivisorFinder implements Runnable {
        private final int start;
        private final int end;

        public DivisorFinder(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            int localMaxDivisors = 0;
            int localIntegerWithMaxDivisors = 0;

            for (int num = start; num <= end; num++) {
                int divisors = countDivisors(num);
                if (divisors > localMaxDivisors) {
                    localMaxDivisors = divisors;
                    localIntegerWithMaxDivisors = num;
                }
            }

            updateGlobalMax(localMaxDivisors, localIntegerWithMaxDivisors);
        }

        public int countDivisors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            return count;
        }

        public void updateGlobalMax(int localMax, int localInteger) {
            synchronized (maxDivisors) {
                if (localMax > maxDivisors.get()) {
                    maxDivisors.set(localMax);
                    integerWithMaxDivisors.set(localInteger);
                }
            }
        }
    }
}
