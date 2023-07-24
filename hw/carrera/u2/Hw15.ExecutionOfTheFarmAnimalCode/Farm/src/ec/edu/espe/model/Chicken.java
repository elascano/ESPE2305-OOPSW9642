
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Chicken extends FarmAnimal implements iBird{
    private boolean isMolting;
    private int laidEggs;

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + ", isMolting=" + isMolting + ", laidEggs=" + laidEggs + '}';
    }
    
    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        //TODO program
        return 4;
    }
    
    public int produce (Meat meat){
        return meat.getPounds();
    }    

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
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

    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }

    
    
}
