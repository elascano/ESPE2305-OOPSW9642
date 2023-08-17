package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    
    boolean isProducingMilk;

    @Override
    public String toString() {
        return "Cow{" + super.toString() + "isProducingMilk=" + isProducingMilk + '}';
    }
    
    
    public Cow(boolean isProducingMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }
    
    public void getLeatherForClothes(){
        
    }
    
    @Override
    public boolean feed(Food food) {
        
        return false;
        
    }

    @Override
    public int produce() {
        
        return 0;
        
    }
}
