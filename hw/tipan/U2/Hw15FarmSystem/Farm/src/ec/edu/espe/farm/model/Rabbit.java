package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Rabbit extends FarmAnimal {

    public Rabbit(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 10;
    }
    
    public String getMeat() {
        return "Rabbit meat";
    }
    
}
