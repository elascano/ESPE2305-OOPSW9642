
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] arg){
        Chicken chicken;
        ChickenFarmer chickenFarmer;
        Coop coop;
        Egg egg;
        Poop poop;
        String name;
        int numberOfEggs;
        
        chicken= new Chicken();
        name="Leonel Tipan";
        numberOfEggs=1;
        
        System.out.println("This is the chicken--> "+ chicken);
        System.out.println("The name is--> "+ name);
        System.out.println("This is the number of assigned eggs-->"+ numberOfEggs);
    }
    
}
