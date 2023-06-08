
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
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
        System.out.println("Adonny Clero´s Farm ");
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, LocalDate.of(1999, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "Maruja", "w", true, LocalDate.of(2015, 10, 11));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Jennifer", "B", true, LocalDate.of(2019,12,03));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Rebecca", "w&B", false, LocalDate.of(1998, 8, 21));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Karla", "w", true, LocalDate.of(2005, 11, 17));
        chickens.add(chicken);
        
        //System.out.println("Chicken --> " + chicken);
        //System.out.println("Chicken --> " + chicken);
        
        System.out.println("chickens size --> " + chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(1, "Paola", "w", true, LocalDate.of(2009, 5, 01));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2, "Sara", "w", true, LocalDate.of(1975, 12, 05));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Tita", "w", true, LocalDate.of(1974, 5, 8));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Tamy", "w", true, LocalDate.of(2012, 11, 14));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Pata", "w", true, LocalDate.of(2002, 12, 25));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        System.out.println("chickens2 size --> " + chickens2.size());
        
        coop2 = new Coop(2, chickens2);
        
        System.out.println("chickens --> " + chickens2);
     
        System.out.println("coop --> " + coop + coop2);
        
    }
}
