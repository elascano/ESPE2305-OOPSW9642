
package ec.edu.espe.AnimalSystem.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public abstract class Bird extends Animal{
    ArrayList<Feather> feather;
    Beak [] beak = new Beak[1];

    public Bird(Date bornOnDate, Claw[] claw) {
        super(bornOnDate, claw);
    }
    public abstract boolean feed();
}

