

package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/*
autor Jordan Guaman/ DCCO-ESPE/SoftwareJuniors
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
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(2009, 16, 15));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        System.out.println("Chicken --> " + chicken);
        
        
        
        chicken = new Chicken(2, "Carla", "w", true, new Date(2014,5,4));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Jacinta", "w&b", false, new Date(2015, 9, 12));
        chickens.add(chicken);
          System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Pancha", "w&b", false, new Date(2013, 12, 20));
        chickens.add(chicken);
          System.out.println("Chicken --> " + chicken);
        
        
        chicken = new Chicken(5, "Paula", "w&b", false, new Date(2016, 5, 16));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        
        
   
        
        
        coop = new Coop(0, chickens);
        
       // System.out.println("chickens --> " + chickens);
        System.out.println("Coop -->" + coop);
        System.out.println("Chicken -->" + chickens);
        System.out.println("chicken size -->" + chickens.size());
        System.out.println("\n");
        
        //
        chicken = new Chicken(1, "Pepa", "w", true, new Date(1981,1,1));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);

        
        chicken = new Chicken(2, "Cazzu", "w&b", false, new Date(1999,2,2));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);

        
        chicken = new Chicken(3, "Pili", "w&b", false, new Date(2005,5,8));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);

        
        chicken = new Chicken(4, "Clara", "w&b", false, new Date(2009,4,8));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(5, "Oscura", "w", true, new Date(2014,8,5));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);

        
        //System.out.println("Chicken --> " + chicken);
        

        System.out.println("chicken size -->" + chickens2.size());

        coop2= new Coop(0, chickens2);
        
        System.out.println("chickens --> " + chickens2);
        System.out.println("Coop2 -->" + coop2);

    }
}
