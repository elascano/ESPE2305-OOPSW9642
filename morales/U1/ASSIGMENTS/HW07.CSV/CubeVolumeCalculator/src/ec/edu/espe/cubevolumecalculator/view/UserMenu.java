package ec.edu.espe.cubevolumecalculator.view;

import ec.edu.espe.cubevolumecalculator.model.Cube;
import ec.edu.espe.cubevolumecalculator.model.FileReaderWriter;
import ec.edu.espe.cubevolumecalculator.model.SideLength;
import java.util.Scanner;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class UserMenu {
    public static void userMenu(){
        Scanner scanner = new Scanner(System.in);
        FileReaderWriter fileReader = new FileReaderWriter("volumecube.csv");
        
        
        int option;
        double sideLength = 0, volume;
        do{
            System.out.println("\t Menu Options \n");
            System.out.println("1. Insert Data \n");
            System.out.println("2. Read Data \n");
            System.out.println("3. Exit");
            option = scanner.nextInt();
            
            while(option<=0 || option>3){
                System.out.println("\nEnter again the option.");
                option = scanner.nextInt();
            }
            
            switch(option){
                case 1 -> {
                    sideLength = SideLength.enterSideLength(sideLength);
                    fileReader.writeFile(new Cube(sideLength));
                    
                }
                
                case 2 -> {
                } 
                
                case 3 -> {
                }
            }
            
            System.out.println();
        }while(option <= 3);
        scanner.close();
    }
    
    public static double validatePositive(double number){
        if(number <= 0){
        System.out.println("Warning! The length of the cube cannot be equal to or less than 0.\n");
        }
        return number;
    }
    
    public static void VolumePrint(double volume){
        System.out.println("The Volume of the cube is:"  +volume);
    }

    private static void SideLength() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
