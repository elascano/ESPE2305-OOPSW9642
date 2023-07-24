package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Bunny;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat ();
        farmAnimal = new Chicken(false, 0, 1,
                "broiled", new Date());
        printTYpe(farmAnimal);                
        System.out.println(""+ farmAnimal);
        farmAnimal.produce();
        
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("" + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        System.out.println("" + chicken);
        meat.setPounds(1);
        System.out.println("Chicken ate ===>" + chicken.produce(meat));

        farmAnimal = new Pig(1, 3,"Kunekune" , new Date());
        printTYpe(farmAnimal);
        System.out.println("" + farmAnimal);
        
        farmAnimal = new Bunny(2, 4, "Lion Head", new Date());
        printTYpe(farmAnimal);         
        System.out.println("" + farmAnimal);
        
        farmAnimal = new Cow(true, 25, 5, "Belgian Blue", new Date());
        printTYpe(farmAnimal);        
        System.out.println("" + farmAnimal);
        
        farmAnimal = new Sheep(new Date (), 6, "Dorper", new Date());
        printTYpe(farmAnimal);
        System.out.println("" + farmAnimal);

    }

    private static void printTYpe(FarmAnimal farmAnimal) {
        System.out.println("---------------------");
        System.out.println("Type of Farm Animal ==>" + farmAnimal.getClass().getSimpleName());
    }
}
