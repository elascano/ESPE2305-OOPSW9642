
package ec.edu.espe.fram.model;

import java.util.Date;

/**
 *
 * @author Josue Marin, CodeCrafters: DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;
    private int litersOfMilk;

    public Cow(boolean isProducingMilk, int litersOfMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.litersOfMilk = litersOfMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + "isProducingMilk=" + isProducingMilk + ", litersOfMilk=" + litersOfMilk + '}';
    }
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 5;
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
     * @return the litersMilk
     */
    public int getLitersMilk() {
        return litersOfMilk;
    }

    /**
     * @param litersMilk the litersMilk to set
     */
    public void setLitersMilk(int litersMilk) {
        this.litersOfMilk = litersMilk;
    }


    public void produceMilk() {
        litersOfMilk = litersOfMilk +1 ;
    }

    public void produce(Meat meat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
