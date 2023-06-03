package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Ruben Benavides, 'Jsons', DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Egg egg;
        Coop coop;
        Poop poop;
        
        chicken = new Chicken();
        
        String name;
        name = "Ruben Benavides";
        
        int numberOfEgg;
        numberOfEgg = 0;
        
        System.out.println("This is the chicken --> " + chicken);
        System.out.println("The name is --> " + name);
        System.out.println("This is the number of eggs --> " + numberOfEgg);
        
    }
}
