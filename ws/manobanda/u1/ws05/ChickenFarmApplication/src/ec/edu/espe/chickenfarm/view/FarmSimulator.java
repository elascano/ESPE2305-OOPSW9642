
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters, DCCO-ESPR
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Jeffrey");
        chicken.setColor("White and brown");
        chicken.setAge(20);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("this chicken is" + chicken);
    }
}
