
package ec.edu.espe.Singer.view;
import ec.edu.espe.Singer.model.Singer;
import ec.edu.espe.Singer.model.SingerManager;
import java.util.Scanner;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */



public class Menu {
    private SingerManager singerManager;

    public Menu(SingerManager singerManager) {
        this.singerManager = singerManager;
    }

    public void showMenu() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("1. List singers");
            System.out.println("2. Delete all singers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> listSingers();
                case 2 -> {
                    deleteAllSingers();
                    System.out.println("All singers deleted.");
                }
                case 0 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Program exited.");
    }

    private void listSingers() {
        for (Singer singer : singerManager.getSingerList()) {
            System.out.println("ID: " + singer.getId());
            System.out.println("Name: " + singer.getName());
            System.out.println("Age: " + singer.getAge());
            System.out.println("---------------------------");
        }
    }

    private void deleteAllSingers() {
        singerManager.deleteAllSingers();
    }
}
