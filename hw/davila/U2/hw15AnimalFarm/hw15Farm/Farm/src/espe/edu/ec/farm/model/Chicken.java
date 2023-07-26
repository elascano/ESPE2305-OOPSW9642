
package espe.edu.ec.farm.model;

import java.util.Date;

/**
 *
 * @author Anabel Davila
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
        return "Chicken{"+super.toString() + 
                "isMolting=" + isMolting + ", laidEggs=" + laidEggs + '}';
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
    }

    

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
       return 4;
    }
    
    public int produce(Meat meat){
    return meat.getPounds();
    }
    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }
    
}
