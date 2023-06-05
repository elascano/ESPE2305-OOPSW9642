package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Menu {
    
    public void addChicken(Coop coop){
        Chicken chicken = new Chicken();
        coop.chickens.add(chicken);
    }
    
    public void uploadInformationToJsonFile(Gson gson, ArrayList<Coop> coops){
        String jsonContent = gson.toJson(coops);
        System.out.println(jsonContent);
        try(PrintWriter printWriter = new PrintWriter("chickenfarm.json")){
            printWriter.write(jsonContent);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
