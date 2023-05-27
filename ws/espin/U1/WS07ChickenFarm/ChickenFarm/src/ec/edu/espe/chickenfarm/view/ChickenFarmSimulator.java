
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        name="Andres Espin";
        int numberOfEggs;
        numberOfEggs=0;
        chicken =new Chicken();
        egg=new Egg();
        System.out.println("This is the chicken---> " + chicken );
        System.out.println("The name is--->"+name);
        System.out.println("This is the number of egg--->"+ egg);
    }
}
