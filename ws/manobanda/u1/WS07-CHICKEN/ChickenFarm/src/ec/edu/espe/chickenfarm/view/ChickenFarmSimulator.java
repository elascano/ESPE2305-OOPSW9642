
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        
        chicken = new Chicken();
        int numberOfEgg;
        
        name = "Jeffrey Manobanda";
        numberOfEgg = 0;
        
        System.out.println("This is the chicken --> " + chicken);
        System.out.println("The name is --> " + name);
        System.out.println("This is number of eggs " + numberOfEgg);
    
    }
}
