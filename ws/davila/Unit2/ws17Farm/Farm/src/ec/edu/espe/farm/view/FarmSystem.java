
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author USER
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        farmAnimal = new Chicken(false, 0, 1, "basas", new Date());
        
        System.out.println("chicken ---> " + farmAnimal);
    }
}
