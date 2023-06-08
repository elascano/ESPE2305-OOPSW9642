
package ec.edu.espe.Exsanp1.view;

import ec.edu.espe.Exsanp1.model.Keyboards;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Pamela Chipe,The javas,KillChainTeam
 */
public class Exsanp1 {
    public static void main(String[] args) {
        ArrayList<Keyboards.Keyboard> keyboards = new ArrayList<>();
        
        

        keyboards.add(new Keyboards.Keyboard("1", "At1 Val1", "At2 Val1"));
        keyboards.add(new Keyboards.Keyboard("2", "At1 Val2", "At2 Val2"));
        keyboards.add(new Keyboards.Keyboard("3", "At1 Val3", "At2 Val3"));
        keyboards.add(new Keyboards.Keyboard("4", "At1 Val4", "At2 Val4"));
        keyboards.add(new Keyboards.Keyboard("5", "At1 Val5", "At2 Val5"));

        saveToJSON(keyboards)
        printAllObjects(keyboards);

        int totalObjects = keyboards.size();
        System.out.println("Total objects stored: " + totalObjects);
        keyboards.clear();

        saveToJSON(keyboards);
    }


}

