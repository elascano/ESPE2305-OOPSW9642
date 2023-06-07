package ec.edu.espe.chickenfarm.model;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class FileManager {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String chickensJson;
    Scanner scanner = new Scanner(System.in);
    
    public void saveFile(ArrayList<Chicken> chickens, String fileName) {
        chickensJson = gson.toJson(chickens);
        
        try (FileWriter file = new FileWriter(fileName+ ".json", true)) {
        // Escribir la cadena JSON en el archivo
        file.write(chickensJson);
        file.flush();
            System.out.println("Data saved succefull");
        } catch (IOException e) {
            System.out.println("There's an error with the file");
            System.out.println("This is usally caused because the file is open");
            System.out.println("Close the file then press enter");
            int option = scanner.nextInt();
            
            saveFile(chickens, fileName);
       }
    }
    
    
    
    
}
