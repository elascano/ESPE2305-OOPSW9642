package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        
        printType(farmAnimal);
        
        System.out.println("chicken -->" + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        printType(farmAnimal);
        chicken.produce(meat);
        System.out.println("new chicken -->" +chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        System.out.println("new chicken --> " + chicken);
        meat.setPounds(1);
        
        farmAnimal = new Pig(3, "Landraci", new Date());
        printType(farmAnimal);
        System.out.println("pig .--> " + farmAnimal);
        
        farmAnimal = new Cow(true, 0, "blanca", new Date());
        printType(farmAnimal);
        System.out.println("cow .--> " + farmAnimal);
        
        farmAnimal = new Sheep(new Date(), 4, "correista XD", new Date());
        printType(farmAnimal);
        System.out.println("sheep .--> " + farmAnimal);
    }

    private static void printType(FarmAnimal farmAnimal) {
        System.out.println("-------------------");
        System.out.println("type of farmAnimal -->" + farmAnimal.getClass().getSimpleName());
        System.out.println("---------------------");
    }
}
