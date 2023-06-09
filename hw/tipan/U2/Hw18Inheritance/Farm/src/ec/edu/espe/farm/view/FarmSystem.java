package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import java.util.Date;


/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args){
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat= new Meat();
        farmAnimal= new Chicken(false,0,1,"bloiled", new Date());
        
        printType(farmAnimal);
        
        System.out.println("Chicken-->"+ farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken= new Chicken(false,0,2,"polish", new Date());
        chicken.produce(meat);
        System.out.println("new chicken-->"+chicken);
        chicken.layEgg();
        chicken.layEgg();
        
        System.out.println("new chicken-->"+chicken);
        meat.setPounds(1);
        System.out.println("chicken ate-->"+chicken.produce(meat));
        
        farmAnimal= new Pig(3,"Landrace",new Date());
    
        printType(farmAnimal);
        System.out.println("pig-->"+farmAnimal);
        
    
        
    }

    private static void printType(FarmAnimal farmAnimal) {
        System.out.println("-------------------------------");
        System.out.println("type of farmAnimal-->"+farmAnimal.getClass().getSimpleName());
        System.out.println("-------------------------------");
    }
    
}
