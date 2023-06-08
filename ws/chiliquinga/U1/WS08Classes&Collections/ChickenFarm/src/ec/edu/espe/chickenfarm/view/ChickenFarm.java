package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDeterTime instead of Date
/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
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
        //1
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        //2
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(2, "maruja", "w", true, new Date(89, 5, 21));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        //3
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(3, "carmer", "b", false, new Date(45, 7, 1));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        //4
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(4, "alberta", "o", true, new Date(66,7, 30));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //5
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(5, "marta", "5", true, new Date(64, 8, 8));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //6
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(6, "julita", "m", false, new Date(55, 1, 1));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //7
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(7, "olivia", "y", true, new Date(23, 11, 21));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //8
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(8, "barbara", "n", false, new Date(14, 3, 8));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //9
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(9, "josuesa", "p", true, new Date(96, 2, 29));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //10
        System.out.println("chickens size --> " + chickens2.size());

        chicken = new Chicken(10, "edita", "l", false, new Date(99+1+23, 8, 21));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        
        //Coop 1
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("coop --> " + coop);
        //Coop 2
        coop2 = new Coop(2, chickens2);
        System.out.println("chickens2 -->" + chickens2);
        System.out.println("coop2 --> " + coop2 );
    }
}