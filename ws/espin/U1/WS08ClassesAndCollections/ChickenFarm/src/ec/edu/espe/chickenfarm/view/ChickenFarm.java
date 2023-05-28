
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Andres Espin,killChain,DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop= new Poop(0);
        Egg egg= new Egg(0);
        ArrayList<Chicken> chickens=new ArrayList<>();
        Coop coop;
        Coop coop2;
        Coop coop3;
        ArrayList<Chicken> chickens2=new ArrayList<>();   
        ArrayList<Chicken> chickens3=new ArrayList<>();  
        
        System.out.println("GRANJA DE ANDRES");
        System.out.println("Chickens size --->" +chickens.size());

        Chicken chicken= new Chicken(1,"andres","blue",true,2023,1,1);
        poop= new Poop(chicken.getId());
        System.out.println(chicken);

        chicken = new Chicken(2, "maruja", "w", true, 2023,1,1);
        chickens.add(chicken);
        System.out.println(chicken);
        
        coop = new Coop(1, chickens);
        System.out.println("1111chickens --> " + chickens);
        System.out.println("**********************************************");
        
        for (int i = 0; i < 5; i++) {
            Chicken newChicken = new Chicken(i+3, "chicken" + (i+3), "color" + (i+3), true,2023,1,1);
            chickens2.add(newChicken);
        }

        coop2=new Coop(2, chickens2);
        System.out.println("2222coop --> " + coop2);
        System.out.println("**********************************************");
        
        Chicken chicken3 = new Chicken(1, "maria", "black",false, 2020,1,1);
        chickens3.add(chicken3);
        chicken3 = new Chicken(2, "juan", "w",false, 2023,1,1);
        chickens3.add(chicken3);
        chicken3 = new Chicken(3, "ana", "red",false, 2022,1,1);
        chickens3.add(chicken3);
        chicken3 = new Chicken(4, "jose", "green",false, 2023,1,1);
        chickens3.add(chicken3);
        chicken3 = new Chicken(5, "andres", "ye",false, 2000,1,1);
        chickens3.add(chicken3);

        coop3 = new Coop(3, chickens3);
        System.out.println("3333coop --> " + coop3);
        System.out.println("**********************************************");
        
    }
}
