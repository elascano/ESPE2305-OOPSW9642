
package basic.operations;

import java.util.Scanner;

/**
 *
 * @author USER
 */

public class BasicOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = 12;
        
        int factorial = calculateFactorial(number);
        System.out.println("Factorial is " + factorial);
        
        System.out.print("Enter the number: ");
        int numberdi = scanner.nextInt();
        scanner.close();
        
        evaluateNumber(numberdi);
    }
    
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    public static void evaluateNumber(int numberdi) {
        if (numberdi % 2 != 0) {
            System.out.println("Number is " + (numberdi / 2));
        }
        else {
            System.out.println("Number is " + (-numberdi / 2));
        }
    }
    
    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float subtruct(float minuhed, float substrahed){
        float difference;
        difference = minuhed - substrahed;
        return difference;
    }
}
