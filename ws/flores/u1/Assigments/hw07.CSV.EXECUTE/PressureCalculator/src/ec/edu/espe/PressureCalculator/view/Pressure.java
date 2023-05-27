package ec.edu.espe.PressureCalculator.view;

import ec.edu.espe.PressureCalculator.control.DataScanner;
import ec.edu.espe.PressureCalculator.model.Calculator;
import ec.edu.espe.PressureCalculator.model.DataManager;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */

public class Pressure{
    
    
    public static void main(String[] args) {
        
            
        float pressure;
        int option = 0;
        DataScanner data;
        Calculator calculator;
        DataManager dataManager;
        Scanner scanner = new Scanner(System.in);
        
        pressure = 0;
        data = new DataScanner();
        calculator = new Calculator();
        dataManager = new DataManager();
        
        while(option != 3) {
            
            System.out.println("PRESSURE CALCULATOR");
            System.out.println("1. Calculate");
            System.out.println("2. Print all data");
            System.out.println("3. exit");
            
            option = scanner.nextInt();
            
            if(option==1){
                data.GetData();
                pressure = calculator.calculatePressure(data.getForce(), data.getArea());
                System.out.println("The pressure is: "+ pressure);
            
                dataManager.saveData(data.getForce(), data.getArea(), pressure);
            }
            else if(option == 2) {
                dataManager.printData();
            }
            else if(option == 3) {
                System.out.println("\n");
            }
            else {
                System.out.println("OPCION INCORRECTA");
            }
            
            
            
            
            
            
            
        }
        
             
        
        
        
    }
}
