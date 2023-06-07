
package ec.edu.espe.chickenFarm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenFarm.controller.Json;
import ec.edu.espe.chickenFarm.controller.Menu;
import ec.edu.espe.chickenFarm.model.Coop;
import java.util.List;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ChickenFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson Json =  new GsonBuilder().setPrettyPrinting().create();
        Json json = new Json("ChickenFarm.json");
        List<Coop> coops = json.readCoops();

        Menu menu = new Menu(coops);
        menu.show();
        json.writeCoops(coops);
               
    }
    
}
