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
    * @author Mesias Mariscal, OOPTech ESPE-DCCO
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
        System.out.println("In Mesias Mariscal's Chicken Farm\n");
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(2017, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date(2019,5,25));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Lala", "r", false, new Date(2005, 8, 18));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Pablo", "w&b", false, new Date(2001, 2, 9));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Antony", "green", true, new Date(2005, 6, 26));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);    
        System.out.println("chickens size --> " + chickens.size());        

        
        chicken = new Chicken(1, "Mateo", "w&b", false, new Date(2006,7, 11));
        chickens2.add(chicken);
        System.out.println("\nChicken --> " + chicken);
        
        chicken = new Chicken(2, "Kira", "b", true, new Date(2002,6, 26));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Rosa", "h", false, new Date(2023,8, 30));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        chicken = new Chicken(4, "Isis", "r", true, new Date(2015,1, 06));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        
        chicken = new Chicken(5, "Deku", "w", false, new Date(2014,10, 04));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        System.out.println("chickens size --> " + chickens.size());        
        

        
        coop = new Coop(1, chickens);
        System.out.println("\nChickens coop 1: \n");
        for (Chicken c : chickens) {
        System.out.println(c);
        }
        System.out.println("\nChicken coop 2:");

        for (Chicken c : chickens2) {
        System.out.println(c);
}
        
    }
}