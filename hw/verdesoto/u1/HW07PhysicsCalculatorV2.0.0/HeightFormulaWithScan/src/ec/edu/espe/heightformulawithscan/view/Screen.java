package ec.edu.espe.heightformulawithscan.view;
import ec.edu.espe.heightformulawithscan.model.CSVFile;
import ec.edu.espe.heightformulawithscan.model.Height;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Screen {
    public static Height data(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Initial Velocity: ");
        double initialVelocity=scanner.nextDouble();
        System.out.println("Enter the Final Velocity: ");
        double finalVelocity=scanner.nextDouble();
        System.out.println("Enter the Time: ");
        double time=scanner.nextDouble();
        return new Height(initialVelocity, finalVelocity, time);
    }
    public static void cover() {
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("Subject: Oriented Objects Programming");
        System.out.println("NRC: 9642");
        System.out.println("INSTRUCTOR: Edison Lascano");
        System.out.println("Height Calculator \n");
        }
    public static void optionMenu () throws IOException{  
        cover();
        CSVFile fileManager = new CSVFile("Formula.csv");
        
        while (true) {
            System.out.println(" ----- OPTION MENU ----- ");
            System.out.println("1. Entry Data");
            System.out.println("2. Print Data");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            
            switch (option) {
                case 1 -> {
                    Height height = data();
                    fileManager.writeData(height);
                    System.out.println("Height: " + height.calculateHeigth());                    
                }
                case 2 -> {               
                    CSVFile fileReader = new CSVFile ("Formula.csv");                                      
                    fileReader.readData();
                    
                }
                case 3 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid Option");
            }
            
        }
            
        }
    
    }