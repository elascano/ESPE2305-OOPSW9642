package ec.edu.espe.PressureCalculator.model;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class DataSave {
    
    public static void save(float force, float area, float pressure){
        try {
            FileWriter writer = new FileWriter("data.csv");
            writer.write("\nForce: ;" + force + "\n");
            writer.write("Area: ;" + area + "\n");
            writer.write("Pressure: ;" + pressure + "\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static void read() {
        
    }
}
