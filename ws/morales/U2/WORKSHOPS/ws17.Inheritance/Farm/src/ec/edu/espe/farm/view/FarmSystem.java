package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class FarmSystem {
    private static final String FILENAME = "C:\\Users\\ANTHONY\\Desktop\\morales\\U2\\WORKSHOPS\\ws17.Inheritance\\Farm\\animals.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static List<FarmAnimal> animalList = new ArrayList<>();
    
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        meat = new Meat();
        
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        addAnimalToList(farmAnimal);
        printTypedAndAnimal(farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        
        chicken.produce(meat);
        System.out.println("new chicken -->" +chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        printTypedAndAnimal(farmAnimal);
        
        System.out.println("new chicken -->" +chicken);
        meat.setPounds(1);
        System.out.println("chicken ate -->" +chicken.produce(meat));
        
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        addAnimalToList(farmAnimal);
        printTypedAndAnimal(farmAnimal);
        System.out.println("pig -->" +farmAnimal);
        
        farmAnimal = new Turkey(true, 0, 1, "Bronze", new Date());
        addAnimalToList(farmAnimal);
        printTypedAndAnimal(farmAnimal);
        System.out.println("turkey -->" +farmAnimal);
        
        farmAnimal = new Cow(true, 0, "Abigar", new Date());
        addAnimalToList(farmAnimal);
        printTypedAndAnimal(farmAnimal);
        System.out.println("cow -->" +farmAnimal);
        
        farmAnimal = new Sheep("Black", new Date(), 0, "Merino", new Date());
        addAnimalToList(farmAnimal);
        printTypedAndAnimal(farmAnimal);
        System.out.println("sheep -->" +farmAnimal);
        
        saveChicken();
    }

    private static void printTypedAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("---------------------------------");
        System.out.println("type -->" +farmAnimal.getClass().getSimpleName());
        System.out.println("animal -->"+farmAnimal);
        System.out.println("---------------------------------");
    }
    
    private static void addAnimalToList(FarmAnimal animal) {
        animalList.add(animal);
    }
    
    public static void saveChicken() {
        try (Writer writer = new FileWriter(FILENAME)) {
            gson.toJson(animalList, writer);
        } catch (IOException e) {
            System.out.println("Error writing animals to JSON file.");
        }
    }
    
}
