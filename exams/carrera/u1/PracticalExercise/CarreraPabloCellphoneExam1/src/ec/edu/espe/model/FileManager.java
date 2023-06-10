package ec.edu.espe.model;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class FileManager {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json;
    
    public void saveFile(ArrayList<Cellphone> cellphones, String fileName) {
        Gson gson = new Gson();

        String json = gson.toJson(cellphones);

        try (FileWriter fileWriter = new FileWriter("cellPhones.json")) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}