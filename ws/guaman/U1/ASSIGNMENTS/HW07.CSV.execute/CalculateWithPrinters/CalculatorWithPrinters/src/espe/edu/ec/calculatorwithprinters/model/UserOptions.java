package espe.edu.ec.calculatorwithprinters.model;

import espe.edu.ec.calculatorwithprinters.view.DataCSV;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    private static Scanner scanner = new Scanner(System.in);

public class UserOptions {
    
    private static List<Measures> measures = new ArrayList<>();

    
    public void menu() {
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Insert Data");
            System.out.println("2. Read Data");
            System.out.println("3. Generate CSV");
            System.out.println("4. Exit");
            System.out.print("Enter the desired option: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    Measures measure = new Measures();
                    measures.readData();
                    measures.add(measure);
                    System.out.println("Successful process");
                    break;
                
                case 2:
                    if (measures.isEmpty()) {
                        System.out.println("Unavailable process, insert data first.");
                    } else {
                        for (Measures measureS : measures) {
                            float volume = CalculatorCilindryc.calculateVolume(measure.getRadius(), measure.getHeight());
                            System.out.println("The radius value is: " + measure.getRadius() + ", the height value is: " + measure.getHeight() + ", the volume is: " + volume);
                        }
                    }
                    break;
                
                case 3: 
                    if (measures.isEmpty()) {
                        System.out.println("Insert the radius: ");
                    } else {
                        DataCSV.dataGeneratorCSV(measures, "volume_data.value.csv");
                    }
                    break;
                
                case 4:
                    System.out.println("Come back soon :)");
                    break;
                
                default:
                    System.out.println("Unavailable option. Please enter again.");
                    break;
            }
        } while (choice != 4);
    }
}
