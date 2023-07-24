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
        
        int fibonacci= calculateFibonacci(number);
        System.out.println("Fibonacci is " + fibonacci);
        
        System.out.print("Enter the number: ");
        int numberdi = scanner.nextInt();
        scanner.close();
        
        evaluateNumber(numberdi);
    }
    
    public static int calculateFibonacci(int number) {
       int serie = 10, num1 = 0, num2 = 1, suma = 1;
       System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
                 System.out.println(suma);
                 suma = num1 + num2;
                 num1 = num2;
                 num2 = suma;           
        }
        return num1;
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