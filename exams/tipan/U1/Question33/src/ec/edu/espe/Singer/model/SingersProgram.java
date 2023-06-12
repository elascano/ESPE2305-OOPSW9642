
package ec.edu.espe.Singer.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */

import ec.edu.espe.Singer.view.Menu;
import java.util.Scanner;

public class SingersProgram {
    public static void main(String[] args) {
        SingerManager singerManager = new SingerManager();

        readSingerObjects(singerManager);

        Menu menu = new Menu(singerManager);
        menu.showMenu();
    }

    private static void readSingerObjects(SingerManager singerManager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of singer objects to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for singer #" + (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Singer singer = new Singer(id, name, age);
            singerManager.addSinger(singer);

            System.out.println("Singer added successfully.");
            System.out.println("---------------------------");
        }
    }
}

