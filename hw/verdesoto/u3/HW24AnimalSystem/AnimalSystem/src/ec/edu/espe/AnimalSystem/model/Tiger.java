package ec.edu.espe.AnimalSystem.model;

import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Tiger extends Mammal {

    public Tiger(Date bornOnDate, Claw[] claw) {
        super(bornOnDate, claw);
    }

    @Override
    public boolean feed() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void born() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
