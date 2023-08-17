
package espe.edu.ec.farm.view;

import espe.edu.ec.farm.model.Chicken;
import espe.edu.ec.farm.model.FarmAnimal;
import espe.edu.ec.farm.model.Meat;
import espe.edu.ec.farm.model.Pig;
import java.util.Date;

/**
 *
 * @author Anabel Davila
 */
public class FarmSystem {
   public static void main(String[] args){
   
       FarmAnimal farmAnimal;
       Meat meat;
       meat = new Meat();
       
       farmAnimal= new Chicken(false, 0, 1, "Broiled", new Date());
        printTypeAndAnimal(farmAnimal);
       farmAnimal.produce();
       Chicken chicken= new Chicken(false, 0, 2, "polish", new Date());
       chicken.produce(meat);
       Print(chicken);
       chicken.layAnEgg();
       chicken.layAnEgg();
       meat.setPounds(1);
       System.out.println("chicken ate --->"+chicken.produce(meat));
       
       farmAnimal = new Pig(3, "Landraci", new Date());
       
       System.out.println("pig--->"+farmAnimal);
       printTypeAndAnimal(farmAnimal);
   } 

    private static void Print(Chicken chicken) {
        System.out.println("New Chicken --->"+chicken);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("------------------------");
        System.out.println("type of farm animal --->"+farmAnimal.getClass().getSimpleName());
        System.out.println("chicken--->"+farmAnimal);
        System.out.println("------------------------");
    }
}
