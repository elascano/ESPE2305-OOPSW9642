package ec.edu.espe.chickenfarmsimulator.view;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import ec.edu.espe.chickenfarmsimulator.model.Egg;
import ec.edu.espe.chickenfarmsimulator.model.Poop;
import java.util.Date;


/**
 *
 * @author Adonny Calero,Jsons, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        Poop poop;
        
        chicken=new Chicken();
        chicken.doStuff(0);
        chicken.setId(5);
        chicken.setName("Adonny Calero");
        chicken.setColor("white and brown");
        chicken.setAge(23);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("This is chicken"+chicken);
     
    }
}
