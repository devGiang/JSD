package tut4Thread.Ex3;

public class FindIntegerWithMostDivisors {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int startRange = 1;
        int endRange = 200000;

        int maxDivisors = 0;
        int integerWithMaxDivisors = 0;

        for (int num = startRange; num <= endRange; num++) {
            int divisors = countDivisors(num);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                integerWithMaxDivisors = num;
            }
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
        System.out.println("Integer with the most divisors: " + integerWithMaxDivisors);
        System.out.println("Number of divisors: " + maxDivisors);
    }

    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
