package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setAge(24);
        chicken.setName("Edison");
        chicken.setColor("Green");
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("This chicken is" + chicken);
    }
}
