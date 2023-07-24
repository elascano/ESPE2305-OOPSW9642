
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Turkey extends FarmAnimal implements iBird{
    
    private int laidEggs;

    public Turkey(int id, String breed, Date bornOn, int laidEggs) {
        super(id, breed, bornOn);
        this.laidEggs=laidEggs;
    }

    @Override
    public String toString() {
        return "Turkey{" + super.toString() + "laidEggs=" + laidEggs + '}';
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 0;
    }

    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }

    /**
     * @return the laidEggs
     */
    public int getLaidEggs() {
        return laidEggs;
    }

    /**
     * @param laidEggs the laidEggs to set
     */
    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
    }
    
}
