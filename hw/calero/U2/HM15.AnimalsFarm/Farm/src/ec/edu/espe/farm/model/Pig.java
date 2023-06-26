
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Pig extends FarmAnimal implements IProduceMeat {
    int kgMeat;

    public Pig(int kgMeat, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.kgMeat = kgMeat;
    }
   
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 50;
    }

    @Override
    public void produceMeat() {
        kgMeat = kgMeat;
    }
    
}
