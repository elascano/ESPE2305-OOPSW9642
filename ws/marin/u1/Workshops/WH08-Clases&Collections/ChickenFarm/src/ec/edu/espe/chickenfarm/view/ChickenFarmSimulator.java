
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Poop;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main (String[]args){
     Poop poop;
     Egg egg;
     Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
               ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
        System.out.println("----Chicken farm by Josue Marin----");
        
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        int age = chicken.getAge();
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        //2
        System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(2, "maruja", "w", false, new Date(69,10,16));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop = new Coop(2, chickens);
        
        //3
        System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(3, "maria", "b", true, new Date(68,9,16));
        coop = new Coop(3, chickens);
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
                
        //4
        System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(4, "josefina", "q", true, new Date(67,8,15));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop = new Coop(4, chickens);
        //5
        System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(5, "rosalia", "q", true, new Date(66,7,14));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop = new Coop(5, chickens);
        
         
         // cup 2
         //6
         System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(6, "rosita", "q", true, new Date(65,6,13));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop2 = new Coop(6, chickens2);
        //7
         System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(7, "perisita", "q", true, new Date(64,5,12));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop2 = new Coop(7, chickens);
        //8
         System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(8, "rosa", "q", true, new Date(65,4,11));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop2 = new Coop(8, chickens);
        //9
         System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(9, "floresita", "q", true, new Date(64,3,10));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop2 = new Coop(9, chickens);
        //10
         System.out.println("chickens size --> " + chickens.size());
        chicken = new Chicken(10, "juanita", "q", true, new Date(99,2,12));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        coop2 = new Coop(10, chickens);
        
         coop = new Coop(1, chickens); 
         System.out.println("coop --> " +coop);
         coop2 = new Coop(2, chickens2); 
         System.out.println("coop2 --> " +coop2);
    }
}
    

