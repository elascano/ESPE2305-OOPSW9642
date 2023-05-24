
package pentagonvolumecalculator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
                    case 1 -> enterDataAndCalculate(scanner);
                    case 2 -> printStoredData();
                    case 3 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid option. Please enter a valid option.");
                }

                System.out.println();
            } while (option != 3);
        }
    }

    public static void enterDataAndCalculate(Scanner scanner) {
        System.out.print("Enter the side length: ");
        double sideLength = scanner.nextDouble();

        System.out.print("Enter the apothem length: ");
        double apothemLength = scanner.nextDouble();

        double volume = calculatePentagonVolume(sideLength, apothemLength);

        saveDataToCSV(sideLength, apothemLength, volume);

        System.out.println("The volume of the pentagon is: " + volume);
    }

    public static double calculatePentagonVolume(double sideLength, double apothemLength) {
        double areaOfBase = calculatePentagonArea(sideLength, apothemLength);
        double height = 10.0;

        double volume = areaOfBase * height;
        return volume;
    }

    public static double calculatePentagonArea(double sideLength, double apothemLength) {
        double perimeter = 5 * sideLength;
        double area = (perimeter * apothemLength) / 2;
        return area;
    }

    public static void saveDataToCSV(double sideLength, double apothemLength, double volume) {
        String fileName = "pentagon_calculation_data.csv";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.print(sideLength + ";");
            writer.print(apothemLength + ";");
            writer.println(volume);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error saving data to CSV file: " + e.getMessage());
        }
    }

    public static void printStoredData() {
        String fileName = "pentagon_calculation_data.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Stored data:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    double sideLength = Double.parseDouble(data[0]);
                    double apothemLength = Double.parseDouble(data[1]);
                    double volume = Double.parseDouble(data[2]);
                    System.out.println("Side Length: " + sideLength + ", Apothem Length: " + apothemLength + ", Volume: " + volume);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading data from CSV file: " + e.getMessage());
        }
    }
}
