package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.JsonFileManager;
import ec.edu.espe.chickenfarm.model.Menu;
import java.util.List;

public class ChickenFarm {
    public static void main(String[] args) {
        JsonFileManager jsonFileManager = new JsonFileManager("chickens.json");
        List<Coop> coops = jsonFileManager.readCoops();

        Menu menu = new Menu(coops);
        menu.show();

        jsonFileManager.writeCoops(coops);
    }
}
