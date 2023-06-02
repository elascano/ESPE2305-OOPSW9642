package ec.edu.espe.chickenFarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenFarm.model.Chicken;
import ec.edu.espe.chickenFarm.model.Coop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//LocalTime, calendar, LocalDate instead of date
/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

public class ChickenFarm {

    private static final String JSON_FILE_PATH = "chickens.json";
    private static final String CSV_FILE_PATH = "chickens.csv";

    public static void main(String[] args) {
        ArrayList<Chicken> chickens = new ArrayList<>();
        Coop coop = new Coop(1, chickens);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Welcome to Chicken Farm Management System");
            System.out.println("1. Add Chicken");
            System.out.println("2. Remove Chicken");
            System.out.println("3. Display Coop");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addChicken(scanner, chickens);
                case 2 -> removeChicken(scanner, chickens);
                case 3 -> displayCoop(coop);
                case 4 -> System.out.println("Exiting Chicken Farm Management System");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        saveChickensToCSV(chickens);
        saveChickensToJson(chickens);
        
    }

       private static void addChicken(Scanner scanner, ArrayList<Chicken> chickens) {
        System.out.print("Enter chicken ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter chicken name: ");
        String name = scanner.nextLine();

        System.out.print("Enter chicken color: ");
        String color = scanner.nextLine();

        System.out.print("Is the chicken molting? (true/false): ");
        boolean isMolting = scanner.nextBoolean();

        System.out.print("Enter the year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); 

        Chicken chicken = new Chicken(id, name, color, isMolting, yearOfBirth);
        chickens.add(chicken);

        System.out.println("Chicken added successfully.");
    }

    private static void removeChicken(Scanner scanner, ArrayList<Chicken> chickens) {
        System.out.print("Enter the ID of the chicken to remove: ");
        int id = scanner.nextInt();

        boolean removed = false;
        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                chickens.remove(chicken);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Chicken removed successfully.");
        } else {
            System.out.println("Chicken not found in the coop.");
        }
    }

    private static void displayCoop(Coop coop) {
        System.out.println("Coop: " + coop);
    }

    private static void saveChickensToJson(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);

        try (FileWriter writer = new FileWriter(JSON_FILE_PATH)) {
            writer.write(json);
            System.out.println("Chickens saved to JSON file: " + JSON_FILE_PATH);
        } catch (IOException e) {
            System.out.println("An error occurred while saving chickens to JSON file.");
        }
    }

    private static void saveChickensToCSV(ArrayList<Chicken> chickens) {
    try (FileWriter writer = new FileWriter(CSV_FILE_PATH)) {
        // Escribir encabezados
        writer.write("ID;Name;Color;IsMolting;Age\n");

        // Escribir datos de cada pollo
        for (Chicken chicken : chickens) {
            writer.write(chicken.getId() + ";");
            writer.write(chicken.getName() + ";");
            writer.write(chicken.getColor() + ";");
            writer.write(chicken.isMolting() + ";");
            writer.write(chicken.getAgeInYears() + "\n");
        }

        System.out.println("Chickens saved to CSV file: " + CSV_FILE_PATH);
    } catch (IOException e) {
        System.out.println("An error occurred while saving chickens to CSV file.");
    }
}
}