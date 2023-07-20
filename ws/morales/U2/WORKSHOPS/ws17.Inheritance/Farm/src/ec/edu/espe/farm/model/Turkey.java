package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class Turkey extends FarmAnimal implements IBird{
    private boolean isMolthing;
    private int laidEggs;

    public Turkey(boolean isMolthing, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolthing = isMolthing;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "Turkey{" + super.toString() + "isMolthing=" + isMolthing + ", laidEggs=" + laidEggs + '}';
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
        setLaidEggs(getLaidEggs() + 1);
    }

    /**
     * @return the isMolthing
     */
    public boolean isIsMolthing() {
        return isMolthing;
    }

    /**
     * @param isMolthing the isMolthing to set
     */
    public void setIsMolthing(boolean isMolthing) {
        this.isMolthing = isMolthing;
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
