
package ec.edu.espe.farm.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String next(){
        return scanner.next();
    }
    
    public String nextLine(){
        return scanner.next();
    }

    public double nextDouble() {
        while (true) {
            try {
                double num = scanner.nextDouble();
                return num;
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter a numeric value (e.g. 0, 1, 0.5)");
                scanner.nextLine(); 
            }
        }
    }
    
    public float nextFloat() {
        while (true) {
            try {
                float num = scanner.nextFloat();
                return num;
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter a numeric value (e.g. 0, 1, 0.5)");
                scanner.nextLine(); 
            }
        }
    }
    
    public int nextInt(){
        while (true) {
            try {
                int num = scanner.nextInt();
                if(num < 0) {
                    throw new IllegalArgumentException();
                }
                return num;
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer numeric value (e.g. 1, 2, 3)");
                scanner.nextLine(); 
            }
        }
    }
   
    
}
