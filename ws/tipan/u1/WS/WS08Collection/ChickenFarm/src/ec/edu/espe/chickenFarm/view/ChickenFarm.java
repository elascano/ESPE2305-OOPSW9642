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
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
            ArrayList<Chicken> chickens2 = new ArrayList<> ();
        Coop coop;
        Coop coop2;                
        poop = new Poop(0);
        egg = new Egg(0);
                        
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70,0,1));
        chickens.add(chicken);
        System.out.println("chicken age --->"  );
        
        //System.out.println("Chicken --->" + chicken);
        
        chicken = new Chicken(2, "Maruja", "w", true, new Date (97,1,20));
        chickens.add(chicken);
        
        chicken = new Chicken(3, "Alice", "w&y", true, new Date (100,6,21));
        chickens.add(chicken);
        
        chicken = new Chicken(4, "Alison", "y", true, new Date (101,8,23));
        chickens.add(chicken);
        
        chicken = new Chicken(5, "Marta", "b", true, new Date (98,3,19));
        chickens.add(chicken);
                
        coop = new Coop(1, chickens);
                
        chicken = new Chicken(6, "Juan", "w", true, new Date (60,1,18));
        chickens2.add(chicken);
        
        chicken = new Chicken(7, "Felipe", "b&w", true, new Date (99,11,5));
        chickens2.add(chicken);
        
        chicken = new Chicken(8, "Ricardo", "g", true, new Date (123,2,11));
        chickens2.add(chicken);
        
        chicken = new Chicken(9, "Harry", "b", true, new Date (05,7,20));
        chickens2.add(chicken);
        
        chicken = new Chicken(10, "Hermione", "b&y", true, new Date (06,5,23));
        chickens2.add(chicken);
        coop2 = new Coop(2, chickens2);
        
        System.out.println("Coop --->" + coop);
        System.out.println("Coop --->" + coop2);
    }   
}
