package ec.edu.espe.AnimalSystem.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public abstract class Mammal extends Animal {
    
    ArrayList<Tooth> tooth;

    public Mammal(Date bornOnDate, Claw[] claw) {
        super(bornOnDate, claw);
    }

    public abstract boolean feed();
}
