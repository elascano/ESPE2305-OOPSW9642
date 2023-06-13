
package ec.edu.espe.hw08.chickenfarmjson.model;

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
    String fileName;
    
    public void create(){
        try {
            File file = new File(fileName + ".json");
            
            if(file.exists()){
                
            }
            else if(file.createNewFile()){
                System.out.println("The file was created correctly");
            }
        } catch (IOException ex) {
            System.out.println("Hubo un error al crear el archivo");
        }
    }
    
    public void write(ArrayList <Coop> coops, Chicken chicken, int numberOfCoop, String data){
        File file = new File(fileName + ".json");
        if (file.exists()){
            writeIfFileExists(chicken, numberOfCoop, data);
        }
        else{
            create();
            writeIfFileDoesntExists(coops);
        }
    }
    
    public void writeIfFileDoesntExists(ArrayList <Coop> coops){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".json"));
            Gson gson = new Gson();
            
            writer.write(gson.toJson(coops));
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al escribir el archivo");
        }
        
    }
    
    
    public void writeIfFileExists(Chicken chicken, int numberOfCoop, String data){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".json"));
            Gson gson = new Gson();
            Coop coop;
            Type coopListType = new TypeToken<ArrayList<Coop>>(){}.getType();
            ArrayList<Coop> coops = gson.fromJson(data, coopListType);
           
            coop = coops.get(numberOfCoop-1);

            coop.getChickens().add(chicken);

            writer.write(gson.toJson(coops));
            writer.flush();
            
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al escribir el archivo");
        }
        
    }
    
    public String readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.json"))) {
            String content = "";
            String line;
            while ((line = reader.readLine()) != null) {
                content += line;
            }
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public void showFilteredCoop(String dataReaded,int coopId) {
        Gson gson = new Gson();
        Coop coop;
        Type coopListType = new TypeToken<ArrayList<Coop>>(){}.getType();
        ArrayList<Coop> coops = gson.fromJson(dataReaded, coopListType);

        coop = coops.get(coopId-1);
        
        System.out.println(coop);
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public boolean exists(){
        File file = new File(fileName + ".json");
            
            if(file.exists()){
                return true;
            }
            else{
                return false;
            }
    } 
}
