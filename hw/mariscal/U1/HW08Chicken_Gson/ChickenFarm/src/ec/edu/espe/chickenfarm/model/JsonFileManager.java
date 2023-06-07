/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonFileManager {
    private String fileName;

    public JsonFileManager(String fileName) {
        this.fileName = fileName;
    }

    public List<Coop> readCoops() {
        List<Coop> coops = new ArrayList<>();

        try (FileReader reader = new FileReader(fileName)) {

            
            Gson gson = new Gson();

            Type coopListType = new TypeToken<ArrayList<Coop>>(){}.getType();

            coops = gson.fromJson(reader, coopListType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return coops;
    }

    public void writeCoops(List<Coop> coops) {
        Gson gson = new Gson();

        String jsonCoops = gson.toJson(coops);

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(jsonCoops);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
