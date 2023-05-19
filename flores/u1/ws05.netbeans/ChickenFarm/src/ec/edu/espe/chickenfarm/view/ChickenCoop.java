package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
 */
public class ChickenCoop {
    public static void main(String[] args) {
        int id;
        Chicken chicken;
        Egg egg;
        Poop poop;
    
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Caetano");
        chicken.setColor("withe and brown");
        chicken.setAge(5);
        chicken.setIsMolting(true);
        chicken.setBornDate(new Date());
        System.out.println("This chicken is " + chicken);
    }
     
}
