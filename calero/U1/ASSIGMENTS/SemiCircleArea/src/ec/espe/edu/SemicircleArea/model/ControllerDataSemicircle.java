
package ec.espe.edu.SemicircleArea.model;

import ec.espe.edu.SemicircleArea.view.InterfaceUser;
import java.util.Scanner;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class ControllerDataSemicircle {
    public static void main(String[] args) {
        InterfaceUser viewUser = new InterfaceUser();
        usingData data = new usingData();
        boolean out = false;
        while (!out) {
            viewUser.showMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Insert Data");
            System.out.println("2. Read Data .csv");
            System.out.println("3. Out");
            System.out.print("Please enter an option: ");
        
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    CalculateSemicircleArea area = viewUser.enterData();
                    data.saveResultCSV(area);
                    System.out.println("Area is: " + area.CalculateArea());
                }
                case 2 -> data.readFileCSV();
                case 3 -> {
                    out = true;
                    System.out.println("¡See you later!");
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
