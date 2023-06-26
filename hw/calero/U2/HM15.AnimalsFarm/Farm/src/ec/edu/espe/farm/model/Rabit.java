
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Rabit extends FarmAnimal implements IProduceMeat{
    int kgMeat;

    public Rabit(int kgMeat, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.kgMeat = kgMeat;
    }

    @Override
    public String toString() {
        return "Rabit{" + super.toString()+ "kgMeat=" + kgMeat + '}';
    }
   
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 2;
    }

    @Override
    public void produceMeat() {
        kgMeat = kgMeat + 1;
    }
    
}
