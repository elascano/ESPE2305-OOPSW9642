
package ec.edu.espe.formula.controller;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ohmController {
     public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("*******Options Menu********");
            System.out.println("1. Insert data");
            System.out.println("2. Read Data");
            System.out.println("3. Leave");
            System.out.print("Enter an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addToCSV add = new addToCSV();
                    add.addToCSV();
                    break;
                case 2:
                    reedFileCSV read = new reedFileCSV();
                    read.reedFileCSV();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}