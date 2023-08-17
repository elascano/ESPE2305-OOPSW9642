package ec.edu.espe.exam1.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class JsonFile {
    private String name;
    
    public JsonFile(String name) {
        this.name = name;
    }
    
    public void create(){
        try {
            File file = new File(name + ".json");
            
            if(file.exists()){
                
            }
            else if(file.createNewFile()){
                System.out.println("The file was created correctly");
            }
        } 
        catch (IOException ex) {
            System.out.println("There was an error creating the file");
        }
    }
    
    public void write(Sport sport){
        File file = new File(name + ".json");
        String dataReaded;
        if (file.exists()){
            dataReaded = readData();
            writeIfFileExists(sport, dataReaded);
        }
        else{
            create();
            writeIfFileDoesntExists(sport);
        }
    }
    
    public void writeIfFileDoesntExists(Sport sport){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".json"));
            Gson gson = new Gson();
            ArrayList<Sport> savedSports = new ArrayList();
            savedSports.add(sport);
            writer.write(gson.toJson(savedSports));
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println("There was an error writing the file");
        }
    }
    
    public void writeIfFileExists(Sport sport, String dataReaded){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".json"));
            Gson gson = new Gson();
            Type sportsArrayList = new TypeToken<ArrayList<Sport>>(){}.getType();
            ArrayList<Sport> savedSports = gson.fromJson(dataReaded, sportsArrayList);
           
            if(savedSports == null){
                savedSports = new ArrayList();
                savedSports.add(sport);
            }
            else{
                savedSports.add(sport);
            }
            writer.write(gson.toJson(savedSports));
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al escribir el archivo");
        }
    }
    
    public void deleteAllSaved(){
        File file = new File(name + ".json");
        if (file.exists()){
            file.deleteOnExit();
        }
        else{
            System.out.println("There is no file to delete");
        }
        
    }
    
    public String readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(name + ".json"))) {
            String content = "";
            String line;
            while ((line = reader.readLine()) != null) {
                content += line;
            }
            return content;
        } catch (IOException e) {
                System.out.println("There was an error reading the data");
            return "";
        }
    }
}
