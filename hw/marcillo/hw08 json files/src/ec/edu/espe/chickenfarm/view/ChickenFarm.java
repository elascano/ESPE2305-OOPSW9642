package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.JsonController;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ChickenFarm {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Chicken> chickens = new ArrayList<>();
    private static ArrayList<Chicken> chickens2 = new ArrayList<>();
    private static Coop coop1;
    private static Coop coop2;

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("=== Welcome to the Chicken Farm by Jhordy :D ===");
            System.out.println("1. Add Chicken");
            System.out.println("2. View Data");
            System.out.println("3. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addChicken();
                    break;
                case 2:
                    viewData();
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);
    }

    public static void addChicken() {
        System.out.println("========== Add Chicken ==========");
        System.out.print("Enter the chicken's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the chicken's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the chicken's color: ");
        String color = scanner.nextLine();
        System.out.print("Enter the chicken's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Is the chicken molting? (true/false): ");
        boolean isMolting = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Enter the chicken's birth date (yyyy-mm-dd): ");
        String birthDateStr = scanner.nextLine();
        Date bornOnDate = parseDate(birthDateStr);

        System.out.println("=== Choose Coop ===");
        System.out.println("1. Coop 1");
        System.out.println("2. Coop 2");
        System.out.print("Enter the coop number: ");
        int coopNumber = scanner.nextInt();
        scanner.nextLine();

        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);
        chicken.setAge(age);

        if (coopNumber == 1) {
            if (coop1 == null) {
                chickens.add(chicken);
                coop1 = new Coop(1, chickens);
            } else {
                coop1.getChickens().add(chicken);
            }
        } else if (coopNumber == 2) {
            if (coop2 == null) {
                chickens2.add(chicken);
                coop2 = new Coop(2, chickens2);
            } else {
                coop2.getChickens().add(chicken);
            }
        } else {
            System.out.println("Invalid coop number. Chicken not added to any coop.");
        }

        JsonController.writeChickensToJSON(coop1);
        JsonController.writeChickensToJSON(coop2);
    }

    public static void viewData() {
        System.out.println("=== View Data ===");
        System.out.println("Coop 1:");
        if (coop1 != null) {
            for (Chicken chicken : coop1.getChickens()) {
                System.out.println("ID: " + chicken.getId());
                System.out.println("Name: " + chicken.getName());
                System.out.println("Color: " + chicken.getColor());
                System.out.println("Age: " + chicken.getAge());
                System.out.println("Molting: " + chicken.isMolting());
                System.out.println("Birth Date: " + chicken.getBornOnDate());
                System.out.println();
            }
        } else {
            System.out.println("No chickens in Coop 1.");
        }

        System.out.println("Coop 2:");
        if (coop2 != null) {
            for (Chicken chicken : coop2.getChickens()) {
                System.out.println("ID: " + chicken.getId());
                System.out.println("Name: " + chicken.getName());
                System.out.println("Color: " + chicken.getColor());
                System.out.println("Age: " + chicken.getAge());
                System.out.println("Molting: " + chicken.isMolting());
                System.out.println("Birth Date: " + chicken.getBornOnDate());
                System.out.println();
            }
        } else {
            System.out.println("No chickens in Coop 2.");
        }
    }

    private static Date parseDate(String dateStr) {
        return new Date();
    }
}
