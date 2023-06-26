package ec.espe.edu.view;

import java.util.Scanner;
import ec.espe.edu.model.Result;

public class Cone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result cone = new Result();

        Data data = new Data();

        boolean exit = false;
        while (!exit) {
            System.out.println("Cone Volume Calculator");
            System.out.println("1. Insert Data");
            System.out.println("2. Read Data");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    data.inputData(scanner, cone);
                    break;
                case 2:
                    data.readData();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

            System.out.println();
        }
    }
}
