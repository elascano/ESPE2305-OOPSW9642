
package ec.edu.espe.chickenFarm.controller;

import ec.edu.espe.chickenFarm.model.Chicken;
import ec.edu.espe.chickenFarm.model.Coop;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Menu {
     private final List<Coop> coops;
    private final Scanner scanner;

    public Menu(List<Coop> coops) {
        this.coops = coops;
        this.scanner = new Scanner(System.in);
    }

public void show() {
    boolean exit = false;

    while (!exit) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Menu:");
        System.out.println("1. Add coop");
        System.out.println("2. Add chicken");
        System.out.println("3. Save and exit");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter coop id: ");
                int id = scanner.nextInt();
                Coop coop = new Coop(id, new ArrayList<>());
                coops.add(coop);
                break;
            case 2:
                System.out.print("Enter coop id: ");
                int coopId = scanner.nextInt();
                Coop selectedCoop = null;
                for (Coop c : coops) {
                    if (c.getId() == coopId) {
                        selectedCoop = c;
                        break;
                    }
                }
                if (selectedCoop == null) {
                    System.out.println("Coop not found");
                    break;
                }
                System.out.print("Enter chicken id: ");
                int chickenId = scanner.nextInt();
                System.out.print("Enter chicken name: ");
                String name = scanner.next();
                System.out.print("Enter chicken color: ");
                String color = scanner.next();
                System.out.print("Is chicken molting (true/false): ");
                boolean isMolting = scanner.nextBoolean();
                System.out.print("Enter chicken birth year: ");
                int year = scanner.nextInt();
                System.out.print("Enter chicken birth month: ");
                int month = scanner.nextInt();
                System.out.print("Enter chicken birth day: ");
                int day = scanner.nextInt();
            Chicken chicken = new Chicken(chickenId, name, color, isMolting, new Date(year - 1900, month - 1, day));
            selectedCoop.getChickens().add(chicken);
            int age = chicken.getAge();
            System.out.println("Chicken added: " + chicken.getName() + ", age: " + age);
            
            break;
            
            case 3:
                exit = true;
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
}

