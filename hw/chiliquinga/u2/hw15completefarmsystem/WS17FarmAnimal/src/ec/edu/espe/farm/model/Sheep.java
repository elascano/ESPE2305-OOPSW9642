package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Yeshua Chiliquinga, JSons; DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    Date lasSheering;

    public Sheep(Date lasSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lasSheering = lasSheering;
    }
    
    public void sheer(){
        
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
