package ec.edu.espe.exampoo.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exampoo.model.Forniture;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Simulator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int selection;
        System.out.println("Welcom");
        System.out.println("Select the options\n"
                + "1\n"
                + "2\n");
        selection=sc.nextInt();
        if(selection==1){
            writeJSON();
            }else{
                if(selection==2){
                   String jsonFilePath = "forniture.json";

                    try (BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath))) {
                        StringBuilder jsonContent = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            jsonContent.append(line);
                        }

                        // Mostrar el contenido del archivo JSON
                        System.out.println(jsonContent.toString());

                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo JSON: " + e.getMessage());
                    }
                }
        }
    
    }
    public static void writeJSON() throws IOException, Exception{
        
        String food;
        String medicine;
        String tool;
        
        ArrayList<Forniture> forniture = new ArrayList<Forniture>();
        Forniture fornitureArray[] = new Forniture[10];
        Scanner sc = new Scanner(System.in);
                   
                            
        System.out.println("Enter Food:");
        food=sc.nextLine();
        System.out.println("Enter Meidicine :");
        medicine=sc.nextLine();
        System.out.println("Enter Tool:");
        tool=sc.nextLine();
        
        
        Forniture fornitures = new Forniture(food , medicine, tool);
        System.out.println("food object -> " + fornitures);
        
        fornitures = new Forniture(food , medicine, tool);
        System.out.println("medicine object -> " + fornitures);
                   
        forniture.add(fornitures);
               
        System.out.println("tool -> " + fornitures  + "\n");
        fornitureArray[0] = fornitures;
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBlender;
        jsonBlender = gson.toJson(forniture);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("forniture.json")) {
                 writer.write(gson.toJson(fornitures));
             }
    }
    
public void JsonUtils()  {
        String jsonFilePath = "forniture.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            // Mostrar el contenido del archivo JSON
            System.out.println(jsonContent.toString());

        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
    }
}
