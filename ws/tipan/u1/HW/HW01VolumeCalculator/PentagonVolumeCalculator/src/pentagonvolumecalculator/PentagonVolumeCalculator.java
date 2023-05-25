package pentagonvolumecalculator;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class PentagonVolumeCalculator {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("----- Menu -----");
                System.out.println("1. Enter data and calculate volume");
                System.out.println("2. Print all stored data");
                System.out.println("3. Exit");
                System.out.print("Enter an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        Calculator.enterDataAndCalculate(scanner);
                        Calculator.saveDataToCSV();
                    }
                    case 2 -> Calculator.printStoredData();
                    case 3 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid option. Please enter a valid option.");
                }

                System.out.println();
            } while (option != 3);
        }
    }
}
