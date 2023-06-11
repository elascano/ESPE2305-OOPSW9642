package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
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
        numberOfEggs=0;
        name="Jordan Guaman";
        
        
        
            System.out.println("This is the Chicken --->"+chicken);

            System.out.println("The name is --->"+name);

            System.out.println("This is the number if Eggs --->"+numberOfEggs);
    }
}
