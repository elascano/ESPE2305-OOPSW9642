package ec.edu.espe.farm.model;

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
public class JsonFileManager {
    
    public static void create(String fileName) {
        try {
            File file = new File(fileName + ".json");

            if(file.exists()){

            }
            else if(file.createNewFile()){
                System.out.println("The file was created correctly");
            }
        } catch (IOException ex) {
            System.out.println("There was an error creating the file");
        }
    }
    
    public static void write(FarmAnimal farmAnimal, String fileName) {
        File dataFolder = new File( "data");
        File file = new File(fileName + ".json");
        if (file.exists()){
            String dataReaded;
            dataReaded = read(fileName);
            writeIfFileExists(farmAnimal, dataReaded, fileName);
        }
        else{
            dataFolder.mkdir();
            create(fileName);
            writeIfFileDoesntExists(farmAnimal, fileName);
        }
    }
    
    public static void writeIfFileDoesntExists(FarmAnimal farmAnimal, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/" + fileName + ".json"));
            Gson gson = new Gson();
            
            if(farmAnimal.getClass().getSimpleName().equals("Chicken")){
                ArrayList<Chicken> savedAnimals = new ArrayList();
                savedAnimals.add((Chicken)farmAnimal);
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Cow")){
                ArrayList<Cow> savedAnimals = new ArrayList();
                savedAnimals.add((Cow)farmAnimal);
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Duck")){
                ArrayList<Duck> savedAnimals = new ArrayList();
                savedAnimals.add((Duck)farmAnimal);
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Pig")){
                ArrayList<Pig> savedAnimals = new ArrayList();
                savedAnimals.add((Pig)farmAnimal);
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Sheep")){
                ArrayList<Sheep> savedAnimals = new ArrayList();
                savedAnimals.add((Sheep)farmAnimal);
                writer.write(gson.toJson(savedAnimals));
            }
            
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println("There was an error writing the file");
        }
    }
    
    public static void writeIfFileExists(FarmAnimal farmAnimal, String dataReaded, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/" + fileName + ".json"));
            Gson gson = new Gson();
            if(farmAnimal.getClass().getSimpleName().equals("Chicken")){
                Type farmAnimalArrayList= new TypeToken<ArrayList<Chicken>>(){}.getType();
                ArrayList<Chicken> savedAnimals = gson.fromJson(dataReaded, farmAnimalArrayList);
                if(savedAnimals == null){
                    savedAnimals = new ArrayList();
                    savedAnimals.add((Chicken) farmAnimal);
                }
                else{
                    savedAnimals.add((Chicken) farmAnimal);
                }
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Cow")){
                Type farmAnimalArrayList= new TypeToken<ArrayList<Cow>>(){}.getType();
                ArrayList<Cow> savedAnimals = gson.fromJson(dataReaded, farmAnimalArrayList);
                if(savedAnimals == null){
                    savedAnimals = new ArrayList();
                    savedAnimals.add((Cow) farmAnimal);
                }
                else{
                    savedAnimals.add((Cow) farmAnimal);
                }
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Duck")){
                Type farmAnimalArrayList= new TypeToken<ArrayList<Duck>>(){}.getType();
                ArrayList<Duck> savedAnimals = gson.fromJson(dataReaded, farmAnimalArrayList);
                if(savedAnimals == null){
                    savedAnimals = new ArrayList();
                    savedAnimals.add((Duck) farmAnimal);
                }
                else{
                    savedAnimals.add((Duck) farmAnimal);
                }
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Pig")){
                Type farmAnimalArrayList= new TypeToken<ArrayList<Duck>>(){}.getType();
                ArrayList<Pig> savedAnimals = gson.fromJson(dataReaded, farmAnimalArrayList);
                if(savedAnimals == null){
                    savedAnimals = new ArrayList();
                    savedAnimals.add((Pig) farmAnimal);
                }
                else{
                    savedAnimals.add((Pig) farmAnimal);
                }
                writer.write(gson.toJson(savedAnimals));
            }
            else if(farmAnimal.getClass().getSimpleName().equals("Sheep")){
                Type farmAnimalArrayList= new TypeToken<ArrayList<Duck>>(){}.getType();
                ArrayList<Sheep> savedAnimals = gson.fromJson(dataReaded, farmAnimalArrayList);
                if(savedAnimals == null){
                    savedAnimals = new ArrayList();
                    savedAnimals.add((Sheep)farmAnimal);
                }
                else{
                    savedAnimals.add((Sheep)farmAnimal);
                }
                writer.write(gson.toJson(savedAnimals));
            }
            
            writer.flush();
        } 
        catch (IOException ex) {
            System.out.println("There was an error writing the file");
        }
    }
    
    public static ArrayList<FarmAnimal> objectsSaved(String fileName) {
        Gson gson = new Gson();
        String dataReaded = read(fileName);
        if (dataReaded!=null){
           Type objectArrayList = new TypeToken<ArrayList<Object>>(){}.getType();
           ArrayList<FarmAnimal> savedAnimals = gson.fromJson(dataReaded, objectArrayList);
           return savedAnimals;
        }
        else{
            ArrayList<FarmAnimal> savedAnimals = new ArrayList();
            return savedAnimals;
        }
    }
    
    public static String read(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/" + fileName + ".json"))) {
            String content = "";
            String line;
            while ((line = reader.readLine()) != null) {
                content += line;
            }
            return content;
        } 
        catch (IOException e) {
            System.out.println("There was an error reading the data");
            return null;
        }
    }
}
