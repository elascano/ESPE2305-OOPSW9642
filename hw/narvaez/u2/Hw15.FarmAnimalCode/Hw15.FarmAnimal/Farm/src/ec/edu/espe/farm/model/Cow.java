package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO-ESPE
 */
public class Cow extends FarmAnimal implements IMammal, IMeat{
    private boolean isProducingMilk;
    private int laidMilk;
    private int groundMeat;

    public Cow(boolean isProducingMilk, int laidMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.laidMilk = laidMilk;
    }

    @Override  
    public String toString() {
        return "Cow{" + super.toString() + "isProducingMilk=" + isProducingMilk + ", laidMilk=" + laidMilk + ", groundMeat=" + groundMeat + '}';
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
    public void produceMilk() {
        laidMilk +=1;
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    /**
     * @return the laidMilk
     */
    public int getLaidMilk() {
        return laidMilk;
    }

    /**
     * @param laidMilk the laidMilk to set
     */
    public void setLaidMilk(int laidMilk) {
        this.laidMilk = laidMilk;
    }

    @Override
    public void makeGroundMeat() {
       groundMeat =+1;
    }
    
    
}
