/** Copyright ESPE-DECC
*/

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
 * @author Moran David 
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
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(106, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2, "Jaqeline", "b", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Alison", "w", false, new Date(107, 6, 17));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Josue", "r", false, new Date(102, 5, 17));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "David", "g", true, new Date(102, 6, 20));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);    
        System.out.println("chickens size --> " + chickens.size());        

        
        chicken = new Chicken(1, "Camila", "w&b", false, new Date(100,2, 12));
        chickens2.add(chicken);
        System.out.println("\nChicken --> " + chicken);
        
        chicken = new Chicken(2, "Daniel", "b", true, new Date(90,9, 15));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Jenny", "r", false, new Date(102,7, 22));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        chicken = new Chicken(4, "Andrea", "b", true, new Date(122,2, 4));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        
        chicken = new Chicken(5, "Leonel", "w", false, new Date(121,7, 10));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        System.out.println("chickens size --> " + chickens.size());        
        

        
        coop = new Coop(1, chickens);
        System.out.println("Chickens coop 1: \n" + chickens);
        
        coop2 = new Coop(2, chickens2);
        System.out.println("Chickens coop 2: \n" +chickens2);
        
    }
}
