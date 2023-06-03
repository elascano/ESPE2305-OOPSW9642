package espe.edu.ec.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ChickenJsonFileManager {

    private static Gson gson = new Gson();
    private String filename;

    public ChickenJsonFileManager(String filename) {
        this.filename = filename;
    }

    public void writeToJson(ArrayList<Chicken> chickens) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(chickens, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Chicken> readFromJson() {
        try {
            FileReader reader = new FileReader(filename);
            Type type = new TypeToken<ArrayList<Chicken>>(){}.getType();
            return gson.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();  // Devuelve una lista vacía si el archivo no existe
        }
    }

}
