package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;

import java.io.FileWriter;
import java.io.IOException;

public class JsonController {
    private static final String FILE_PATH = "chickens.json";

    public static void writeChickensToJSON(Coop coop) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(coop, writer);
            System.out.println("Chickens data written to " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error writing chickens data to " + FILE_PATH);
            e.printStackTrace();
        }
    }
}
