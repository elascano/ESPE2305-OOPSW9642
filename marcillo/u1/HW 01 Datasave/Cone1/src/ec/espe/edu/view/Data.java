/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import ec.espe.edu.model.Result;

public class Data {
    private static final String FILE_PATH = "Datos.csv";
    
    public void inputData(Scanner scanner, Result cone) {
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();
        cone.setRadius(radius);

        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();
        cone.setHeight(height);

        cone.calculateVolume();
        double volume = cone.getVolume();
        System.out.println("The volume of the cone is: " + volume);

        saveData(radius, height, volume);

        System.out.println("Data saved to file " + FILE_PATH);
    }
    
    public void saveData(double radius, double height, double volume) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(radius + "," + height + "," + volume);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    public void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                double radius = Double.parseDouble(values[0]);
                double height = Double.parseDouble(values[1]);
                double volume = Double.parseDouble(values[2]);
                
                System.out.println("Radius: " + radius);
                System.out.println("Height: " + height);
                System.out.println("volume: " + volume);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
