package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */

public class ChickenFarm {
    public static void main(String [] args){
    Poop poop;
    Egg egg;
    Chicken chicken;
    ArrayList<Chicken>chickens=new ArrayList<>();
    ArrayList<Chicken>chickens2=new ArrayList<>();
    
    Coop coop;
    Coop coop2;
    
    egg = new Egg(0);
    chicken = new Chicken(1, "Lucy", "w&b", false, new Date(99, 0, 1));
    chickens.add(chicken);
    poop = new Poop (chicken.getId());
    
    System.out.println("Chicken--->" + chicken);
    
    chicken=new Chicken(2,"Maruja","w",true, new Date(98, 1, 2));
    chickens.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(3,"Leonardo","r",false, new Date(97, 2, 3));
    chickens.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(4,"Matias","b",true, new Date(96, 3, 4));
    chickens.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(5,"Osciris","g",false, new Date(95, 4, 5));
    chickens.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    System.out.println("Chicken size ---> "+ chickens.size());
    
    chicken=new Chicken(6,"Tito","p",true, new Date(94, 5, 6));
    chickens2.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(7,"Fernanda","o",false, new Date(93, 6, 7));
    chickens2.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(8,"Carlos","g",true, new Date(92, 7, 8));
    chickens2.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(9,"Polina","r",false, new Date(91, 8, 9));
    chickens2.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    chicken=new Chicken(10,"Luis","t",true, new Date(90, 9, 10));
    chickens2.add(chicken);

    System.out.println("Chicken ---> " + chicken);
    
    System.out.println("Chicken size ---> "+ chickens.size());

    
    coop = new Coop(1,chickens);
    System.out.println("chickens ---> " + chickens);
    
    coop2=new Coop(2,chickens2);
    
    System.out.println("chickens 2 ---> " + chickens2);
    
    
    }
}
