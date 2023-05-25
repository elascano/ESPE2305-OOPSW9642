package espe.edu.ec.calculatorwithprinters.model;

import java.util.Scanner;

public class Measures {
    private float radius;
    private float high;
    private static Scanner scanner = new Scanner(System.in);
    
    public void enterData() {        
        System.out.print("Enter the value of the radius: ");
        radius = scanner.nextFloat();
        System.out.print("Enter the value of the height: ");
        high = scanner.nextFloat();
    }
    
    public float getRadius() {
        return radius;
    }
    
    public float getHigh() {
        return high;
    }
}
