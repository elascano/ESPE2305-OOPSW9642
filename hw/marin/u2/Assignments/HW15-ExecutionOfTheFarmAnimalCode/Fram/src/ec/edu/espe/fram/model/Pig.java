
package ec.edu.espe.fram.model;

import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public boolean feed(Food food) {
      return true;
    }

    @Override
    public int produce() {
        return 50;
    }
    
    
    
}
