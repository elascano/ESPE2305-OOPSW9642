package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Leonardo Narvaez The FAMSE ESPE-DCCO
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
        
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(1980, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2, "maruja", "w", true, new Date(2001, 12, 1));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "maria", "b", false, new Date(1995, 3, 18));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "alejandro", "w&b", false, new Date(1996, 5, 17));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "mateo", "g", true, new Date(1975, 6, 26));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);    
        System.out.println("chickens size --> " + chickens.size());        

        
        chicken = new Chicken(1, "Alejo", "w&b", false, new Date(1990,6, 10));
        chickens2.add(chicken);
        System.out.println("\nChicken --> " + chicken);
        
        chicken = new Chicken(2, "Matias", "b", true, new Date(1998,9, 15));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Janeth", "w", false, new Date(2006,8, 30));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        chicken = new Chicken(4, "Jenny", "g", true, new Date(2005,5, 5));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        
        chicken = new Chicken(5, "Diego", "w", false, new Date(2009,9, 28));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        System.out.println("chickens size --> " + chickens.size());        
        

        
        coop = new Coop(1, chickens);
        System.out.println("Chickens coop 1: \n" +chickens);
        coop2 = new Coop(2, chickens2);
        System.out.println("Chickens coop 2: \n" +chickens2);
        
    }
}
