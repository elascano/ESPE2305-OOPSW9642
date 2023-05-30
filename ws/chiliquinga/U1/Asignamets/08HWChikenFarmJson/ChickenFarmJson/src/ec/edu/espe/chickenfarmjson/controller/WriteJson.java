package ec.edu.espe.chickenfarmjson.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class WriteJson {
    public void WriteJson(String jsonString, String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens.json", true))) {
            writer.write(jsonString);
            System.out.println("");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
