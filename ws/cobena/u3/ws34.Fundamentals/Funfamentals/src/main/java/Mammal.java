
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public abstract class Mammal extends Animal{
    ArrayList<Tooth> teeth;

    @Override
    public String toString() {
        return super.toString() + " Mammal{" + "teeth=" + teeth + '}';
    }

    public Mammal(ArrayList<Tooth> teeth, Date bornOn, Claw[] claw) {
        super(bornOn, claw);
        this.teeth = teeth;
    }
    
    @Override
    public abstract void feed();
}
