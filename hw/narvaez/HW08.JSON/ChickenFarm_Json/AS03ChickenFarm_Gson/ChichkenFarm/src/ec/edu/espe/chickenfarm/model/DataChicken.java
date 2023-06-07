package ec.edu.espe.chickenfarm.model;

import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class DataChicken {
public static void addChickenToCoop(Coop coop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID:");
        int id = scanner.nextInt();
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the Color: ");
        String color = scanner.next();
        System.out.println("Is the chicken molting?, write true or false.");
        boolean molting = scanner.nextBoolean();
        System.out.println("Enter the born year: ");
        int bornYear = scanner.nextInt();
        System.out.println("Enter the born month (1-12): ");
        int bornMonth = scanner.nextInt();
        while(bornMonth<1 || bornMonth>12){
            System.out.println("Out of the range, enter again: ");
            bornMonth = scanner.nextInt();
        }
        System.out.println("Enter the born day: ");
        int day = scanner.nextInt();
        while(day<1 || day>31){
            System.out.println("Out of the range, enter again: ");
            day = scanner.nextInt();
        }

        Chicken chicken = new Chicken(id, name, color, molting, new Date());
        coop.getChickens().add(chicken);
        System.out.println("Chicken added to the coop.");
    }
}

