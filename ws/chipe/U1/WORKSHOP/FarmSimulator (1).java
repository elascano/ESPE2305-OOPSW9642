package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;

/**
 *
 * @author Pamela Chipe,The javas,KillChainTeam
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setName("Yeshua");
        chicken.setColor("white and black");
        chicken.setAge(21);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("this chicken is " + chicken);
    }
}
