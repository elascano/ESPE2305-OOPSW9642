package ec.edu.espe.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

