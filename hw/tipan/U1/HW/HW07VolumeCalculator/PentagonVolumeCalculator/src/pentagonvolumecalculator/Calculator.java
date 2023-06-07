package pentagonvolumecalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class Calculator {
    private static double sideLength;
    private static double apothemLength;
    private static double volume;

    public static void enterDataAndCalculate(Scanner scanner) {
        System.out.print("Enter the side length: ");
        sideLength = scanner.nextDouble();

        System.out.print("Enter the apothem length: ");
        apothemLength = scanner.nextDouble();

        volume = calculatePentagonVolume();
        System.out.println("The volume of the pentagon is: " + volume);
    }

    public static double calculatePentagonVolume() {
        double areaOfBase = calculatePentagonArea();
        double height = 10.0;

        volume = areaOfBase * height;
        return volume;
}

    public static double calculatePentagonArea() {
        double perimeter = 5 * sideLength;
        double area = (perimeter * apothemLength) / 2;
        return area;
    }

    public static void saveDataToCSV() {
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
            String[] data = line.split(";");
            if (data.length == 3) {
                double sideLengthValue = Double.parseDouble(data[0]);
                double apothemLengthValue = Double.parseDouble(data[1]);
                double volumeValue = Double.parseDouble(data[2]);
                System.out.println("Side Length: " + sideLengthValue + ", Apothem Length: " + apothemLengthValue + ", Volume: " + volumeValue);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading data from CSV file: " + e.getMessage());
    }
  }

}