package ec.edu.espe.chickenfarm.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import com.google.gson.Gson;
import java.io.IOException;
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
    
    public void write(ArrayList <Coop> coops, Chicken chicken, int numberOfCoop){
        File file = new File(fileName + ".json");
        if (file.exists()){
            writeIfFileExists(chicken, numberOfCoop);
        }
        else{
            writeIfFileDoesntExists(coops);
        }
    }
    
    public void writeIfFileDoesntExists(ArrayList <Coop> coops){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".json"));
            Gson gson = new Gson();
           
            writer.write(gson.toJson(coops));
            writer.flush();
            
            System.out.println("entre sin querer");
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al escribir el archivo");
        }
        
    }
    
    public void writeIfFileExists(Chicken chicken, int numberOfCoop){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".json"));
            Gson gson = new Gson();
            Coop coop;
            ArrayList<Coop> coops = gson.fromJson(readData(), ArrayList.class);
           
            coop = coops.get(numberOfCoop-1);

            coop.getChickens().add(chicken);

            coops.remove(numberOfCoop-1);
            coops.add(numberOfCoop-1, coop);

            writer.write(gson.toJson(coops));
            writer.flush();
            
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al escribir el archivo");
        }
        
    }
    
    public String readData() {
        try {
            
            FileReader reader = new FileReader(fileName + ".json");
            BufferedReader bR = new BufferedReader(reader);
            String content = new String();
            String line;
            while ((line = bR.readLine()) != null) {
                content += line;
            }
            return content;
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al leer el archivo");
            return "";
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
