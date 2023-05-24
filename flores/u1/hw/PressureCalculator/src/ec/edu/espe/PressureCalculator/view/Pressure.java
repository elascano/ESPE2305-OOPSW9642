package ec.edu.espe.PressureCalculator.view;

import ec.edu.espe.PressureCalculator.control.DataScanner;
import ec.edu.espe.PressureCalculator.model.Calculator;
import ec.edu.espe.PressureCalculator.model.DataSave;
import java.util.Scanner;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */

public class Pressure{

    
    public static void main(String[] args) {
            
        float pressure;
        int option = 1;
        DataScanner data;
        Calculator calculator;
        DataSave dataSave;
        
        data = new DataScanner();
        calculator = new Calculator();
        dataSave = new DataSave();
                
        data.GetData();
        
        
        while(option == 1) {
            System.out.println("PRESSURE CALCULATOR");
            pressure = calculator.calculatePressure(data.getForce(), data.getArea());
            System.out.println("La pressure is: "+ pressure);
            
            dataSave.save(data.getForce(), data.getArea(), pressure);
            option = data.GetOption();
            
        }
        
             
        
        
        
    }
}
