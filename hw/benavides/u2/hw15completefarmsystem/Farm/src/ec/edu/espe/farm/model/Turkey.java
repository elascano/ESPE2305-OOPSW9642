package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Turkey extends FarmAnimal implements IBird {

    private int laidEggs;

    @Override
    public String toString() {
        return "Turkey{" + super.toString() + ", laidEggs=" + laidEggs + '}';
    }
    
    public Turkey(int id, String breed, Date bornOn, int laidEggs) {
        super(id, breed, bornOn);
        this.laidEggs = laidEggs;
    }

    @Override
    public boolean feed(Food food) {
        //TODO program feed sheep
        return true;
    }

    @Override
    public int produce() {
        //TODO program produce sheeps
        return 0;
    }

    @Override
    public void layAnEgg() {
        laidEggs = laidEggs + 1;
    }
    
}
