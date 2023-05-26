
package ec.edu.espe.josu.controller;

import ec.edu.espe.josu.model.Variables;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class MenuAndResolution {
public void start() throws IOException {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {

        System.out.println("---MENU---");
        System.out.println("My name is Josue Marin");
        System.out.println("1. Insert data");
        System.out.println("2. Read Data");
        System.out.println("3. Leave");
        System.out.print("Enter an option: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Limpia el búfer

        switch (option) {
            case 1:
                addToCSV();
                break;
            case 2:
                readFileCSV();
                break;
            case 3:
                exit = true;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

private void addToCSV() {
    
    Variables operation = new Variables();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the base1 : ");
    int base1 = scanner.nextInt();
    operation.setBase1(base1);
    
    System.out.println("Enter the base2 : ");
    int base2 = scanner.nextInt();
    operation.setBase2(base2);

    System.out.println("Calculating area ...");
    int area = base1 * base2;
    operation.setArea(area);
    
    String data = base1 + "," + base2 + "," + area;

    // Guardar los datos en un archivo CSV
    writeFileCSV(data, "area.csv");

    System.out.println("Data saved successfully.");
    
}

private void readFileCSV() throws IOException {
    String file = "";
    BufferedReader reader = null;
    String line ="";
    try {
        reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            String[] row = line.split(",");
            for (String index : row) {
                System.out.printf("%-20s", index);
            }
            System.out.println("");
        } 
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        reader.close();
    }
}
private void writeFileCSV(String data, String fileName) {

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
        writer.write(data);
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Error saving data: " + e.getMessage());
    }
}
}

