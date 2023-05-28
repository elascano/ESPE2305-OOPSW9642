
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        int numberOfEggs;
        
        chicken = new Chicken();
        name = "Adonny Calero";
        numberOfEggs = 0;
        System.out.println("This is the chicken -->" + chicken);
        System.out.println("The name is -->" + name);
        System.out.println("This is the number of eggs:" + numberOfEggs);
    }
}
