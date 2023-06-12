package ec.edu.espe.chickenfarmsimulator.view;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import ec.edu.espe.chickenfarmsimulator.model.Egg;
import ec.edu.espe.chickenfarmsimulator.model.Poop;
import java.util.Date;


/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Joan Cobeña");
        chicken.setColor("Gray");
        chicken.setAge(18);
        chicken.setIsMolting(false);
        chicken.setDate(new Date());
        
        System.out.println("this chicken is" + chicken);
        
    }
}
