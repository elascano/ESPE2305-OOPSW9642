/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.traffic.view;

import ec.edu.espe.traffic.model.Traffic;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class TrafficMenu {
    public static final String FILENAME = "";
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static List<Traffic> traffic = new ArrayList<>();
    
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\tTraffic Choice 2");
            System.out.println("1. Enter Information");
            System.out.println("2. Count The total number of objects stored ");
            System.out.println("3. out");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTraffic(scanner);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
    
    
    private static void addTraffic(Scanner scanner) {
        System.out.print("Enter the number of cars: ");
        String cars = scanner.next();
        System.out.print("Enter the number of Buses: ");
        String buses = scanner.next();
        System.out.print("Enter the number of Trucks: ");
        String trucks = scanner.next();

        Traffic traffic = new Traffic();
        

        
        if (traffic.contains(traffic)) {
            System.out.println("Car already exists.");
        } else {
            traffic.add(traffic);
            System.out.println("Car added successfully!");
        }

        System.out.println();
    }
    
        private static void loadTraffic() {
        try (Reader reader = new FileReader(FILENAME)) {
            Type listType = new TypeToken<List<Traffic>>(){}.getType();
            traffic = gson.fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            // File doesn't exist, ignore
        } catch (IOException e) {
            System.out.println("Error reading cars from JSON file.");
        }
    }

    private static void saveTraffic() {
        try (Writer writer = new FileWriter(FILENAME)) {
            gson.toJson(traffic, writer);
        } catch (IOException e) {
            System.out.println("Error writing cars to JSON file.");
        }
    }
}
