package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;
    private int milk;

    public Cow(boolean isProducingMilk, int milk, int id, String bredd, Date bornOn) {
        super(id, bredd, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.milk = milk;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Producing Milk=" + isProducingMilk + "\nmilk=" + milk;
    }

    @Override
    public int produce() {
        return 100;
    }
    public int produce (Meat meat){
        return meat.getPounds();
    }

    @Override
    public boolean feed(Food food) {
        return true;
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
     * @return the milk
     */
    public int getMilk() {
        return milk;
    }

    /**
     * @param milk the milk to set
     */
    public void setMilk(int milk) {
        this.milk = milk;
    }
    
}
