
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jeffrey Manobanda, CodeCrafters
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
