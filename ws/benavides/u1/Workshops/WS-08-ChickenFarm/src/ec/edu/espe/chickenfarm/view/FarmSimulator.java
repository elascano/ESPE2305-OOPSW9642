package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;


/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Ruben");
        chicken.setColor("blue");
        chicken.setAge(12);
        chicken.setIsMolting(true);
        chicken.setDate(new Date());
        
        System.out.println("this chicken is" + chicken);
        
    }
}

