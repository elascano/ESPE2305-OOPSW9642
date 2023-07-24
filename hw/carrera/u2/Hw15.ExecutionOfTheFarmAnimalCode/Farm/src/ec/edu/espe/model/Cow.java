package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Pablo Carrera, Jsons, DCCO-ESPE
 */
public class Cow  extends FarmAnimal {
     private boolean isProducingMilk;

    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk ) {
        super(id, breed, bornOn);
        this.isProducingMilk=isProducingMilk;
    }
    
    public void getLeatherForClothes(){
        System.out.println("Leather is ready");
    
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + " ,isProducingMilk=" + isProducingMilk + '}';
    }
    

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 0;
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
    
}
