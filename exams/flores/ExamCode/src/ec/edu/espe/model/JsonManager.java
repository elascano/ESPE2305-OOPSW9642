package ec.edu.espe.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class JsonManager {
    public void createJson(ArrayList<University> universities) {
        File file = new File("SavedFiles");
        file.mkdir();
        Gson gson = new Gson();
        
        String json = gson.toJson(universities);

        try (FileWriter fileWriter = new FileWriter("SavedFiles/universities.json")) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    
}
