
package semicirclearea;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
import java.io.*;
import java.util.Scanner;

public class CalculateAreaofSemicircle {
    private static final String ARCHIVO_CSV = "results.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean out = false;

        while (!out) {
            System.out.println("Menú:");
            System.out.println("1. Insert Data");
            System.out.println("2. Read Data .csv");
            System.out.println("3. Out");
            System.out.print("Please enter an option: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculateArea(scanner);
                    saveResultCSV();
                    break;
                case 2:
                    readFileCSV();
                    break;
                case 3:
                    out = true;
                    System.out.println("¡See you later!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    private static void calculateArea(Scanner scanner) {
        System.out.print("Enter the radius of the semicircle: ");
        double radius = scanner.nextDouble();
        double area = (Math.PI * Math.pow(radius, 2)) / 2;
        System.out.println("The area of ​​the semicircle is: " + area);
    }

    private static void saveResultCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CSV))) {
            writer.println("Area");
            writer.println(getArea());
            System.out.println("Result saved in: " + ARCHIVO_CSV);
        } catch (IOException e) {
            System.out.println("Error saving result to file " + ARCHIVO_CSV);
        }
    }

    private static double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the semicircle to save to the file: ");
        double radio = scanner.nextDouble();
        return (Math.PI * Math.pow(radio, 2)) / 2;
    }

    private static void readFileCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CSV))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + ARCHIVO_CSV);
        }
    }
}