package ec.edu.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;


/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[]args){
      Chicken chicken;
      Egg egg;
      Poop poop;
      
      chicken = new Chicken();
      chicken.doStuff(0);
      chicken.setId(1);
      chicken.setName("Leonel");
      chicken.setColor("White");
      chicken.setAge(19);
      chicken.setIsMolting(true);
      chicken.setBornOnDate(new Date());
      System.out.println("This chicken is"+ chicken);
    }
    
}
