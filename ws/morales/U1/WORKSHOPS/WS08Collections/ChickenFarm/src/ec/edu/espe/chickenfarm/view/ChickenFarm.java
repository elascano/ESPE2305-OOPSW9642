
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop;
        Coop coop2;
        
        
        System.out.println("\tGRANJA MORALES S.A");
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(2020,0,10));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(2, "Maruja", "w", true, new Date(2023, 0, 1));
        chickens.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(3, "Lola", "gr&b", true, new Date(2017,4,23));
        chickens.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(4, "Eliza", "br", true, new Date(2015,8,16));
        chickens.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(5, "Ala", "br&b", true, new Date(2013,9,30));
        chickens.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        System.out.println("Chicken -->" + chicken);
        System.out.println("chicken size -->" + chickens.size());
        
        coop = new Coop(0, chickens);
        System.out.println("Chickens -->" + chickens);
        System.out.println("Coop -->" + coop);
        System.out.println("\n");
        
        chicken = new Chicken(1, "Nata", "w&b", false, new Date(2000, 4, 1));
        chickens2.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(2, "Umberta", "w", true, new Date(2018, 5, 9));
        chickens2.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(3, "Laly", "br", true, new Date(2019, 5, 1));
        chickens2.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(4, "Enik", "br&w", true, new Date(2010, 11, 5));
        chickens2.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        chicken = new Chicken(5, "Ala", "gr", true, new Date(2009, 13, 12));
        chickens2.add(chicken);
        System.out.println("Chicken -->" + chicken);
        
        System.out.println("chicken size -->" + chickens2.size());
        coop2 = new Coop(0, chickens2);
        System.out.println("Chickens -->" + chickens2);
        System.out.println("Coop -->" + coop2);
    }

}
