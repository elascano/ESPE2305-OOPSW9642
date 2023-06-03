package ec.edu.espe.view;

import ec.edu.espe.model.DensityCalculator;
import ec.edu.espe.model.FileManager;
import java.util.Scanner;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE , credits: @Caetano Flores 
 */
public class Menu {
    public static void main(String[] args) {
        int option;
        DensityCalculator calculator = new DensityCalculator();
        Scanner scanner = new Scanner(System.in);
        FileManager file = new FileManager();
        
        
        do{
            System.out.println("DENSITY CALCULATOR");
            System.out.println("1. Calculate");
            System.out.println("2. Print Data");
            System.out.println("3. Exit");

            option = scanner.nextInt();
            
            while(option<1||option>3){
                System.out.println("Incorrect option, Enter again!");
                option = scanner.nextInt();
            }

            if(option == 1){
                calculator.calculateDensity();

            }else if(option ==2){
                
                file.printData();
                
            }
        }while(option!=3);
    }
}
