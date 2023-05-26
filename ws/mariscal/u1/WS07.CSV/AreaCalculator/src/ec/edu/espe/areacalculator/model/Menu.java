package ec.edu.espe.areacalculator.model;

import ec.edu.espe.areacalculator.view.CSVGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static List<FormulaArea> areas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        int option;
        do {
            System.out.println("MENU:");
            System.out.println("1. Insert the diameter");
            System.out.println("2. Read Data");
            System.out.println("3. Generate CSV");
            System.out.println("4. Exit");
            System.out.print("Enter the desired option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    FormulaArea area = new FormulaArea();
                    area.readData();
                    areas.add(area);
                    System.out.println("Data inserted");
                    break;
                case 2:
                    if (areas.isEmpty()) {
                        System.out.println("Insert data first");
                    } else {
                        for (FormulaArea a : areas) {
                            float circleArea = a.calculateCircleArea();
                            System.out.println("The area of the circle with diameter " + a.getDiameter() + " is: " + circleArea);
                        }
                    }
                    break;
                case 3:
                    if (areas.isEmpty()) {
                        System.out.println("Insert data first");
                    } else {
                        CSVGenerator.generateCSV(areas, "area_data.csv");
                    }
                    break;
                case 4:
                    System.out.println("Successfully exited");
                    break;
                default:
                    System.out.println("Invalid option. Enter again: ");
                    break;
            }
        } while (option != 4);
    }
}