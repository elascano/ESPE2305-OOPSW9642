package ec.edu.espe.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class FileManager {
    public static void createFile(){
        try {
            FileWriter recopile = new FileWriter("dataRegister.csv");
        }catch (IOException e){ 
            e.printStackTrace();
        }
    }
    
    public static void saveData(float mass, float volume, float density){
        try {
            FileWriter recopile = new FileWriter("dataRegister.csv", true);
            recopile.write("\nMass: ;" + mass + "\n");
            recopile.write("Volume: ;" + volume + "\n");
            recopile.write("Density: ;" + density + "\n");
            recopile.close();
        }catch (IOException e){ 
            
            createFile();
            saveData(mass,volume,density);
        }
    }
    
    public static void printData(){
        String line;


        try (BufferedReader read = new BufferedReader(new FileReader("dataRegister.csv"))) {
            while ((line = read.readLine()) != null) {

                String[] data = line.split(";");
                
                for (String value : data) {
                    System.out.println(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
