
package ec.edu.espe.chickenfram.view;

import ec.edu.espe.chickenfram.model.Chicken;
import ec.edu.espe.chickenfram.model.Egg;
import ec.edu.espe.chickenfram.model.Poop;
import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setName("Josue");
        chicken.setColor("green and blue");
        chicken.setAge(21);
        chicken.setIsMolting(true);
        chicken.setBorn0nDate(new Date());
        System.out.println("This chicken is"+chicken);
              
    }
    
}
