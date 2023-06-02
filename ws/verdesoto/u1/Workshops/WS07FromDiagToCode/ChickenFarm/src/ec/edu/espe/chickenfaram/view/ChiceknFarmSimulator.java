package ec.edu.espe.chickenfaram.view;

import ec.edu.espe.chickenfaram.model.Chicken;
import ec.edu.espe.chickenfaram.model.ChickenFarmer;
import ec.edu.espe.chickenfaram.model.Coop;
import ec.edu.espe.chickenfaram.model.Egg;
import ec.edu.espe.chickenfaram.model.Poop;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class ChiceknFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        int numberOfEggs;
        
        name="Edison Verdesoto";
        chicken = new Chicken ();
        numberOfEggs = 3;
        
        System.out.println("This is the Chicken ----> " + chicken);
        
        System.out.println("The name is ----> " + name);
        
        System.out.println("This is the number of assigned eggs" + numberOfEggs);
    
    }
}
