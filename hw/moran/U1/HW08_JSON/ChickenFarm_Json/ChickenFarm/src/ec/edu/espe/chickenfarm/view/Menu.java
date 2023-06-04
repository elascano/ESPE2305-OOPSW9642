package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.controller.JsonGenerator;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Moran David
 */

public class Menu {
    private ArrayList<Chicken> chickens;
    private ArrayList<Chicken> chickens2;

    public void showMenu() {
        chickens = new ArrayList<>();
        chickens2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("--- Autor Moran David ---");
            System.out.println("\nMenu:");
            System.out.println("Press \"1\" to add a chicken");
            System.out.println("Press \"2\" to view coop");
            System.out.println("Press \"3\" to modify chicken");
            System.out.println("Press \"4\" to generate the JSON file");
            System.out.println("Press \"5\" to exit the system");
            System.out.print("Enter the option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addChicken();
                    break;
                case 2:
                    viewCoops();
                    break;
                case 3:
                    modifyChicken();
                    break;
                case 4:
                    generateJsonFile();
                    break;
                case 5:
                    System.out.println("Left the program");
                    break;
                default:
                    System.out.println("Invalid option, enter again: ");
            }
        } while (option != 5);
    }

    private void addChicken() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNew chicken");
        System.out.print("Enter the chicken's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the chicken's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the chicken's color: ");
        String color = scanner.nextLine();

        System.out.print("Is the chicken molting? (true or false): ");
        boolean isMolting = scanner.nextBoolean();

        System.out.print("Enter the chicken's birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the chicken's birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the chicken's birth day: ");
        int day = scanner.nextInt();

        Date bornOnDate = new Date(year - 1900, month - 1, day);
        Chicken chicken = new Chicken(id, name, color, isMolting, bornOnDate);

        System.out.print("In which coop do you want to place it? (1 or 2): ");
        int coopNumber = scanner.nextInt();

        if (coopNumber == 1) {
            chickens.add(chicken);
        } else if (coopNumber == 2) {
            chickens2.add(chicken);
        } else {
            System.out.println("Invalid option, enter again: ");
        }
    }
    private void viewCoops() {
        System.out.println("--- David Moran ChickenFarm ---");
        System.out.println("Chickens in Coop 1:");
        for (Chicken chicken : chickens) {
            System.out.println(chicken);
        }

        System.out.println("\nChickens in Coop 2:");
        for (Chicken chicken : chickens2) {
            System.out.println(chicken);
        }
    }
    private void modifyChicken() {
        if (chickens.isEmpty() && chickens2.isEmpty()) {
            System.out.println("No chickens to modify, add a chicken first");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nModify chicken");
        System.out.print("Enter the ID of the chicken to modify: ");
        int id = scanner.nextInt();

        Chicken foundChicken = null;
        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                foundChicken = chicken;
                break;
            }
        }

        if (foundChicken == null) {
            for (Chicken chicken : chickens2) {
                if (chicken.getId() == id) {
                    foundChicken = chicken;
                    break;
                }
            }
        }

        if (foundChicken == null) {
            System.out.println("Chicken not found");
            return;
        }
        System.out.print("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Is the chicken molting? (true or false): ");
        boolean isMolting = scanner.nextBoolean();
        System.out.print("Enter the chicken's birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the chicken's birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the chicken's birth day: ");
        int day = scanner.nextInt();
        foundChicken.setName(name);
        foundChicken.setColor(color);
        foundChicken.setMolting(isMolting);
        foundChicken.setBornOnDate(new Date(year - 1900, month - 1, day));
        System.out.println("Chicken modified");
    }
    private void generateJsonFile() {
        if (chickens.isEmpty() && chickens2.isEmpty()) {
            System.out.println("No chickens to generate JSON file");
            return;
        }
        //generador JSON
        List<Chicken> allChickens = new ArrayList<>();
        allChickens.addAll(chickens);
        allChickens.addAll(chickens2);
        JsonGenerator jsonGenerator = new JsonGenerator();
        jsonGenerator.generateJsonFile(allChickens);
    }
}
