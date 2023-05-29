package ec.edu.espe.chickenFarm.view;

import ec.edu.espe.chickenFarm.model.Chicken;
import ec.edu.espe.chickenFarm.model.Coop;
import ec.edu.espe.chickenFarm.model.Egg;
import ec.edu.espe.chickenFarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;
//LocalTime, calendar, LocalDate instead of date
/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class ChickenFarm {
    Chicken chickens[];
    
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
               ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        
        coop2 = new Coop(2, chickens2);
     
        System.out.println("coop --> " + coop);
    }
}
