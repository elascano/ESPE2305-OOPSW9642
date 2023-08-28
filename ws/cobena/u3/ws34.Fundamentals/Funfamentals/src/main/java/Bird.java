
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public abstract class Bird extends Animal{
    ArrayList<Feather> feathers;
    Beak beak;

    @Override
    public String toString() {
        return super.toString() + " Bird{" + "feathers=" + feathers + ", beak=" + beak + '}';
    }
    
    public Bird(ArrayList<Feather> feathers, Beak beak, Date bornOn, Claw[] claws) {
        super(bornOn, claws);
        this.feathers = feathers;
        this.beak = beak;
    }
    
    @Override
    public abstract void feed();
    
}
