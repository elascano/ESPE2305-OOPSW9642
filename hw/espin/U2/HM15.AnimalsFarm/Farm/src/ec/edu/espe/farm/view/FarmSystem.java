
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Rabit;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        printfTypeAndAnimal(farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false,0,2,"Polish",new Date());
        chicken.produce(meat);
        System.out.println("new chicken = " + chicken);
        
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        System.out.println("new chicken = " + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate = " + chicken.produce(meat));
        
        farmAnimal = new Pig(0, 1, "Landrace", new Date(121,12,04));
        printfTypeAndAnimal(farmAnimal);
        
       Pig pig = new Pig(0, 2, "Landrace", new Date(121,12,05));
       pig.produceMeat();
       pig.produceMeat();
        System.out.println("new Pig = " + pig );
        
        farmAnimal = new Cow(false, 0, 1, "Holstein", new Date());
        printfTypeAndAnimal(farmAnimal);
        
        Cow cow = new Cow(true, 0, 2, "Holstein", new Date(115,02,10));
        cow.produceMilk();
        cow.produceMilk();
        System.out.println("new Cow = " + cow);
        
        farmAnimal = new Sheep(new Date(), 0, 1, "Merina", new Date(111,01,12));
        printfTypeAndAnimal(farmAnimal);
        
        Sheep sheep = new Sheep(new Date(), 0, 2, "Merina", new Date(118,07,23));
        sheep.toGetWool();
        sheep.toGetWool();
        sheep.toGetWool();
        System.out.println("new Sheep = " + sheep);
        
        farmAnimal = new Rabit(0, 1, "Mini Lop", new Date());
        printfTypeAndAnimal(farmAnimal);
        
        Rabit rabit = new Rabit(0, 1, "Mini Lop", new Date(122,03,01));
        rabit.produceMeat();
        rabit.produceMeat();
        rabit.produceMeat();
        System.out.println("new Rabit = " + rabit);
    }

    private static void printfTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("---------------------------");
        System.out.println("type of Animal = " + farmAnimal.getClass().getSimpleName());
        System.out.println("Animal =" + farmAnimal);
        System.out.println("---------------------------");
    }
    
}
