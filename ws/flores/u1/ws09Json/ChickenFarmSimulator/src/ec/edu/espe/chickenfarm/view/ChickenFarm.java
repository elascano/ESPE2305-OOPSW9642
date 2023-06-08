package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;

/**
 *
 * @author Caetano Flores, Juniors, DCCO-ESPE
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
        
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false);
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(2, "maruja", "w", true);
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(3, "Marilda", "w&bk", true);
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(4, "Martina", "bk", false);
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(5, "Coco", "brown", true);
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(6, "Bella", "white", false);
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(7, "Rocky", "bk&wh", true);
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(8, "Luna", "gray", false);
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(9, "Daisy", "yellow", false);
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(10, "JuanaMartaIgnacia", "pink", true);
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        
        coop2 = new Coop(2, chickens2);
        System.out.println("chickens --> " + chickens2);
     
        System.out.println("coop --->"+ coop);
    }
}