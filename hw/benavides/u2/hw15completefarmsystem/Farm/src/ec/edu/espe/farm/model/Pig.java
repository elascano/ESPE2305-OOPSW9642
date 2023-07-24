package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Pig extends FarmAnimal {

    @Override
    public String toString() {
        return "Pig{" + super.toString() + "}";
    }

    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    
    @Override
    public boolean feed(Food food) {
       return true;
    }

    @Override
    public int produce() {
        return 0;
    }
    
    public void produceSausage(){
        //TODO program the function to produce Sausage
    }
}
