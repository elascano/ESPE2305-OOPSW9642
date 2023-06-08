
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters, DCCO-ESPE
 */
public class ChickenFarm {
    Chicken chickens[];
    
    public static void main(String[] args){
    Poop poop;
    Egg egg;
    Chicken chicken;
    ArrayList<Chicken>chickens = new ArrayList<>();
    ArrayList<Chicken>chickens2 = new ArrayList<>();
    Coop coop;
    Coop coop2;
    System.out.println("Coop - Jeffrey Manobanda");
    System.out.println("chicken size --->" + chickens.size());
    
    egg = new Egg(0);
    chicken = new Chicken(1, "Lucy", "white&black", false, new Date(70,11,17));
    chickens.add(chicken);
    poop = new Poop(chicken.getId());
    
    System.out.println("Chicken ---> " + chicken);
    
    chicken = new Chicken(2, "maruja", "white", true, new Date(89,12,06));
    chickens.add(chicken);
    
    System.out.println("Chicken ---> " + chicken);
    
    chicken = new Chicken(3, "Martha", "black", false, new Date(15,10,02));
    chickens.add(chicken);
    
    System.out.println("Chicken ---> " + chicken);
    
    chicken = new Chicken(4, "Patricia", "brown", true, new Date(75,04,05));
    chickens.add(chicken);
    
    System.out.println("Chicken ---> " + chicken);
    
    chicken = new Chicken(5, "Julia", "green", false, new Date(95,01,25));
    chickens.add(chicken);
    
    System.out.println("Chicken ---> " + chicken);
    
    System.out.println("chicken size --->" + chickens.size());
    
    coop = new Coop(1, chickens);
    System.out.println("chickens --->" + chickens);
    System.out.println("Coop --->" + coop);
    
    System.out.println("chicken size 2 --->" + chickens2.size());
    
    chicken = new Chicken(1, "Plucky", "yellow", true, new Date(85,10,24));
    chickens2.add(chicken);
    
    System.out.println("Chicken 2 ---> " + chicken);
    
    chicken = new Chicken(2, "Piolin", "orange", false, new Date(95,04,23));
    chickens2.add(chicken);
    
    System.out.println("Chicken 2 ---> " + chicken);
    
    chicken = new Chicken(3, "Molly", "blue", true, new Date(23,12,01));
    chickens2.add(chicken);
    
    System.out.println("Chicken 2 ---> " + chicken);
    
    chicken = new Chicken(4, "Ali", "red", false, new Date(45,02,22));
    chickens2.add(chicken);
    
    System.out.println("Chicken 2 ---> " + chicken);
    
    chicken = new Chicken(5, "Condorito", "grey", true, new Date(85,05,29));
    chickens2.add(chicken);
    
    System.out.println("Chicken 2 ---> " + chicken);
    
    System.out.println("Chicken size 2 --->" + chickens.size());
    
    coop2 = new Coop(2,chickens2);
    System.out.println("Chickens 2 --->" + chickens2);
    System.out.println("Coop 2 --->" + coop2);
    }
}
