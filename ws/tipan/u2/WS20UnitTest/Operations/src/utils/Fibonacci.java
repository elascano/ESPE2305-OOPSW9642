
package utils;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Fibonacci {
    public static int[] generateFibonacciSequence(int n) {
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = calculateFibonacci(i);
        }
        return sequence;
    }
    
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int result = 0;

            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }

            return result;
        }
    }
}

