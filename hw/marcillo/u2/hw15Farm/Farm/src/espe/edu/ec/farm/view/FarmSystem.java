package espe.edu.ec.farm.view;

import espe.edu.ec.farm.model.Chicken;
import espe.edu.ec.farm.model.Cow;
import espe.edu.ec.farm.model.FarmAnimal;
import espe.edu.ec.farm.model.Meat;
import espe.edu.ec.farm.model.Pig;
import java.util.Date;

/**
 * 
 * author Jhordy Marcillo
 */
public class FarmSystem {
   public static void main(String[] args) {
       FarmAnimal farmAnimal;
       Meat meat = new Meat();
       
       farmAnimal = new Chicken(false, 0, 1, "Broiled", new Date());
       printTypeAndAnimal(farmAnimal);
       farmAnimal.produce();
       
       Chicken chicken = new Chicken(false, 0, 2, "Polish", new Date());
       chicken.produce(meat);
       printTypeAndAnimal(chicken);
       chicken.layAnEgg();
       chicken.layAnEgg();
       meat.setPounds(1);
       System.out.println("Chicken ate: " + chicken.produce(meat));
       
       farmAnimal = new Pig(3, "Landraci", new Date());
       printTypeAndAnimal(farmAnimal);
       
       farmAnimal = new Cow(true, 4, "vaquita", new Date());
       printTypeAndAnimal(farmAnimal);
       Cow cow = (Cow) farmAnimal;
       meat.setPounds(3);
       System.out.println("Cow ate: " + cow.produce(meat));
   } 

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("------------------------");
        System.out.println("Type of farm animal: " + farmAnimal.getClass().getSimpleName());
        System.out.println("Animal: " + farmAnimal.toString());
        System.out.println("------------------------");
    }
}
