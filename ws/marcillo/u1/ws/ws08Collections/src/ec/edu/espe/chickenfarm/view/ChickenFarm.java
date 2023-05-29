
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
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
        
        System.out.println("chickens size-->" + chickens.size());
        System.out.println("Gallinera Jhordy Marcillo :D");
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "white and brown", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2,"maruja", "w", true, new Date(90,12,10));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3,"morojo", "brown", true, new Date(98, 10,2));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4,"mach", "black", false, new Date(97,8,1));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
       
        chicken = new Chicken(5,"spy", "black", true, new Date(90,1,2));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        System.out.println("**Chickens size --> **" +chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("coop1-->" + chickens);
        
        
        System.out.println("===================");
        
        chicken = new Chicken(1,"AAA", "black", true, new Date(90,11,3));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2,"BBB", "white", false, new Date(96,3,20));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3,"CCC", "brown", true, new Date(95,2,12));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);  
 
        chicken = new Chicken(4,"DDD", "black", false, new Date(96,5,2));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);      
        
        chicken = new Chicken(5,"yor", "b&w", true, new Date(20,2,30));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);        

        System.out.println("**Chickens size --> **" +chickens.size());
        
        coop2 = new Coop(2, chickens2);
        System.out.println("coop2 -->" + chickens2);
    }
    
}
