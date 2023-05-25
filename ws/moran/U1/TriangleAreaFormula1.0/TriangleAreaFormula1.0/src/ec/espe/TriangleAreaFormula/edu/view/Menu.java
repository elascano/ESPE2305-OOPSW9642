/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.TriangleAreaFormula.edu.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import ec.edu.espe.TriangleAreaFormula.model.Extent;
import ec.edu.espe.TriangleAreaFormula.model.TriangleAreaCalculator;
/**
 *
 * @author David Moran
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double base = 0;
        double height = 0;
        double area = 0;
        Extent extent = new Extent();
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        do {
            System.out.println("Menu Options:");
            System.out.println("1. Calculate the area of a triangle");
            System.out.println("2. Show entered data and calculated area");
            System.out.println("3. Generate CSV file");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    extent.calculateArea(scanner);
                    base = extent.getBase();
                    height = extent.getHeight();
                    area = extent.getArea();
                    break;
                case 2:
                    System.out.println("Entered data:");
                    System.out.println("Base: " + base);
                    System.out.println("Height: " + height);
                    System.out.println("Calculated area: " + area);
                    break;
                case 3:
                    try {
                        generateCSV(base, height, area);
                        System.out.println("CSV file generated successfully.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while generating the CSV file.");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    calculator.exitProgram();
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }
    
    private static void generateCSV(double base, double height, double area) throws IOException {
        try (FileWriter writer = new FileWriter("triangle_data.csv")) {
            writer.append("Order\n"); 
            writer.append("\n");
            writer.append("base:  " + base + "\nheight:  " + height + "\narea: " + area); 
            writer.append("\n");
        }
    }
}