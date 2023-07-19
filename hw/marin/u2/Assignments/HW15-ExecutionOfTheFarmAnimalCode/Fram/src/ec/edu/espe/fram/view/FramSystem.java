
package ec.edu.espe.fram.view;

import ec.edu.espe.fram.model.Chicken;
import ec.edu.espe.fram.model.Cow;
import ec.edu.espe.fram.model.FarmAnimal;
import ec.edu.espe.fram.model.Meat;
import ec.edu.espe.fram.model.Pig;
import ec.edu.espe.fram.model.Sheep;
import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class FramSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        Cow cow;
        Sheep sheep;
        meat=new Meat();
        
        farmAnimal=new Cow(true, 4, 2, "Blaack", new Date());
        printTyepAndAnimal(farmAnimal);
        System.out.println("Cow-->"+farmAnimal);
                farmAnimal=new Sheep(new Date(2012, 2, 25),2, 1, "Red",new Date());
        printTyepAndAnimal(farmAnimal);
        System.out.println("Sheep-->"+farmAnimal);
        
        farmAnimal=new Chicken(true, 0, 1, "boiled",new Date());
        printTyepAndAnimal(farmAnimal);
        System.out.println("chicken-->"+farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken=new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("new Chicken-->"+chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        printTyepAndAnimal(chicken);
        System.out.println("new Chicken-->"+chicken);
        meat.setPounds(1);
        System.out.println("chiken ate-->"+chicken.produce(meat));
        
        farmAnimal=new Pig(3,"Landradce",new Date());
         printTyepAndAnimal(farmAnimal);
        System.out.println("Pig-->"+farmAnimal);
    }

    private static void printTyepAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("type of farm Animal-->"+farmAnimal.getClass().getSimpleName());
        System.out.println("------------------------------------------------------------------");
    }

}
