package ec.edu.espe.view;

import java.util.Scanner;
import ec.edu.espe.model.CalculatorVolume;
import ec.edu.espe.model.DataSaveCSV;


public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        CalculatorVolume calculatorvolume = new CalculatorVolume();
        DataSaveCSV datasave = new DataSaveCSV();
        datasave.setFileName("Data Comprobate");
        do {
            System.out.println("MENU");
            System.out.println("1. Data Registrer");
            System.out.println("2. Show Datas y Results");
            System.out.println("3. Print CSV");
            System.out.println("4. Exit ");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            

            switch (opcion) {
                case 1:
                    System.out.print("Enter the value of Height: ");calculatorvolume.setHeight(scanner.nextDouble());
                    System.out.print("Enter the value of Radius: ");calculatorvolume.setRadius(scanner.nextDouble());
                    System.out.print("The Clindryc Volume is: ");calculatorvolume.calculateCylinderVolume();
                  datasave.write(calculatorvolume);
                break;
                    
                case 2:
                
                    datasave.readFile();

                    break;
               
                default:
                 
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
    
}
