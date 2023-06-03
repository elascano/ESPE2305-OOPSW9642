package ec.edu.espe.chickenfarm.model;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class FileManager {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json;
    
    public void saveFile(ArrayList<Chicken> chickens, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        json = gson.toJson(chickens);
        try (FileWriter file = new FileWriter(fileName+ ".json", true)) {
            file.write(json);
            System.out.println("Data saved succefull");
            file.close();
            
        } catch (IOException e) {
            System.out.println("There's an error with the file");
       }
        
    }
    
    public void printFile(String fileName) {
        ArrayList<Chicken> chickens;
        
        Gson gson = new Gson();
        
        try (FileReader reader = new FileReader(fileName + ".json")) {
            Type type = new TypeToken<ArrayList<Chicken>>(){}.getType();
            
            chickens = gson.fromJson(reader, type);
            System.out.println(chickens);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
