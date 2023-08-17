
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString()+ '}';
    }
    
    public void produceSausage(){
    
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 0;
    }
    
}
