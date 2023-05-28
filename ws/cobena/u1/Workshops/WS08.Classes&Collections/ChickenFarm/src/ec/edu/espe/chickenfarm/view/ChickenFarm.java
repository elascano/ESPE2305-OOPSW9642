package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList <Chicken> chickens1;
        ArrayList <Chicken> chickens2;
        Coop coop1;
        Coop coop2;
        
        chickens1 = new ArrayList<>();
        chickens2 = new ArrayList<>();
        
        System.out.println("Chickens1 size --->" + chickens1.size());
        System.out.println("Chickens2 size --->" + chickens2.size());
        
        coop1 = new Coop(1, chickens1);
        coop2 = new Coop(2, chickens2);
        
        System.out.println("----- COOP 1 ----- \n");
       
        chicken = new Chicken(1, "Lucy", "B&W", true, new Date(1970,11,17));
        poop = new Poop(chicken.getId());
        chickens1.add(chicken);
        egg = new Egg(0);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens1 size ---> " + chickens1.size()+ "\n");
        
        chicken = new Chicken(2, "Mary", "Brown", true, new Date(2020,2,11));
        chickens1.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens1 size ---> " + chickens1.size()+ "\n");
        
        chicken = new Chicken(3, "Lo", "W", true, new Date(2021,3,13));
        chickens1.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens1 size ---> " + chickens1.size()+ "\n");
        
        chicken = new Chicken(4, "Coco", "Black", true, new Date(2017,10,15));
        chickens1.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens1 size ---> " + chickens1.size()+ "\n");
        
        chicken = new Chicken(5, "Ro", "Gray", true, new Date(2022,7,12));
        chickens1.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens1 size ---> " + chickens1.size()+ "\n");
        
        System.out.println("----- COOP 2 ----- \n");
        
        chicken = new Chicken(6, "Diana", "Gray", true, new Date(2019,1,4));
        chickens2.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens2 size ---> " + chickens2.size()+ "\n");
        
        chicken = new Chicken(7, "Seju", "Black", true, new Date(2018,2,3));
        chickens2.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens2 size ---> " + chickens2.size()+ "\n");
        
        chicken = new Chicken(8, "Xayah", "Brown", true, new Date(2016,3,6));
        chickens2.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens2 size ---> " + chickens2.size()+ "\n");
        
        chicken = new Chicken(9, "Rom", "W", true, new Date(2020,8,7));
        chickens2.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens2 size ---> " + chickens2.size()+ "\n");
        
        chicken = new Chicken(10, "Ram", "W", true, new Date(2000,9,1));
        chickens2.add(chicken);
        System.out.println("Chicken is ---> " + chicken);
        System.out.println("Chickens2 size ---> " + chickens2.size()+ "\n");
       
        System.out.println("COOP 1 - - - > : \n"+ coop1);
        System.out.println("COOP 2 - - - > : \n"+ coop2);
        System.out.println("Chickens1 size ---> " + chickens1.size());
        System.out.println("Chickens2 size ---> " + chickens2.size());
        
    }
}
