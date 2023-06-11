package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Moran David
 */

public class JsonGenerator {
    public void generateJsonFile(List<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);

        try (FileWriter writer = new FileWriter("chickens.json")) {
            writer.write(json);
            System.out.println("JSON file generated");
        } catch (IOException e) {
            System.out.println("Error generating JSON file: " + e.getMessage());
        }
    }
}
