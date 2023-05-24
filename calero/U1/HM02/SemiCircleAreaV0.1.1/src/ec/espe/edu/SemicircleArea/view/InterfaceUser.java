
package ec.espe.edu.SemicircleArea.view;

import ec.espe.edu.SemicircleArea.model.CalculateSemicircleArea;
import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
import java.util.Scanner;

public class InterfaceUser {
    private Scanner scanner;

    public InterfaceUser() {
        scanner = new Scanner(System.in);
    }

    public int displayMenuAndGetOption() {
        System.out.println("Menu:");
        System.out.println("1. Insert data");
        System.out.println("2. Read data from .csv file");
        System.out.println("3. to out");
        System.out.print("Enter an option: ");
        return scanner.nextInt();
    }

    public double getRadiusFromUser() {
        System.out.print("Enter the radius of the semicircle: ");
        return scanner.nextDouble();
    }

    public void displayArea(double area) {
        System.out.println("The area of ​​the semicircle is: " + area);
    }

    public void displayInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }

    public void displayFarewellMessage() {
        System.out.println("See you later!");
    }
}