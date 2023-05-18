package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;

/**
 *
 * @author Leonardo Narvaez, The FAMSE; DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setName("Leonardo");
        chicken.setColor("Black and Green");
        chicken.setAge(19);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("this chicken is " + chicken);
    }
}
