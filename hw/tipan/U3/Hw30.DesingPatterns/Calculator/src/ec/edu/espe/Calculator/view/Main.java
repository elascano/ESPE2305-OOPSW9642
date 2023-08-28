/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Calculator.view;
import ec.edu.espe.Calculator.model.Calculator;
import java.util.Scanner;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Main {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2);
        double result = calculator.add();

        System.out.println("The sum of the two numbers is: " + result);
    }


    
}
