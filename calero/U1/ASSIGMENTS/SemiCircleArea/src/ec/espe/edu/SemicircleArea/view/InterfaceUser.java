
package ec.espe.edu.SemicircleArea.view;

import ec.espe.edu.SemicircleArea.model.CalculateSemicircleArea;
import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class InterfaceUser {
    public CalculateSemicircleArea enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        return new CalculateSemicircleArea(radius);
    }
    
    public void showMenu(){
        System.out.println("Menú:");
        System.out.println("1. Insert Data");
        System.out.println("2. Read Data .csv");
        System.out.println("3. Out");
        System.out.print("Please enter an option: ");
    }
}
