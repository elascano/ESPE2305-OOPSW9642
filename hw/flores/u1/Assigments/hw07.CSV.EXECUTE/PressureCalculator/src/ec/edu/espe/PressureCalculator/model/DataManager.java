package ec.edu.espe.PressureCalculator.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class DataManager {
    
    public static void createFile(){
        try {
            FileWriter writer = new FileWriter("data.csv");
        }catch (IOException e){ 
            e.printStackTrace();
        }
    }
    
    public static void saveData(float force, float area, float pressure){
        try {
            FileWriter writer = new FileWriter("data.csv", true);
            writer.write("\nForce: ;" + force + "\n");
            writer.write("Area: ;" + area + "\n");
            writer.write("Pressure: ;" + pressure + "\n");
            writer.close();
        }catch (IOException e){ 
            System.out.println("Creating new file....");
            createFile();
            saveData(force, area, pressure);
        }
    }
    
    public static void printData(){
        String line;
        String Separator = ";";

        try (BufferedReader read = new BufferedReader(new FileReader("data.csv"))) {
            while ((line = read.readLine()) != null) {

                String[] data = line.split(Separator);
                
                for (String value : data) {
                    System.out.println(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
