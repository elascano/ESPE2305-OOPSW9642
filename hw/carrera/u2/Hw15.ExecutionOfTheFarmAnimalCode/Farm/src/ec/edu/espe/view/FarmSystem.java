
package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.Cow;
import ec.edu.espe.model.FarmAnimal;
import ec.edu.espe.model.Meat;
import ec.edu.espe.model.Pig;
import ec.edu.espe.model.Sheep;
import ec.edu.espe.model.Turkey;
import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args ){
        FarmAnimal farmAnimal;
        farmAnimal = new Chicken(true, 0, 1, "broiled", new Date());
        printTypeAnAnimal(farmAnimal);
        
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0,2,"polish",new Date());
        Meat meat = new Meat();
        chicken.produce(meat);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        meat.setPounds(1);
        
        System.out.println("chicken ate --->" + chicken.produce(meat));
        printTypeAnAnimal(chicken);
        
        farmAnimal = new Pig(2,"Landrace", new Date());
        printTypeAnAnimal(farmAnimal);
        
        Pig pig = new Pig(3,"Baconer", new Date());
        pig.produceSausage();
        printTypeAnAnimal(pig);
        
        Turkey turkey = new Turkey (4,"RealTurkey",new Date(),5);
        turkey.layAnEgg();
        printTypeAnAnimal (turkey);
               
        Sheep sheep =  new Sheep (5,"Blacksheep",new Date(),new Date());
        sheep.sheer();
        printTypeAnAnimal(sheep);
        
        Cow cow = new Cow (6,"Meater",new Date(), true);
        cow.getLeatherForClothes();
        printTypeAnAnimal(cow);

    }

    private static void printTypeAnAnimal(FarmAnimal farmAnimal) {
        System.out.println("type of FarmAnimal ---> " + farmAnimal.getClass().getSimpleName());
        System.out.println(farmAnimal);
        System.out.println("-----------------------------------------");
    }
}
