package ec.edu.espe.chickenfarmjson.controller;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Menu {
    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("*******Options Menu********");
            System.out.println("1. Insert chicken");
            System.out.println("2. Read Json");
            System.out.println("3. Leave");
            System.out.print("Enter an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el búfer

            switch (option) {
                case 1:
                    DataJson dataJason = new DataJson();
                    dataJason.DataJson();
                    
                    break;
                case 2:
                    ReadJson read = new ReadJson();
                    read.reedJason();
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
